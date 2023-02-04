/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.tsproject.negocio;

import com.ifpe.tsproject.modelo.Usuario;
import com.ifpe.tsproject.repo.UsuarioRepositorio;

/**
 *
 * @author ALUNO
 */
public class LoginNegocio {

    private UsuarioRepositorio repo;

    public LoginNegocio(UsuarioRepositorio rep) {
        this.repo = rep;
    }

    public boolean logar(String login, String senha) {
        boolean ret = false;

        for (Usuario usr : repo.getUsuarios()) {
            if ((usr.getEmail().equals(login) || usr.getUserName().equals(login)) && usr.getSenha().equals(senha)) {
                ret = true;
                break;
            }
        }
        return ret;
    }
}
