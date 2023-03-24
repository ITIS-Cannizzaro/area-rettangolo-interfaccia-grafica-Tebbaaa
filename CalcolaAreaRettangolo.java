package dina;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcolaAreaRettangolo extends JFrame implements ActionListener {
  
  private JLabel label1, label2, label3;
  private JTextField text1, text2;
  private JButton button;
  private void add(JButton button2) {
		
		
}

private void add(JTextField text12) {
	
	
}

private void setDefaultCloseOperation(String exitOnClose) {
	
	
}

private void setLayout(GridLayout gridLayout) {
	
	
}

private void setSize(int i, int j) {
	
	
}

private void add(JLabel label32) {
	
	
}

private void setVisible(boolean b) {
	
	
}

private void setTitle(String string) {
	
	
}
  
  
  public CalcolaAreaRettangolo() {
    setTitle("Calcola Area Rettangolo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    setLayout(new GridLayout(3, 2));
    
    label1 = new JLabel("Inserisci la base: ");
    add(label1);
    text1 = new JTextField();
    add(text1);
    
    label2 = new JLabel("Inserisci l'altezza: ");
    add(label2);
    text2 = new JTextField();
    add(text2);
    
    button = new JButton("Calcola");
    button.addActionListener(this);
    add(button);
    
    label3 = new JLabel("L'area del rettangolo è: ");
    add(label3);
    
    setVisible(true);
  }
  


public void actionPerformed(ActionEvent event) {
    if (event.getSource() == button) {
      int base = Integer.parseInt(text1.getText());
      int altezza = Integer.parseInt(text2.getText());
      int area = base * altezza;
      label3.setText("L'area del rettangolo è: " + area);
    }
  }
  
  public static void main(String[] args) {
    CalcolaAreaRettangolo app = new CalcolaAreaRettangolo();
  }
}
