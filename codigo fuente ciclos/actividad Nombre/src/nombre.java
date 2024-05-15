
public class nombre {

	public static void main(String[] args) {
   int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de nombres que desea ingresar"));
   
   String nombres = "";
   
   for (int i =0; i < n; i++) {
	   String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona" + (i + 1)+ ":");
	   nombres += nombre + \n;
   }
   
   JOptionPane.showMessageDialog(null, "los nombres ingresados son:\n" + nombres);
	}

}
