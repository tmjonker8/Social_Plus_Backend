package com.tmjonker.socialmediabackend.dto;

public class UsernameDTO {

    private String username;

    public UsernameDTO(String username) {
        this.username = username;
    }

    public UsernameDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
