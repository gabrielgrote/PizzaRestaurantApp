import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


public class MenuBar extends JMenuBar{
    MenuBar() throws IOException{
        // Creates menu bars
        JMenu mainMenu = new JMenu("Menu");
        JMenu fileMenu = new JMenu("Arquivo");
        JMenu gameMenu = new JMenu("Game");

        // Create main menu components
        JMenuItem ajuda = new JMenuItem("Ajuda");
        JMenuItem sobre = new JMenuItem("Sobre");
        JMenuItem sair = new JMenuItem("Sair");

        // Creates file menu components
        JMenuItem load = new JMenuItem("Carregar");
        JMenuItem save = new JMenuItem("Salvar");

        // Creates game menu components
        JMenuItem game = new JMenuItem("Game");

        // Places menu components
        mainMenu.add(ajuda);
        mainMenu.add(sobre);
        fileMenu.add(load);
        fileMenu.add(save);
        gameMenu.add(game);
        mainMenu.add(sair);
        this.add(mainMenu);
        this.add(fileMenu);
        this.add(gameMenu);

        // Creates action listeners
        ajuda.addActionListener(e -> {
            HelpFrame helpFrame = new HelpFrame();

        });
        sobre.addActionListener(e -> {
            AboutFrame aboutFrame = new AboutFrame();
        });
        sair.addActionListener(e -> {
            System.exit(0);
        });

        game.addActionListener((e -> {
            GameFrame gameFrame = new GameFrame();
        }));

        save.addActionListener(e -> {
            //FileWriter writer = new FileWriter(file)
            JFileChooser fileChooserSave = new JFileChooser();
            fileChooserSave.setCurrentDirectory(new File("."));
            int responseSave = fileChooserSave.showSaveDialog(null);
            if (responseSave == JFileChooser.APPROVE_OPTION){
                File fileSave = new File(fileChooserSave.getSelectedFile().getAbsolutePath());
                try{
                    FileWriter writer = new FileWriter(fileSave);
                    for (int i = 0; i < RightPanel.getRowCountt();i++) {
                        writer.write(RightPanel.getSingleRow(i, 0).toString()+"-"+RightPanel.getSingleRow(i, 1).toString()+"="+RightPanel.getSingleRow(i, 2).toString()+"+"+RightPanel.getSingleRow(i, 3).toString()+"_"+RightPanel.getSingleRow(i, 4).toString()+"!"+RightPanel.getSingleRow(i, 5).toString()+"\n");
                    }
                    writer.close();
                    }catch(IOException f){
                        f.printStackTrace();
                    }
                }
    
        });

        load.addActionListener(e -> {
            RightPanel.setN();
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getPath());
                try{
                    Load.main(file);
                }catch(IOException f){
                    f.printStackTrace();
                }
            }
        });

    }
    
}
