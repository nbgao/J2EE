package JDBCTest3;

import java.sql.*;

public class JdbcTest3 {
	// JDBC 驱动器名称和数据库地址
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// 数据库名称为 EXAMPLE
	static final String DB_URL = "jdbc:mysql://localhost/EXAMPLE";
	// 数据库用户和密码
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			//注册JDBS驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			
			//打开连接
			System.out.println("Connecting to databases ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//执行查询
			System.out.println("Creating statement ...");
			
			String sql = "UPDATE Students SET age=? WHERE id=?";
			stmt = conn.prepareStatement(sql);
			
			//将值绑定到参数，参数从左至右序号为1,2,...
			stmt.setInt(1, 22);		//绑定age的值
			stmt.setInt(2, 1);		//绑定ID的值
			
			//更新ID为1的同学的年龄
			int rows = stmt.executeUpdate();
			System.out.println("被影响的行数: " + rows);
			
			//查询所有记录，并显示
			sql = "SELECT id, name, age, major FROM Students";
			ResultSet rs = stmt.executeQuery(sql);
			
			//得到和处理结果集
			while(rs.next()){
				//检索
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String major = rs.getString("major");
				
				//显示
				System.out.print("ID:" + id);
				System.out.print(", Age: " + age);
				System.out.print(", Name: " + name);
				System.out.print(", Major: " + major);
				System.out.println();
			}
			
			//清理环境
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//JDBC 操作错误
			se.printStackTrace();
		}catch(Exception e){
			//Class.forName错误
			e.printStackTrace();
		}finally{
			//关闭资源
			try{
				if(stmt != null)
					stmt.close();
			}catch(SQLException se2){
				se2.printStackTrace();
			}
			try{
				if(conn != null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}	
}
