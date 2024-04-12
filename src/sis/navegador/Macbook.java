package sis.navegador;

public class Macbook implements Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
    
}
