/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.tsproject.repo;

import com.ifpe.tsproject.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class UsuarioRepositorio {

    private List<Usuario> usuarios;

    public UsuarioRepositorio() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public boolean addUsuario(Usuario u) {
        return this.usuarios.add(u);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
}
