import java.util.Hashtable;
import java.util.ArrayList;

public class Escuela extends Administra{

    public Escuela(Area area1, Area area2, Area area3, Area area4 ){
        this.alumnos = new Hashtable<>();
        area = new Area[4];
        this.area[0] = area1;
        this.area[1] = area2;
        this.area[2] = area3;
        this.area[3] = area4;
        this.profesores = new Profesor[20];
        administradores = new Hashtable<>();
        this.contadorProfesores = 0;
    }

    public void addAlumno(Estudiante estudiante){
        this.alumnos.put(estudiante.getCuenta(), estudiante);
    }


    public void addProfesor(Profesor profesor){
      this.profesores[contadorProfesores] = profesor;
      contadorProfesores ++ ;
    }

    public double consultaCalificacion(Estudiante estudiante, String materia){
          Area areaAuxiliar = this.area[estudiante.getArea()];
          if(areaAuxiliar.getMateria(0).getClase().getMateria().equals(materia))
              return areaAuxiliar.getMateria(0).getClase().getInscritos().get(estudiante.getCuenta()).getPromedio();
          else if(areaAuxiliar.getMateria(1).getClase().getMateria().equals(materia))
              return areaAuxiliar.getMateria(1).getClase().getInscritos().get(estudiante.getCuenta()).getPromedio();
          System.out.println("no se encontro la clase");
          return 0;
    }


    public void inscribirseOTC(Estudiante estudiante, String opcion){
        for(int i = 0; i <= 3; i ++){
            if(profesores[i].getMateria().equals(opcion))
               profesores[i].getClase().inscribirAlumno(estudiante);
        }
    }

    public void despideProfesor(Profesor profesor){
        for(int i = 0; i <= contadorProfesores; i++){
            if(profesores[i].equals(profesor) )
                profesores[i] = null;
        }
    }

}
