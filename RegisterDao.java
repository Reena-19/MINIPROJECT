import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class RegisterDao {
		String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
		String dbUname="root";
		String dbPassword="";
		String dbDriver="com.mysql.cj.jdbc.Driver";
        String name,pass,email,phone;
        RegisterDao(String name,String pass,String email,String phone){
        	this.name=name;
        	this.pass=pass;
        	this.email=email;
        	this.phone=phone;
        }
         boolean store(){
        	Connection con = null;
    		try {
    			Class.forName(dbDriver);  //class not found exception
    			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
    			String sql="select * from student_table where Email='"+email+"'";
    			Statement s = con.createStatement();
    			ResultSet rs =s.executeQuery(sql);
    			if(rs.next()) {
    				return true;
    			}else {
    			String sql1 ="insert into student_table (Email,Password,Name,Phone_no)"
    					+ "values('"+email+"','"+pass+"','"+name+"','"+phone+"')";
	    		    s = con.createStatement();
	     		    s.execute(sql1);
	     		    return false;
    		    }
//			   	con.close();
    		} catch (Exception e){
    			e.printStackTrace();
    		}
    		return false;
        }

        

}

