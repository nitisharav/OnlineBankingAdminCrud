package xml;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import common.AdminInputs;
import common.AdminRepository;

public class AdminRepositoryImpl implements AdminRepository  {

	 public AdminRepositoryImpl() {
		 System.out.println("AdminRepositoryImpl() Constructor");
	 }
		private DataSource dataSource;
		public void setDataSource(DataSource d) {
			System.out.println("setDateSource(DataSource) setter method invoked...");
			this.dataSource = d;
		}
 public List<AdminInputs>  getAvailableAdminInputs() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from AdminInputs";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			List<AdminInputs> rows = new ArrayList<AdminInputs>();
			
			while(rs.next()) { //each row
				AdminInputs ad = new AdminInputs(); //blank object
				
				ad.setReferenceId(rs.getInt(1)); //fillup
				ad.setApproval(rs.getString(2));  //fillup
				ad.setAccount_no(rs.getString(3)); //fillup
				ad.setAdmin_remarks(rs.getString(4)); //fillup
				
				rows.add(ad); //store it in list
			}
			return rows;
 }
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try { rs.close(); pst.close(); conn.close(); } catch(Exception e) { 
				
				System.out.println("error "+e);
			}
		}
    }
    public void addAdminInputs(AdminInputs ad) {
    	Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			

			conn = dataSource.getConnection();
			
			
			String sql="insert into AdminInputs values (?,?,?,?)";
	  pst = conn.prepareStatement(sql);
	  
	  pst.setInt(1, ad.getReferenceId());
	  pst.setString(2, ad.getApproval());
	  pst.setString(3, ad.getAccount_no());
	  pst.setString(4, ad.getAdmin_remarks());
	  
	  pst.executeUpdate();
	  
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try { rs.close(); pst.close(); conn.close(); } catch(Exception e) { 
				
				System.out.println("error "+e);
			}
		}
    }

	public void updateAdminInputs(int referenceid, String approval, String account_no, String admin_remarks) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			

			conn = dataSource.getConnection();
			
			
			String sql="update AdminInputs set approval=?,account_no=?,admin_remarks=? where referenceid=?";
	  pst = conn.prepareStatement(sql);
	  
	  pst.setString(1, approval);
	  pst.setString(2, account_no);
	  pst.setString(3, admin_remarks);
	  pst.setInt(4, referenceid);
	  
	  pst.executeUpdate();
	  
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try { rs.close(); pst.close(); conn.close(); } catch(Exception e) { 
				
				System.out.println("error "+e);
			}
		}
    }

	
    public void deleteAdminInputs(int referenceId) {
    	Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			

			conn = dataSource.getConnection();
			
			
			String sql="delete from AdminInputs where referenceid=?";
	  pst = conn.prepareStatement(sql);
	  
	  
	pst.setInt(1, referenceId);
	  
	  pst.executeUpdate();
	  
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try { rs.close(); pst.close(); conn.close(); } catch(Exception e) { 
				
				System.out.println("error "+e);
			}
		}
    }

	
}

