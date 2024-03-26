import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class griddemo extends JFrame implements ActionListener{
    boolean flag=true;

public griddemo() {

setTitle("press buttons");

JButton b[]=new JButton[6];
String label[]={"1","2","3","4","5","6"};

setLayout(new GridLayout(2,3));
for (int i = 0; i < label.length; i++) {
    b[i]=new JButton(label[i]);
    add(b[i]);
    b[i].addActionListener(this);
    
}
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public void actionPerformed(ActionEvent e)
{
   
 if(flag){
    setLayout(new GridLayout(2, 3));
    
 }
  else{
    setLayout(new GridLayout(3, 2));
 }
 flag =! flag;
 validate();
}

public static void main(String args[]){
    griddemo o=new griddemo();
    
}



}
