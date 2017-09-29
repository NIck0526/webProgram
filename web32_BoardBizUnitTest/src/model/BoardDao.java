package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sql.StringQuery;

/*
 *  ���߿� ���������� Component������� ���������� �Ǥ���������
 *  DataSource ����� ����� ���̴�...
 *  
 *  ������ �����׽�Ʈ�� �켱������ �ؾ��ϱ� ������
 *  DriverManager ����� �ӽ÷� ����ϰڴ�.
 *  ::
 *  1) 
 *  DataSource ����� ����� �� ���� �ٽ��� �Ǵ� Service�� JNDI(Naming Service)
 *  ���ε� �� ��ü�� ã�ƿ��� ������ dao�� ȥ����� �ʵ��� ������ �и���Ű�ڴ�
 *  ::
 *  DataSourceManager
 *  ::
 *  ::
 *  2)
 *  String Query �κ��� ������ �и���Ű�ڴ�.
 *  Interface >>> properties >>> xml(Framework - MyBatis) >>> Annotation
 *  
 */
public class BoardDao {
	
	private static BoardDao dao = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return dao;
	}
	
	//////////////// �������� ���� ////////////////////
	
	public  Connection getConnection() throws SQLException{
		System.out.println("��񿬰� ����....");
		return DataSourceManager.getInstance().getConnection();
	}
	public void closeAll(PreparedStatement ps, Connection conn)throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn)throws SQLException{
		if(rs!=null){
			rs.close();
			closeAll(ps, conn);
		}
	}
	
	///////////////// �����Ͻ� ���� ///////////
	
	public void posting(BoardVO vo) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.INSERT_POSTING);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getWriter());
			ps.setString(3, vo.getPassword());
			ps.setString(4, vo.getContent());
			
			int row = ps.executeUpdate();
			System.out.println(row+"row INSERT OK!!!");
			
			
			System.out.println("dao INSERT before SquenceNo :: "+vo.getNo());
			// ���⼭ �������� �ϳ� �� ���ƾ� �Ѵ�...CURRENT_NO...
			// vo�� no�� ����... vo.setNo(a)
			ps = conn.prepareStatement(StringQuery.CURRENT_NO);
			rs = ps.executeQuery();
			if(rs.next()) vo.setNo(rs.getInt(1));
				System.out.println("dao INSERT after SquenceNo :: "+vo.getNo());
		
		}finally{
			closeAll(ps, conn);
		}
				
	}
	
	
	public BoardVO getPostingByNo(int no)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardVO vo = null;
		try {
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_POSTING);	
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new BoardVO(no,
								rs.getString("title"), 
								rs.getString("writer"), 
								rs.getString("content"), 
								rs.getInt("hits"), 
								rs.getString("time_posted"));
				System.out.println("getPostingByNo...."+no);
			}
			
		}finally {
			closeAll(rs, ps, conn);
		}
		return vo;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		BoardDao dao = new BoardDao();
		dao.getInstance().posting(new BoardVO("�Ѱ���","ȫ�浿","1234","�������� �߸���~~"));
		System.out.println("ge");

	}

}
