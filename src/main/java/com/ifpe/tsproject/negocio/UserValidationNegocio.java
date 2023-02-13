package com.ifpe.tsproject.negocio;

import com.ifpe.tsproject.modelo.UserValidation;
import com.ifpe.tsproject.repo.UserValidationRepo;

public class UserValidationNegocio {

    private static UserValidationRepo rep = new UserValidationRepo();

    public static boolean UserValidation(UserValidation u) {

        


        if((validNumber(u.getNumber()) && validEmail(u.getEmail())) && (verifyEmail(u.getConfirmationCode()) || verifyNumber(u.getConfirmationCode()))) {
            rep.addUserValidation(u);
            return true;
        }
        return false;
    }

    public static boolean verifyEmail(String i) {
        if (i.equals("1011")) {
            return true;
        }
        return false;
    }

    public static boolean verifyNumber(String i) {
        if (i.equals("1011")) {
            return true;
        }
        return false;
    }

    

    public static boolean validNumber(String number) {
        if(number.length() < 8 || number.length() > 11) {
            return false;
        } 
        return true;
    }

    public static boolean validEmail(String email) {
        if(email.contains("@")) {
            return true;
        }
        return false;
    }

    // Boolean result = UsuarioNegocio.verifyEmail(u.getconfirmationCode());
    // if (result == false) {
    //     return false;
    // }
    //         if ("andre@gmail.com".equals(u.getEmail())) {
    //             return false;
    //         }
    // if (u.getIsActive() == false) {
    //     return false;
    // }
}
