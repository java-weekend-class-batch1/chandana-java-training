package com.Company.security.internal;

public class TokenManager {

		    // Package-private method
		    public String generateToken(String user) {
		        return "TOKEN_" + user + "_" + System.currentTimeMillis();
		    }

		    // Package-private method
		    public boolean validateToken(String token) {
		        return token != null && token.startsWith("TOKEN_");
		    }
		}

