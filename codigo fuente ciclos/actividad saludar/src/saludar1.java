import java.util.Scanner;

public class saludar1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de veces que quiere que se repita el saludo");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("!Hola!");
		}
		scanner.close();
	}

}
