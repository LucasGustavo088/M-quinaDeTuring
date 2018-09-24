package br.usjt;

import com.sun.prism.paint.Color;

import javax.swing.*;

//Testando DiscagemFrame
public class Main extends JFrame
{
    public static void main( String[] args ) {
        GuiMaquina guiMaquina = new GuiMaquina();
        guiMaquina.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        guiMaquina.setResizable(false);
        guiMaquina.setSize( 360, 680 ); // configura o tamanho do frame
        guiMaquina.setVisible( true ); // exibe o frame
    } // fim de main
} // fim da classe DiscagemFrame

