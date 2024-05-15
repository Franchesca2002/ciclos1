import javax.swing.JOptionPane;

public class restaurante {
	private static final String CantidadPlatosProcesados = null;
	private static final int cantPlatosTipicos = 0;
	private static final int PRECIO_PLATO_TIPICO = 0;
	private static final int cantPlatosCarta = 0;
	private static final int PRECIO_PLATO_CARTA = 0;
	private static final int cantPlatosInternacional = 0;
	private static final int PRECIO_PLATO_INTERNACIONAL = 0;
	
	String nombreUsuario = JOptionPane.showInputDialog("Bienvenido al Restaurante. Por favor, ingrese su nombre:");
	
	JOptionPane.showMessageDialog(null, "Hola" + nombreUsuario + "! Bienvenido al restaurante");
	int codMenuPpal=0;
	int platosTipicos =0;
	double costoTotal =0;
	int  cantidadPlatos =0;
	private String factura;
	private int platoTipico, procesados=0;
	
			
	do {
		string menu= "Menu RESTAURANTE\n\n";
		menu+="1. Plato Tipico\n";
		menu+="2. Plato a la Carta\n";
		menu+="3. Plato Internacional\n";
		menu+="4. Salir\n";
		menu+="Por favor seleccione una opcion \n";
		codMenuPpal=Integer.parseInt(JOptionPane.ShowInputDialog(menu));
		
		string menuTipico= "Menu TIPICO\n\n";
		menu+="1. Plato Tipico\n";
		menu+="2. Plato a la Carta\n";
		menu+="3. Plato Internacional\n";
		menu+="4. Salir\n";
		menu+="Por favor seleccione una opcion \n";
		codMenuPpal=Integer.parseInt(JOptionPane.ShowInputDialog(menu));
		
		string menuCarta= "Menu a la CARTA\n\n";
		menu+="1. Plato Tipico\n";
		menu+="2. Plato a la Carta\n";
		menu+="3. Plato Internacional\n";
		menu+="4. Salir\n";
		menu+="Por favor seleccione una opcion \n";
		codMenuPpal=Integer.parseInt(JOptionPane.ShowInputDialog(menu));
		
		string menuInternacional= "Menu INTERNACIONAL\n\n";
		menu+="1. Plato Tipico\n";
		menu+="2. Plato a la Carta\n";
		menu+="3. Plato Internacional\n";
		menu+="4. Salir\n";
		menu+="Por favor seleccione una opcion \n";
		codMenuPpal=Integer.parseInt(JOptionPane.ShowInputDialog(menu));
		
		switch (codMenuPpal) {
		case 1:
			JOptionPane.showMessageDialog(null, "Menu 1 - Plato Tipico");
			platoTipico++;
			costoTotal+= 30.00;
		     break;
		case 2:
			JOptionPane.showMessageDialog(null, "Menu 2 - Plato a la Carta");
			costoTotal += 40.00;
			
		     break;
		case 3:
			JOptionPane.showMessageDialog(null, "Menu 3 - Plato Internacional");
			costoTotal += 45.00;
		     break;
		case 4:
			JOptionPane.showMessageDialog(null, "Menu 4 - salir");
		     break;
		default:
			JOptionPane.showMessageDialog(null, "No corresponde a un" 
		            +"codigo valido", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					break;
		}
		while (codMenuPpal!=4);
		
		JOptionPane.showMessageDialog(null,  "cantidad de platos procesados:" + CantidadPlatosProcesados);
		
		if(cantPlatosTipicos >0)
			   factura+="Platostipicos x "+cantPlatosTipicos+" = $"+(cantPlatosTipicos * PRECIO_PLATO_TIPICO)+"\n";
		if(cantPlatosCarta >0);
		
		if(cantPlatosCarta >0)
			   factura+="PlatosCarta x "+cantPlatosCarta+" = $"+(cantPlatosCarta * PRECIO_PLATO_CARTA)+"\n";
		if(cantPlatosInternacional >0);
		
		if(cantPlatosInternacional >0)
			   factura+="PlatosInternacional x "+cantPlatosInternacional+" = $"+(cantPlatosInternacional * PRECIO_PLATO_INTERNACIONAL)+"\n";
		if(codMenuPpal >0);
		
		
	}
	

}


String factura1 = "FACTURA\n";
factura1 += "Nombre:" + nombreUsuario +"\n";
factura1 += "Cantidad de platos tipicos:" + PlatosTipicos + "\n";
factura1 += "Costo unitario por plato tipico: $30.00\n";
factura1 += "Costo total: $" + CostoTotal + "\n";


JOptionPane.showMessageDialog(null, factura1);
