import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class smile extends Canvas{
    public void paint(Graphics g){
       Font f =new Font ("Helvatic",Font.BOLD,20);
      g.setFont(f);
      g.setColor(Color.red);
      g.drawString("keep smiling !!!!!!!!!!!!!!!!!! ", 90, 30);
   g.setColor(Color.orange);
      g.fillOval(60, 60, 200, 200);
g.setColor(Color.black);
g.fillOval(90, 120, 30, 20);
g.fillOval(190, 120, 30, 20);

g.drawLine(155, 125, 155, 175);
//g.drawArc(110, 130, 95, 95, 0, -180);//
//g.drawArc(110, 160, 93, 50, 0, -180);//
g.setColor(Color.WHITE);
g.fillArc(110, 130, 95, 95, 0, -180);


    }
  

  public static void main(String[]args) {
    smile m = new smile();
     JFrame f = new JFrame();
       f.add(m);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
  } 
}