package com.example.Model;
public class PruebaResponse {
    private String message;

    public PruebaResponse(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}