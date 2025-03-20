package Iphone;

import java.util.Scanner;

public class Musica {

    public void escolherMusica() {
        Scanner scanner = new Scanner(System.in);
        String musicaSelecionada = "";

        while (true) {
            try {
                System.out.println("Escolha sua música: A, B ou C");
                musicaSelecionada = scanner.nextLine().toUpperCase();

                if (!musicaSelecionada.equals("A") && !musicaSelecionada.equals("B") && !musicaSelecionada.equals("C")) {
                    throw new IllegalArgumentException("Entrada inválida! Escolha apenas: A, B ou C.");
                }
                break; // Sai do loop quando a entrada for válida

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Música " + musicaSelecionada + " selecionada!");
            tocarMusica(scanner, musicaSelecionada); // Chama o método para tocar música
    }

    public void tocarMusica(Scanner scanner, String musica) {
        System.out.println("Tocando música " + musica + "...");

        int tempoMusica = 180; // Reduzi para testes; pode ser 180 segundos
        boolean tocando = true;

        while (tempoMusica > 0 && tocando) {
            System.out.println("🎵 Tocando... (" + tempoMusica + " segundos restantes)");

            try {
                Thread.sleep(1000); // Pausa por 1 segundo
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

    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.escolherMusica();
    }
}
