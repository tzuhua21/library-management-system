package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
/**
 * @param TableOption
 * @return ResultSet, ResultSetMetaData将得到列名和数据行赋给集合，返回查询结果集
 */
public class TableOption {
	//返回出现在视图中 column 列位置处的列名称的集合。
	public Vector<String> getColumnName(ResultSetMetaData md){
		Vector<String> colms=new Vector<String>();
		try {
			colms.add(md.getColumnName(1));//添加列名
			colms.add(md.getColumnName(2));
			colms.add(md.getColumnName(3));
			colms.add(md.getColumnName(5));
			colms.add(md.getColumnName(6));
			colms.add(md.getColumnName(8));
			colms.add(md.getColumnName(9));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colms;
	}
	//获得表格行中的数据
	public Vector<Vector<String>> getData(ResultSet rs){
		Vector<Vector<String>> datas=new Vector<Vector<String>>();
		try {
			while(rs.next()){
				Vector<String> row=new Vector<String>();
				row.add(rs.getString(1));//添加行数据
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(5));
				row.add(rs.getString(6));
				row.add(rs.getString(8));
				row.add(rs.getString(9));
				datas.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datas;
		
	}
	}
