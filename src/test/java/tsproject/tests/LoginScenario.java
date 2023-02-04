/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsproject.tests;

import com.ifpe.tsproject.modelo.Usuario;
import com.ifpe.tsproject.negocio.LoginNegocio;
import com.ifpe.tsproject.repo.UsuarioRepositorio;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ALUNO
 */

public class LoginScenario {
    
    UsuarioRepositorio ur;
    
    
    @Before
    public void addCorrectUsuario() {
        
        ur = new UsuarioRepositorio();
        
        Usuario correctUsuario = new Usuario();
        correctUsuario.setEmail("lucas@gmail.com");
        correctUsuario.setSenha("123456789");
        correctUsuario.setUserName("lucashca");
        
        ur.addUsuario(correctUsuario);
    }
    
    @Test
    public void loginDadosCorretos() {
        String email = "lucas@gmail.com";
        String senha = "123456789";
        
        LoginNegocio loginNgc = new LoginNegocio(ur);
        
        assertTrue(loginNgc.logar(email, senha));
    }
    
    @Test
    public void loginEmailInvalido() {
        String email = "luc@gmail.com";
        String senha = "123456789";
        
        LoginNegocio loginNgc = new LoginNegocio(ur);
        
        assertFalse(loginNgc.logar(email, senha));
    }
    
    @Test
    public void loginSenhaIncorretaEmailCorreto() {
        String email = "lucas@gmail.com";
        String senha = "123456789L";
        
        LoginNegocio loginNgc = new LoginNegocio(ur);
        
        assertFalse(loginNgc.logar(email, senha));
    }
    
    @Test
    public void loginUserNameIncorreto() {
        String username = "lucas12XD";
        String senha = "123456789";
        
        LoginNegocio loginNgc = new LoginNegocio(ur);
        
        assertFalse(loginNgc.logar(username, senha));
    }
    
    @Test
    public void loginUserNameCorretoSenhaIncorreta() {
        String username = "lucashca";
        String senha = "123456789L";
        
        LoginNegocio loginNgc = new LoginNegocio(ur);
        
        assertFalse(loginNgc.logar(username, senha));
    }
    
    
    
}
