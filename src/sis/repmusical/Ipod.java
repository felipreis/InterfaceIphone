package sis.repmusical;

public class Ipod implements RepMusical {

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
    
    
}
