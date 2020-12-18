import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game implements ActionListener {

    private static String player = "X";
    private static JButton buttonReset;
    private static JButton buttonExit;
    private static JLabel demo;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton buttonA1;
    private static JButton buttonA2;
    private static JButton buttonA3;
    private static JButton buttonB1;
    private static JButton buttonB2;
    private static JButton buttonB3;
    private static JButton buttonC1;
    private static JButton buttonC2;
    private static JButton buttonC3;
    private static boolean running = true;

    private static ImageIcon icon = new ImageIcon("D:\\Development\\Java\\TicTacToe1.8\\src\\img\\icon.png");

    public static void main(String[] args) {
        panel = new JPanel();
        frame = new JFrame();

        frame.setSize(235, 330);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TicTacToe");
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setBackground(Color.black);
        frame.add(panel);

        panel.setLayout(null);

        frame.setIconImage(icon.getImage());

        buttonA1 = new JButton("");
        buttonA1.setBounds(10, 10, 60, 60);
        buttonA1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonA1.addActionListener(new game());
        panel.add(buttonA1);

        buttonA2 = new JButton("");
        buttonA2.setBounds(80, 10, 60, 60);
        buttonA2.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonA2.addActionListener(new game());
        panel.add(buttonA2);

        buttonA3 = new JButton("");
        buttonA3.setBounds(150, 10, 60, 60);
        buttonA3.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonA3.addActionListener(new game());
        panel.add(buttonA3);

        buttonB1 = new JButton("");
        buttonB1.setBounds(10, 80, 60, 60);
        buttonB1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonB1.addActionListener(new game());
        panel.add(buttonB1);

        buttonB2 = new JButton("");
        buttonB2.setBounds(80, 80, 60, 60);
        buttonB2.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonB2.addActionListener(new game());
        panel.add(buttonB2);

        buttonB3 = new JButton("");
        buttonB3.setBounds(150, 80, 60, 60);
        buttonB3.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonB3.addActionListener(new game());
        panel.add(buttonB3);

        buttonC1 = new JButton("");
        buttonC1.setBounds(10, 150, 60, 60);
        buttonC1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonC1.addActionListener(new game());
        panel.add(buttonC1);

        buttonC2 = new JButton("");
        buttonC2.setBounds(80, 150, 60, 60);
        buttonC2.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonC2.addActionListener(new game());
        panel.add(buttonC2);

        buttonC3 = new JButton("");
        buttonC3.setBounds(150, 150, 60, 60);
        buttonC3.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonC3.addActionListener(new game());
        panel.add(buttonC3);

        demo = new JLabel();
        demo.setBounds(10, 210, 200, 25);
        demo.setText("X ist am Zug!");
        panel.add(demo);

        buttonReset = new JButton();
        buttonReset.setBounds(110, 220, 100, 30);
        buttonReset.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonReset.addActionListener(new game());
        buttonReset.setText("Reset");
        panel.add(buttonReset);

        buttonExit = new JButton();
        buttonExit.setBounds(110, 255, 100, 30);
        buttonExit.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonExit.addActionListener(new game());
        buttonExit.setText("Exit");
        panel.add(buttonExit);

        frame.setVisible(true);
    }

    public static void changeplayer() {
        if (String.valueOf(player).equals("X")){
            player = "O";
            demo.setText(player + " ist am Zug!");
        } else if (String.valueOf(player).equals("O")){
            player = "X";
            demo.setText(player + " ist am Zug!");
        }
    }

    public static void check() {
        if (buttonA1.getText().equals("X") && buttonA2.getText().equals("X") && buttonA3.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonB1.getText().equals("X") && buttonB2.getText().equals("X") && buttonB3.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonC1.getText().equals("X") && buttonC2.getText().equals("X") && buttonC3.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA1.getText().equals("X") && buttonB1.getText().equals("X") && buttonC1.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA2.getText().equals("X") && buttonB2.getText().equals("X") && buttonC2.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA3.getText().equals("X") && buttonB3.getText().equals("X") && buttonC3.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA1.getText().equals("X") && buttonB2.getText().equals("X") && buttonC3.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA3.getText().equals("X") && buttonB2.getText().equals("X") && buttonC1.getText().equals("X")) {
            demo.setText("X hat gewonnen!");
            running = false;
        } else if (buttonA1.getText().equals("O") && buttonA2.getText().equals("O") && buttonA3.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonB1.getText().equals("O") && buttonB2.getText().equals("O") && buttonB3.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonC1.getText().equals("O") && buttonC2.getText().equals("O") && buttonC3.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonA1.getText().equals("O") && buttonB1.getText().equals("O") && buttonC1.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonA2.getText().equals("O") && buttonB2.getText().equals("O") && buttonC2.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonA3.getText().equals("O") && buttonB3.getText().equals("O") && buttonC3.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonA1.getText().equals("O") && buttonB2.getText().equals("O") && buttonC3.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (buttonA3.getText().equals("O") && buttonB2.getText().equals("O") && buttonC1.getText().equals("O")) {
            demo.setText("O hat gewonnen!");
            running = false;
        } else if (!buttonA1.getText().equals("") && !buttonA2.getText().equals("") && !buttonA3.getText().equals("") && !buttonB1.getText().equals("") && !buttonB2.getText().equals("") && !buttonB3.getText().equals("") && !buttonC1.getText().equals("") && !buttonC2.getText().equals("") && !buttonC3.getText().equals("")) {
            demo.setText("Unentschieden!");
            running = false;
        } else {
            changeplayer();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonA1) {
            if (!buttonA1.getText().equals("") || !running) return;
            buttonA1.setText(player);
            check();
        } else if (e.getSource() == buttonA2) {
            if (!buttonA2.getText().equals("") || !running) return;
            buttonA2.setText(player);
            check();
        } else if (e.getSource() == buttonA3) {
            if (!buttonA3.getText().equals("") || !running) return;
            buttonA3.setText(player);
            check();
        } else if (e.getSource() == buttonB1) {
            if (!buttonB1.getText().equals("") || !running) return;
            buttonB1.setText(player);
            check();
        } else if (e.getSource() == buttonB2) {
            if (!buttonB2.getText().equals("") || !running) return;
            buttonB2.setText(player);
            check();
        } else if (e.getSource() == buttonB3) {
            if (!buttonB3.getText().equals("") || !running) return;
            buttonB3.setText(player);
            check();
        } else if (e.getSource() == buttonC1) {
            if (!buttonC1.getText().equals("") || !running) return;
            buttonC1.setText(player);
            check();
        } else if (e.getSource() == buttonC2) {
            if (!buttonC2.getText().equals("") || !running) return;
            buttonC2.setText(player);
            check();
        } else if (e.getSource() == buttonC3) {
            if (!buttonC3.getText().equals("") || !running) return;
            buttonC3.setText(player);
            check();
        } else if (e.getSource() == buttonReset) {
            player = "X";
            running = true;
            demo.setText(player + " ist am Zug!");
            buttonA1.setText("");
            buttonA2.setText("");
            buttonA3.setText("");
            buttonB1.setText("");
            buttonB2.setText("");
            buttonB3.setText("");
            buttonC1.setText("");
            buttonC2.setText("");
            buttonC3.setText("");
        } else if (e.getSource() == buttonExit) {
            frame.dispose();
        }
    }
}
