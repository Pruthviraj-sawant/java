import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class calculator extends JFrame implements ActionListener{
JTextField t1,t2,t3;
JLabel l1,l2,l3;
JButton b1,b2,b3,b4,b5,b6;

public calculator(){
    setTitle("calculator");
    t1=new JTextField(20);
    t1.setBounds(780,300,150,50);
    t2=new JTextField(20);
    t2.setBounds(780,400,150,50);
    t3=new JTextField(20);
    t3.setBounds(780,500,150,50);

    l1=new JLabel("enter no 1 :");
    l1.setBounds(680,300,170,50);
    l2=new JLabel("enter no 2 :");
    l2.setBounds(680,400,170,50);
    l3=new JLabel("Result :");
    l3.setBounds(680,500,170,50);
    b1=new JButton("+");
    b1.setBounds(680,600,70,50);
    b2=new JButton("-");
    b2.setBounds(780,600,70,50);
    b3=new JButton("*");
    b3.setBounds(680,700,70,50);
    b4=new JButton("/");
    b4.setBounds(780,700,70,50);
    b5=new JButton("%");
    b5.setBounds(680,800,70,50);
    b6=new JButton("=");
    b6.setBounds(780,800,70,50);

setLayout(null);

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(400,400);
setVisible(true);
getContentPane().setBackground(Color.yellow);

}

public void actionPerformed(ActionEvent e){

Double num1= Double.parseDouble(t1.getText());
Double num2= Double.parseDouble(t2.getText());
Double res=0.0;
  if (e.getSource() == b1) {
    res=num1+num2;
    t3.setText(Double.toString(res));
 
  }
  if (e.getSource() == b2) {
    res=num1-num2;
    t3.setText(Double.toString(res));
 
  }
  if (e.getSource() == b3) {
    res=num1*num2;
    t3.setText(Double.toString(res));
 
  }
  if (e.getSource() == b4) {
    res=num1/num2;
    t3.setText(Double.toString(res));
 
  }
  if (e.getSource() == b5) {
    res=num1%num2;
    t3.setText(Double.toString(res));
 
  }

}
public static void main(String args[]){

    calculator c = new calculator();
}






} 