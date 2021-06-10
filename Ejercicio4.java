import java.util.*;

public class Ejercicio4{
	public static void main (String[] args){

		Scanner leer = new Scanner(System.in);

		int r =0;
		int p =150;

		for (int i=0;i<=20 ; i++) {
			System.out.println("Ingrese las edades: ");
			int edad = leer.nextInt();
			if (edad>r) {
				r=edad;	
			}
			if (edad<p) {
			   p=edad;			
			}			
		}
		System.out.println("La persona de mayor edad es: "+r);
		System.out.println("La persona de menor edad es: "+p);
	}
}	