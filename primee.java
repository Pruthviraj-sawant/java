import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class primee extends JFrame implements ActionListener{

JLabel l1,l2;
JTextField t1,t2;
JButton b1;


public primee(){

    setTitle("prime or not");
    l1=new JLabel("enter a no : ");
    l2=new JLabel("result : ");
    t1=new JTextField(20);
    t2=new JTextField(20);
    b1=new JButton("click");
    
    setLayout(new FlowLayout());

    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);

     b1.addActionListener(this);
setSize(400,400);
setVisible(true);
getContentPane().setBackground(Color.pink);
    
}

public void actionPerformed(ActionEvent e){

    int count=0;
    int no =Integer.parseInt(t1.getText());
    if(e.getSource()==b1){
    for(int i=1;i<=no;i++){
      if (no % i == 0) {
      count++;
      }
    }
  
    if (count == 2) {
     t2.setText("prime no");
    }
    else {
     t2.setText("not prime");
      
    }
  
}

}

public static void main(String[] args) {
    primee p=new primee();
}


}