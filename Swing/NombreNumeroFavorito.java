import javax.swing.JOptionPane;

public class NombreNumeroFavorito {

	public static void main(String[] args) {
		
		int option;
		
		do {
			
			String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
			String numero = JOptionPane.showInputDialog("¿Cuál es tu número favorito?");
			
			JOptionPane.showMessageDialog(null,  "Hola, " + nombre + ", ¡tú número favorito es el " + numero + "!");
			
			option = JOptionPane.showConfirmDialog(null,  "¿Quieres continuar?", "Swing", JOptionPane.YES_NO_OPTION);
			
		}while (option == JOptionPane.YES_OPTION);

	}

}
