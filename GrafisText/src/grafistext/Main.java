/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafistext;
import java.awt.*;

/**
 *
 * @author erwin
 */
public class Main extends Panel{
    Font f;
    String text = "Halo KHARISMA";
    Main(){
        setBackground(Color.GRAY); //konstanta bentuk Color
    }
    public void paint (Graphics g) {
        f= new Font ("Helvetica", Font.BOLD,48);
        
        //kotakhijau
        g.setColor(Color.GREEN);
        g.fillRect(8,8,402,105);
        
        //warna hitam pinggir
        g.setColor(Color.BLACK);
        g.drawRect(8,8,402,105);
        
        //bulatpink
        g.setColor(Color.pink);
        g.fillOval(10,10,402,100);
        
        //diberi pinggiran warna merah tebal(3x
        g.setColor(Color.red);
        g.drawOval(10,10,400,100);
        g.drawOval(10,10,400,104);
        //tulsan warna hitam dengan font helvetica
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text,40,75);
    }
     public static void main (String[] args){
         Frame f = new Frame ("Testing Graphics Panel");
         Main gp = new Main ();
         f.add(gp);
         f.setSize(900,900);
         f.setVisible(true);
     }
        
    }


