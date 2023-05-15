package EjerciciosOO;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClaseEjA c = new ClaseEjA();
        c.m1(5.5, 6.6);
        
        double res = ClaseEjA.m2(5.5,6.6);
        
        
        ClaseEjB c1 = new ClaseEjB();
        ClaseEjB c2 = new ClaseEjB(1,2);
        /*Si son publicos los atributos
        System.out.println("Los datos de c1 son "+c1.dato1+" y "+c1.dato2);
        System.out.println("Los datos de c1 son "+c2.dato1+" y "+c2.dato2);*/
        System.out.println("Los datos de c1 son "+c1.getDato1()+" y "+c1.getDato2());
        System.out.println("Los datos de c1 son "+c2.getDato1()+" y "+c2.getDato2());
        System.out.println("Hay "+ClaseEjB.getContador()+" objetos");
        
        System.out.println("Que quieres hacer:\n1 suma\n2 resta\n3 multiplicacion\n4 division");
        try{
        int op = in.nextInt();
        System.out.println("Dame 2 números para hacer lo seleccionado anteriormente");
        Calculadora c4 = new Calculadora(in.nextDouble(), in.nextDouble());
        if (op == 1){
            System.out.println("la suma es "+ c4.getSuma());
        }else if (op == 2){
            System.out.println("la resta es "+ c4.getResta());
        }else if (op == 3){
            System.out.println("la multiplicacion es "+ c4.getMulti());
        }else if (op == 4){
            System.out.println("la division es "+ c4.getDivision());
        }else{
            System.out.println("Dato incorrecto");
        }
        }catch(Exception e){System.out.println("Dato invalido en alguna sección");}
        
        
        
    }
    
}
