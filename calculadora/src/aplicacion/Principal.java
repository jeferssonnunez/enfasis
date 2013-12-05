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
        
        switch(op){
        case 1: 
                System.out.println("la suma entre "+num1+" y "+num2+" es: "+ope.sumar(num1, num2));        
                break;
            
        case 2: 
                    System.out.println("la resta entre "+num1+" y "+num2+" es: "+ope.restar(num1, num2));        
                    break;
         case 3: 
                    System.out.println("el producto entre "+num1+" y "+num2+" es: "+ope.multiplicar(num1, num2));        
                    break; 
         case 4:
         	if(num2==0)
         	{
         		System.out.println("la division por  cero no existe");     
         		
                break;
         	}
         	else{
         		System.out.println("la division entre "+num1+" y "+num2+" es: "+ope.dividir(num1, num2));        
                        break;	
         	}
 
	}
	
	}

}
