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
                contaFD.setText(contaFD.getText() + " √");

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
                if(contaFD.getText().charAt(contaFD.getText().length()-1) ==' ') {
                    contaFD.setText(contaFD.getText() + "π");
                }
                else {
                    contaFD.setText(contaFD.getText() + " x π");

                }
            }
        });
        fatorial.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + "!");

            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               fazerConta();


            }
        });
        subtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contaFD.setText(contaFD.getText() + " - ");
            }
        });
    }

    public int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }

        return count;
    }

private void fazerConta(){
    String conta = contaFD.getText();
    if(conta.isEmpty()){
        JOptionPane.showMessageDialog(null, "Digite uma conta!", "Erro", JOptionPane.ERROR_MESSAGE);
    }else if(conta.contains("(")){
        if(conta.contains(")")){
            String novaConta = conta.substring(conta.indexOf("(")+1, conta.lastIndexOf(")"));


          conta = conta.replace('(' + novaConta + ')', fazerConta(novaConta));
            conta = fazerConta(conta);
        }
    }
    else {

        conta = conta.replace("π", "3.1415");
        conta = conta.replace(",", ".");

        conta = conta.replaceAll("π", "3.1415");
        conta = conta.replaceAll(",", ".");


        //fatorial

        int qtmax = countChar(conta,'!');
      for(int qt = 1;qt <= qtmax;qt++){
          String a = "";
          for (int i = conta.indexOf("!", qt) -1; i >= 0;i--){
              if(conta.charAt(i) == ' ' || conta.charAt(i) == '!'){
                  break;
              }
              a += conta.charAt(i);
          }
          int res = 1;
          a = new StringBuilder(a).reverse().toString();

          for(int j = 1;j <= Integer.parseInt(a);j++){
              res *= j;
          }
          conta = conta.replaceAll(a + "!", Integer.toString(res));
      }


        //porcentagem

        qtmax = countChar(conta,'%');

        for(int qt = 1;qt <= qtmax;qt++){
            double a, b;
            String sa = "";
            String sb = "";

            for (int i = conta.indexOf("%", qt) -1; i >= 0;i--){
                if(conta.charAt(i) == ' ' || conta.charAt(i) == '%'){
                    break;
                }
                sa += conta.charAt(i);

            }

            sa = new StringBuilder(sa).reverse().toString();
            a = Double.parseDouble(sa);

            if(conta.indexOf("%", qt) + 1 == conta.length() ||conta.charAt(conta.indexOf("%", qt) + 1) == ' ') {
                conta = conta.replace(sa + '%', Double.toString(a/100));
            }
            else{
                for (int i = conta.indexOf("%", qt) + 1; i < conta.length(); i++) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '%') {
                        break;
                    }
                    sb += conta.charAt(i);
                }

                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(Double.toString(Math.pow(a, b)));
                conta = conta.replace(sa + '%' + sb, Double.toString((a * b)/100));
            }
        }


        //expoente

         qtmax = countChar(conta,'^');

        for(int qt = 1;qt <= qtmax;qt++){
            double a, b;
            String sa = "";
            String sb = "";

            for (int i = conta.indexOf("^", qt) -1; i >= 0;i--){
                if(conta.charAt(i) == ' ' || conta.charAt(i) == '^'){
                    break;
                }
                sa += conta.charAt(i);
            }
            for (int i = conta.indexOf("^", qt) +1; i < conta.length();i++){
                if(conta.charAt(i) == ' ' || conta.charAt(i) == '^'){
                    break;
                }
                sb += conta.charAt(i);
            }

            sa = new StringBuilder(sa).reverse().toString();
            a = Double.parseDouble(sa);
            b = Double.parseDouble(sb);

            System.out.println(sa + " " + sb);
            System.out.println(Double.toString(Math.pow(a,b)));
            conta = conta.replace(sa + '^' + sb,  Double.toString(Math.pow(a,b)));

        }

        //raiz

        qtmax = countChar(conta,'√');

        for(int qt = 1;qt <= qtmax;qt++){
            double b;

            String sb = "";

            for (int i = conta.indexOf("√", qt) +1; i < conta.length();i++){
                if(conta.charAt(i) == ' ' || conta.charAt(i) == '√'){
                    break;
                }
                sb += conta.charAt(i);
            }
;
            b = Double.parseDouble(sb);

            conta = conta.replace('√' + sb,  Double.toString(Math.sqrt(b)));

        }


        for(int g = 0;g < conta.length();g++){

            //multiplicação

            if(conta.charAt(g) =='x') {
                double a, b;
                String sa = "";
                String sb = "";

                for (int i = g - 2; i >= 0; i--) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == 'x') {
                        break;
                    }
                    sa += conta.charAt(i);
                }
                for (int i = g + 2; i < conta.length(); i++) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == 'x') {
                        break;
                    }
                    sb += conta.charAt(i);
                }

                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(a * b);
                conta = conta.replace(sa + " x " + sb, Double.toString(a * b));
            }
