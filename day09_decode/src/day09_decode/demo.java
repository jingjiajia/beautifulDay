package day09_decode;


import java.net.URLDecoder;
import java.net.URLEncoder;

public class demo {

	public static void main(String[] args) throws Exception {
		String encode = URLEncoder.encode("王帅是一个大Sb","UTF-8");
		String decode = URLDecoder.decode("%e7%b2%97%e4%ba%ba","UTF-8");
		System.out.println(encode);
		System.out.println(decode);
		
	}

}
