package Iphone;

import java.util.Scanner;

public class Saphari {

    public void exibirPagina() {

        Scanner scanner1 = new Scanner(System.in);
        String exibir = "";

        while (true) {
            try {
                System.out.println("Navegador aberto! Deseja exibir uma página? Sim(S) Não(N)");
                exibir = scanner1.nextLine().toUpperCase();
                if (!exibir.equals("S") && !exibir.equals("N")) {
                    throw new IllegalArgumentException("Entrada inválida! Escolha Sim(S) Não(N)");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Exibindo página inicial!");

    }

    public void atualizarPagina() {

        Scanner scanner2 = new Scanner(System.in);
        String atualziar = "";

        while (true) {
            try {
                System.out.println("Deseja atualizar a página? Sim(S) Não(N)");
                atualziar = scanner2.nextLine().toUpperCase();
                if (!atualziar.equals("S") && !atualziar.equals("N")) {
                    throw new IllegalArgumentException("Entrada inválida! Escolha Sim(S) Não(N)");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Página atualziada!");

        System.out.println("APP Saphari fechado.");
    }

}
