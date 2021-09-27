package ui;

import javax.swing.*;

import ui.LoginPanel;

public class LoginForm extends JFrame {
	LoginPanel pl;
	public LoginForm(){
	  super("圖書管理系统");
	  pl=new LoginPanel(this);
	  this.getContentPane( ).add(pl);
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
