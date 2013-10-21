package Model;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class telaLogin extends JFrame {

    JTextField txtLogin = new JTextField();
    JTextField txtSenha = new JTextField();
    public telaLogin() {
        super("Eleve Desenvolvimento Humano Ltda");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = this.getContentPane();

        GridBagConstraints cons = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        c.setLayout(layout);

        cons.fill = GridBagConstraints.BOTH;
        cons.gridy = 0;
        cons.gridx = 0;
        cons.gridwidth = 2;
        c.add(txtLogin, cons);
        cons.gridwidth = 1;
        cons.gridx = 2;
        c.add(new JButton("Direita"), cons);

        cons.gridx = 0;
        cons.gridy = 1;
        c.add(new JButton("Esquerda"), cons);

        cons.gridx = 1;
        c.add(new JButton("Meio"), cons);

        cons.gridx = 2;
        c.add(new JButton("Direita"), cons);

        this.setSize(600, 600);
    }

//    public static void main(String[] args) {
//        telaLogin exe = new telaLogin();
//        exe.setVisible(true);
//    }
}
