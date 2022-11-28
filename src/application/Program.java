package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        int menu = 0;

        do {
            System.out.println("");
            System.out.println("O que vc deseja fazer?");
            System.out.println("1- Cadastrar Produto 2- Adicionar Produto");
            System.out.println("3- Remover Produto 4- Visualizar estoque 0- Sair");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entre com as informacoes do produto: ");
                    System.out.print("Nome: ");
                    product.name = sc.next();
                    System.out.print("Preco: ");
                    product.price = sc.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    product.quantity = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Quantos Produtos serao adicionados ?");
                    int resp = sc.nextInt();
                    resp += product.addProducts(resp);
                    System.out.println("Produto Adicionado: " + product.toSting());

                    break;
                case 3:
                    System.out.println("Quantos Produtos serao removidos ?");
                    resp = sc.nextInt();
                    resp -= product.removeProducts(resp);
                    System.out.println("Produto Removido: " + product.toSting());

                    break;
                case 4:
                    System.out.println("Estoque Atual :" + product.toSting());
                    break;
                case 5:
                    if (menu >= 5) {
                        System.out.println("Digite uma opcao valida!");
                    }break;
                default:
                    System.out.println("Programa Finalizado.");
                    break;
            }

        } while (menu != 0);
        sc.close();
    }
}

