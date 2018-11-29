import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutionClass {

	public static void main(String[] args) throws SQLException    {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		String jdbcUrl="jdbc:oracle:thin:@localhost:1521:CLRExtProc";
		String username="system";
		String password = "Oracle18c";
		Connection conn = null;
		ResultSet rs;
		PreparedStatement pst = null;
		int empid=7566;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				conn=DriverManager.getConnection(jdbcUrl, username, password);
				pst=conn.prepareStatement("select empno,deptno from emp where empid=?");
				pst.setInt(1, empid);
				rs=pst.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getString(2));
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("could not connect to database");
				e1.printStackTrace();
			}finally {
				st.close();
				conn.close();
			}
		
	}

}
