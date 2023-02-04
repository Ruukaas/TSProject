package com.ifpe.tsproject.modelo;

public class localização {
    private String CEP;
    private String endereço;
    private String bairro;
    private String estado;
    private String país;

    public localização(String cEP, String endereço, String bairro, String estado, String país) {
        CEP = cEP;
        this.endereço = endereço;
        this.bairro = bairro;
        this.estado = estado;
        this.país = país;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
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
