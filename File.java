import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class File{
    public static void main(String[] args) {

        // Creates frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,400);
        frame.setLayout(null);
        frame.setVisible(true);

        // Creates left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.red);
        leftPanel.setBounds(0,0,400,400);

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
            if (sabor1Text.getText().length() != 0){
                System.out.println(sabor1Text.getText());
            }
            //System.out.println("Seu texto é inserido aqui, entre aspas duplas");
        });
        placeOrderButton.setBounds(100,320,200,20);
        /*
        JButton button = new JButton();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Seu texto é inserido aqui, entre aspas duplas");
            }
        });
        */

        // Creates right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.green);
        rightPanel.setBounds(400,0,500,400);

        // Places left panel components
        leftPanel.setLayout(null);
        leftPanel.add(sabor1Label);
        leftPanel.add(sabor1Text);
        leftPanel.add(sabor2Label);
        leftPanel.add(sabor2Text);
        leftPanel.add(sabor3Label);
        leftPanel.add(sabor3Text);
        leftPanel.add(sabor4Label);
        leftPanel.add(sabor4Text);
        leftPanel.add(bordaLabel);
        leftPanel.add(placeOrderButton);

        // Places frame components
        frame.add(leftPanel);
        frame.add(rightPanel);
    }

}