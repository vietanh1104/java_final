/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject.Dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import finalproject.Models.*;
/**
 *
 * @author Acer
 */
public class KhachHangDAO {
    public String SelectTenKhachHangById(int id) throws SQLException, ClassNotFoundException{
		String tkh=null;
		Connection conn = Connect.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "SELECT ho_ten FROM KhachHang WHERE id = "+id;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
                            tkh = rs.getString("ho_ten");
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                        
		}
                Connect.closeConnection(conn);
		return tkh;
    }
}
