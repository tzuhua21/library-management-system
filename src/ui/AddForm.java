package ui;

import javax.swing.JFrame;

public class AddForm extends JFrame {
        AddPanel ap;
   public AddForm(){
	 super("圖書管理系统");
	  ap=new AddPanel(this);
	  this.getContentPane( ).add(ap);
		this.setSize(1260,600);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
