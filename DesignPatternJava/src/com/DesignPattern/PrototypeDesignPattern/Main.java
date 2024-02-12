package com.DesignPattern.PrototypeDesignPattern;

public class Main {
	public static void main(String[] args) {
		NetworkConnection nConnection = new NetworkConnection();
		nConnection.setIp("198:162:4:2");
		
		String impdata = nConnection.getNetworkConnection();
		System.out.println(impdata);
		nConnection.setImportantData(impdata);
		
		System.out.println(nConnection);
		
		System.out.println("------Now copying object---------");
		
		try {
			NetworkConnection nCon2 = (NetworkConnection) nConnection.clone();
			nConnection.getGetDomains().remove(0);
			System.out.println(nConnection);
			System.out.println(nCon2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
