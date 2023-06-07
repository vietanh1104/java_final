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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class TinNhanDAO {
    public ArrayList<TinNhan> SelectAllTinNhan() throws SQLException, ClassNotFoundException{
		ArrayList<TinNhan> tn= new ArrayList<TinNhan>();
		Connection conn = Connect.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "SELECT * FROM TinNhan";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
                            TinNhan tinNhan = new TinNhan();
                            tinNhan.setId(rs.getInt("id"));
                            tinNhan.setNoi_dung(rs.getString("noi_dung"));
                            tinNhan.setNgay(rs.getDate("thoi_gian"));
                            tinNhan.setGio(rs.getTime("thoi_gian"));
                            tinNhan.setTrang_thai(rs.getInt("trang_thai"));
                            tinNhan.setIdKH(rs.getInt("idKH"));
                            tn.add(tinNhan);
			}
			Connect.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tn;
	}
    public ArrayList<TinNhan> SelectTinNhanById(int id) throws SQLException, ClassNotFoundException{
		ArrayList<TinNhan> tn= new ArrayList<TinNhan>();
		Connection conn = Connect.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "SELECT * FROM TinNhan WHERE idKH = "+id;
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
                            TinNhan tinNhan = new TinNhan();
                            tinNhan.setId(rs.getInt("id"));
                            tinNhan.setNoi_dung(rs.getString("noi_dung"));
                            tinNhan.setGio(rs.getTime("thoi_gian"));
                            tinNhan.setTrang_thai(rs.getInt("trang_thai"));
                            tinNhan.setIdKH(rs.getInt("idKH"));
                            tn.add(tinNhan);
			}
			Connect.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tn;
	}
     public int SelectIdKHById(int id) throws SQLException, ClassNotFoundException{
		int idKH=0;
		Connection conn = Connect.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "SELECT idKH FROM TinNhan WHERE id = "+id;
			ResultSet rs = st.executeQuery(sql);
                        while(rs.next()) {
                            idKH=rs.getInt("idKH");
			}	
			Connect.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idKH;
	}
    public int UpdateTinNhan(int id) throws SQLException, ClassNotFoundException{
        int kt = 0;
        Connection conn = Connect.getConnection();
        Statement st = conn.createStatement();
        String sql = "UPDATE TinNhan SET trang_thai = 1 WHERE idKH = "+id;
        kt = st.executeUpdate(sql);
        Connect.closeConnection(conn);
        return kt;
    }
    public int InsertTinNhan(TinNhan tn) throws SQLException, ClassNotFoundException{
	int res = 0;       
                Connection conn = Connect.getConnection();
                Statement st = conn.createStatement();
                String query = "INSERT INTO TinNhan(noi_dung, thoi_gian, trang_thai, idKH) VALUES(N'"+tn.getNoi_dung()+"','"+tn.getNgay()+" "+tn.getGio()+"',"+"0,"+tn.getIdKH()+")"; 
                res = st.executeUpdate(query);
                Connect.closeConnection(conn);	  
        return res;
    }
}
