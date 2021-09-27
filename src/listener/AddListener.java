package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dao.Bookdao;
import entity.Books;
import ui.AddPanel;

public class AddListener implements ActionListener {
	AddPanel ap;

	public AddListener(AddPanel ap) {// 将添加面板AddPanel作为参数传给AddListener
		this.ap = ap;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		// 获取输入的图书信息
		JButton btnTemp = (JButton) evt.getSource();//得到按钮的事件源
		if (btnTemp == ap.btnADD) {
			Books book = new Books();
			// 获取图书id(id是主键,不能重复,我们从图书表中将最后一本书的id获取出来+1，为添加图书的id)
			Bookdao dao = new Bookdao();
			int id = dao.getId() + 1;
			book.setId(id);
			// 书名
			book.setTitle(ap.txtOne.getText());
			// 作者
			book.setAuthor(ap.txtTwo.getText());
			// 出版时间
			book.setPublishdate(ap.txtThree.getText());
			// ISBN
			book.setIsbn(ap.txtFive.getText());
			// 图书价格
			double price;
			// 如果输入的价格为空将价格设置为0
			if (ap.txtFour.getText().equals("")) {
				price = 0;
			} else {
				price = Double.parseDouble(ap.txtFour.getText());// 将文本框中的值取出并强制转换为double类型赋给price
			}
			// 图书价格
			book.setUnitprice(price);
			// 内容描述
			book.setContendescription(ap.txtArea.getText());
			// 作者介绍
			book.setAuthordescription(ap.txtAre.getText());
			// 出版社Id(因为出版社在数据库中对应一个出版社Id值)
			int publisherId = dao.getPublisherId(String.valueOf(ap.cbPhr.getSelectedItem()));
			book.setPublisherid(publisherId);
			// 获取分类Id(因为分类在数据库中对应一个分类Id值)
			String CategpryId = dao.getCategoryId(String.valueOf(ap.cbCate.getSelectedItem()));
			book.setCategoryId(CategpryId);
			// 调用BookDao中的添加图书方法,true为添加成功
			if (dao.Add(book) == true) {
				JOptionPane.showMessageDialog(null, "添加成功！");
			} else {
				JOptionPane.showMessageDialog(null, "添加失败！");
			}
		}
	}
}
