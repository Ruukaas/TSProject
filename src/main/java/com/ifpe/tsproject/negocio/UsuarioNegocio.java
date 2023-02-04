/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.tsproject.negocio;

import java.util.List;

import com.ifpe.tsproject.modelo.Usuario;
import com.ifpe.tsproject.modelo.localização;
import com.ifpe.tsproject.repo.UsuarioRepositorio;

/**
 *
 * @author ALUNO
 */
public class UsuarioNegocio {

    private UsuarioRepositorio repo;

    private List<localização> locais;

    public UsuarioNegocio(UsuarioRepositorio rep) {
        this.repo = rep;
    }

    public UsuarioNegocio(UsuarioRepositorio rep, List<localização> lcs) {
        this.repo = rep;
        this.locais = lcs;
    }

    public boolean cadastrarUsuario(Usuario u, String confirmarSenha) {
        boolean ret = false;

        //Validação de obrigatoriedade
        if (u.getFullName().isEmpty() || u.getDataDeNascimento().isEmpty() || u.getEmail().isEmpty() || u.getTelefone().isEmpty() || u.getUserName().isEmpty() || u.getSenha().isEmpty() || confirmarSenha.isEmpty()) {
            return ret;
        }

        //Visualizando se apenas o CEP das informações de localização foi preenchido, para preencher os outros a partir dele
        if(locais != null) {
            if(!(u.getCEP().isEmpty()) && u.getEndereço() == null && u.getBairro() == null && u.getEstado() == null && u.getPaís() == null) {
                for(localização lc : locais) {
                    if(u.getCEP().equals(lc.getCEP())) {
                        u.setEndereço(lc.getEndereço());
                        u.setBairro(lc.getBairro());
                        u.setEstado(lc.getEstado());
                        u.setPaís(lc.getPaís());
                        break;
                    }
                }
            }
        }

        //Validação de ser único
        for (Usuario usr : repo.getUsuarios()) {
            if (usr.getEmail().equals(u.getEmail()) || usr.getTelefone().equals(u.getTelefone()) || usr.getUserName().equals(u.getUserName())) {
                return ret;
            }
        }

        //Validação de senha com no mínimo oito chars, um número e uma letra maiuscula
        if(u.getSenha().length() < 8) {
            return ret;
        }
        
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        
        for (int i = 0; i < u.getSenha().length(); i++) { // para todos os caracteres da string
            char c = u.getSenha().charAt(i); // pegar o caractere
            
            if(hasUpperCase && hasNumber) break;

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;               
            } 
        }
        
        if(!(hasUpperCase && hasNumber)) {
            return ret;
        }
        
        //Validação de senha igual ao confirmarSenha
        if(!(u.getSenha().equals(confirmarSenha))) {
            return ret;
        }
            ret = this.repo.addUsuario(u);
            return ret;
    }
}
