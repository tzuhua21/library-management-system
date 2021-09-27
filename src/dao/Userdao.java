package dao;

import java.sql.*;

import demo.database;
import entity.Books;

public class Userdao {
	database db;public Books book;
	public Userdao(){
		book=new Books();
		//db=new database();
	}
	public boolean dologin(String name,String pwd){	
		Connection con =db.getConnection();//建立数据库连接，获得Connection对象。
		if(con==null)
			System.out.println("连接数据库失败");
		//创建SQL语句
		String sql="select * from users where LoginId=? and LoginPwd=?";
			try {
			PreparedStatement stmt=con.prepareStatement(sql);//根据SOL语句建立PreparedStatement对象
			stmt.setString(1, name);//设置参数
			stmt.setString(2, pwd);//设置参数
			ResultSet rSet=stmt.executeQuery();//执行SQL语句
			if(rSet.next()){
				return true;
				}else{
					return false;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			//db.CloseConnection(con);//关闭数据库连接，释放资源
		}
		return false;
}
			}