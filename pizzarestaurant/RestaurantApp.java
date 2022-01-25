import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

import java.io.FileNotFoundException;

public class RestaurantApp{
    public static void main(String[] args) throws IOException{

        // Creates frame
        JFrame frame = new JFrame();

        // Creates panels
        RightPanel rightPanel = new RightPanel();
        LeftPanel leftPanel = new LeftPanel();

        // Creates meu bar
        try{
            MenuBar restaurantMenu = new MenuBar();
            frame.setJMenuBar(restaurantMenu);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        // Places frame components
        frame.add(leftPanel);
        frame.add(rightPanel);
        

        // Set frame characteristics
        frame.setTitle("Pizza App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}