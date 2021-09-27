package ui;

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

import model.TableOption;
import java.awt.*;
import java.util.*; 
public class MainForm extends JFrame {
	//JMenuBar jmb;
	//JMenu jmenu, joperate, jset, jhelp;
	QueryPanel qp;
	TablePanel tablePanel;
	//JTextArea txtArea;
	public MainForm() {
		
		super("圖書管理系统");
		tablePanel = new TablePanel();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize(); 
		this.setBounds(0,0,d.width,d.height-100);
		//txtArea=new JTextArea(3,20);
		qp = new QueryPanel(tablePanel, this);
		this.add(qp,BorderLayout.SOUTH);
		this.add(tablePanel,BorderLayout.CENTER);
		//this.add(txtArea,BorderLayout.CENTER);
		setLocationRelativeTo(this);
		//this.setSize(1260, 630);
		this.setVisible(true);
		//this.add(txtArea);
		//this.setResizable(true);
		
		//this.add(qp,height-200);
	   
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
	
		
		//jmb = new JMenuBar();
		//jmenu = new JMenu("快捷：");
		//joperate = new JMenu("圖書操作");
		//jset = new JMenu("系统設置");
		//jhelp = new JMenu("help");
		//jmb.add(jmenu);
		//jmb.add(joperate);
		//jmb.add(jset);
		//jmb.add(jhelp);
		//this.setJMenuBar(jmb);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Label lab=new Label("");
		//Calendar calendar = new GregorianCalendar();
		//lab.setBackground(Color.pink);
	    //this.add(lab,BorderLayout.SOUTH);
	    
	    //Thread time = new Thread(new Runnable() {
			
			//public void run() {
				//while(true) {
					//calendar.setTimeInMillis( System.currentTimeMillis() );
			    	//lab.setText(calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.HOUR_OF_DAY)+":"+
			    	//calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
					//System.out.println("test");
				//}
			//}
		//});
	    //time.start();	
	
	}
}