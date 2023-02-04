/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ifpe.tsproject;

import com.ifpe.tsproject.modelo.Usuario;
import com.ifpe.tsproject.negocio.UsuarioNegocio;
import com.ifpe.tsproject.repo.UsuarioRepositorio;

/**
 *
 * @author ALUNO
 */
public class TSProject {

    public static void main(String[] args) {

        UsuarioRepositorio ur = new UsuarioRepositorio();

        Usuario correctUsuario = new Usuario("Lucas Henrique Costa de Arruda", "01/06/2001", "lucashc@gmail.com", "40028922", "luc147as", "123456789Lucas", "54750000", "Av. Prof Luís Freire 500", "Várzea", "Pernambuco", "Brasil");

        String confirmarSenha = "123456789Lucas";

        UsuarioNegocio usrNgc = new UsuarioNegocio(ur);

        System.out.println(usrNgc.cadastrarUsuario(correctUsuario, confirmarSenha));
    }
}
