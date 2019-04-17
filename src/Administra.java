import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public abstract class Administra{

    public Hashtable<Integer, Estudiante> alumnos;
    public Area[] area;
    public Profesor[] profesores; //aqui estan todas las clases incluyendo OTC
    public Hashtable<Integer, Administrador> administradores;
    public int contadorProfesores;
    public int n_area;

    /** Método que añade un administrador.
    * @param administrador el administrador a agregar.
    */
    public void addAdministrador(Administrador administrador){
        this.administradores.put(administrador.getSerie(), administrador);
    }

    /** Método que nos regresa la lista completa de alumnos en la escuela.
    * @return los alumnos de la escuela.
    */
    public Hashtable<Integer, Estudiante> getAlumnos(){
        return this.alumnos;
    }

    /** Método que nos regresa la lista de profesores de la escuela.
    * @return los profesores de la escuela.
    */
    public Profesor[] getProfesores(){
        return profesores;
    }

    /** Método que nos muestra los alumnos inscritos.
    *  Definimos la llave de cada alumno como su número de cuenta y después recorremos
    *  el diccionario y por cada llave obtenemos el nombre de cada alumno.
    */
    public void muestraInscritos(){
        Integer str;
        Set<Integer> keys = alumnos.keySet();
        Iterator<Integer> it3 = keys.iterator();
        while(it3.hasNext()) {
            str = it3.next();
            System.out.println(alumnos.get(str).getNombre());
        }
    }


    /** Método que nos muestra los inscritos en las opciones técnicas.
    * Si la materia inscrita es igual al nombre que tiene la opción técnica entonces obtenemos
    * la clase asignada a cada profesor y una vez en ahí la recorremos y obtenemos el nombre
    * de cada alumno con base en la llave (su número de cuenta).
    */
    public void muestraInscritosOTC(String opcion){
        System.out.println(opcion);
        for(int i = 0; i < contadorProfesores; i ++){
            if(profesores[i].getMateria().equals(opcion)){
                Hashtable<Integer, Estudiante> auxiliar = profesores[i].getClase().getInscritos();
                Integer str;
                Set<Integer> keys = auxiliar.keySet();
                Iterator<Integer> it3 = keys.iterator();
                while(it3.hasNext()) {
                    str = it3.next();
                    auxiliar.get(str).estudianteToString();
                }
            }
        }
    }


    /** Método que nos muestra los profesores.
    * Cada vez que añadimos un profesor al arreglo incrementamos el contador de profesores
    * entonces aquí recorremos el arreglo de los profesores y mientras no lleguemos al número
    * máximo obtenemos el p¿nombre de cada profesor.
    */
    public void muestraProfesores(){
        for(int i = 0; i < contadorProfesores; i ++){
            System.out.println(this.profesores[i].getNombre());
        }
    }

    /** Método que elimina un alumno.
    *  @param estudiante el estudiante a eliminar.
    * Primero nos fijamos en un area (0-4, en ese orden) y si el estudiante está inscrito,
    * entonces quitamos al estudiante, relacionado a ese número de cuenta, de esa área.
    * Después recoremos los profesores y eliminamos al alumno inscrito en la materia respectiva
    * a ese profesor.
    */
    public void eliminaAlumno(Estudiante estudiante){
        for(int i = 0; i <= 3; i++){
            if(area[i].getProfesor(0).getClase().getInscritos().get(estudiante.getCuenta()) != null)
                area[i].getProfesor(0).getClase().getInscritos().remove(estudiante.getCuenta());
            if(area[i].getProfesor(1).getClase().getInscritos().get(estudiante.getCuenta()) != null)
                 area[i].getProfesor(1).getClase().getInscritos().remove(estudiante.getCuenta());

        }
        for(int i = 0; i < contadorProfesores; i++){
            if(profesores[i].getClase().getInscritos().get(estudiante.getCuenta()) != null)
                profesores[i].getClase().getInscritos().remove(estudiante.getCuenta());
        }
    }

    /** Método que contrata a un profesor.
    * @param profesor el profesor a contratar.
    * Recorremos el arreglo de los profesores y agregamos el nuevo profesor al final del
    * arreglo, después aumentamos el contador y el siguiente profesor se agregará en un
    * índice más.
    */
    public void contrataProfesor(Profesor profesor){
        System.out.println("Profesor contratado" + contadorProfesores);
        this.profesores[contadorProfesores] = profesor;
        this.contadorProfesores = contadorProfesores + 1;
    }


    /** Método que Gradua a un alumno.
    * @param estudiante el estudiante a graduar.
    * obtenemos el promedio del alumno y las materias que curso buscando en la lista de profesore.
    */
    public void graduarAlumno(Estudiante estudiante){
        System.out.println("el alumno " + estudiante.getNombre() + " se graduo con un promedio de: " +
                            alumnos.get(estudiante.getCuenta()).getPromedio()
                            + " Cursando las materias de " + getMaterias(estudiante));
        eliminaAlumno(estudiante);
    }

    /** Método que obtiene las materias que cursó un alumno.
    * @param estudiante el estudiante a bsucar sus materias.
    * obtenemos el promedio del alumno y las materias que cursó buscando en la lista de profesore.
    */
    public String getMaterias(Estudiante estudiante){
        String materias = "";
        for(int i = 0; i < contadorProfesores; i++){
            if(profesores[i].getClase().getInscritos().get(estudiante.getCuenta()) != null)
                materias += " " + profesores[i].getClase().getMateria();
        }
        return materias;
    }
}
