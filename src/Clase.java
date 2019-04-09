import java.util.Hashtable;

public class Clase {

      private int grupo;
      private String materia;
      private Hashtable<Integer, Estudiante> inscritos;

      public Clase(int grupo, String materia){
          this.grupo = grupo;
          this.materia = materia;
          this.inscritos = new Hashtable<>();
      }

      public int getGrupo(){
          return this.grupo;
      }

      public String getMateria(){
          return this.materia;
      }


      public Hashtable<Integer, Estudiante> getInscritos(){
          return this.inscritos;
      }

      public void inscribirAlumno(Estudiante alumno){
         inscritos.put(alumno.getCuenta(), alumno);
      }

      public Estudiante getEstudiante(int cuenta){
          return this.inscritos.get(cuenta);
      }

}
