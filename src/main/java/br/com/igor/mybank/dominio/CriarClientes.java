package br.com.igor.mybank.dominio;

import java.util.Scanner;

public class CriarClientes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Cliente cliente = criarCliente(sc);
            Endereco endereco = criarEndereco(sc);

            exibirInformacoesCliente(cliente, endereco);
        }
    }
 
    private static Cliente criarCliente(Scanner sc) {
        System.out.print("NOME: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("EMAIL: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(new CPF(cpf));
        cliente.setEmail(new Email(email));

        return cliente;
    }

    private static Endereco criarEndereco(Scanner sc) {
        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        return new Endereco(rua, numero, bairro, cidade, estado, cep);
    }

    private static void exibirInformacoesCliente(Cliente cliente, Endereco endereco) {
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf().getNumero());
        System.out.println(cliente.getEmail().getEndereco());
        System.out.println(endereco.getEndereco());
    }

}
