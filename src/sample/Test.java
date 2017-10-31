package sample;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Test {
	public static void main(String[] args) throws UnknownHostException {
		
		String ip ="";
		String sysname ="";
		
		InetAddress adr;
		adr = InetAddress.getByName(sysname);
		System.out.println(adr);
		
		adr =InetAddress.getLocalHost();
		System.out.println("system name :  "+adr);
		
		adr = InetAddress.getLoopbackAddress();
		System.out.println(adr);
		
		
		
	}

}
