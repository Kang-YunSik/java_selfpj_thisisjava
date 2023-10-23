import java.util.ArrayList;
import java.util.Scanner;

// Board.java에서 정의한 함수를 기반으로 실행될 것 작성
public class BoardMain {

	public static void main(String[] args) {

		DBUtil db = new DBUtil();
		db.init();
		// 생성자
		Board board= new Board();

		// list() 실행
		board.list();
	}
}