import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class factoooo extends Applet implements ActionListener{

  Button  b1;
  TextField t1,t2;
  Label l1,l2;

  public void init(){

l1=new Label("enter a no");
t1=new TextField(20);
l2=new Label("factorial of that no : ");
t2=new TextField(20);
b1=new Button("click");

add(l1);
add(t1);
add(l2);
add(t2);
add(b1);

b1.addActionListener(this);
  }

public void actionPerformed(ActionEvent e){
   int fact=1 ;
    int num=Integer.parseInt(t1.getText());
if(e.getSource()==b1){
    for (int i = 0; i<num; i++) {
        fact+=fact*i;
    }
    t2.setText(String.valueOf(fact));
}

}

}

/*<applet code="factoooo.class" 
   width=400
    height=400
   >
   </applet> 
*/
