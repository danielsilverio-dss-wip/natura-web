package br.com.omega.naturaweb.repository.impl;

public class Url {
	
	private static String url = "http://localhost:8081";

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Url.url = url;
	}
	
	

}
