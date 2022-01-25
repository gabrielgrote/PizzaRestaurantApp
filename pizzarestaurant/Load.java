import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


public class Load{
    public static void main(File file) throws IOException{

        Scanner scan = new Scanner(file);
        //System.out.println(scan.nextLine());
        
        while (scan.hasNextLine()){
            // Colects each cell to create a row in table
            String line = scan.nextLine().toString();
            String sabor1 = line.substring(0,line.indexOf("-"));
            String sabor2 = line.substring(line.indexOf("-")+1,line.indexOf("="));
            String sabor3 = line.substring(line.indexOf("=")+1,line.indexOf("+"));
            String sabor4 = line.substring(line.indexOf("+")+1,line.indexOf("_"));
            String borda = line.substring(line.indexOf("_")+1,line.indexOf("!"));
            String refri = line.substring(line.indexOf("!")+1,line.length());
            RightPanel.addRowInTable(new Object[]{sabor1,sabor2,sabor3,sabor4,borda,refri});

        }
        
    }
    
}
