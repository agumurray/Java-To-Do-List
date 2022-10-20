package classes;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.*;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;

public class ButtonPanel extends JPanel {
  
private JButton addTask;
private JButton clear;

Border emptyBorder = BorderFactory.createEmptyBorder();

//Constructor
ButtonPanel(){
  this.setPreferredSize(new Dimension(400,60));

  addTask = new JButton("Add Task");
  addTask.setBorder(emptyBorder);
  addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
  addTask.setVerticalAlignment(JButton.BOTTOM);
  this.add(addTask);

  this.add(Box.createHorizontalStrut(20));
  clear = new JButton("Clear completed tasks");
  clear.setBorder(emptyBorder);
  clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

  this.add(clear);
}

public JButton getAddTask(){
  return addTask;
}

public JButton getClear(){
  return clear;
}



}
