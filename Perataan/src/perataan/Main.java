/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package perataan;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author helen
 */
public class Main extends Panel {
    Main(){
    setBackground(Color.GRAY);
}

    public void paint (Graphics g){
        Font f = new Font("Hellvetica", Font.BOLD,48);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);
        
        String S= "Teks ini tampil ditengah";
        int xpos = (this.size() .width - fm.stringWidth(S));
        int ypos = (this.size().height)/2;
        g.drawString(S, xpos,ypos);
    }
  
    public static void main(String[] args) {
        Frame f = new Frame ("Testing Graphics Panel");
        Main gp = new Main();
        f.add(gp);
        f.setSize(600,300);
        f.setVisible(true);
    }

}
