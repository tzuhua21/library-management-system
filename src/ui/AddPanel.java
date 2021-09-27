package ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.*;

import listener.AddListener;
import model.NewOption;

public class AddPanel extends JPanel {
	JLabel lblName, lblAuthor, lblDate, lblPublisher, lblPrice, lblISBN,
			lblCate, lblDescription, lblJianjie;
	public JTextField txtOne;
	public JTextField txtTwo;
	public JTextField txtThree;
	public JTextField txtFour;
	public JTextField txtFive;
	//public JComboBox cbCate;
	//public JComboBox cbPhr;
	public JButton btnADD;
	public JTextArea txtArea;
	public JTextArea txtAre;
	AddForm af;
	NewOption option;

	public AddPanel(AddForm af) {
		option = new NewOption();
		this.af = af;
		lblName = new JLabel("書名：");
		lblAuthor = new JLabel("作者：");
		lblDate = new JLabel("出版日期：");
		lblPublisher = new JLabel("出版社：");
		lblPrice = new JLabel("Price：");
		lblISBN = new JLabel("ISBN:");
		lblCate = new JLabel("Type:");
		lblDescription = new JLabel("内容描述：");
		lblJianjie = new JLabel("作者簡介：");
		txtArea = new JTextArea(3, 20);
		txtAre = new JTextArea(3, 20);
		txtOne = new JTextField(20);
		txtTwo = new JTextField(10);
		txtThree = new JTextField(10);
		txtFour = new JTextField(10);
		txtFive = new JTextField(10);
		// 获取数据库中图书的分类（表：categories）
		//Vector<String> listt = option.getBookOption();
		// 创建下拉列表框,将获取到的图书分类集合添加到参数中
		//cbCate = new JComboBox(listt);
		// 获取数据库中所有出版社（表：publishers）
		//Vector<String> list = option.getPublisherOption();
		// 创建下拉列表框,将获取到的出版社集合添加到参数中
		//cbPhr = new JComboBox(list);
		btnADD = new JButton("添加");
		GridBagLayout gbl = new GridBagLayout(); // 设置布局方式为网格袋布局
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(gbl); // 创建布局
		gbc.gridx = 1;
		gbc.gridy = 1;// 设置控件的摆放位置
		gbc.anchor = GridBagConstraints.NORTHWEST;// 设置控件的对齐方式
		gbc.insets = new Insets(10, 10, 10, 10);// 设置控件之间的间距
		gbl.setConstraints(lblName, gbc);
		this.add(lblName);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbl.setConstraints(txtOne, gbc);
		this.add(txtOne);
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbl.setConstraints(lblAuthor, gbc);
		this.add(lblAuthor);
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
		//gbl.setConstraints(cbPhr, gbc);
		//this.add(cbPhr);
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
		//gbl.setConstraints(cbCate, gbc);
		//this.add(cbCate);
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
		gbl.setConstraints(btnADD, gbc);
		this.add(btnADD);
		AddListener al = new AddListener(this);
		btnADD.addActionListener(al);// 为按钮btnAdd添加动作监听
	}
}
