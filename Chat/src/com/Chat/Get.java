package com.Chat;
import java.net.*;

public class Get {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024];
		DatagramSocket ds = new DatagramSocket(963);
		DatagramPacket dp = new DatagramPacket(buf,1024);
		System.out.println("wait...");
		ds.receive(dp);
		String str = new String(dp.getData(),0,dp.getLength())
				+" from "+dp.getAddress().getHostAddress()
				+":"+dp.getPort();
		System.out.println(str);
		ds.close();
	}
}
