package br.com.igor.mybank.dominio;

public class Endereco {
    private String bairro;
    private String rua;
    private String cidade;
    private String estado;
    private String numero;
    private String cep;

    public Endereco(String rua, String numero, String bairro,  String cidade, String estado,  String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return  "Rua: " + rua + " - "
                +"N°: " + numero + " - "
                + "Bairro: " + bairro + " - "
                + "Cidade: " + cidade + " - "
                + "Estado: " + estado + " - "
                + "CEP: " + cep;
    }
}
