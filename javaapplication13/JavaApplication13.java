
package javaapplication13;

import java.util.Scanner;


public class JavaApplication13 {
static Scanner scanner=new Scanner (System.in);

   
    public static void main(String[] args) {
      CalculadoraSimple simple=new CalculadoraSimple();
      int opcion = 0;
    
    do{
    System.out.print("\n Bienvenidos a calculadora especial:");
    System.out.print("\n 1. Coseno ");
    System.out.print("\n 2. Tangente ");
    System.out.print("\n 3. raiz cuadrada");
    System.out.print("\n 4. Suma ");
    System.out.print("\n 5. Resta");
    System.out.print("\n 6. Division");
    System.out.print("\n 7. Mostrar Transacciones");
    System.out.print("\n Escoja una opcion: ");
        opcion = scanner.nextInt();    
      
      switch(opcion){
               
       case 1 -> { 
       System.out.print("Coseno\n"); 
       System.out.println("Ingrese un numero");
       double resultado=scanner.nextDouble();
       System.out.println("El resultado es: " + simple.Coseno(resultado));
       }
       
       case 2 -> {
       System.out.print("Tangente\n"); 
       System.out.println("Ingrese un numero");
       double result=scanner.nextDouble();
       System.out.println("El resultado es: " + simple.Tangente(result));
       }
       
       case 3 -> {
       
       System.out.println("Ingrese un numero");
       double Numero1=scanner.nextDouble();
       System.out.println("El valor es " + simple.raizCuadrada(Numero1));
       }
    
       case 4 -> {
       System.out.println( "ingrese el  primer numero de la suma ");
       double Numero1=scanner.nextDouble();
       System.out.println( "ingrese el  segundo numero de la suma ");
       double Numero2=scanner.nextDouble();
       System.out.print("El resultado es: "+simple.sumar(Numero1, Numero2));
       simple.mostrarTransacciones();
       }
       
       case 5 -> {
       System.out.println( "ingrese el  primer numero de la resta ");
       double Numero1=scanner.nextDouble();
       System.out.println( "ingrese el  segundo numero de la resta");
       double Numero2=scanner.nextDouble();
       System.out.print("El resultado es: "+simple.restar(Numero1, Numero2));
       simple.mostrarTransacciones();
       }
       
       case 6 -> {
       System.out.println( "Ingrese un numero ");
       double Numero1=scanner.nextDouble();
       System.out.println( "ingrese un segundo numero ");
       double Numero2=scanner.nextDouble();
       System.out.print("El resultado es: "+simple.dividir(Numero1, Numero2));
       simple.mostrarTransacciones();
       }
       
      case 7 -> {
         simple.mostrarTransaccionEspecial();
         simple.mostrarTransacciones();
     
          break;
                }
}
    }  while (opcion !=7); 
          
        }
        
} 
      
   
    
    

