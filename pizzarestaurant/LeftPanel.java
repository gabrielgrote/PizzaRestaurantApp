import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LeftPanel extends JPanel{
    int borda = 0;
    Object refri;
    LeftPanel(){
        // Set panel characteristics
        this.setBackground(Color.green);
        this.setBounds(0,0,400,400);
        // Creates labels
        JLabel sabor1Label = new JLabel("Sabor 1: ");
        sabor1Label.setBounds(20,10,100,50);
        JLabel sabor2Label = new JLabel("Sabor 2: ");
        sabor2Label.setBounds(20,60,100,50);
        JLabel sabor3Label = new JLabel("Sabor 3: ");
        sabor3Label.setBounds(20,110,100,50);
        JLabel sabor4Label = new JLabel("Sabor 4: ");
        sabor4Label.setBounds(20,160,100,50);
        JLabel bordaLabel = new JLabel("Borda: ");
        bordaLabel.setBounds(20,210,100,50);
        JLabel refriLabel = new JLabel("Refri: ");
        refriLabel.setBounds(20, 260,100,50);

        // Creates soda comboBox
        String[] refriList = {"Coca", "Pepsi", "Sprite"};
        JComboBox refriComboBox = new JComboBox(refriList);
        refriComboBox.setBounds(100, 280,80,20);
        refriComboBox.addActionListener(e -> {
            refri = refriComboBox.getSelectedItem();
        });

        // Creates flavor text fields
        JTextField sabor1Text = new JTextField();
        sabor1Text.setBounds(100,25,150,20);
        JTextField sabor2Text = new JTextField();
        sabor2Text.setBounds(100,75,150,20);
        JTextField sabor3Text = new JTextField();
        sabor3Text.setBounds(100,125,150,20);
        JTextField sabor4Text = new JTextField();
        sabor4Text.setBounds(100,175,150,20);

        // Creates order button
        JButton placeOrderButton = new JButton("Adicionar pedido");
        placeOrderButton.addActionListener(e -> {
            if (sabor1Text.getText().length() != 0 && sabor2Text.getText().length() != 0 && sabor3Text.getText().length() != 0 && sabor4Text.getText().length() != 0 && refriComboBox != null && borda != 0){
                String bordaStatus = new String();
                if (borda == 1){
                    bordaStatus = "Com";
                }
                if (borda == 2){
                    bordaStatus = "Sem";
                }
                RightPanel.addRowInTable(new Object[]{sabor1Text.getText(),sabor2Text.getText(),sabor3Text.getText(),sabor4Text.getText(), bordaStatus, refri});
            }
        });
        placeOrderButton.setBounds(100,320,200,20);
        
        // Creates radio button
        JRadioButton comBordaButton = new JRadioButton("Com borda");
        comBordaButton.setBackground(Color.green);
        comBordaButton.setBounds(100,225,105,20);
        JRadioButton semBordaButton = new JRadioButton("Sem borda");
        semBordaButton.setBackground(Color.green);
        semBordaButton.setBounds(200,225,120,20);
        
        // Creates radio buttons group
        ButtonGroup bordaGroup = new ButtonGroup();
        bordaGroup.add(comBordaButton);
        bordaGroup.add(semBordaButton);

        // Creates radio buttons action
        comBordaButton.addActionListener(e -> {
            borda = 1;
        });
        semBordaButton.addActionListener(e -> {
            borda = 2;
        });

        // Places left panel components
        this.setLayout(null);
        this.add(sabor1Label);
        this.add(sabor1Text);
        this.add(sabor2Label);
        this.add(sabor2Text);
        this.add(sabor3Label);
        this.add(sabor3Text);
        this.add(sabor4Label);
        this.add(sabor4Text);
        this.add(bordaLabel);
        this.add(placeOrderButton);
        this.add(comBordaButton);
        this.add(semBordaButton);
        this.add(refriLabel);
        this.add(refriComboBox);
    }

}