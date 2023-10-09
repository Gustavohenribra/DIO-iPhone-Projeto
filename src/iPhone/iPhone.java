package iPhone;

import iPhone.funcionalidades.ReprodutorMusical;
import iPhone.funcionalidades.AparelhoTelefonico;
import iPhone.funcionalidades.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação da interface AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação da interface NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
