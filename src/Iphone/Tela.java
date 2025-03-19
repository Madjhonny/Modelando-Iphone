package Iphone;

public class Tela {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.escolherMusica();

        Telefone telefone = new Telefone();
        telefone.correioDeVoz();
        telefone.atender();
        telefone.ligar();

        Saphari saphari = new Saphari();
        saphari.exibirPagina();
        saphari.atualizarPagina();
    }
}