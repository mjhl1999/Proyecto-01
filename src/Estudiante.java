public class Estudiante{

      private String nombre;
      private int cuenta;
      private int edad;
      private int area;
      private OTC otc;
      private double promedio;
      private Escuela escuela;

      public Estudiante(String nombre, int cuenta, int edad, int area, OTC otc, double promedio, Escuela escuela){
          this.nombre = nombre;
          this.cuenta = cuenta;
          this.edad = edad;
          this.area = area;
          this.otc = otc;
          this.promedio = promedio;
          this.escuela = escuela;
      }

      public String getNombre(){
          return this.nombre;
      }

      public int getCuenta(){
          return this.cuenta;
      }

      public int getEdad(){
          return this.edad;
      }

      public int getArea(){
          return area;
      }

      public OTC getOTC(){
          return this.otc;
      }

      public double getPromedio(){
          return this.escuela.getAlumnos().get(this.getCuenta()).getPromedio();
      }

      public void setPromedio(double promedioNuevo){
          this.promedio = promedioNuevo;
      }

      public double consultaCalificacion(String materia){
          return this.escuela.consultaCalificacion(this, materia);
      }

      public void inscribirseOTC(String opcion){
          this.escuela.inscribirseOTC(this, opcion);
      }

      public void estudianteToString(){
          System.out.println(this.nombre);
      }

}
