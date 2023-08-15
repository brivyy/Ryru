package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu {
    private JPanel panel1;

    public calcu() {
        nove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "9");
            }
        });
        oito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "8");

            }
        });
        sete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "7");

            }
        });
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "6");

            }
        });
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "5");

            }
        });
        quatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "4");

            }
        });
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "3");

            }
        });
        dois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "2");

            }
        });
        um.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "1");

            }
        });
        abreParetese.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "(");

            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "0");

            }
        });
        fechaparentese.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + ")");

            }
        });
        multiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + " x ");

            }
        });
        divisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + " ÷ ");

            }
        });
        soma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + " + ");

            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + " √ ");

            }
        });
        elevado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "^");

            }
        });
        virgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + ",");

            }
        });
        porcentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "%");

            }
        });
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText("");

            }
        });
        pi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "π");

            }
        });
        fatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "!");

            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FazerConta();


            }
        });
    }
private void FazerConta(){
    String conta = contaFD.getText();
    if(conta.isEmpty()){
        JOptionPane.showMessageDialog(null, "Digite uma conta!", "Erro", JOptionPane.ERROR_MESSAGE);
    }else if(conta.contains("(")){
        if(conta.contains(")")){
            string novConta = conta.subString(conta.indexOf("("), conta.lastIndexOf(")"));

          //    fazerConta(novaConta);
        }
    }
    else {
        conta.replace(" ", "");

    }
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("calcu");
        frame.setContentPane(new calcu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField contaFD;
    private JButton historico;
    private JButton sete;
    private JButton quatro;
    private JButton um;
    private JButton nove;
    private JButton oito;
    private JButton seis;
    private JButton cinco;
    private JButton tres;
    private JButton dois;
    private JButton abreParetese;
    private JButton zero;
    private JButton soma;
    private JButton multiplicacao;
    private JButton fechaparentese;
    private JButton virgula;
    private JButton divisao;
    private JButton elevado;
    private JButton subtracao;
    private JButton pi;
    private JButton fatorial;
    private JButton raiz;
    private JButton igual;
    private JButton porcentagem;
    private JButton dButton;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
