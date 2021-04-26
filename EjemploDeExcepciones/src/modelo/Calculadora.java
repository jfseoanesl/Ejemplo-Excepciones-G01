package modelo;

public class Calculadora {

    public static int division(int n, int d) throws ExcepcionPropia {

          if(d==0) 
              throw new ExcepcionPropia("No se puede dividir por cero");
          
          return n/d;
    }
}
