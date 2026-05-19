package com.project.back_end.services;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class TokenService {

    // 1. User login hone par ek unique Secure Token generate karne ka method
    public String generateToken(String username) {
        // UUID ka use karke ek random unique string generate kar rahe hain
        return "TOKEN_" + UUID.randomUUID().toString() + "_" + username;
    }

    // 2. Token ko validate karne ka method
    public boolean validateToken(String token) {
        if (token != null && token.startsWith("TOKEN_")) {
            return true;
        }
        return false;
    }
}
