package sql;

public interface StringQuery {
	String INSERT_POSTING = "INSERT INTO board (no, title, writer, password, content, time_posted)"+
			"VALUES(board_seq.nextVal,?,?,?,?,sysdate)";
	
	String CURRENT_NO = "SELECT board_seq.currVal FROM dual";
	
	String SELECT_POSTING = "SELECT no, title, writer, content, hits, time_posted FROM board WHERE no=?";
	
}
