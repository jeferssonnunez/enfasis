package aplicacion;

import java.util.Scanner;

import clase.Operacion;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner flujoE=new Scanner(System.in);
		double num1,num2;
        System.out.println ("Por favor digite el primer número:");
        num1=flujoE.nextDouble();    
        System.out.println ("Por favor digite el segundo número:");
        num2=flujoE.nextDouble();
        
        int op=0;  //para que entre al while
        while(op<1 || op>4){
        System.out.println("Seleccione una operación:"
                + "\n 1. suma"
                +"\n 2. resta"
                +"\n 3. multiplicación"
                +"\n 4. división");
        op=flujoE.nextInt();
        }
        
        Operacion ope=new Operacion(); //creamos el objeto de la clase Operacion.
 
	}

}
