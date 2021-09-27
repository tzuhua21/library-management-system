package ui;
import java.awt.*;
import javax.swing.*;
import listener.LoginListener;
	public class LoginPanel extends JPanel {
		JLabel lbeName,lbePassword;
		public JTextField txtArea;
		public JPasswordField txtPass;
		public JButton btnLogin;//事件源
		public JButton btnCancel;//事件源
		public LoginForm lf;
		public LoginPanel(LoginForm lf){
			this.lf=lf;
			lbeName=new JLabel("用戶");
			lbePassword=new JLabel("密碼");
			txtArea=new JTextField(10);
			txtPass=new JPasswordField(10);
			btnLogin=new JButton("登入");
			btnCancel=new JButton("取消");
			txtPass.setEchoChar('*');
			GridBagLayout gbl=new GridBagLayout();//创建网格袋布局
			GridBagConstraints gbc=new GridBagConstraints();
			LoginListener ul=new LoginListener(this,lf);//添加UserListener ul
			btnLogin.addActionListener(ul);//给按钮btnLogin添加动作监听
			btnCancel.addActionListener(ul);//给按钮btnCancel添加动作监听
		    this.setLayout(gbl);// 创建布局
		    gbc.gridx=1;gbc.gridy=1;//设置控件的摆放位置
			gbc.anchor=GridBagConstraints.NORTHWEST;//设置控件的对齐方式
			gbc.insets=new Insets(10,10,10,10);//设置控件之间的间距
			gbl.setConstraints(lbeName,gbc);
			this.add(lbeName);
			gbc.gridx=2;gbc.gridy=1;
			gbl.setConstraints(txtArea,gbc);
			this.add(txtArea);
			gbc.gridx=1;gbc.gridy=2;
			gbl.setConstraints(lbePassword,gbc);
			this.add(lbePassword);
			gbc.gridx=2;gbc.gridy=2;
			gbl.setConstraints(txtPass,gbc);
			this.add(txtPass);
			gbc.gridx=1;gbc.gridy=3;
			gbl.setConstraints(btnLogin,gbc);
			this.add(btnLogin);
			gbc.gridx=2;gbc.gridy=3;
			gbl.setConstraints(btnCancel,gbc);
			this.add(btnCancel);
	}
	}
