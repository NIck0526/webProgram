package model;
// DAO

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// ArrayList<Item> getAllItems()
/*
 * Controller --> handleRequest()
 * - ItemListController
 * -----------------------------
 * Factory -- > HandlerMapping
 * -----------------------------
 * DispatcherServlet
 * -----------------------------
 * ModelAndView
 */
public class ItemDao {
	private static ItemDao dao=new ItemDao();
	private DataSource ds;
	private ItemDao(){
		try{
			//DataSource를 찾는다...
			Context ic = new InitialContext();
			ds=(DataSource)ic.lookup("java:comp/env/jdbc/oracleDB");
			System.out.println("DataSource Lookup......");
		}catch(NamingException e){
			e.printStackTrace();
		}
	}
	public static ItemDao getInstance(){
		return dao;
	}
	private Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	public void closeAll(PreparedStatement pstmt,Connection conn) throws SQLException{
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException{
		if(rs!=null)
			rs.close();
		closeAll(pstmt, conn);
	}
	
	public ArrayList<Item> getAllItems() throws SQLException {
		ArrayList<Item> list = new ArrayList();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			rs = ds.getConnection().prepareStatement("SELECT * FROM item").executeQuery();
			while(rs.next()) {
				list.add(new Item(rs.getInt("item_id"), rs.getString("item_name"), 
						rs.getInt("price"), rs.getString("description"), rs.getString("picture_url"), 
						rs.getInt("count")));
			}
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return list;
	}
	
	public boolean updateRecordCount(int itemid) throws SQLException {
		boolean flag = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("UPDATE item SET count=(count+1) WHERE item_id=?");
			pstmt.setInt(1, itemid);
			if(pstmt.executeUpdate()!=0) flag=true;
		} finally {
			closeAll(pstmt, conn);
		}
		return flag;
	}
	
	public Item getItem(int itemnumber) throws SQLException {
		Item item = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM item WHERE item_id=?");
			pstmt.setInt(1, itemnumber);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				item = new Item(rs.getInt("item_id"), rs.getString("item_name"), 
						rs.getInt("price"), rs.getString("description"), rs.getString("picture_url"), 
						rs.getInt("count"));
			}
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return item;
	}
}