//divisao
            if (conta.length() <= g) g = 0;

            if(conta.charAt(g) =='÷') {

                double a, b;
                String sa = "";
                String sb = "";

                for (int i = g - 2; i >= 0; i--) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '÷') {
                        break;
                    }
                    sa += conta.charAt(i);
                }
                for (int i = g + 2; i < conta.length(); i++) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '÷') {
                        break;
                    }
                    sb += conta.charAt(i);
                }

                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(a * b);
                conta = conta.replace(sa + " ÷ " + sb, Double.toString(a / b));
            }
        }

        for(int g = 0;g < conta.length();g++){

            //soma

            if(conta.charAt(g) =='+') {
                double a, b;
                String sa = "";
                String sb = "";

                for (int i = g - 2; i >= 0; i--) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '+') {
                        break;
                    }
                    sa += conta.charAt(i);
                }
                for (int i = g + 2; i < conta.length(); i++) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '+') {
                        break;
                    }
                    sb += conta.charAt(i);
                }

                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(a * b);
                conta = conta.replace(sa + " + " + sb, Double.toString(a + b));
            }

            //subtração
    if (conta.length() <= g) g = 0;

    if(conta.charAt(g) =='-') {

                double a, b;
                String sa = "";
                String sb = "";

                for (int i = g - 2; i >= 0; i--) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '-') {
                        break;
                    }
                    sa += conta.charAt(i);
                }
                for (int i = g + 2; i < conta.length(); i++) {
                    if (conta.charAt(i) == ' ' || conta.charAt(i) == '-') {
                        break;
                    }
                    sb += conta.charAt(i);
                }

                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(a * b);
                conta = conta.replace(sa + " - " + sb, Double.toString(a - b));
            }
        }

    }

    contaFD.setText(conta);
}

    private String fazerConta(String c){
        String conta = c;
        if(conta.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite uma conta!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(conta.contains("(")){
            if(conta.contains(")")){
                if(conta.contains(")")) {
                    String novaConta = conta.substring(conta.indexOf("(") + 1, conta.lastIndexOf(")"));


                    conta = conta.replace('(' + novaConta + ')', fazerConta(novaConta));
                    conta = fazerConta(conta);
                }
            }
        }
        else {

            conta = conta.replace("π", "3.1415");
            conta = conta.replace(",", ".");

            conta = conta.replaceAll("π", "3.1415");
            conta = conta.replaceAll(",", ".");


            //fatorial

            int qtmax = countChar(conta,'!');
            for(int qt = 1;qt <= qtmax;qt++){
                String a = "";
                for (int i = conta.indexOf("!", qt) -1; i >= 0;i--){
                    if(conta.charAt(i) == ' ' || conta.charAt(i) == '!'){
                        break;
                    }
                    a += conta.charAt(i);
                }
                int res = 1;
                a = new StringBuilder(a).reverse().toString();

                for(int j = 1;j <= Integer.parseInt(a);j++){
                    res *= j;
                }
                conta = conta.replaceAll(a + "!", Integer.toString(res));
            }


            //porcentagem

            qtmax = countChar(conta,'%');
            for(int qt = 1;qt <= qtmax;qt++){
                double a, b;
                String sa = "";
                String sb = "";

                for (int i = conta.indexOf("%", qt) -1; i >= 0;i--){
                    if(conta.charAt(i) == ' ' || conta.charAt(i) == '%'){
                        break;
                    }
                    sa += conta.charAt(i);
                }
                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                if(conta.indexOf("%", qt) + 1 == conta.length() ||conta.charAt(conta.indexOf("%", qt) + 1) == ' ') {
                    conta = conta.replace(sa + '%', Double.toString(a/100));
                }
                else{
                    for (int i = conta.indexOf("%", qt) + 1; i < conta.length(); i++) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '%') {
                            break;
                        }
                        sb += conta.charAt(i);
                    }
                    b = Double.parseDouble(sb);

                    System.out.println(sa + " " + sb);
                    System.out.println(Double.toString(Math.pow(a, b)));
                    conta = conta.replace(sa + '%' + sb, Double.toString((a * b)/100));
                }
            }


            //expoente

            qtmax = countChar(conta,'^');

            for(int qt = 1;qt <= qtmax;qt++){
                double a, b;
                String sa = new String();
                String sb = new String();

                for (int i = conta.indexOf("^", qt) -1; i >= 0;i--){
                    if(conta.charAt(i) == ' ' || conta.charAt(i) == '^'){
                        break;
                    }
                    sa += conta.charAt(i);
                }
                for (int i = conta.indexOf("^", qt) +1; i < conta.length();i++){
                    if(conta.charAt(i) == ' ' || conta.charAt(i) == '^'){
                        break;
                    }
                    sb += conta.charAt(i);
                }

                sa = new StringBuilder(sa).reverse().toString();
                a = Double.parseDouble(sa);
                b = Double.parseDouble(sb);

                System.out.println(sa + " " + sb);
                System.out.println(Double.toString(Math.pow(a,b)));
                conta = conta.replace(sa + '^' + sb,  Double.toString(Math.pow(a,b)));

            }

            //raiz

            qtmax = countChar(conta,'√');

            for(int qt = 1;qt <= qtmax;qt++){
                double b;

                String sb = "";

                for (int i = conta.indexOf("√", qt) +1; i < conta.length();i++){
                    if(conta.charAt(i) == ' ' || conta.charAt(i) == '√'){
                        break;
                    }
                    sb += conta.charAt(i);
                }

                b = Double.parseDouble(sb);

                conta = conta.replace('√' + sb,  Double.toString(Math.sqrt(b)));

            }


            for(int g = 0;g < conta.length();g++){

                //multiplicação

                if(conta.charAt(g) =='x') {
                    double a, b;
                    String sa = "";
                    String sb = "";

                    for (int i = g - 2; i >= 0; i--) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == 'x') {
                            break;
                        }
                        sa += conta.charAt(i);
                    }
                    for (int i = g + 2; i < conta.length(); i++) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == 'x') {
                            break;
                        }
                        sb += conta.charAt(i);
                    }

                    sa = new StringBuilder(sa).reverse().toString();
                    a = Double.parseDouble(sa);
                    b = Double.parseDouble(sb);

                    System.out.println(sa + " " + sb);
                    System.out.println(a * b);
                    conta = conta.replace(sa + " x " + sb, Double.toString(a * b));
                }
                //divisao
                if (conta.length() <= g) g = 0;

                if(conta.charAt(g) =='÷') {

                    double a, b;
                    String sa = "";
                    String sb = "";

                    for (int i = g - 2; i >= 0; i--) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '÷') {
                            break;
                        }
                        sa += conta.charAt(i);
                    }
                    for (int i = g + 2; i < conta.length(); i++) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '÷') {
                            break;
                        }
                        sb += conta.charAt(i);
                    }

                    sa = new StringBuilder(sa).reverse().toString();
                    a = Double.parseDouble(sa);
                    b = Double.parseDouble(sb);

                    System.out.println(sa + " " + sb);
                    System.out.println(a * b);
                    conta = conta.replace(sa + " ÷ " + sb, Double.toString(a / b));
                }
            }

            for(int g = 0;g < conta.length();g++){

                //soma

                if(conta.charAt(g) =='+') {
                    double a, b;
                    String sa = "";
                    String sb = "";

                    for (int i = g - 2; i >= 0; i--) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '+') {
                            break;
                        }
                        sa += conta.charAt(i);
                    }
                    for (int i = g + 2; i < conta.length(); i++) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '+') {
                            break;
                        }
                        sb += conta.charAt(i);
                    }

                    sa = new StringBuilder(sa).reverse().toString();
                    a = Double.parseDouble(sa);
                    b = Double.parseDouble(sb);

                    System.out.println(sa + " " + sb);
                    System.out.println(a * b);
                    conta = conta.replace(sa + " + " + sb, Double.toString(a + b));
                }

                //subtração
                if (conta.length() <= g) g = 0;

                if(conta.charAt(g) =='-') {

                    double a, b;
                    String sa = "";
                    String sb = "";

                    for (int i = g - 2; i >= 0; i--) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '-') {
                            break;
                        }
                        sa += conta.charAt(i);
                    }
                    for (int i = g + 2; i < conta.length(); i++) {
                        if (conta.charAt(i) == ' ' || conta.charAt(i) == '-') {
                            break;
                        }
                        sb += conta.charAt(i);
                    }

                    sa = new StringBuilder(sa).reverse().toString();
                    a = Double.parseDouble(sa);
                    b = Double.parseDouble(sb);

                    System.out.println(sa + " " + sb);
                    System.out.println(a * b);
                    conta = conta.replace(sa + " - " + sb, Double.toString(a - b));
                }
            }

        }

        return conta;
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("calcu");
        frame.setContentPane(new calcu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField contaFD;
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
