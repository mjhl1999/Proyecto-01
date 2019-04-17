public class Profesor {

      private int serie;
      private String nombre;
      private int edad;
      private Clase clase;

      public Profesor(int serie, String nombre, int edad, Clase clase){
          this.serie = edad;
          this.nombre = nombre;
          this.edad = edad;
          this.clase = clase;
      }


      /** Método que obtiene el número de serie de un profesor.
      * @return la serie.
      */
      public int getSerie(){
         return this.serie;
      }

      /** Método que regresa el nombre del profesor.
      * @return el nombre del profesor.      /*
      public void profesorToString(){
          System.out.println(this.nombre);
      }
      */
      public String getNombre(){
          return this.nombre;
      }

      /** Método que regresa la edad del profesor.
      * @return la edad del profesor.
      */
      public int getEdad(){
          return this.edad;
      }

      /** Método que regresa la clase impartida por el profesor.
      * @return la clase impartida por el profesor.
      */
      public Clase getClase(){
          return this.clase;
      }

      /** Método que regresa el grupo al que da clase el profesor.
      * @return el grupo al que da clase el profesor.
      */
      public int getGupo(){
          return this.clase.getGrupo();
      }

      /** Método que define la calificación del alumno inscrito a la clase del profesor.
      * @param estudiante el estudiante al cual asignarle una calificación.
      * @param promedioNuevo el promedio del estudiante en esa materia.
      */
      public void setCalifiacion(Estudiante estudiante, double promedioNuevo){
          clase.getInscritos().get(estudiante.getCuenta()).setPromedio(promedioNuevo);
      }

      /** Método que regresa la materia dada por el profesor.
      * @return la materia impartida.
      * Regresamos la materia de esa clase.
      */
      public String getMateria(){
          return clase.getMateria();
      }
}
