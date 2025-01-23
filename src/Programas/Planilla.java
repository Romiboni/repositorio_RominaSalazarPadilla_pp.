package Programas;

import java.util.Scanner;
public class Planilla {
  public static void main(String[] args){  
     //Declarar variables
     String empleado;
     double ht,th,sb,d,sn,he, phe;
     //Crear un objeto de lectura de datos
     Scanner lectura=new Scanner(System.in);
     //Entrada de datos
     System.out.println("Nombre de empleado: ");
     empleado=lectura.next();
     System.out.println("Horas trabajadas: ");
     ht=lectura.nextDouble();
     System.out.println("Tarifa por hora");
     th=lectura.nextDouble();
     System.out.println("Horas extras");
     he=lectura.nextDouble();
     //Proceso de datos
     sb=ht*th;
     d=sb*0.13;
     sn=sb-d;
     phe=((sb/30/8)+(sb/30/8)*0.25)*he;
     //Salida de datos
     System.out.println("Sueldo bruto: "+sb);
     System.out.println("Descuento: "+d);
     System.out.println("Sueldo neto: "+sn); 
     System.out.println("Pago horas extra: "+phe);
 }//Fin del método   
}//Fin del programa  
