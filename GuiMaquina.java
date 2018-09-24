package br.usjt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class GuiMaquina extends JFrame {

    private JTextField tfDiscagem;
    private JLabel lbDiscagem;
    private JButton btDiscar, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove, btZero, btLimpar;
    private JTextArea taRegistro;
    public Maquina maquina;

    public GuiMaquina() {
        super("Maquina de Turing");
        setLayout( null ); // configura o layout de frame

        tfDiscagem = new JTextField(27);
        tfDiscagem.setFont( new Font("Roboto", Font.PLAIN, 24));
        //tfDiscagem.setForeground(new java.awt.Color(255, 204, 0));
        tfDiscagem.setBounds(24, 32, 312,58);
        add( tfDiscagem ); // adiciona textField ao JFrame

        taRegistro = new JTextArea();
        taRegistro.setFont( new Font("Roboto", Font.PLAIN, 18));
        taRegistro.setBounds(24, 122, 312,106);
        taRegistro.setEnabled(false);
        taRegistro.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane( taRegistro );
        add( taRegistro ); // adiciona textField ao JFrame

        btUm = new JButton("1" );
        btUm.setFont( new Font("Roboto", Font.PLAIN, 24));
        btUm.setBounds(24, 262, 90,58);
        btUm.setForeground(Color.BLACK);
        btUm.setBackground(Color.lightGray);
        btUm.setBorderPainted(false);
        btUm.setFocusable(false);
        add( btUm ); // adiciona button ao Jframe
        btUm.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("1");
            }
        }); // ouvinte

        btDois = new JButton("2" );
        btDois.setFont( new Font("Roboto", Font.PLAIN, 24));
        btDois.setBounds(136, 262, 90,58);
        btDois.setForeground(Color.BLACK);
        btDois.setBackground(Color.lightGray);
        btDois.setBorderPainted(false);
        btDois.setFocusable(false);
        add( btDois ); // adiciona button ao Jframe
        btDois.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("2");
            }
        }); // ouvinte

        btTres = new JButton("3" );
        btTres.setFont( new Font("Roboto", Font.PLAIN, 24));
        btTres.setBounds(246, 262, 90,58);
        btTres.setForeground(Color.BLACK);
        btTres.setBackground(Color.lightGray);
        btTres.setBorderPainted(false);
        btTres.setFocusable(false);
        add( btTres ); // adiciona button ao Jframe
        btTres.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("3");
            }
        }); // ouvinte

        btQuatro = new JButton("4" );
        btQuatro.setFont( new Font("Roboto", Font.PLAIN, 24));
        btQuatro.setBounds(24, 328, 90,58);
        btQuatro.setForeground(Color.BLACK);
        btQuatro.setBackground(Color.lightGray);
        btQuatro.setBorderPainted(false);
        btQuatro.setFocusable(false);
        add( btQuatro ); // adiciona button ao Jframe
        btQuatro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("4");
            }
        }); // ouvinte

        btCinco = new JButton("5" );
        btCinco.setFont( new Font("Roboto", Font.PLAIN, 24));
        btCinco.setBounds(136, 328, 90,58);
        btCinco.setForeground(Color.BLACK);
        btCinco.setBackground(Color.lightGray);
        btCinco.setBorderPainted(false);
        btCinco.setFocusable(false);
        add( btCinco ); // adiciona button ao Jframe
        btCinco.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("5");
            }
        }); // ouvinte

        btSeis = new JButton("6" );
        btSeis.setFont( new Font("Roboto", Font.PLAIN, 24));
        btSeis.setBounds(246, 328, 90,58);
        btSeis.setForeground(Color.BLACK);
        btSeis.setBackground(Color.lightGray);
        btSeis.setBorderPainted(false);
        btSeis.setFocusable(false);
        add( btSeis ); // adiciona button ao Jframe
        btSeis.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("6");
            }
        }); // ouvinte

        btSete = new JButton("7" );
        btSete.setFont( new Font("Roboto", Font.PLAIN, 24));
        btSete.setBounds(24, 394, 90,58);
        btSete.setForeground(Color.BLACK);
        btSete.setBackground(Color.lightGray);
        btSete.setBorderPainted(false);
        btSete.setFocusable(false);
        add( btSete ); // adiciona button ao Jframe
        btSete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("7");
            }
        }); // ouvinte

        btOito = new JButton("8" );
        btOito.setFont( new Font("Roboto", Font.PLAIN, 24));
        btOito.setBounds(136, 394, 90,58);
        btOito.setForeground(Color.BLACK);
        btOito.setBackground(Color.lightGray);
        btOito.setBorderPainted(false);
        btOito.setFocusable(false);
        add( btOito ); // adiciona button ao Jframe
        btOito.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("8");
            }
        }); // ouvinte

        btNove = new JButton("9" );
        btNove.setFont( new Font("Roboto", Font.PLAIN, 24));
        btNove.setBounds(246, 394, 90,58);
        btNove.setForeground(Color.BLACK);
        btNove.setBackground(Color.lightGray);
        btNove.setBorderPainted(false);
        btNove.setFocusable(false);
        add( btNove ); // adiciona button ao Jframe
        btNove.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("9");
            }
        }); // ouvinte

        btZero = new JButton("0" );
        btZero.setFont( new Font("Roboto", Font.PLAIN, 24));
        btZero.setBounds(136, 460, 90,58);
        btZero.setForeground(Color.BLACK);
        btZero.setBackground(Color.lightGray);
        btZero.setBorderPainted(false);
        btZero.setFocusable(false);
        add( btZero ); // adiciona button ao Jframe
        btZero.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                escreveNumero("0");
            }
        }); // ouvinte

        btLimpar = new JButton("CE" );
        btLimpar.setFont( new Font("Roboto", Font.PLAIN, 24));
        btLimpar.setBounds(246, 460, 90,58);
        btLimpar.setForeground(Color.WHITE);
        btLimpar.setBackground(Color.RED);
        btLimpar.setBorderPainted(false);
        add( btLimpar ); // adiciona button ao Jframe
        btLimpar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                limparCampo();
            }
        }); // ouvinte

        btDiscar = new JButton("Discar" );
        btDiscar.setFont( new Font("Roboto", Font.PLAIN, 24));
        btDiscar.setBounds(24, 566, 312,58);
        btDiscar.setForeground(Color.WHITE);
        btDiscar.setBackground(Color.GREEN);
        btDiscar.setBorderPainted(false);
        add( btDiscar ); // adiciona button ao Jframe
        btDiscar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                String num = tfDiscagem.getText();
                maquina = new Maquina();
                maquina.iniciar(num);
                taRegistro.setText(maquina.getRegistro());

            }
        }); // ouvinte

    }

    private void limparCampo() {
        tfDiscagem.setText( "" );
        taRegistro.setText( "" );
    }

    public String getDiscagem() {
        String discagem = tfDiscagem.getText();
        System.out.println( discagem );
        return discagem;
    }

    public void setRegistros(String estado) {
        taRegistro.setText( estado );
    }

    public void escreveNumero(String numero) {
        if (tfDiscagem.hasFocus()) {
            String m = tfDiscagem.getText();
            tfDiscagem.setText(m + numero);
            tfDiscagem.requestFocus(true);
        }
    }

}
