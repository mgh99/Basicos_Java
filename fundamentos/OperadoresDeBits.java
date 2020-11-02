public class OperadoresDeBits {

	public static void main(String[] args) {

		//  OPERADORES LOGICOS
		/* 
		 * && AND -> cuando se cumple todas las condiciones (y)
		 * || OR ->cuando se cumple una de las condiciones (o)
		 * ! NOT -> cuando es la negación de una condicion
		 */
		
		//OPERADORES DE BITS
		/*
		 * & AND
		 * | OR
		 * ^ XOR
		 * ~ NOT
		 * << despalazamiento de bits a la izquierda
		 * >> desplazamiento de bits a la derecha
		 * 
		 */
		
		//para asignar el b¡valor binario pongo el prefijo 0b
		// si es octal pongo el prefijo 0
		//y 0x hexadecimal
		
		int binario = 0b10111010;       // 0xBA, 186 en decimal
		int octal = 010;				// 0x08, 8 en decimal
		int hexadecimal = 0x2F;			// 0x2F, 47 en decimal
		
		int total = (binario + octal + hexadecimal);
		
		System.out.println("Binario \t" + binario + "\t 0x" + String.format("%x",  binario) 
							+ "\t 0b" + Integer.toBinaryString(binario));
		
		System.out.println("Octal  \t" + octal + "\t 0x" + String.format("%x", octal).toUpperCase()
							+ "\t ob" + Integer.toBinaryString(octal));
		
		System.out.println("Hexadecimal \t" + hexadecimal + "\t 0x" + String.format("%x", hexadecimal).toUpperCase()
							+ "\t 0b" + Integer.toBinaryString(hexadecimal));
		
		System.out.println("Total \t" + total + "\t 0x" + String.format("%x", total).toUpperCase()
							+ "\t 0b" + Integer.toBinaryString(total) + "\n");
		
		
		int r1 = total & 0xD8; // 0xF1 & 0xD8 = 0xD0
		int r2 = total | 0xA7; // 0xF1 | 0xA7 = 0xF7
		int r3 = total ^ 0x5A; // 0xF1 ^ 0x5A = 0xAB
		
		System.out.println("Total & 0xD8 \t" + r1 + "\t 0x" + String.format("%x", r1).toUpperCase() 
							+ "\t 0b" + Integer.toBinaryString(r1));
		
		System.out.println("Total | 0xA7 \t" + r2 + "\t 0x" + String.format("%x", r2).toUpperCase()
							+ "\t 0b" + Integer.toBinaryString(r2));
		
		System.out.println("Total ^ 0x5A \t" + r3 + "\t 0x" + String.format("%x", r3).toUpperCase()
							+ "\t 0b" + Integer.toBinaryString(r3));
		
		System.out.println("");
		
		
		// uso de desplazamiento de bits y máscaras para extraer
		// las direcciones de una ip
		
		long ip = 3232235778L;
		
		System.out.println("ip decimal \t" + ip);
		String bin = Long.toBinaryString(ip);
		System.out.println("ip binario \t" + bin);
		
		short []ips = new short[4];
		
		ips[3] = (short) (ip >> 24 & 0xFF);
		ips[2] = (short) (ip >> 16 & 0xFF);
		ips[1] = (short) (ip >> 8 & 0xFF);
		ips[0] = (short) (ip & 0xFF);
		
		System.out.println("ip hexadecimal \t0x" + String.format("%x", ip).toUpperCase());
		
		System.out.print("ip \t\t");
		System.out.print(ips[3] + ".");
		System.out.print(ips[2] + ".");
		System.out.print(ips[1] + ".");
		System.out.println(ips[0]);

	}

}
