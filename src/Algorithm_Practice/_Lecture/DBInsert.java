package Algorithm_Practice._Lecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBInsert {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String sql;
	String name;
	int index;
	try {
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:21006/?serverTimezone=UTC&useSSL=false &allowPublicKeyRetrieval=true",
				"root", "-----------------------------------------------*");
		java.sql.Statement st = null;
		ResultSet rs = null;
		st = con.createStatement();
		st.executeUpdate("use 6202_pc;");
		System.out.println("Input name : ");
		name = sc.nextLine();
		System.out.println("Input index : ");
		index = sc.nextInt();
		sql = "insert into test values(?, ?)";    //insert�� ���ڰ��� �ֱ� ���� ���
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,name);
		pst.setInt(2, index);
		pst.execute();
		pst.close();


		rs = st.executeQuery("select name, idx from test;");
		while(rs.next()) {
			String str = rs.getString("name");
			int idx = rs.getInt("idx");
			System.out.println(str + " " + idx);
		}


	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
}
