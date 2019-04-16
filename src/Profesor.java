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

      public int getSerie(){
         return this.serie;
      }

      public String getNombre(){
          return this.nombre;
      }

      public int getEdad(){
          return this.edad;
      }

      public Clase getClase(){
          return this.clase;
      }

      public int getGupo(){
          return this.clase.getGrupo();
      }

      public void setCalifiacion(Estudiante estudiante, double promedioNuevo){
          clase.getInscritos().get(estudiante.getCuenta()).setPromedio(promedioNuevo);
      }

      public String getMateria(){
          return clase.getMateria();
      }

      /*
      public void profesorToString(){
          System.out.println(this.nombre);
      }
      */

}
