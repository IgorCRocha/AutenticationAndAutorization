package com.example.AutenticationAPI.service;

import com.example.AutenticationAPI.security.JwtUtil;
import org.springframework.stereotype.Service;

/**
 * Serviço responsável por operações relacionadas á autenticação e geração de tokens JWT
 * */
@Service
public class AuthService {

    /**
     *Gera um token JWT para o nome de usuario fornecido.
     *
     *@param username O nome de usuário para o qual um token JWT será gerado.
     *@return Uma String contendo o token JWY gerado.
     */

    public String generateToken(String username) {
        String token = JwtUtil.generateToken(username);
        return token;
    }

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;
    }
}