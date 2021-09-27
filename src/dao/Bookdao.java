package dao;

import java.sql.*;
import java.util.Vector;

import demo.database;
import entity.Books;

public class Bookdao {
	database db;

	// 构造方法
	public Bookdao() {
		//db = new database();
	}

	/**
	 * @param book
	 * @return ResultSet 根据所有信息查询图书，返回查询结果集
	 */
	public ResultSet getBookByAll(String author) {
		// 得到连接
		Connection con = db.getConnection();// 得到连接
		String sql = "select * from books ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			return rset;

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * @param book
	 * @return ResultSet 根据书名查询图书,返回查询的结果集
	 */
	public ResultSet getBookByTitle(String title) {
		// 得到连接
		Connection con = db.getConnection();
		String sql = "select * from books where Title like '%" + title + "%'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			return rset;

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * @param book
	 * @return ResultSet 根据图书ISBN编码查询图书
	 */
	public ResultSet getBookByISBN(String isbn) {
		// 得到连接
		Connection con = db.getConnection();// 得到连接
		String sql = "select * from books where ISBN like '%" + isbn + "%'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			return rset;

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * @param book
	 * @return ResultSet 根据图书作者查询图书，返回查询结果集
	 */
	public ResultSet getBookByAuthor(String author) {
		// 得到连接
		Connection con = db.getConnection();// 得到连接
		String sql = "select * from books where Author like '%" + author + "%'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			return rset;

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * @param 添加图书对象
	 * @return ResultSet 添加图书方法
	 */
	public boolean Add(Books book) {
		Connection con = db.getConnection();// 建立数据库连接，获得Connection对象。
		if (con == null)
			System.out.println("连接数据库失败");
		// 创建SQL语句
		String sql = "insert into books values (?,?,?,?,?,?,0,?,?,?,'','',?,0)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			stmt.setInt(1, book.getId());
			stmt.setString(2, book.getTitle());
			stmt.setString(3, book.getAuthor());
			stmt.setInt(4, book.getPublisherid());
			stmt.setString(5, book.getPublishdate());
			stmt.setString(6, book.getIsbn());
			stmt.setDouble(7, book.getUnitprice());
			stmt.setString(8, book.getContendescription());
			stmt.setString(9, book.getAuthordescription());
			stmt.setString(10, book.getCategoryId());
			int row = stmt.executeUpdate();// 执行语句
			if (row > 0)// 判断是否数据插入成功，如果更新行数大于0，则插入数据成功
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.CloseConnection(con);// 关闭数据库连接，释放资源
		}
		return false;// 否则插入数据失败
	}

	public int getId() {
		// 得到连接
		Connection con = db.getConnection();
		String sql = "select * from books";
		int id = 1;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			if (rset.last())// 判断得到的结果集下一行是否有记录
				id = rset.getInt(1);// 将得到记录的索引号赋给ID
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return id;
	}

	/**
	 * 方法名：删除图书对象
	 * 
	 * @param key
	 *            删除图书的Id
	 * @return 返回是否成功
	 */
	public boolean Delete(String id) {
		Connection con = db.getConnection();// 得到数据库连接
		String sql = "delete from books where Id=" + id;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			// 执行sql语句
			int row = stmt.executeUpdate();// 执行语句
			if (row > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 执行操作后关闭数据库
			//db.CloseConnection(con);
		}
		return false;
	}

	/**
	 * 方法名：修改图书
	 * 
	 * @param key
	 *            修改图书信息
	 * @return 返回是否成功
	 */
	public boolean update(Books book) {
		Connection con = db.getConnection();
		if (con == null)
			System.out.println("连接数据库失败");

		String sql = "update books set title =?, author= ?,publishDate =?,unitprice=?,isbn=?,authorDescription=?,contenDescriptiob where Id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			stmt.setInt(1, book.getId());
			stmt.setString(2, book.getTitle());
			stmt.setString(3, book.getAuthor());
			stmt.setString(5, book.getPublishdate());
			stmt.setString(6, book.getIsbn());
			stmt.setDouble(7, book.getUnitprice());
			stmt.setString(8, book.getContendescription());
			stmt.setString(9, book.getAuthordescription());
			int row = stmt.executeUpdate();
			if (row > 0)// 判断是否修改插入成功，如果更新行数大于0，则修改数据成功
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.CloseConnection(con);// 关闭数据库连接，释放资源
		}
		return false;// 否则修改数据失败
	}

	/**
	 * 获取数据库中图书种类表(categories)中对应的Id
	 * 
	 * @param categories
	 *            (种类)
	 * @return 返回对应Id
	 */
	public String getCategoryId(String Categories) {
		// 得到连接
		Connection con = db.getConnection();
		String id = "28"; // 在分类表中28为其他
		String sql = "select * from categories where Name='" + Categories + "'";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			if (rset.next())
				id = rset.getString(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	/**
	 * 获取数据库中图书出版社表(publishers)中对应的Id
	 * 
	 * @param Publisher
	 *            (出版社)
	 * @return 返回对应Id
	 */
	public int getPublisherId(String Publisher) {
		// 得到连接
		Connection con = db.getConnection();
		int id = 4; // 在出版社id表中4为未知
		String sql = "select * from publishers where Name='" + Publisher + "'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);// 根据SOL语句建立PreparedStatement对象
			ResultSet rset = stmt.executeQuery();// 执行语句
			if (rset.next())
				id = rset.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

}
