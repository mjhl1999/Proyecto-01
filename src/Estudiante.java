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

      /** Método que regresa el nombre del estudiante.
      * @return el nombre del estudiante.
      */
      public String getNombre(){
          return this.nombre;
      }

      /** Método que regresa el número de cuenta de un estudiante.
      * @return el número de cuenta del estudiante.
      */
      public int getCuenta(){
          return this.cuenta;
      }

      /** Método que regresa la edad del estudiante.
      * @return la edad del estudiante.
      */
      public int getEdad(){
          return this.edad;
      }

      /** Método que regresa el área en la que estudia el alumno.
      * @return el área en la que estudia.
      */
      public int getArea(){
          return area;
      }

      /** Método que regresa la opción técnica de un estudiante.
      * @return la opción técnica.
      */
      public OTC getOTC(){
          return this.otc;
      }

      /** Método que regresa el promedio de un estudiante.
      * @return el promedio del estudiante.
      */
      public double getPromedio(){
        return this.promedio;
      }

      /** Método que define el promedio del estudiante.
      * @param promedio el promedio del estudiante.
      */
      public void setPromedio(double promedio){
        this.promedio = promedio;
      }


      /** Método que consulta la calificación del estudiante.
      * @param materia la materia de la cual saber la calificación.
      * Mandamos a llamar al método que ya consultaba la califición desde la escuela.
      */
      public double consultaCalificacion(String materia){
          return this.escuela.consultaCalificacion(this, materia);
      }

      /** Método que inscribe al estudiante a una opción técnica.
      * @param opcion la opción técnica a inscribir.
      * Mandamos llamar a método que ibscribe a un alumno a una O.T. desde la escuela.
      */
      public void inscribirseOTC(String opcion){
          this.escuela.inscribirseOTC(this, opcion);
      }

      /** Método que nos da impreso el nombre de un estudiante.
      * Imprimimos el nombre del estudiante.
      */
      public void estudianteToString(){
          System.out.println(this.nombre);
      }

}
