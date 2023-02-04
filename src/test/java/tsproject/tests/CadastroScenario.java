package tsproject.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ifpe.tsproject.modelo.Usuario;
import com.ifpe.tsproject.modelo.localização;
import com.ifpe.tsproject.negocio.UsuarioNegocio;
import com.ifpe.tsproject.repo.UsuarioRepositorio;

public class CadastroScenario {

    static UsuarioRepositorio ur;
    List<localização> locais;
    localização local;

    @Before
    public void addUsuario() {
        local = new localização("54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco","Brasil");
        locais = new ArrayList<localização>();
        locais.add(local);
        ur = new UsuarioRepositorio();

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucas321321@gmail.com",
                "40028923", "luc146", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco",
                "Brasil");

        ur.addUsuario(currentUsuario);
    }

    @BeforeClass
    public static void refreshRepositorio() {

        ur = new UsuarioRepositorio();

    }

    @Test
    public void cadastroDadosCorretos() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea",
                "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertTrue(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroFullNameVazio() {

        Usuario currentUsuario = new Usuario("", "01/06/2001", "lucashc@gmail.com", "40028922", "luc147as",
                "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroDataNascimentoVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "", "lucashc@gmail.com", "40028922",
                "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroEmailVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "", "40028922", "luc147as",
                "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroTelefoneVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com", "",
                "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroUsernameVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea",
                "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroSenhaVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroConfirmarSenhaVazio() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea",
                "Pernambuco", "Brasil");

        String confirmarSenha = "";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroEmailJaCadastrado() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucas321321@gmail.com",
                "40028923", "luc146", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco",
                "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroTelefoneJaCadastrado() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucas321321@gmail.com",
                "40028923", "luc146", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco",
                "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroUsernameJaCadastrado() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucas321321@gmail.com",
                "40028923", "luc146", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco",
                "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroSenhaSemCumprirRequisitos() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "1", "54750000", "Av. Prof Luís Freire 500", "Várzea",
                "Pernambuco", "Brasil");

        String confirmarSenha = "1";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroConfirmarSenhaDiferenteDoSenha() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea",
                "Pernambuco", "Brasil");

        String confirmarSenha = "1";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        assertFalse(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }

    @Test
    public void cadastroComCEPPreenchendoOutrosCampos() {

        Usuario currentUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com",
                "40028922", "luc147as", "123456789Lucas", "54750000");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur,locais);

        assertTrue(usrNgc.cadastrarUsuario(currentUsuario, confirmarSenha));
    }
}
