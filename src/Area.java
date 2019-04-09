import java.util.Arrays;
import java.util.Hashtable;

public class Area{

    private Profesor[] materias;
    private int area;
    private Hashtable<Integer, Estudiante> estudiantesArea;

    public Area(int area, Profesor profesor1, Profesor profesor2){
        this.area = area;
        this.materias = new Profesor[2];
        this.materias[0] = profesor1;
        this.materias[1] = profesor2;
        estudiantesArea = new Hashtable<>();
    }


    public void agregaEstudiante(Estudiante estudiante){
        estudiantesArea.put(estudiante.getCuenta(), estudiante);
    }

    public Profesor getMateria(int materia){
        if(materia == 1)
          return this.materias[0];
        else if(materia == 2)
          return this.materias[0];
        else
          return null;
    }

    public Hashtable<Integer, Estudiante> getEstudiantes(){
        return this.estudiantesArea;
    }

    public Profesor getProfesor(int i){
        return materias[i];
    }

}
