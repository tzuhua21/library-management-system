package ui;

import javax.swing.JFrame;

public class Updateform extends JFrame {
	UpdatePanel ap;
	
	   public Updateform(){
		 super("圖書管理系统");
		  ap=new UpdatePanel();
		  this.getContentPane( ).add(ap);
			this.setSize(1260,600);
			
			this.setVisible(true);
			this.setResizable(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			this.setVisible(true);
			this.setResizable(true);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
