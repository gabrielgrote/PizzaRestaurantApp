import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class AboutFrame extends JFrame{
    AboutFrame(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        this.setVisible(true);

        JLabel label1 = new JLabel("App de restaurante de pizza");
        JLabel label2 = new JLabel("Feito por Gabriel Grote.");
        this.add(label1);
        this.add(label2);

    }
    
}
