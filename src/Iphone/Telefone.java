package Iphone;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Telefone {

    public void correioDeVoz() {

        Scanner scanner1 = new Scanner(System.in);
        String escolha = "";

        while (true) {

          try{
              System.out.println("Novo correio de voz! \nDeseja reproduzir? Sim(s) Não(n)");
              escolha = scanner1.nextLine().toUpperCase();

              if (!escolha.equals("S") && !escolha.equals("N")) {
                  throw new IllegalArgumentException("Entrada inválida! Escolha apenas Sim(S) ou Não(N)");
              }
              break;
          } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
          }


        }

        System.out.println("Reproduzindo correio de voz...");

    }

    public void atender() {

        Scanner scanner2 = new Scanner(System.in);
        String atender = "";

        while (true) {
            try {
                System.out.println("REECBENDO LIGAÇÃO! Atender? Sim(S) Não(N)");
                atender = scanner2.nextLine().toUpperCase();

                if (!atender.equals("S") && !atender.equals("N")) {
                    throw new IllegalArgumentException("Entrada inválida de opção! Escolher apenas Sim(S) ou Não(N)");
                }
                break;

            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atendendo ligação...");

    }

    public void ligar() {

        Scanner scanner3 = new Scanner(System.in);

        String pai = "Pai";
        String mae = "Mãe";
        String irmao = "Irmão";
        String ligar = "";

        while (true) {

            try{
                System.out.println("Deseja fazer uma ligação? Sim(S) Não(N)");
                ligar = scanner3.nextLine().toUpperCase();

                if(!ligar.equals("S") && !ligar.equals("N")) {
                    throw new IllegalArgumentException("Entrada inválida de opção! Escolher apenas Sim(S) Não(N)");
                }
                break;


            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        if(ligar.equals("S")) {
            String ligarEscolha = "";

            while(true) {
                try{
                    System.out.println("Deseja ligar para quem? Pai(P), Mãe(M) ou Irmão(I)");
                    ligarEscolha = scanner3.nextLine().toUpperCase();

                    if(!ligarEscolha.equals("P") && !ligarEscolha.equals("M") && !ligarEscolha.equals("I")) {
                        throw new IllegalArgumentException("Entrada inválida! Opções Pai(P), Mãe(M) ou Irmão(I)");
                    }
                    break;
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (ligarEscolha.equals("P")) {
                System.out.println("Ligando para " + pai + "...");
            } else if (ligarEscolha.equals("M")) {
                System.out.println("Ligando para " + mae + "...");
            } else {
                System.out.println("Ligando para " + irmao + "...");
            }

        } else {
            System.out.println("Encerrando ligação!");
        }

        }

    }




