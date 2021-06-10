import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int n = 0;
		int total;
		System.out.println("ingresar un numero: ");
		n = sca.nextInt();
		total = 1;
		while (n>0) {
			total *= n;
			n -=1;
		}
		System.out.println("El factorrial es de " +total);
	}


}

