
package javaapplication13;
import java.util.Scanner;
import static javaapplication13.JavaApplication13.scanner;

public class CalculadoraSimple extends CalculadoraEspecial {
    
    private String[] vectorTransacciones;  
    private int indiceVector;

   
    public CalculadoraSimple(){
      
        vectorTransacciones= new String[10000000];
        this.indiceVector=0;
    }
   
     public double sumar(double primerNumero, double segundoNumero){
        double resultado = primerNumero+segundoNumero;
        this.registrarTransaccion(" suma ", primerNumero, segundoNumero, resultado);
        return resultado;
    }
     
      public double restar(double primerNumero, double segundoNumero){
        double resultado = primerNumero-segundoNumero;
        this.registrarTransaccion(" resta ", primerNumero, segundoNumero, resultado);
        return resultado;
    }
      
      public double dividir(double primerNumero, double segundoNumero){
        double resultado = primerNumero/segundoNumero;
        this.registrarTransaccion(" dividir ", primerNumero, segundoNumero, resultado);
        return primerNumero/segundoNumero;
       }
   
    
  public void registrarTransaccion(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector= indiceVector+1;
        vectorTransacciones[indiceVector]= " "+ tipo + ""+ primerParametro+" "+segundoParametro+" resultado: "+resultado;
        
    }
    public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                    //System.out.println(transaccion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    }
}




  
