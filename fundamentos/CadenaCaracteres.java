package fundamentos;

// almacena cadena de caracteres delimitados por "

/* ofrece metodos como:
 * length()
 * charAt()
 * tolowerCase()
 * toUpperCase()
 * toCharArray()
 * equals()
 */

public class CadenaCaracteres {

	public static void main(String[] args) {

		String palabra = "hola";
		
		//usando el metodo charAt(k)
		
		for(int i = 0; i < palabra.length(); i++) {
			
			System.out.print(palabra.charAt(i));
		}
		
		 System.out.println("\t");
				
		for (int i = palabra.length()-1; i >= 0; i--) {
			
			System.out.print( palabra.charAt(i));
		}
		
		 System.out.println("\n");

		 //usando el metodo toCharArray()

		 char [] letras = palabra.toCharArray();

		 for(int i = 0; i < letras.length; i++) {

			 System.out.print(letras[i]);
		 }
		 
		 System.out.println("\t");

		 for(int i = letras.length - 1; i >= 0; i--) {

			 System.out.print(letras[i]);
		 }
		 
		 System.out.println("\n");
		 
		 //un array se puede recorrer con un for para todo
		 
		 for(char c : letras) {
			 
			 System.out.print(c);
		 }
		
	}
}
