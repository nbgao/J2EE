package JDBCTest1;

import java.sql.*;

public class JdbcTest1 {
	// JDBC ���������ƺ����ݿ��ַ
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// ���ݿ�����Ϊ EXAMPLE
	static final String DB_URL = "jdbc:mysql://localhost/EXAMPLE";
	// ���ݿ��û�������
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//ע��JDBS��������
			Class.forName("com.mysql.jdbc.Driver");
			
			//������
			System.out.println("Connecting to databases ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//ִ�в�ѯ
			System.out.println("Creating statement ...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, age, major FROM Students";
			ResultSet rs = stmt.executeQuery(sql);
			
			//�õ��ʹ�������
			while(rs.next()){
				//����
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String major = rs.getString("major");
				
				//��ʾ
				System.out.print("ID:" + id);
				System.out.print(", Age: " + age);
				System.out.print(", Name: " + name);
				System.out.print(", Major: " + major);
				System.out.println();
			}
			
			//������
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//JDBC ��������
			se.printStackTrace();
		}catch(Exception e){
			//Class.forName����
			e.printStackTrace();
		}finally{
			//�ر���Դ
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
