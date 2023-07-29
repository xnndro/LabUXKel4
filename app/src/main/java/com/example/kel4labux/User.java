package com.example.kel4labux;

public class User {
    private static User instance;
    private String email;
    private int accBal = 10;

    public User() {
        this.email = email;
        this.accBal = accBal;
    }

    public static User getInstance(){
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccBal() {
        return accBal;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }
}
