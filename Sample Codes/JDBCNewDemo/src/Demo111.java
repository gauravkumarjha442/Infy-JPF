import java.sql.*;  

class Demo111{  
public static void main(String args[]) throws SQLException{  
	Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
	PreparedStatement preStmt=null;
	
	try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  // Load and register the driver
			con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/infy1","root","");  //Establish the connection
			//here "infosys" is database name, "root" is username and password is none  
			stmt=con.createStatement();  
			rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

		
			//After adding one more row
//			stmt.executeUpdate("insert into employee values(128999, 'Manisha','Mumbai')");  
//			rs=stmt.executeQuery("select * from employee");  
//			while(rs.next())  
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  


			//PreparedStatement
		//	preStmt = con.prepareStatement("select * from employee");
		//	rs=preStmt.executeQuery();
		//	while(rs.next())  
		//		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
// 
//			//One more row is added
//
//			stmt.executeUpdate("insert into emp values(101,'Ramesh',45)");  
//
//			rs=preStmt.executeQuery();
//			while(rs.next())  
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
//			
			
			//stmt.close();  // Done in finally block
			//con.close();  
		}
	
	catch (ClassNotFoundException ce) {
		System.out.print("No suitable driver for DB found");
		ce.printStackTrace();
	} 
	
	catch (SQLException se) {
		System.out.print("SQL Exception occurred");
		se.printStackTrace();
		con.rollback();
	}
	
	finally {
		if (stmt != null)
			stmt.close();
		if (preStmt != null)
			preStmt.close();
		if (con != null)
			con.close();
	}
}  
	


	
//	public static void main(String args[]) throws ClassNotFoundException, SQLException{  
//
//		Class.forName("com.mysql.cj.jdbc.Driver");  
//	Connection con=DriverManager.getConnection(  
//	"jdbc:mysql://localhost:3306/abcd","root","");  
//	//here "abcd" is database name, "root" is username and password is none  
//	Statement stmt=con.createStatement();  
//	ResultSet rs=stmt.executeQuery("select * from emp");  
//	while(rs.next())  
//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//	con.close();  
	
	 
}  