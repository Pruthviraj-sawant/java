import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class counter extends JFrame implements ActionListener{

JLabel l1;
JTextField t1;
JButton b1,b2,b3;


public counter(){

    setTitle("increse a num");
    l1=new JLabel("counter : ");
   l1.setBounds(200,120,100,200);
    t1=new JTextField(20);
    t1.setBounds(300,200,300,50);
    b1=new JButton("increase");
    b2=new JButton("decrease");
    b3=new JButton("reset");
    b1.setBounds(650, 200, 100, 50);
    b2.setBounds(800, 200, 100, 50);
    b3.setBounds(950, 200, 100, 50);
    setLayout(null);

    add(l1);
    add(t1);
    add(b1);
    add(b2);
    add(b3);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
setSize(400,400);
setVisible(true);
getContentPane().setBackground(Color.yellow);
    
}

public void actionPerformed(ActionEvent e){

    int no =Integer.parseInt(t1.getText());
    if(e.getSource()==b1){
   t1.setText(""+(no+=1));
}
if(e.getSource()==b2){
    t1.setText(""+(no-=1));
 }
 if(e.getSource()==b3){
    no=0;
    t1.setText(""+(no));
 }
  

}

public static void main(String[] args) {
    counter p=new counter();
}


}