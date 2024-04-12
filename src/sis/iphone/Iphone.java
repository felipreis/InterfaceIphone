package sis.iphone;

import sis.navegador.Navegador;
import sis.repmusical.RepMusical;
import sis.telefone.Telefone;

public class Iphone implements RepMusical, Navegador, Telefone {

    @Override
    public void ligar() {
        System.out.println("LIGANDO VIA IPHONE");

        correioDeVoz();
    }

    @Override
    public void atender() {
        System.out.println("ATENDIDO VIA IPHONE");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA WEB VIA IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA VIA IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA VIA IPHONE");
    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA NO IPHONE");
    }

    @Override
    public void pausarMusica() {
        System.out.println("PAUSANDO MÚSICA NO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NO IPHONE");
    }
    
}
