package ui;

import java.awt.Dimension;import java.util.Calendar;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.*;

import dao.Bookdao;
import javafx.scene.image.Image;
import listener.QueryListener;
import model.TableOption;

public class QueryPanel extends JPanel {
	public MainForm mf;
	public JTextField txtTitle;
	public JButton btnSelect;
	public JButton btnAdd, btnEdit;
	public JButton btnDelete,btnMusic,btnNoMusic;
	public JLabel lblSelect;
	public JTable table;
	public JComboBox cbKnow;
	public TablePanel tablePanel;
	
	public QueryPanel(TablePanel tablePanel, MainForm mf) {
		  //btnMusic.setIcon(new ImageIcon(getClass().getResource("m.jpg"))); 
		
		this.mf = mf;
		this.tablePanel = tablePanel;
		
		txtTitle = new JTextField(15);
		btnSelect = new JButton("��");
		lblSelect = new JLabel("���撘��");
		//lblcaozuo = new JLabel("蝞∠�蝐�:");
		btnAdd = new JButton("瘛餃��");
		btnEdit = new JButton("蝻��");
		btnDelete = new JButton("��");
		//ImageIcon image = new ImageIcon(icons[i]);
		btnNoMusic=new JButton("���犖");
		btnMusic = new JButton("甇�撣訾犖");
		String[] list = { "--����--", "����", "雿��", "����", "ISBN" };
		cbKnow = new JComboBox(list);
		GridBagLayout gbl = new GridBagLayout(); // 霈曄蔭撣��撘蛹蝵鋡��
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(gbl); // ��遣撣�
		gbc.gridx=1;
		gbc.gridy=1;//霈曄蔭�隞嗥��雿蔭
		gbc.anchor=GridBagConstraints.NORTHWEST;//霈曄蔭�隞嗥�笆朣撘�
		gbc.insets=new Insets(10,10,10,10);//霈曄蔭�隞嗡���頝�
		gbl.setConstraints(lblSelect, gbc);
		this.add(lblSelect);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbl.setConstraints(cbKnow, gbc);
		this.add(cbKnow);
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbl.setConstraints(txtTitle, gbc);
		this.add(txtTitle);
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbl.setConstraints(btnSelect, gbc);
		this.add(btnSelect);

		gbc.gridx = 5;
		gbc.gridy = 1;
		gbl.setConstraints(btnAdd, gbc);
		this.add(btnAdd);
		gbc.gridx = 6;
		gbc.gridy = 1;
		gbl.setConstraints(btnEdit, gbc);
		this.add(btnEdit);
		gbc.gridx = 7;
		gbc.gridy = 1;
		gbl.setConstraints(btnDelete, gbc);
		this.add(btnDelete);
		gbc.gridx = 12;
		gbc.gridy = 2;
		gbl.setConstraints(btnMusic, gbc);
		this.add(btnMusic);
		gbc.gridx = 13;
		gbc.gridy = 2;
		gbl.setConstraints(btnNoMusic, gbc);
		this.add(btnNoMusic);
		Label labtime=new Label("");
		Calendar calendar = new GregorianCalendar();
	    Thread time = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					calendar.setTimeInMillis( System.currentTimeMillis() );
			    	lab.setText(calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.HOUR_OF_DAY)+":"+
			    	calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
					//System.out.println("test");
				}
			}
		});
	    time.start();	
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbl.setConstraints(lab, gbc);
		this.add(labtime);
		QueryListener ql = new QueryListener(this, mf);
		btnSelect.addActionListener(ql);// 銝箸�瘛餃��
		btnAdd.addActionListener(ql);
		btnEdit.addActionListener(ql);
		btnDelete.addActionListener(ql);

	}
}