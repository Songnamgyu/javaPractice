package com.song.practice.network.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Application {

	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress localIp = InetAddress.getLocalHost();
		
		System.out.println(localIp.getHostAddress());
		System.out.println(localIp.getHostName());
		
		InetAddress naverIp = InetAddress.getByName("www.naver.com");
		//naver를 찾아갈수 있는 ip주소
		System.out.println(naverIp.getHostAddress());

		InetAddress[] googleIp = InetAddress.getAllByName("www.google.com");
		
		for(InetAddress ip : googleIp) {
			System.out.println(ip.getHostAddress());
		}
	}

}
