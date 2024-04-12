package sis.usuario;

import sis.iphone.Iphone;
import sis.repmusical.RepMusical;
import sis.telefone.Telefone;
import sis.navegador.Navegador;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphoneUsuario = new Iphone();

        iphoneUsuario.ligar();
        iphoneUsuario.tocarMusica();

        RepMusical repMusical = iphoneUsuario;
        Telefone telefone = iphoneUsuario;
        Navegador navegador = iphoneUsuario;
    }
}
