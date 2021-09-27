package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import demo.database;

public class NewOption {
	database db;

	public NewOption() {
		//db = new database();
	}

	/**
	 * �������掩��妍
	 * 
	 * @return Vector 餈��掩����
	 */
	public Vector<String> getBookOption() {
		// 敺餈
		Connection con = db.getConnection();
		String sql = "select * from categories";
		Vector<String> option = new Vector<String>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// ��遣PreparedStatement撖寡情
			ResultSet rset = stmt.executeQuery();// �銵祗�
			while (rset.next()) {
				option.add(rset.getString(2));// ��蛹ID�����蛹蝚砌�����隞亙������掩��蛹蝚砌�葵
			}
		} catch (SQLException e) {
			// TODO ������� catch ���
			e.printStackTrace();
		}
		return option;
	}

	/**
	 * ��������冗��妍
	 * 
	 * @return Vector 餈���冗����
	 */
	public Vector<String> getPublisherOption() {
		// 敺餈
		Connection con = db.getConnection();
		String sql = "select * from publishers";
		Vector<String> option = new Vector<String>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// ��遣PreparedStatement撖寡情
			ResultSet rset = stmt.executeQuery();// �銵祗�
			while (rset.next()) {
				option.add(rset.getString(2));// ��蛹ID�����蛹蝚砌�����隞亙�������冗��蛹蝚砌�葵
			}
		} catch (SQLException e) {
			// TODO ������� catch ���
			e.printStackTrace();
		}
		return option;
	}
}
