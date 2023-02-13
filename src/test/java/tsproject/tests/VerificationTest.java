/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsproject.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ifpe.tsproject.modelo.UserValidation;
import com.ifpe.tsproject.negocio.UserValidationNegocio;

/**
 *
 * @author ALUNO
 */
public class VerificationTest {

    
        @Test
    public void testVerificationOK() {
        UserValidation user = new UserValidation("andre@gmail.com", "81196546", true, "1011");
       
        assertTrue(UserValidationNegocio.UserValidation(user));
    }
    
    @Test
    public void testVerificationPhone() {
        UserValidation user = new UserValidation("andre@gmail.com", "81196546", true, "1011");
        
        assertTrue(UserValidationNegocio.UserValidation(user));
    }

    @Test
    public void wrongEmail() {
        UserValidation user = new UserValidation("andregmail.com", "81196546", true, "1011");
        
        assertFalse(UserValidationNegocio.UserValidation(user));
    }

     @Test
    public void wrongNumber() {
        UserValidation user = new UserValidation("andre@gmail.com", "8119654654864", true, "1011");
        
        assertFalse(UserValidationNegocio.UserValidation(user));
    }

   

}
