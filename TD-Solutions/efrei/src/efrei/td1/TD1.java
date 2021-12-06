package efrei.td1;

public class TD1 {

	public static String padLeft(String inputString, char character, int length) {
		if (inputString.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		while (sb.length() < length - inputString.length()) {
			sb.append(character);
		}
		sb.append(inputString);

		return sb.toString();
	}

	public static String toBinaryString(int num) {
		String s = "";
		while (num > 0) {
			s = num % 2 + s;
			num /= 2;
		}
		return s;
	}
	
	public static String toBinaryStringWithBuilder(int num) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			sb.insert(0,  num % 2);
			num /= 2;
		}
		return sb.toString();
	}

	public static String toHexString(int num) {
		StringBuilder s = new StringBuilder();
		final char[] HEX_CHARS = { '0', '1', '2', '3', '4','5','6','7','8','9','A','B', 'C', 'D', 'E','F'};
		while(num > 0) {
			s.insert(0, HEX_CHARS[num % 16]);
			num /= 16;
		}
		return s.toString();
	}
	
	public static String toHexStringASCII(int num) {
		StringBuilder s = new StringBuilder();
		while(num > 0) {
			int mod = num % 16;
			if(mod < 10) {
				s.insert(0, mod);				
			}else {
				s.insert(0, (char)(55 + mod));
			}
			
			num /= 16;
		}
		return s.toString();
	}

	public static void main(String[] args) {
//		System.out.println(Integer.toBinaryString(547));
//		System.out.println(Main.toBinaryString(547));
//		System.out.println(Main.toBinaryStringWithBuilder(27));
//		System.out.println(Integer.toHexString(27).toUpperCase());
//		System.out.println(Main.toHexString(27));
//		System.out.println(Main.toHexStringASCII(27));
		
		System.out.println(TD1.padLeft(TD1.toBinaryString(22), '0', 8));
		System.out.println(TD1.padLeft(TD1.toBinaryString(22 >> 2), '0', 8));
		System.out.println(TD1.padLeft(TD1.toBinaryString(22 << 2), '0', 8));
	}

}
