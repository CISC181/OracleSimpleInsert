package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SimpleInsert {

	public static void main(String[] args) {
		try { 
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
            String username = "CISC181";
            String password = "Section1";
            Connection conn = DriverManager.getConnection(url,username,password); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO Bert.EMP " + 
                "(ID, First_Name, Last_Name, Salary, MiddleName)" +
                "VALUES (seq_emp.nextval,'Bert','Jones',25000,'R')"); 
            System.out.println("Record Inserted");
            conn.close(); 
            
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 

	}

}
