
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Oh shit...");
        System.out.println("Here I go again.");
		//DECLARACION Y SOLICITUD INICIAL
	    Scanner user_input= new Scanner(System.in);
	    System.out.println("Introducir valor deseado a convertir a binario:");
	    System.out.println(" ");
	    int input= user_input.nextInt();
	    //PROCESO DE CONVERSION DECIMAL A BINARIO
	    if (input<=0){
	    	System.out.println("Valor entrado no es entero o mayor a 0 [ERROR]"); // FAILSAFE
	    }else {
		    int x=0;//POSICION INICIAL DEL VECTOR EN EL ARRAY (BINARIO)
		    System.out.print("Decimal a binario: ");
		    int binario []= new int[input]; //DEFINICION DE ARRAY DE ALMACENAMIENTO
		    while   (input!=0){ //DECIMAL --> BINARIO
		    	if ((binario.length)%binario.length==0){
		    		binario[x]= (input%2)+binario[x];
		    		input/=2;
		    	}System.out.print(binario[x]); //IMPRESION SECUENCIAL DE CADA POSICION en x++
		    	x++; }
	    }

//adios julio




    }
}
