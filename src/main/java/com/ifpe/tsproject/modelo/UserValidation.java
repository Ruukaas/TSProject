package com.ifpe.tsproject.modelo;

public class UserValidation {
    private String Email;
    

    private String Number;
   

    private boolean IsActive;
  

    private String confirmationCode;

   

    public UserValidation(String Email, String Number, boolean IsActive, String confirmationCode) {
        this.Email = Email;
        this.Number = Number;
        this.IsActive = IsActive;
        this.confirmationCode = confirmationCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

     public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean isActive) {
        IsActive = isActive;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }


}