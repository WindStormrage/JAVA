package com.Chat;
import java.net.*;

public class Send {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(656);
		String str = "hello world";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),
				InetAddress.getByName("localhost"),963);
		System.out.println(dp);
		ds.send(dp);
		ds.close();
	}

}
