public class TiposNumericos {

	public static void main(String [] args) {
		
		byte b; //1 byte complemento a 2 (8bits), [-128 a +127]
		short s; //2 bytes complemento a 2 (16 bits), [-32768 a +32767]
		int i; //4 bytes complemento a 2 (32 bits), [-2147483648 a +2147483647]
		
		b = -1;
		System.out.println("byte    " + b);		
		b++;
		System.out.println("byte++    " + b);		
		b++;
		System.out.println("byte++    " + b);	
		b = 127;
		System.out.println("byte    " + b);
		b++;
		System.out.println("byte++    " + b);	
		b++;
		System.out.println("byte++    " + b);		
		b--;
		System.out.println("byte--    " + b);		
		b--;
		System.out.println("byte--    " + b + "\n");
		
		s = -1;
		System.out.println("byte    " + s);		
		s++;
		System.out.println("byte++    " + s);		
		s++;
		System.out.println("byte++    " + s);	
		s = 32767;
		System.out.println("byte    " + s);
		s++;
		System.out.println("byte++    " + s);	
		s++;
		System.out.println("byte++    " + s);		
		s--;
		System.out.println("byte--    " + s);		
		s--;
		System.out.println("byte--    " + s + "\n");
		
		i = -1;
		System.out.println("byte    " + i);		
		i++;
		System.out.println("byte++    " + i);		
		i++;
		System.out.println("byte++    " + i);	
		i = 2147483647;
		System.out.println("byte    " + i);
		i++;
		System.out.println("byte++    " + i);	
		i++;
		System.out.println("byte++    " + i);		
		i--;
		System.out.println("byte--    " + i);		
		i--;
		System.out.println("byte--    " + i + "\n");
	}
}
