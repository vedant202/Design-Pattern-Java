package com.DesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	private List<String> getDomains=new ArrayList<String>();
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + getDomains + "]";
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}

	// In this method trying to mimic expensive method calls
	public String getNetworkConnection() {
		System.out.println("Trying to get network connection....");
		getDomains.add("www.codewithdurgesh.com");
		getDomains.add("www.facebook.com");
		getDomains.add("www.google.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "Setting important data";
	}
	
	public List<String> getGetDomains() {
		return getDomains;
	}

	public void setGetDomains(List<String> getDomains) {
		this.getDomains = getDomains;
	}

	//For shallow copy
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		
//		
//		return super.clone();
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		NetworkConnection conn = new NetworkConnection();
		conn.setIp(this.ip);
		conn.setImportantData(this.importantData);
		List<String> domains = new ArrayList<String>();
		
		for(String i:this.getDomains) {
			domains.add(i);
		}
		conn.setGetDomains(domains);
		
		return conn;
	}
	
	
}
