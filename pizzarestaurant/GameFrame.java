import javax.swing.*;
import java.util.concurrent.TimeUnit;

import java.lang.Thread;

import java.awt.event.*;
import java.awt.Color;

public class GameFrame extends JFrame implements KeyListener{
    
    // Creates labels and score
    JLabel prot;
    JLabel item1;
    JLabel item2;
    JLabel item3;
    int score = 0;

    GameFrame(){
        // Set frame characteristics
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        // Creates and set protagonist
        prot = new JLabel();
        prot.setBounds(0,0,10,10);
        prot.setOpaque(true);
        prot.setBackground(Color.red);

        // Creates and sets instruction label
        JLabel instructionsLabel = new JLabel("A W S D para mover.");
        instructionsLabel.setBounds(100,10,200,20);

        // Creates colectables
        item1 = new JLabel();
        item1.setBounds(400,400,10,10);
        item1.setOpaque(true);
        item1.setBackground(Color.green);

        item2 = new JLabel();
        item2.setBounds(100,300,10,10);
        item2.setOpaque(true);
        item2.setBackground(Color.green);

        item3 = new JLabel();
        item3.setBounds(50,80,10,10);
        item3.setOpaque(true);
        item3.setBackground(Color.green);

        // Sets frame components
        this.add(instructionsLabel);
        this.add(item1);
        this.add(item2);
        this.add(item3);
        this.add(prot);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        // Creates action listeners for moving
        switch(e.getKeyChar()){
            case 'a': prot.setLocation(prot.getX()-10, prot.getY());
                break;
            case 'w': prot.setLocation(prot.getX(), prot.getY()-10);
                break;
            case 's': prot.setLocation(prot.getX(), prot.getY()+10);
                break;
            case 'd': prot.setLocation(prot.getX()+10, prot.getY());
                break;
        }

        // Creates events for colecting items
        if (prot.getX() == 400 && prot.getY() == 400){
            this.remove(item1);
            score = score + 1;
        }
        if (prot.getX() == 100 && prot.getY() == 300){
            this.remove(item2);
            score = score + 1;
        }
        if (prot.getX() == 50 && prot.getY() == 80){
            this.remove(item3);
            score = score + 1;
        }

        // Creates winner label
        if (score == 3){
            JLabel winnerLabel = new JLabel("Voce ganhou");
            winnerLabel.setBounds(200,200,100,100);
            winnerLabel.setVisible(true);
            this.add(winnerLabel);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
