package com.murali;

import java.sql.*;

public class StudentDAO {
	
		public Student getStudent(int rollno) throws Exception {
			Student s = new Student();	
	        
			Connection mycon = connect();
			String sname = getStudentDetails(mycon,rollno); // to open the connection details and fetch the value from the mysql db
			
			s.rollNo = rollno;
			s.sname = sname;
			return s;
		}
		
		Connection connect() throws Exception {
			
			String url = "jdbc:mysql://localhost:3306/aliens";
			String uname = "root";
			String pass = "Employer@00";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass); // step3: create connection
			return con;
		}
		
		String getStudentDetails(Connection mycon, int rollno) throws Exception {
			
			String query = "select sname from student where rollno="+rollno;
			
			Statement st = mycon.createStatement(); // step4: create statement // statement type
			ResultSet rs = st.executeQuery(query);
			rs.next(); //moving the pointer to the first column
			String name = rs.getString(1); //getting the first column
			
			st.close(); // step7: closing the connection objects
			mycon.close();
			
			return name;
			
		}

		public void addStudent(Student s2) throws Exception {
			Connection mycon = connect();
			
			String query = "INSERT INTO student VALUES (?,?)"; 
			PreparedStatement st = mycon.prepareStatement(query);
			st.setInt(1, s2.rollNo);
			st.setString(2, s2.sname);
			
			int count = st.executeUpdate();
			System.out.println(count + " row/s affected");
			
			st.close(); // step7: closing the connection objects
			mycon.close();
			
		}
}
