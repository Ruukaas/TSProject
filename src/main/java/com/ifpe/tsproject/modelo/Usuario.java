/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.tsproject.modelo;

/**
 *
 * @author ALUNO
 */
public class Usuario {
    private String fullName;
    private String DataDeNascimento;
    private String email;
    private String telefone;
    private String userName;
    private String senha;
    private String CEP;
    private String endereço;
    private String bairro;
    private String estado;
    private String país;

    public Usuario(String fullName, String dataDeNascimento, String email, String telefone, String userName,
            String senha, String cEP) {
        this.fullName = fullName;
        DataDeNascimento = dataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.userName = userName;
        this.senha = senha;
        CEP = cEP;
    }

    public Usuario(String fullName, String DataDeNascimento, String email, String telefone, String userName, String senha, String CEP, String endereço, String bairro, String estado, String país) {
        this.fullName = fullName;
        this.DataDeNascimento = DataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.userName = userName;
        this.senha = senha;
        this.CEP = CEP;
        this.endereço = endereço;
        this.bairro = bairro;
        this.estado = estado;
        this.país = país;
    }

    public Usuario() {
    }
    
    

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }
    
}
