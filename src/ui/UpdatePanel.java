package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdatePanel extends JPanel {
	JLabel lblName,lblAuthor,lblDate,lblPublisher
	 ,lblPrice,lblISBN,lblCate,lblDescription,lblJianjie;
	 JTextField txtOne,txtTwo,txtThree,txtFour,txtFive;
	 JComboBox cbCate,cbPhr;
	 JButton btnOK;
	 JTextArea txtArea,txtAre;
	 public UpdatePanel(){
		 lblName=new JLabel("書名：");
		 lblAuthor=new JLabel("作者：");
		 lblDate=new JLabel("出版日期：");
		 lblPublisher=new JLabel("出版社：");
		 lblPrice=new JLabel("Price：");
		 lblISBN=new JLabel("ISBN:");
		 lblCate=new JLabel("Type:");
		 lblDescription=new JLabel("内容大綱：");
		 lblJianjie=new JLabel("作者簡介：");
		 txtArea=new JTextArea(3,20);
		 txtAre=new JTextArea(3,20);
		 txtOne=new JTextField(20);
		 txtTwo=new JTextField(10);
		 txtThree=new JTextField(10);
		 txtFour=new JTextField(10);
		 txtFive=new JTextField(10);
		 String list[]={"中中出版社","央央出版社","中央出版社","中大出版社","央大出版社"};
		 String listt[]={"1","2","3","4"};
		 cbCate=new JComboBox(listt);
		 cbPhr=new JComboBox(list);
		 btnOK=new JButton("確定");
		 GridBagLayout gbl = new GridBagLayout(); // 设置布局方式为网格袋布局
			GridBagConstraints gbc = new GridBagConstraints();
			this.setLayout(gbl); // 创建布局
			gbc.gridx=1;
			gbc.gridy=1;//设置控件的摆放位置
			gbc.anchor=GridBagConstraints.NORTHWEST;//设置控件的对齐方式
			gbc.insets=new Insets(10,10,10,10);//设置控件之间的间距
			gbl.setConstraints(lblName, gbc);
			this.add(lblName);
			gbc.gridx = 2;
			gbc.gridy = 1;
			gbl.setConstraints(txtOne, gbc);
			this.add(txtOne);
			gbc.gridx =3;
			gbc.gridy = 1;
			gbl.setConstraints( lblAuthor, gbc);
			this.add( lblAuthor);
			gbc.gridx = 4;
			gbc.gridy = 1;
			gbl.setConstraints(txtTwo, gbc);
			this.add(txtTwo);
			gbc.gridx = 5;
			gbc.gridy = 1;
			gbl.setConstraints(lblDate, gbc);
			this.add(lblDate);
			gbc.gridx = 6;
			gbc.gridy = 1;
			gbl.setConstraints(txtThree, gbc);
			this.add(txtThree);
			gbc.gridx = 1;
			gbc.gridy = 2;
			gbl.setConstraints(lblPublisher, gbc);
			this.add(lblPublisher);
			gbc.gridx = 2;
			gbc.gridy = 2;
			gbl.setConstraints(cbPhr, gbc);
			this.add(cbPhr);
			gbc.gridx = 3;
			gbc.gridy = 2;
			gbl.setConstraints(lblPrice, gbc);
			this.add(lblPrice);
			gbc.gridx = 4;
			gbc.gridy = 2;
			gbl.setConstraints(txtFour, gbc);
			this.add(txtFour);
			gbc.gridx = 5;
			gbc.gridy = 2;
			gbl.setConstraints(lblISBN, gbc);
			this.add(lblISBN);
			gbc.gridx = 6;
			gbc.gridy = 2;
			gbl.setConstraints(txtFive, gbc);
			this.add(txtFive);
			gbc.gridx = 1;
			gbc.gridy = 3;
			gbl.setConstraints(lblCate, gbc);
			this.add(lblCate);
			gbc.gridx = 2;
			gbc.gridy = 3;
			gbl.setConstraints(cbCate, gbc);
			this.add(cbCate);
			gbc.gridx = 1;
			gbc.gridy = 4;
			gbl.setConstraints(lblDescription, gbc);
			this.add(lblDescription);
			gbc.gridx = 2;
			gbc.gridy = 4;
			gbl.setConstraints(txtArea, gbc);
			this.add(txtArea);
			gbc.gridx = 1;
			gbc.gridy = 5;
			gbl.setConstraints(lblJianjie, gbc);
			this.add(lblJianjie);
			gbc.gridx = 2;
			gbc.gridy = 5;
			gbl.setConstraints(txtAre, gbc);
			this.add(txtAre);
			gbc.gridx = 3;
			gbc.gridy = 6;
			gbl.setConstraints(btnOK, gbc);
			this.add(btnOK);
			
	 }
}
