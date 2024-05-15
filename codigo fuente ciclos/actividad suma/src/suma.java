import java.util.Scanner;

public sealed class suma {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que desea sumar los numeros:"));
		
		double suma =0;
		
		for (int i = 0; i < n; i++) {
			double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));
			double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
			suma += numero1 + numero2;
			
		}
		JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados" + n + "veces:" + suma);
	}
	

}
