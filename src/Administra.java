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


  // Se obtuvo de escuela
  public void addAdministrador(Administrador administrador){
      this.administradores.put(administrador.getSerie(), administrador);
  }

  // Se obtuvo de escuela
  public Hashtable<Integer, Estudiante> getAlumnos(){
      return this.alumnos;
  }

  public Profesor[] getProfesores(){
    return profesores;
  }

  // Se obtuvo de escuela
  public void muestraInscritos(){
    Integer str;
    Set<Integer> keys = alumnos.keySet();
    Iterator<Integer> it3 = keys.iterator();
    while(it3.hasNext()) {
        str = it3.next();
        alumnos.get(str).estudianteToString();
    }
  }

  // Se obtuvo de escuela
  public void muestraInscritosOTC(String opcion){
      for(int i = 0; i <= 3; i ++){
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


  // Se obtuvo de escuela
  public void muestraProfesores(){
      for(int i = 0; i <= contadorProfesores; i ++){
        profesores[i].getNombre();
      }
  }

  // Se obtuvo de escuela
  public void eliminaAlumno(Estudiante estudiante){
      for(int i = 0; i <= 3; i++){
          if(area[i].getProfesor(0).getClase().getInscritos().get(estudiante.getCuenta()) != null)
              area[i].getProfesor(0).getClase().getInscritos().remove(estudiante.getCuenta());
          if(area[i].getProfesor(1).getClase().getInscritos().get(estudiante.getCuenta()) != null)
               area[i].getProfesor(1).getClase().getInscritos().remove(estudiante.getCuenta());

      }
      for(int i = 0; i <= contadorProfesores; i++){
          if(profesores[i].getClase().getInscritos().get(estudiante.getCuenta()) != null)
              profesores[i].getClase().getInscritos().remove(estudiante.getCuenta());

      }
  }

  // Se obtuvo de escuela
  public void contrataProfesor(Profesor profesor){
      this.profesores[contadorProfesores] = profesor;
      contadorProfesores++;
  }





}
