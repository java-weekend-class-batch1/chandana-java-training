package com.Company.app;

	import com.Company.security.SecurityFacade;

	public class Main {
	    public static void main(String[] args) {

	        SecurityFacade security = new SecurityFacade();

	        String token = security.createToken("Chandana");
	        System.out.println("Generated Token: " + token);

	        boolean valid = security.checkToken(token);
	        System.out.println("Is token valid? " + valid);

	      
	    }
	}
