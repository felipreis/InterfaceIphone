package sis.telefone;

public class Phone implements Telefone {


    
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
        correioDeVoz();
    }

    @Override
    public void atender() {
        System.out.println("ATENDIDA LIGAÇÃO");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("LIGAÇÃO NO CORREIO DE VOZ");
    }
}
