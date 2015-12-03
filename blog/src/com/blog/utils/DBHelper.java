
package com.blog.utils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*******************************************
 * 	创建标识：熊小文   2015.10.03
 * 	类描述：数据库操作的公共类
 * 
 * 	修改日期：
 * 	修改原因：
 * 	修改内容：
 *******************************************/
public class DBHelper {

	private static String driver ="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://blog.2015.all123.net:3306/blog?userUnicode=true&characterEncoding=UTF-8";
	private static String username="blog";
	private static String password="blog";
	private static Connection conn=null;
	
	/*
	 * 加载驱动
	 */
	static
	{
		
		try
		{
			Class.forName(driver);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 获取连接
	 */
	public static Connection getConnection()
	{
		if(conn==null)
		{
			try
			{
				conn=DriverManager.getConnection(url, username, password);
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		else
		return conn;
	}
	
	/**
	 * 不带参数的增、删、改操作
	 * @throws Exception
	 */
	public static int NonQuery(String sql) throws Exception
	{
		Connection conn = DBHelper.getConnection();
		if(conn!=null)
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			return pstmt.executeUpdate();
		}
		return -1;
		
	}
	
	/**
	 * 不带参数的查询操作
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public static ResultSet Query(String sql) throws Exception
	{
		Connection conn = DBHelper.getConnection();
		if(conn!=null)
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			return pstmt.executeQuery();
		}
		return null;
	}
	
	
	/**
	 * 带有参数的插入、删除、修改操作
	 * @param sql
	 * @param args
	 * @return 改变的行数
	 * @throws Exception
	 */
	public static int NonQuery(String sql , Object[] args) throws Exception
	{
		Connection conn = DBHelper.getConnection();
		if(conn!=null)
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
			{
				pstmt.setObject(i+1, args[i]);
			}
			return pstmt.executeUpdate();
		}
		return -1;
	}

	/**
	 * 带有参数的查询操作
	 * @param sql
	 * @param args
	 * @return
	 * @throws Exception
	 */
	public static ResultSet Query(String sql,Object[] args) throws Exception
	{
		Connection conn = DBHelper.getConnection();
		if(conn!=null)
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++)
			{
				pstmt.setObject(i+1, args[i]);
			}
			return pstmt.executeQuery();
		}
		return null;
	}
	
	/*
	 * 关闭数据库连接
	 */
	public static void closeConn() throws Exception
	{
		if(conn !=null && !conn.isClosed())
		{
			conn.close();
		}
	}
	
	/**	
	 * 上传文件，参数为文件路径和其他参数对象
	 * @param sql
	 * @param path
	 * @return
	 * @throws Exception
	 */
 	public static int uploadfile(String sql,String path,Object[] args) throws Exception
	{
		File file = new File(path);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setBinaryStream(1,in, (int)file.length());
		//这里，第一个参数必须是文件路径，其他参数放在后面，如果不是这种情况，自行编写对应的语句。
		for(int i=0;i<args.length;i++)
		{
			ps.setObject(i+2, args[i]);
		}
		int i = ps.executeUpdate();
		return i;
	}

 	
	/*
	 * 主方法，测试连接是否成功
	 * 测试插入、查询、更新操作
	 */
	public static void main(String[] args) {
	try
	  {
		Connection conn =DBHelper.getConnection();
		if(conn!=null)
		{
			System.out.println("数据库连接成功！");
			//不带参数的插入、删除、更新测试
//			String sql = "update user set Host='dolby' where User='dolby'";
//			System.out.println(DBHelper.ExeSQL(sql));
			
			
			//不带参数的查询操作测试
//			String sql ="select * from user";
//			ResultSet rs = DBHelper.Query(sql);
//			while(rs.next())
//			{
//				System.out.println(rs.getString("User"));
//			}
			
			//带参数的插入操作的测试
//			String sql="insert into person values(?,?,?,?)";
//			Object[] obj=new Object[]{"1","2","3","4"};
//			int i=DBHelper.insert(sql, obj);
//			if(i>0)
//				System.out.println(i);
//			else
//				System.out.println("插入失败！");
			
			
			//插入文件操作

//			String sql = "UPDATE user SET head=? WHERE uid=1";
//			File file = new File("D:\\Courses\\Basical English\\Resources\\Al Pacino\\scent of woman.jpg");
//			InputStream in = new BufferedInputStream(new FileInputStream(file));
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setBinaryStream(1,in, (int)file.length());
//			int i = ps.executeUpdate();
			
			
			//带参数的文件插入操作
//			Object[] parms = new Object[]{"1"};
//			DBHelper.uploadfile("UPDATE user SET head=? WHERE uid = ?", "D:\\Courses\\Basical English\\Resources\\Al Pacino\\god father.jpg", parms);
//			conn.close();

			//读取上传的文件，保存到D:\\temp\\中测试完成
//			ResultSet rs = DBHelper.Query("SELECT head FROM user WHERE uid = '1'");
//			while(rs.next())
//			{
//				InputStream in=rs.getBinaryStream("head");
//				File file = new File("D:\\temp\\temp.jpg");
//				OutputStream out = new BufferedOutputStream(new FileOutputStream(file));
//				byte[] buff= new byte[1024];
//				for(int i=0;(i=in.read(buff))>0;)
//				{
//					out.write(buff,0,i);
//				}
//				out.close();
//			}
			
		}
		else
			System.out.println("数据库连接失败！");
	  }
	catch(Exception ex)
	  {
		ex.printStackTrace();
	  }
	}
	
}
