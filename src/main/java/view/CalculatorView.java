package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private JPanel calcPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton buttonDot;
    private JTextField calcSolution;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMultiply;
    private JButton buttonDegree;
    private JButton buttonCalculate;
    private JButton buttonDelChr;
    private JButton buttonDivide;
    private JTextArea textAreaHistory;

    public CalculatorView() {

        super("Calculator");
        createGUI();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(240, 200);
        this.add(calcPanel);
        this.pack(); //устанавливаем оптимальный размер окна
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void createGUI() {

        calcPanel = new JPanel();
        calcPanel.setLayout(new GridBagLayout());
        final JPanel spacer1 = new JPanel();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(spacer1, gbc);
        a1Button = new JButton();
        a1Button.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a1Button, gbc);
        a2Button = new JButton();
        a2Button.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a2Button, gbc);
        a3Button = new JButton();
        a3Button.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a3Button, gbc);
        a4Button = new JButton();
        a4Button.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a4Button, gbc);
        a5Button = new JButton();
        a5Button.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a5Button, gbc);
        a6Button = new JButton();
        a6Button.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a6Button, gbc);
        a7Button = new JButton();
        a7Button.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a7Button, gbc);
        a8Button = new JButton();
        a8Button.setText("8");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a8Button, gbc);
        a9Button = new JButton();
        a9Button.setText("9");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a9Button, gbc);
        a0Button = new JButton();
        a0Button.setText("0");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(a0Button, gbc);
        buttonDot = new JButton();
        buttonDot.setText(".");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonDot, gbc);
        calcSolution = new JTextField();
        calcSolution.setHorizontalAlignment(4);
        calcSolution.setEnabled(false);
        calcSolution.setDisabledTextColor(new Color(-16777216));
        calcSolution.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(calcSolution, gbc);
        buttonPlus = new JButton();
        buttonPlus.setText("+");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonPlus, gbc);
        buttonMinus = new JButton();
        buttonMinus.setText("-");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonMinus, gbc);
        buttonDivide = new JButton();
        buttonDivide.setText("/");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonDivide, gbc);
        buttonMultiply = new JButton();
        buttonMultiply.setText("*");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonMultiply, gbc);
        buttonCalculate = new JButton();
        buttonCalculate.setText("=");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonCalculate, gbc);
        buttonDegree = new JButton();
        buttonDegree.setText("^");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonDegree, gbc);
        buttonDelChr = new JButton();
        buttonDelChr.setText("C");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        calcPanel.add(buttonDelChr, gbc);

        textAreaHistory = new JTextArea(5,0);

        textAreaHistory.setEnabled(false);
        textAreaHistory.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.fill = GridBagConstraints.BOTH;
        calcPanel.add(textAreaHistory, gbc);
        ActionListener actionListener1 = new ButtonListener("1");
        a1Button.addActionListener(actionListener1);
        ActionListener actionListener2 = new ButtonListener("2");
        a2Button.addActionListener(actionListener2);
        ActionListener actionListener3 = new ButtonListener("3");
        a3Button.addActionListener(actionListener3);
        ActionListener actionListener4 = new ButtonListener("4");
        a4Button.addActionListener(actionListener4);
        ActionListener actionListener5 = new ButtonListener("5");
        a5Button.addActionListener(actionListener5);
        ActionListener actionListener6 = new ButtonListener("6");
        a6Button.addActionListener(actionListener6);
        ActionListener actionListener7 = new ButtonListener("7");
        a7Button.addActionListener(actionListener7);
        ActionListener actionListener8 = new ButtonListener("8");
        a8Button.addActionListener(actionListener8);
        ActionListener actionListener9 = new ButtonListener("9");
        a9Button.addActionListener(actionListener9);
        ActionListener actionListener0 = new ButtonListener("0");
        a0Button.addActionListener(actionListener0);
        ActionListener actionListenerDot = new ButtonListener(".");
        buttonDot.addActionListener(actionListenerDot);
        ActionListener actionListenerPlus = new ButtonListener("+");
        buttonPlus.addActionListener(actionListenerPlus);
        ActionListener actionListenerMinus = new ButtonListener("-");
        buttonMinus.addActionListener(actionListenerMinus);
        ActionListener actionListenerDivide = new ButtonListener("/");
        buttonDivide.addActionListener(actionListenerDivide);
        ActionListener actionListenerMultiply = new ButtonListener("*");
        buttonMultiply.addActionListener(actionListenerMultiply);
        ActionListener actionListenerDegree = new ButtonListener("^");
        buttonDegree.addActionListener(actionListenerDegree);
        ActionListener actionListenerDelChr = new ButtonListener("del");
        buttonDelChr.addActionListener(actionListenerDelChr);
    }

    // public int getCalcSolution() { return Integer.parseInt(calcSolution.getText()); }
    public void setCalcSolution(String solution) {
        textAreaHistory.append(calcSolution.getText() +" = "+solution+"\n");
        calcSolution.setText("");
    }

    public void addCalculateListener(ActionListener listenForCalcButton) {
        buttonCalculate.addActionListener(listenForCalcButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    class ButtonListener implements ActionListener {
        private String buttonChar;

        public ButtonListener(String buttonChar) {
            this.buttonChar = buttonChar;
        }

        public void actionPerformed(ActionEvent e) {
            if (buttonChar !="del") {
                calcSolution.setText(calcSolution.getText() + buttonChar);
            }else{
                calcSolution.setText("");
            }
        }
    }

    public String getInputString(){
        return calcSolution.getText();
    }

}
