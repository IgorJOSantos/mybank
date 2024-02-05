package br.com.igor.mybank.dominio;

public class Cliente extends Conta {
    private String nome;
    private CPF cpf;
    private Email email;

    public String getNome() {
        return "Nome: "
                + nome
                + " ";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
    public CPF getCpf() {
        return cpf;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    public Email getEmail() {
        return email;
    }
}
