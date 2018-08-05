package networking_DOC;

import java.net.*;

public class InetAddress {

	public static void main(String[] args)throws Exception 
	{
		InetAddress myIp = InetAddress.getLocalHost();
		
		System.out.println("The I P address is:\n");
		
		System.out.println(myIp.getHostAddress());
	}

}
