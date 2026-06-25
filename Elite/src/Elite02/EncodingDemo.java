package Elite02;

import java.util.Base64;
import java.util.Base64.*;

public class EncodingDemo {
	public static void main(String[] args) {
		String pass="Nikhil@123";
		System.out.println(pass);
		
		Encoder encode=Base64.getEncoder();
		String encoded=encode.encodeToString(pass.getBytes());
		System.out.println(encoded);
		
		Decoder decoder=Base64.getDecoder();
		byte[] decoded=decoder.decode(encoded.getBytes());
		System.out.println(new String(decoded)+"abc");
	}

}
