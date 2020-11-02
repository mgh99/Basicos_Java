import javax.swing.JOptionPane;

public class ComoTeLlamas {
	
	public static void main(String[] args) {
		
		int op1;
		
		do {
			
			Object[] opciones = {"Chico", "Chica"};
			
			String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
			String dia = JOptionPane.showInputDialog("¿Cuál es tú día de nacimiento?");
			String mes = JOptionPane.showInputDialog("Mes de nacimiento en número");
			String año = JOptionPane.showInputDialog("Año de nacimiento");
			
			int opcion = JOptionPane.showOptionDialog(null, "Eres chico o chica",
					"Swing", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			JOptionPane.showMessageDialog(null,  "Hola, " + nombre + 
					" has nacido el dia " + dia + " del mes " + mes + " del año " + año +
					". Y eres " + opciones[opcion]);
			
			op1 = JOptionPane.showConfirmDialog(null,  "¿Quieres continuar?", "Swing", JOptionPane.YES_NO_OPTION);
			
		}while(op1 == JOptionPane.YES_OPTION);
		
		
		
	}

}
