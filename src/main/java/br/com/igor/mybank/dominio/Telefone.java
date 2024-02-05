package br.com.igor.mybank.dominio;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null || !ddd.matches("\\d{2}") || !numero.matches("\\d{4,5}-\\d{4}")) {
            throw new IllegalArgumentException("Número de telefone inválido! Deve estar no formato xxXXXXX-XXXX, onde xx é o DDD");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}