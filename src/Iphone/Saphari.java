package Iphone;

import java.util.Scanner;

public class Saphari {

    public void exibirPagina() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Saphari navegador aberto! Deseja exibir uma página? Sim (S) Não (N)");
        String exibir = scanner1.nextLine().toUpperCase();

        if(exibir.equals("S")) {
            System.out.println("Nova página aberta!");
        }

        else {

            System.out.println("Página mantida!");

        }


    }

    public void atualizarPagina() {

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Deseja atualizar a página atual? Sim (S) Não (N)");
        String atualizar = scanner2.nextLine().toUpperCase();

        if(atualizar.equals("S")) {

            System.out.println("Página atualizada!");
        }

        else {
            System.out.println("Página permanecida!");
        }

        System.out.println("Navegador fechado! Iphone bloqueado.");

    }

}
