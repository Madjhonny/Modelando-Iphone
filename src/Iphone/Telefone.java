package Iphone;

import java.util.Scanner;

public class Telefone {

    public void correioDeVoz() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Novo Correio de Voz na caixa de mensagens! \nDeseja repoduzir? Sim (S) Não (N)");
        String escolha = scanner1.nextLine().toUpperCase();

        if(escolha.equals("S")) {
            System.out.println("Reproduzindo mensagem!");
        }

        else {
            System.out.println("Ignorando mensagem!");
        }


    }

    public void atender() {

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("LIGAÇÃO REECBIDA! Atender? Sim (S) | Não (N)");
        String atender = scanner2.nextLine().toUpperCase();

        if(atender.equals("S")) {
            System.out.println("Ligaçao atendida!");

        }

        else {

            System.out.println("Ligação ignodara!");
        }


    }

    public void ligar() {

        Scanner scanner3 = new Scanner(System.in);

        String pai = "Pai";
        String mae = "Mãe";
        String irmao = "Irmão";


        System.out.println("Deseja fazer uma ligação? Sim (S) Não (N): ");
        String ligar = scanner3.nextLine().toUpperCase();

        if(ligar.equals("S")) {

            System.out.println("Deseja ligar para quem? Pai (P) Mãe (M) Irmão (I)");
            String ligarEscolha = scanner3.nextLine().toUpperCase();

            if(ligarEscolha.equals("P")) {
                System.out.println("Ligando para " + pai + " ...");
            }

            else if(ligarEscolha.equals("M")) {
                System.out.println("Ligando para  " + mae + " ...");
            }

            else {
                System.out.println("Ligando para  " + irmao + "...");
            }


        }

        else {

            System.out.println("Encerrando ligação!");

        }



    }

}


