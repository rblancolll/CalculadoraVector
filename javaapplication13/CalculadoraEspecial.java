
package javaapplication13;


public class CalculadoraEspecial {
   private String[] vectorTransacciones;  
    private int indiceVector;
    
public CalculadoraEspecial(){
      vectorTransacciones= new String[10000000];
        this.indiceVector=0;  
        
    }
    public double raizCuadrada(double raiz){
        
        double Numero1 = Math.sqrt(raiz);
        this.registrarTranEspecial("raiz ", raiz, raiz, Numero1);
        return Numero1;
    }

public double Tangente(double Numero1){
      
     double result = Math.tan(Numero1);
     this.registrarTranEspecial("tangente ", Numero1, Numero1, result);
    return result;
}

 public double Coseno(double cos){
        double resultado = Math.cos(cos);
     this.registrarTranEspecial("coseno ", cos, cos, resultado);
    return resultado;
    }

   public void registrarTranEspecial(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector= indiceVector+1;
        vectorTransacciones[indiceVector]= " "+ tipo + ""+ primerParametro+" "+segundoParametro+" resultado: "+resultado;
        
    }
    public void mostrarTransaccionEspecial(){
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

    
