package com.Company.security;

import com.Company.security.internal.TokenManager;

public class SecurityFacade {

		    private TokenManager tokenManager = new TokenManager();

		    public String createToken(String user) {
		        return tokenManager.generateToken(user);
		    }

		    public boolean checkToken(String token) {
		        return tokenManager.validateToken(token);
		    }
		}
