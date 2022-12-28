package agenda.classes;

import java.util.Date;

public class Contato {
    String pnome;
    String sobrenome;
    Date dataNasc;
    String logadouro;
    int numero;
    String cidade;
    String bairro;
    String estado;
    String celular;
    String telefone;
    String email_principal;
    String emaill_alternativo;

    public Contato() {
    }

    public Contato(String pnome, String sobrenome, Date dataNasc, String logadouro, int numero, String cidade, String bairro, String estado, String celular, String telefone, String email_principal, String emaill_alternativo) {
        this.pnome = pnome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.logadouro = logadouro;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.celular = celular;
        this.telefone = telefone;
        this.email_principal = email_principal;
        this.emaill_alternativo = emaill_alternativo;
    }
    
    public Contato(String pnome, String sobrenome){
        this.pnome = pnome;
        this.sobrenome = sobrenome;
    }

    public String getPnome() {
        return pnome;
    }

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail_principal() {
        return email_principal;
    }

    public void setEmail_principal(String email_principal) {
        this.email_principal = email_principal;
    }

    public String getEmaill_alternativo() {
        return emaill_alternativo;
    }

    public void setEmaill_alternativo(String emaill_alternativo) {
        this.emaill_alternativo = emaill_alternativo;
    }
    
     public boolean existe(String s){
        if(this.pnome.toLowerCase().contains(s.toLowerCase()))
            return true;
        else if(this.sobrenome.toLowerCase().contains(s.toLowerCase()))
            return true;
        return false;
    }
}
