package br.usjt;

import javax.swing.*;

public class Maquina {
    int cont;
    char fita[];
    String seq;
    String registro;

    public Maquina() {
        registro = "";
        seq = "";
    }


    public void iniciar(String sentenca) {
        if(sentenca.length() >= 10 ){
            seq = sentenca;
            cont = 0;
            fita = sentenca.toCharArray();
            q0();
        } else {
            JOptionPane.showMessageDialog(null, "Erro de discagem, número incompleto",
                    "Digite novamente", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void q0() {
        if (cont < fita.length) {
            if (fita[cont] == '0') {
                cont++;
                q1();
                setRegistro("q0 = 0");
            } else {
                getSubString();
            }
        }
    }

    public void q1() {
        if (fita[cont] == '0') {
            cont++;
            q2();
            setRegistro("q1 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q9();
            setRegistro("q1 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q9();
            setRegistro("q1 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q9();
            setRegistro("q1 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q9();
            setRegistro("q1 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q9();
            setRegistro("q1 = 5");
        } else if (fita[cont] == '7') {
            cont++;
            q9();
            setRegistro("q1 = 7");
        }
        else {
            getSubString();
        }
    }

    public void q2() {
        if (fita[cont] == '1') {
            cont++;
            q3();
            setRegistro("q2 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q5();
            setRegistro("q2 = 2");
        } else {
            getSubString();
        }
    }

    public void q3() {
        if (fita[cont] == '5') {
            cont++;
            q4();
            setRegistro("q3 = 5");
        } else {
            getSubString();
        }
    }

    public void q4() {
        if (fita[cont] == '3') {
            cont++;
            q7();
            setRegistro("q4 = 3");
        } else {
            getSubString();
        }
    }

    public void q5() {
        if (fita[cont] == '1') {
            cont++;
            q6();
            setRegistro("q5 = 1");
        } else {
            getSubString();
        }
    }

    public void q6() {
        if (fita[cont] == '3') {
            cont++;
            q7();
            setRegistro("q6 = 3");
        } else {
            getSubString();
        }
    }

    public void q7() {
        if (fita[cont] == '3') {
            cont++;
            q8();
            setRegistro("q7 = 3");
        } else {
            getSubString();
        }
    }

    public void q8() {
        if (fita[cont] == '1') {
            cont++;
            q9();
            setRegistro("q8 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q9();
            setRegistro("q8 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q9();
            setRegistro("q8 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q9();
            setRegistro("q8 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q9();
            setRegistro("q8 = 4");
        } else if (fita[cont] == '7') {
            cont++;
            q9();
            setRegistro("q8 = 7");
        }
        else {
            getSubString();
        }
    }

    public void q9() {
        if (fita[cont] == '0') {
            cont++;
            q10();
            setRegistro("q9 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q10();
            setRegistro("q9 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q10();
            setRegistro("q9 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q10();
            setRegistro("q9 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q10();
            setRegistro("q9 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q10();
            setRegistro("q9 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q10();
            setRegistro("q9 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q10();
            setRegistro("q9 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q10();
            setRegistro("q9 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q10();
            setRegistro("q9 = 9");
        } else {
            getSubString();
        }
    }

    public void q10() {
        if (fita[cont] == '0') {
            cont++;
            q11();
            setRegistro("q10 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q11();
            setRegistro("q10 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q11();
            setRegistro("q10 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q11();
            setRegistro("q10 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q11();
            setRegistro("q10 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q11();
            setRegistro("q10 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q11();
            setRegistro("q10 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q11();
            setRegistro("q10 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q11();
            setRegistro("q10 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q11();
            setRegistro("q10 = 9");
        } else {
            getSubString();
        }
    }

    public void q11() {
        if (fita[cont] == '0') {
            cont++;
            q12();
            setRegistro("q11 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q12();
            setRegistro("q11 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q12();
            setRegistro("q11 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q12();
            setRegistro("q11 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q12();
            setRegistro("q11 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q12();
            setRegistro("q11 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q12();
            setRegistro("q11 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q12();
            setRegistro("q11 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q12();
            setRegistro("q11 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q12();
            setRegistro("q11 = 9");
        } else {
            getSubString();
        }
    }

    public void q12() {
        if (fita[cont] == '0') {
            cont++;
            q13();
            setRegistro("q12 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q13();
            setRegistro("q12 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q13();
            setRegistro("q12 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q13();
            setRegistro("q12 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q13();
            setRegistro("q12 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q13();
            setRegistro("q12 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q13();
            setRegistro("q12 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q13();
            setRegistro("q12 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q13();
            setRegistro("q12 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q13();
            setRegistro("q12 = 9");
        } else {
            getSubString();
        }
    }

    public void q13() {
        if (fita[cont] == '0') {
            cont++;
            q14();
            setRegistro("q13 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q14();
            setRegistro("q13 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q14();
            setRegistro("q13 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q14();
            setRegistro("q13 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q14();
            setRegistro("q13 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q14();
            setRegistro("q13 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q14();
            setRegistro("q13 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q14();
            setRegistro("q13 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q14();
            setRegistro("q13 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q14();
            setRegistro("q13 = 9");
        } {
            getSubString();
        }
    }

    public void q14() {
        if (fita[cont] == '0') {
            cont++;
            q15();
            setRegistro("q14 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q15();
            setRegistro("q14 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q15();
            setRegistro("q14 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q15();
            setRegistro("q14 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q15();
            setRegistro("q14 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q15();
            setRegistro("q14 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q15();
            setRegistro("q14 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q15();
            setRegistro("q14 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q15();
            setRegistro("q14 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q15();
            setRegistro("q14 = 9");
        } else {
            getSubString();
        }
    }

    public void q15() {
        if (fita[cont] == '0') {
            cont++;
            q16();
            setRegistro("q15 = 0");
        } else if (fita[cont] == '1') {
            cont++;
            q16();
            setRegistro("q15 = 1");
        } else if (fita[cont] == '2') {
            cont++;
            q16();
            setRegistro("q15 = 2");
        } else if (fita[cont] == '3') {
            cont++;
            q16();
            setRegistro("q15 = 3");
        } else if (fita[cont] == '4') {
            cont++;
            q16();
            setRegistro("q15 = 4");
        } else if (fita[cont] == '5') {
            cont++;
            q16();
            setRegistro("q15 = 5");
        } else if (fita[cont] == '6') {
            cont++;
            q16();
            setRegistro("q15 = 6");
        } else if (fita[cont] == '7') {
            cont++;
            q16();
            setRegistro("q15 = 7");
        } else if (fita[cont] == '8') {
            cont++;
            q16();
            setRegistro("q15 = 8");
        } else if (fita[cont] == '9') {
            cont++;
            q16();
            setRegistro("q15 = 9");
        } else {
            getSubString();
        }
    }

    public void q16() {
        if (fita[cont] == '0') {
            cont++;
            setRegistro("q16 = 0");
            getSubString();
        } else if (fita[cont] == '1') {
            cont++;
            setRegistro("q16 = 1");
            getSubString();
        } else if (fita[cont] == '2') {
            cont++;
            setRegistro("q16 = 2");
            getSubString();
        } else if (fita[cont] == '3') {
            cont++;
            setRegistro("q16 = 3");
            getSubString();
        } else if (fita[cont] == '4') {
            cont++;
            setRegistro("q16 = 4");
            getSubString();
        } else if (fita[cont] == '5') {
            cont++;
            setRegistro("q16 = 5");
            getSubString();
        } else if (fita[cont] == '6') {
            cont++;
            setRegistro("q16 = 6");
            getSubString();
        } else if (fita[cont] == '7') {
            cont++;
            setRegistro("q16 = 7");
            getSubString();
        } else if (fita[cont] == '8') {
            cont++;
            setRegistro("q16 = 8");
            getSubString();
        } else if (fita[cont] == '9') {
            cont++;
            setRegistro("q16 = 9");
            getSubString();
        }
    }

    public void setRegistro(String estado) {
        registro = registro  + ", " + estado;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void getSubString() {
        String subSeq = seq.substring(1,2);
        mensagens(Integer.parseInt(subSeq));
    }

    public void mensagens( int indice ) {
        if (indice == 01) {
            JOptionPane.showMessageDialog(null, "Chamada para região parisiense (Île-de-France)",
                    "Numero geográfico", JOptionPane.INFORMATION_MESSAGE);
        } else if (indice == 02) {
            JOptionPane.showMessageDialog(null, "Chamada para noroeste da França e dependências no Oceano Índico, ",
                    "Numero geográfico", JOptionPane.INFORMATION_MESSAGE);
        } else if (indice == 03) {
            JOptionPane.showMessageDialog(null, "Chamada para nordeste da França",
                    "Numero geográfico", JOptionPane.INFORMATION_MESSAGE);
        } else if (indice == 04) {
            JOptionPane.showMessageDialog(null, "Chamada para sudeste da França",
                    "Numero geográfico", JOptionPane.INFORMATION_MESSAGE);
        } else if (indice == 05) {
            JOptionPane.showMessageDialog(null, "Chamada para sudoeste da França" +
                            "e dependências no Atlântico, ",
                    "Numero geográfico", JOptionPane.INFORMATION_MESSAGE);
        } else if (indice == 07) {
            JOptionPane.showMessageDialog(null, "Chamada para telefones celulares e aparelhos M2M",
                    "Numero não geográfico", JOptionPane.INFORMATION_MESSAGE);
        }  else if (indice == 00) {
            JOptionPane.showMessageDialog(null, "Chamada Internacional, \nChamada do Brasil para " +
                            "região parisiense",
                    "Chamada do Brasil para região parisiense", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro de discagem",
                    "Numero não geográfico", JOptionPane.ERROR_MESSAGE);
        }
    }
}

