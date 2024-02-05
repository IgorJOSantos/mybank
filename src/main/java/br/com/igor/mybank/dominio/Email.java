package br.com.igor.mybank.dominio;

public class Email {
    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b")) {
            throw new IllegalArgumentException("Endereço de e-mail inválido! Deve estar no formato padrão exemplo@dominio.com");
        }
        this.endereco = endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return "Email: "
                + endereco
                +" ";
    }
}