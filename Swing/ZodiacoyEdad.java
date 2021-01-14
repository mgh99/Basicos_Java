package Swing;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ProgramaZodiaco {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");

		int año =Integer.valueOf(JOptionPane.showInputDialog("¿En que año naciste "+nombre+"?"));
		
		
		Month[] meses=Month.values();

			int mes=JOptionPane.showOptionDialog(null,"¿En que mes naciste?",
					"Swing", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, meses,meses[0]);

			LocalDate fecha=LocalDate.of(año, mes+1, 1);//año,mes,dia
			
			
		Object [] dias= new Object [Month.of(mes+1).length(fecha.isLeapYear())];

		for(int i=1;i<=dias.length;i++) dias[i-1]=i;

		int dia=JOptionPane.showOptionDialog(null,"¿Que dia naciste?",
				"Swing", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, dias,dias[0]);

		fecha=fecha.withDayOfMonth(dia+1);
		
		Period edad = Period.between(LocalDate.of(año, mes+1, dia+1), LocalDate.now());
		System.out.println(String.format("%d años, %d meses y %d días",
		        edad.getYears(),
		        edad.getMonths(),
		        edad.getDays()));
		
		JOptionPane.showMessageDialog(null,  nombre +
				" has nacido en " + fecha + " por lo tanto tines " +
				String.format("%d años, %d meses y %d días",
				        edad.getYears(),
				        edad.getMonths(),
				        edad.getDays()));
		
		switch(mes + 1) {
		case 1: //Enero
			if(dia >= 20) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Acuario" );
			}else if(dia < 20) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Capricornio");
			}
			break;
		case 2: //Febrero
			if(dia >= 19) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Piscis");
			}else if(dia < 19){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Acuario");
			}
			break;
		case 3: //Marzo
			if(dia >= 21) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Aries");
			}else if (dia < 21){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Piscis");
			}
			break;
		case 4: //Abril
			if(dia >= 20) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Tauro");
			}else if(dia < 20){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Aries");
			}
			break;
		case 5: //Mayo
			if(dia >= 21) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Géminis");
			}else if(dia < 21){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Tauro");
			}
			break;
		case 6: //Junio
			if(dia >= 21) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Cáncer");
			}else if(dia < 21){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Géminis");
			}
			break;
		case 7: //Julio
			if(dia >= 23) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Leo");
			}else if(dia < 23){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Cáncer");
			}
			break;
		case 8: //Agosto
			if(dia >= 23) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Virgo");
			}else if(dia < 23){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Leo");
			}
			break;
		case 9: //Septiembre
			if(dia >= 23) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Libra");
			}else if(dia < 23){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Virgo");
			}
			break;
		case 10: //Octubre
			if(dia >= 23) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Escorpio");
			}else if(dia < 23){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Libra");
			}
			break;
		case 11: //Noviembre
			if(dia >= 22) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Sagitario");
			}else if(dia < 22){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Escorpio");
			}
			break;
		case 12: //Diciembre
			if(dia >= 22) {
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Capricornio");
			}else if(dia < 22){
				JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", tú símbolo del zodiaco es: Sagitario");
			}
			break;
		}
	}

}
