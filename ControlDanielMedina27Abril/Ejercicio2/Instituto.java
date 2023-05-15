package Ejercicio2;

import java.util.Scanner;

public class Instituto {
    private int numA;
    private int numP;
    private int numD;
    
    private String[] infoA;
    private String[] infoP;
    private String[] infoD;
    
    public static void alta(){
        Scanner in = new Scanner(System.in);
        System.out.println("Que quieres dar de alta\n1-Alumno\n2-Profesor\n3-Directivo");
        int opc = in.nextInt();
        if (opc==1){
            System.out.println("Has elegido alumno\nIntroduce la informacion");
            System.out.print("Numero de asignaturas del alumno: ");
            int nAsig = in.nextInt();
            System.out.print("Introduce el DNI del alumno: ");
            String DNI = in.nextLine();
            System.out.println("Introduce el nombre del alumno: ");
            String nom = in.nextLine();
            System.out.println("Introduce el primer apellido del alumno: ");
            String ape= in.nextLine();
            Alumno a1 = new Alumno(nAsig,DNI,nom,ape);
        }else if(opc==2){
            System.out.println("Has elegido profesor\nIntroduce la informacion");
            System.out.print("Numero de asignaturas del profesor: ");
            double sueldo = in.nextInt();
            System.out.print("Introduce el DNI del profesor: ");
            String DNI = in.nextLine();
            System.out.println("Introduce el nombre del profesor: ");
            String nom = in.nextLine();
            System.out.println("Introduce el primer apellido del profesor: ");
            String ape= in.nextLine();
            Profesor prof = new Profesor(sueldo,DNI,nom,ape);
        }
    }
}
