package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sql.StringQuery;

/*
 *  나중에 실질적으로 Component기반으로 최종적으롣 ㅗㄹ릴떄에는
 *  DataSource 방식을 사요할 것이다...
 *  
 *  지금은 단위테스트를 우선적으로 해야하기 때문에
 *  DriverManager 방식을 임시로 사용하겠다.
 *  ::
 *  1) 
 *  DataSource 방식을 사용할 때 가장 핵심이 되는 Service는 JNDI(Naming Service)
 *  바인딩 된 객체를 찾아오는 로직이 dao에 혼재되지 않도록 별도로 분리시키겠다
 *  ::
 *  DataSourceManager
 *  ::
 *  ::
 *  2)
 *  String Query 부분을 별도로 분리시키겠다.
 *  Interface >>> properties >>> xml(Framework - MyBatis) >>> Annotation
 *  
 */
public class BoardDao {
	
	private static BoardDao dao = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return dao;
	}
	
	//////////////// 공통적인 로직 ////////////////////
	
	public  Connection getConnection() throws SQLException{
		System.out.println("디비연결 성공....");
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
	
	///////////////// 비지니스 로직 ///////////
	
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
			// 여기서 쿼리문이 하나 더 돌아야 한다...CURRENT_NO...
			// vo에 no를 주입... vo.setNo(a)
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
		dao.getInstance().posting(new BoardVO("한가위","홍길동","1234","보름달이 뜨면은~~"));
		System.out.println("ge");

	}

}
