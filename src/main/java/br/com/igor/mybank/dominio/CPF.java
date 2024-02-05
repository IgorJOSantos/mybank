package br.com.igor.mybank.dominio;

public class CPF {
        private String numero;
        public CPF(String numero) {
            if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                throw new IllegalArgumentException("CPF inválido! O CPF deve estar no formato 123.456.789-01");
            }
            this.numero = numero;
        }

    public void setNumero(String numero) {
        this.numero = numero;
    }
        public String getNumero() {
            return "CPF: "
                    + numero
                    +" ";
       }
}