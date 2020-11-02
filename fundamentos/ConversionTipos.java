package fundamentos;

public class ConversionTipos {

	public static void main(String[] args) {

		byte b;
		char c;
		short s;
		int i ;
		long l;
		float f;
		
		//conversion implicita de tipos
		//
		//un tipo de darto entero o rela se conb¡vierte implícitamente a otro tipo entero o real
		//si el tipo de dato tiene suficiente capacidad para almacenar el tipo de dato origen
		
		b = 125;
		s = b;
		
		System.out.println("Casting implicito \n");
		System.out.println("byte " + b + "\t short = byte \t short " + s);
		
		s =32767;
		i = s;
		
		System.out.println("short " + s + "\t int = short \t int " + i);
		
		l = i;
		
		System.out.println("int " + i + "\t long = int \t long " + l);
		
		f = i;
		
		System.out.println("int " + i + "\t float = int \t float " + f);
		
		// b = s; no podemos almacenar un tipo short en un byte
		
		//conversion explícita de tipos (casting): puede provocar pérdida de datos en tiempo de
		//ejecución
		
		System.out.println("\nCasting explicito \n");
		
		c = 65;
		c = 'A';
		s = (short) c;
		
		System.out.println("char " + c + "\t\t short = char \t short " + s);
		
		s++;
		c = (char) s;
		
		System.out.println("short " + s + "\t\t char = short \t char " + c);
		
		s = 125;
		b = (byte) s;
		
		System.out.println("short " + s + "\t\t byte = short \t byte " + b);
		
		s = -134;
		b = (byte) s;
		
		System.out.println("short " + s + "\t\t byte = short \t byte " + b);

	}

}
