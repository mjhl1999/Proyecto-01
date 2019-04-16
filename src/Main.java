
public class Main{

  public static void main(String[] args){

     Administrador admin = new Administrador(11);

     Clase Matematicas  = new Clase(3120, "Matematicas");
     Clase Fisica       = new Clase(4320, "Fisica");
     Clase Biologia     = new Clase(8963, "Biologia");
     Clase Quimica      = new Clase(7821, "Quimica");
     Clase Historia     = new Clase(5698, "Historia");
     Clase Sociales     = new Clase(2631, "Ciencias Sociales");
     Clase Filosofia    = new Clase(4569, "Filosofia");
     Clase Artes        = new Clase(1147, "Artes Plasticas");
     Clase Hoteleria    = new Clase(2569, "Agente de viajes y hoteleria");
     Clase Fotografia   = new Clase(1147, "Fotografo, laboratorista y prensa");
     Clase Nutriologia  = new Clase(1147, "Nutriologo");
     Clase Laboratorio  = new Clase(1147, "Laboratorista Quimica");

     Profesor profesor1 = new Profesor(1111, "Luis Soto", 31, Matematicas);
     Profesor profesor2 = new Profesor(2222, "Victor Zamora", 24, Fisica);
     Profesor profesor3 = new Profesor(3333, "Canek Pelaez", 45, Biologia);
     Profesor profesor4 = new Profesor(4444, "Miren Hernandez", 27, Quimica);
     Profesor profesor5 = new Profesor(5555, "Jorge Ruiz", 32, Historia);
     Profesor profesor6 = new Profesor(6666, "Miguel Baron", 31, Sociales);
     Profesor profesor7 = new Profesor(7777, "Magali Segura", 45, Filosofia);
     Profesor profesor8 = new Profesor(8888, "Ernesto De La Cruz", 51, Artes);
     Profesor profesor9 = new Profesor(9999, "Charles Manson", 41, Hoteleria);
     Profesor profesor10 = new Profesor(0000, "Ali G", 41, Fotografia);
     Profesor profesor11 = new Profesor(0101, "Liam Neeson", 52, Nutriologia);
     Profesor profesor12 = new Profesor(0202, "Keanu Reeves", 49, Laboratorio);

     Area area1 = new Area(1, profesor1, profesor2);
     Area area2 = new Area(2, profesor3, profesor4);
     Area area3 = new Area(1, profesor5, profesor6);
     Area area4 = new Area(1, profesor7, profesor8);

     Escuela ENP6 = new Escuela(area1, area2, area3, area4);
     ENP6.contrataProfesor(profesor1);
     ENP6.contrataProfesor(profesor2);
     ENP6.contrataProfesor(profesor3);
     ENP6.contrataProfesor(profesor4);
     ENP6.contrataProfesor(profesor5);
     ENP6.contrataProfesor(profesor6);
     ENP6.contrataProfesor(profesor7);
     ENP6.contrataProfesor(profesor8);
     ENP6.contrataProfesor(profesor9);
     ENP6.contrataProfesor(profesor10);
     ENP6.contrataProfesor(profesor11);
     ENP6.contrataProfesor(profesor12);

     Estudiante estudiante1 = new Estudiante("Luis Pacheco", 315116663, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante2 = new Estudiante("Luis Rodriguez", 315116664, 17, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante3 = new Estudiante("Luis Perez", 315116645, 18, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante4 = new Estudiante("Luis Armeni", 315116678, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante5 = new Estudiante("Luis Sosa", 315177664, 17, 2, OTC.FLP, 1.0, ENP6);
     Estudiante estudiante6 = new Estudiante("Luis Acosta", 315556663, 18, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante7 = new Estudiante("Luis Sanchez", 312516664, 16, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante8 = new Estudiante("Luis Neudert", 455116664, 17, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante9 = new Estudiante("Luis Avila", 795116664, 19, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante10 = new Estudiante("Luis Hernandez", 965116664, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante11 = new Estudiante("Luis Cruz", 315116294, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante12 = new Estudiante("Luis Baron", 312916664, 18, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante13 = new Estudiante("Luis Leyva", 315116164, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante14 = new Estudiante("Luis Salman", 315117064, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante15 = new Estudiante("Luis Garcia", 005116664, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante16 = new Estudiante("Luis Rodriguez", 315116664, 16, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante17 = new Estudiante("Alan Pacheco", 315110063, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante18 = new Estudiante("Alan Rodriguez", 315576664, 17, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante19 = new Estudiante("Alan Perez", 315116689, 18, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante20 = new Estudiante("Alan Armeni", 311916678, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante21 = new Estudiante("Alan Sosa", 315174664, 17, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante22 = new Estudiante("Alan Acosta", 315543663, 18, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante23 = new Estudiante("Alan Sanchez", 312006664, 16, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante24 = new Estudiante("Alan Neudert", 443116664, 17, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante25 = new Estudiante("Alan Avila", 795118064, 19, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante26 = new Estudiante("Alan Hernandez", 965104664, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante27 = new Estudiante("Alan Cruz", 315118994, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante28 = new Estudiante("Alan Baron", 312916404, 18, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante29 = new Estudiante("Alan Leyva", 315116140, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante30 = new Estudiante("Alan Salman", 315897064, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante31 = new Estudiante("Alan Garcia", 005114764, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante32 = new Estudiante("Alan Rodriguez", 315146664, 16, 4, OTC.FLP, 0.0, ENP6);

     Estudiante estudiante33 = new Estudiante("Diego Pacheco", 115110063, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante34 = new Estudiante("Diego Rodriguez", 115576664, 17, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante35 = new Estudiante("Diego Perez", 115116689, 18, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante36 = new Estudiante("Diego Armeni", 111916678, 16, 1, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante37 = new Estudiante("Diego Sosa", 115174664, 17, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante38 = new Estudiante("Diego Acosta", 115543663, 18, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante39 = new Estudiante("Diego Sanchez", 112006664, 16, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante40 = new Estudiante("Diego Neudert", 143116664, 17, 2, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante41 = new Estudiante("Diego Avila", 195118064, 19, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante42 = new Estudiante("Diego Hernandez", 165104664, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante43 = new Estudiante("Diego Cruz", 115118994, 17, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante44 = new Estudiante("Diego Baron", 112916404, 18, 3, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante45 = new Estudiante("Diego Leyva", 115116140, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante46 = new Estudiante("Diego Salman", 115897064, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante47 = new Estudiante("Diego Garcia", 105114764, 17, 4, OTC.FLP, 0.0, ENP6);
     Estudiante estudiante48 = new Estudiante("Diego Rodriguez", 115146664, 16, 4, OTC.FLP, 0.0, ENP6);


     ENP6.getProfesor(0).getClase().inscribirAlumno(estudiante1);
     ENP6.getProfesor(0).getClase().inscribirAlumno(estudiante2);
     ENP6.getProfesor(0).getClase().inscribirAlumno(estudiante3);
     ENP6.getProfesor(0).getClase().inscribirAlumno(estudiante4);

     ENP6.getProfesor(1).getClase().inscribirAlumno(estudiante5);
     ENP6.getProfesor(1).getClase().inscribirAlumno(estudiante6);
     ENP6.getProfesor(1).getClase().inscribirAlumno(estudiante7);
     ENP6.getProfesor(1).getClase().inscribirAlumno(estudiante8);

     ENP6.getProfesor(2).getClase().inscribirAlumno(estudiante9);
     ENP6.getProfesor(2).getClase().inscribirAlumno(estudiante10);
     ENP6.getProfesor(2).getClase().inscribirAlumno(estudiante11);
     ENP6.getProfesor(2).getClase().inscribirAlumno(estudiante12);

     ENP6.getProfesor(3).getClase().inscribirAlumno(estudiante13);
     ENP6.getProfesor(3).getClase().inscribirAlumno(estudiante14);
     ENP6.getProfesor(3).getClase().inscribirAlumno(estudiante15);
     ENP6.getProfesor(3).getClase().inscribirAlumno(estudiante16);

     ENP6.getProfesor(4).getClase().inscribirAlumno(estudiante17);
     ENP6.getProfesor(4).getClase().inscribirAlumno(estudiante18);
     ENP6.getProfesor(4).getClase().inscribirAlumno(estudiante19);
     ENP6.getProfesor(4).getClase().inscribirAlumno(estudiante20);

     ENP6.getProfesor(5).getClase().inscribirAlumno(estudiante21);
     ENP6.getProfesor(5).getClase().inscribirAlumno(estudiante22);
     ENP6.getProfesor(5).getClase().inscribirAlumno(estudiante23);
     ENP6.getProfesor(5).getClase().inscribirAlumno(estudiante24);

     ENP6.getProfesor(6).getClase().inscribirAlumno(estudiante25);
     ENP6.getProfesor(6).getClase().inscribirAlumno(estudiante26);
     ENP6.getProfesor(6).getClase().inscribirAlumno(estudiante27);
     ENP6.getProfesor(6).getClase().inscribirAlumno(estudiante28);

     ENP6.getProfesor(7).getClase().inscribirAlumno(estudiante29);
     ENP6.getProfesor(7).getClase().inscribirAlumno(estudiante30);
     ENP6.getProfesor(7).getClase().inscribirAlumno(estudiante31);
     ENP6.getProfesor(7).getClase().inscribirAlumno(estudiante32);

     ENP6.getProfesor(8).getClase().inscribirAlumno(estudiante33);
     ENP6.getProfesor(8).getClase().inscribirAlumno(estudiante34);
     ENP6.getProfesor(8).getClase().inscribirAlumno(estudiante35);
     ENP6.getProfesor(8).getClase().inscribirAlumno(estudiante36);

     ENP6.getProfesor(9).getClase().inscribirAlumno(estudiante37);
     ENP6.getProfesor(9).getClase().inscribirAlumno(estudiante38);
     ENP6.getProfesor(9).getClase().inscribirAlumno(estudiante39);
     ENP6.getProfesor(9).getClase().inscribirAlumno(estudiante40);

     ENP6.getProfesor(10).getClase().inscribirAlumno(estudiante41);
     ENP6.getProfesor(10).getClase().inscribirAlumno(estudiante42);
     ENP6.getProfesor(10).getClase().inscribirAlumno(estudiante43);
     ENP6.getProfesor(10).getClase().inscribirAlumno(estudiante44);

     ENP6.getProfesor(11).getClase().inscribirAlumno(estudiante45);
     ENP6.getProfesor(11).getClase().inscribirAlumno(estudiante46);
     ENP6.getProfesor(11).getClase().inscribirAlumno(estudiante47);
     ENP6.getProfesor(11).getClase().inscribirAlumno(estudiante48);

     ENP6.addAlumno(estudiante1);
     ENP6.addAlumno(estudiante2);
     ENP6.addAlumno(estudiante3);
     ENP6.addAlumno(estudiante4);
     ENP6.addAlumno(estudiante5);
     ENP6.addAlumno(estudiante6);
     ENP6.addAlumno(estudiante7);
     ENP6.addAlumno(estudiante8);
     ENP6.addAlumno(estudiante9);
     ENP6.addAlumno(estudiante10);
     ENP6.addAlumno(estudiante11);
     ENP6.addAlumno(estudiante12);
     ENP6.addAlumno(estudiante13);
     ENP6.addAlumno(estudiante14);
     ENP6.addAlumno(estudiante15);
     ENP6.addAlumno(estudiante16);
     ENP6.addAlumno(estudiante17);
     ENP6.addAlumno(estudiante18);
     ENP6.addAlumno(estudiante19);
     ENP6.addAlumno(estudiante20);
     ENP6.addAlumno(estudiante21);
     ENP6.addAlumno(estudiante22);
     ENP6.addAlumno(estudiante23);
     ENP6.addAlumno(estudiante24);
     ENP6.addAlumno(estudiante25);
     ENP6.addAlumno(estudiante26);
     ENP6.addAlumno(estudiante27);
     ENP6.addAlumno(estudiante28);
     ENP6.addAlumno(estudiante29);
     ENP6.addAlumno(estudiante30);
     ENP6.addAlumno(estudiante31);
     ENP6.addAlumno(estudiante32);
     ENP6.addAlumno(estudiante33);
     ENP6.addAlumno(estudiante34);
     ENP6.addAlumno(estudiante35);
     ENP6.addAlumno(estudiante36);
     ENP6.addAlumno(estudiante37);
     ENP6.addAlumno(estudiante38);
     ENP6.addAlumno(estudiante39);
     ENP6.addAlumno(estudiante40);
     ENP6.addAlumno(estudiante41);
     ENP6.addAlumno(estudiante42);
     ENP6.addAlumno(estudiante43);
     ENP6.addAlumno(estudiante44);
     ENP6.addAlumno(estudiante45);
     ENP6.addAlumno(estudiante46);
     ENP6.addAlumno(estudiante47);
     ENP6.addAlumno(estudiante48);



     System.out.println(ENP6.getProfesor(1).getClase().getInscritos());
     System.out.println("\n");
     System.out.println(ENP6.getProfesor(1).getClase().getEstudiante(315177664).getNombre());
     System.out.println(ENP6.getProfesor(1).getClase().getEstudiante(315177664).getCuenta());
     System.out.println(ENP6.getProfesor(1).getClase().getEstudiante(315177664).getEdad());
     System.out.println(ENP6.getProfesor(1).getClase().getEstudiante(315177664).getArea());
     System.out.println(ENP6.getProfesor(1).getClase().getEstudiante(315177664).getPromedio());

     System.out.println(ENP6.getAlumnos());

     System.out.println(ENP6.getProfesores());

    }
}
