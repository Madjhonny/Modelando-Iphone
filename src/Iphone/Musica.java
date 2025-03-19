package Iphone;

import java.util.Scanner;

public class Musica {

    public void escolherMusica() {

        Scanner scanner = new Scanner(System.in);

        String musicaA = "A";
        String musicaB = "B";
        String musicaC = "C";

        System.out.print("Escolha sua música (A, B e C): ");
        String musicaSelecionada = scanner.nextLine().toUpperCase();

        if(musicaSelecionada.equals("A")) {

            System.out.println("Música " + musicaA + " selecionada!");
        }

        else if(musicaSelecionada.equals("B")) {

            System.out.println("Música " + musicaB + " selecionada!");
        }

        else {

            System.out.println("Música " + musicaC + " selecionada!");

        }

        tocarMusica(scanner, musicaSelecionada);


    }


    public void tocarMusica(Scanner scanner, String musica) {
        System.out.println("Tocando música " + musica + ". . .");

        int tempoMusica = 180;
        boolean tocando = true;

        while(tempoMusica > 0 && tocando) {

            System.out.println("🎵 Tocando... (" + tempoMusica + " segundos restantes)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tempoMusica--;

            System.out.println("Digite 'p' para pausar ou Enter para continuar:");
            if (scanner.hasNextLine()) {
                String comando = scanner.nextLine();
                if (comando.equalsIgnoreCase("p")) {
                    System.out.println("⏸ Música pausada.");
                    tocando = false;

                }



            }


        }


        if (tempoMusica == 0) {
            System.out.println("🎵 Música finalizada!");

        }

    }

}
