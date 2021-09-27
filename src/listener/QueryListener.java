package listener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.TableOption;
import dao.Bookdao;
import ui.AddForm;
import ui.MainForm;
import ui.QueryPanel;
import ui.Updateform;

public class QueryListener implements ActionListener {
	QueryPanel qp;
	int rowIndex = -1;
	MainForm mf;

	public QueryListener(QueryPanel qp, MainForm mf) {
		this.qp = qp;
		this.mf = mf;

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		JButton btnTemp = (JButton) evt.getSource();
		if (btnTemp == qp.btnSelect) {
			TableOption option = new TableOption();
			Bookdao dao = new Bookdao();
			String title = qp.txtTitle.getText();// 得到文本框中的内容
			ResultSet rset = null;
			int index = qp.cbKnow.getSelectedIndex();// 得到下拉列表框中值得索引号
			switch (index) {
			case 1:// 若为1，根据bookdao中的根据图书名来返回结果集
				rset = dao.getBookByTitle(title);
				break;
			case 2:// 若为2，根据bookdao中的根据图书作者来返回结果集
				rset = dao.getBookByAuthor(title);
				break;
			case 3:// 若为3，根据bookdao中的查询所有图书信息来返回结果集
				rset = dao.getBookByAll(title);
				break;
			case 4:// 若为4，根据bookdao中的根据图书ISBN来返回结果集
				rset = dao.getBookByISBN(title);
				break;
			}
			try {
				ResultSetMetaData mdata = rset.getMetaData();
				// 获取Option中的列名结果集数据，赋给datas 
				Vector<String> colms = option.getColumnName(mdata);
				// 获取Option中的行结果集数据，赋给datas
				Vector<Vector<String>> datas = option.getData(rset);
				qp.table = new JTable(datas, colms);// 将得到的列名和行数据的集合放到表格中
				qp.table.setPreferredScrollableViewportSize(new Dimension(670,
						350));// 设置此表视口的首选大小
				qp.table.addMouseListener(new MouseListener() {
					@Override
					// 鼠标按键在组件上单击
					public void mouseClicked(MouseEvent e) {
						// 获取当前选中的表格项行数(第几行)
						rowIndex = qp.table.getSelectedRow();
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO 自动生成的方法存根

					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO 自动生成的方法存根

					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO 自动生成的方法存根

					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO 自动生成的方法存根
					}

				});
				qp.tablePanel.sPane.setViewportView(qp.table);// 创建一个视口并设置其视图。
				qp.tablePanel.updateUI();// UIManager 发出的表明 L&F 已经更改的通知。
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (btnTemp == qp.btnAdd) {
			AddForm af = new AddForm();
		} else if (btnTemp == qp.btnEdit) {
			Updateform uf = new Updateform();
		} else if (evt.getSource() == qp.btnDelete) {
			// 如果用户没有选中表格的选项,rowIndex默认为-1
			if (rowIndex > -1)
				// 弹出询问框,判断是否点击的OK按钮
				if (JOptionPane.showConfirmDialog(null, "你真的要删除吗？", "删除图书",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
					Bookdao dao = new Bookdao();
					// 获取表格中选中图书的id
					String id = (String) qp.table.getValueAt(rowIndex, 0);
					// 调用删除图书方法，返回真表示删除成功
					if (dao.Delete(id) == true) {
						// 移除表格中的图书信息(百度)
						DefaultTableModel tableModel = (DefaultTableModel) qp.table
								.getModel();
						tableModel.removeRow(rowIndex);
					} else {
						JOptionPane.showMessageDialog(null, "删除失败！");
					}
				}
		}

	}

}
