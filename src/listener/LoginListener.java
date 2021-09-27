package listener;

import java.awt.event.*;

import javax.swing.*;

import ui.LoginForm;
import ui.LoginPanel;
import ui.MainForm;
import dao.Userdao;

public class LoginListener implements ActionListener {
	LoginPanel lp;
	LoginForm lf;
	public LoginListener(LoginPanel lp, LoginForm lf) {
		this.lp = lp;
		this.lf = lf;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		JButton btnTemp = (JButton) evt.getSource();// 得到按钮的事件源
		Userdao dao = new Userdao();
		if (btnTemp == lp.btnLogin) {// 判断动作按钮
			String name = lp.txtArea.getText();// 得到文本框中的值
			String pwd = String.valueOf(lp.txtPass.getPassword());
			
				MainForm mf = new MainForm();
				lf.dispose();// 关闭当前窗口，打开另一个窗口
			}
		
		if (btnTemp == lp.btnCancel) {// 如果按下取消按钮，将文本框中的值赋为空
			lp.txtArea.setText("");
			lp.txtPass.setText("");
		}

	}
}
