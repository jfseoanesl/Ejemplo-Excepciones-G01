package test;

import java.util.Scanner;
import modelo.*;

public class Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int valorA;
        int valorB;
        boolean conExcepcion=true;
        
        do{
            try {
                System.out.println("Numerador: ");
                valorA=entrada.nextInt();

                System.out.println("Denominador: ");
                valorB = entrada.nextInt();

                int resultado = Calculadora.division(valorA, valorB);
                System.out.println("resultado = " + resultado);

                conExcepcion = false;

            } catch(java.util.InputMismatchException ex){
                conExcepcion=true;
                System.out.println("Se requiere valor entero");
                entrada.nextLine();
            }
            catch (ExcepcionPropia ex) {
                conExcepcion=true;
                System.out.println(ex.getMessage());
            }
            finally{
                if(conExcepcion) System.out.println("Se genero excepcion");
                else System.out.println("No se genero excepcion");
            }
        }while(conExcepcion);   
        
        

    }
}
