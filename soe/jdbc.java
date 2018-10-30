import java.util.sql.*;//package for jdbc

public class Reg {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String Query = "select * from Student";
        try{
        		Class.forName("com.mysql.jdbc.Driver");
        		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","iiita123");
        		Statement st = con.createStatement();
        		ResultSet rs = st.excecuteQuery(Query);
        		rs.next();
        		String sname = getString(2);
        		System.out.println(sname);
        		con.close();
        }
        catch(Exception e){

        }
    }
    
}