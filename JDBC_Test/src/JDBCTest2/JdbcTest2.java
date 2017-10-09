package JDBCTest2;

import java.sql.*;
import java.util.Properties;

public class JdbcTest2{
	
	public static void main(String[] args){		

		try{
			// ע��JDBC��������
			// ����1: Class.forName()
			Class.forName("com.mysql.jdbc.Deriver");
			// ����2: DriverManager.registerDriver()
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			// �������Ӷ���
			// 1. ʹ�����ݿ�URL���û�������
			String URL1 = "jdbc:mysql://localhost/Example";
			String USER = "username";
			String PASS = "password";
			Connection conn1 = DriverManager.getConnection(URL1, USER, PASS);
			conn1.close();
			// 2. ֻʹ��һ�����ݿ�URL
			String URL2 = "jdbc:mysql://localhost/Example?user=root&password=0909";
			Connection conn2 = DriverManager.getConnection(URL2);
			conn2.close();
			// 3. ʹ�����ݿ��URL��һ��Properties����
			String URL3 = "jdbc:mysql://localhost/EXAMPLE";
			Properties pro = new Properties();
			pro.put("user", "root");
			pro.put("password", "");
			Connection conn3 = DriverManager.getConnection(URL3, pro);
			conn3.close();
			
		}catch(ClassNotFoundException | SQLException ex){
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
		
	}
	
}