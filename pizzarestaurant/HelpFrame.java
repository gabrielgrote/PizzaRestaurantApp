import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class HelpFrame extends JFrame{
    HelpFrame(){
        // Set frame characteristics
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        this.setVisible(true);

        // Creates labels
        JLabel label1 = new JLabel("Escreva os sabores da pizza escolha a opção");
        JLabel label2 = new JLabel("com ou sem borda, escolha o refri e faça o pedido.");
        
        // Add components to frame
        this.add(label1);
        this.add(label2);

    }
    
}
