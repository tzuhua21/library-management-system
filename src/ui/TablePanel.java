package ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 将表格添加到面板中，且加上滚动条
 */
public class TablePanel extends JPanel {
	public JScrollPane sPane;
		//构造方法
	public TablePanel(){
		sPane = new JScrollPane();
		this.add(sPane);
	}
}
