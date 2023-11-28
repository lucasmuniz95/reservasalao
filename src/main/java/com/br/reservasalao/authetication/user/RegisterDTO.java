package com.br.reservasalao.authetication.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
