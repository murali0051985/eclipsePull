package com.murali;

public class JdbcDaoDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(3);
		System.out.println(s1.sname);
		
		Student s2 = new Student();
		s2.rollNo = 6;
		s2.sname = "Prasad";
		dao.addStudent(s2);
	}

}
