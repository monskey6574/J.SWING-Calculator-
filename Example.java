import java.awt.Font;

import javax.swing.*;


class Example{
  public static void main(String[] args){

    JFrame F1 = new JFrame();

    F1.setSize(400, 300);
    F1.setTitle("Welcome Home");
    F1.setDefaultCloseOperation(3);


    
    JButton b1 = new JButton();
    b1.setText("Button");
    b1.setFont(new Font("",1,25));
    
    F1.add(b1);






    F1.setVisible(true);

  }
}

