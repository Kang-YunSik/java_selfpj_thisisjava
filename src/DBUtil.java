import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// DB연동 설정파일 (jdbc: mariadb / framework: Mybatis)
public class DBUtil {

	// jdbc 사용자 정보 입력
	String url = "jdbc:mariadb://127.0.0.1:3306/java_selfpj_thisisjava"; // addr_prj: 데이터가 저장될 스키마
	String user = "root"; // 아이디
	String pass = "12345"; // 비밀번호
	SqlSessionFactory sqlSessionFactory; // mybatis SqlSessionFactory 필드 생성


	public void init(){
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);

			// SqlSessionFactory 빌드하기
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace(); // printStackTrace() : 예외가 발생하면 예외 족적(발자취)을 남긴다.
		}

	}

	public void insertBoard(String btitle, String bcontent, String bwriter) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO boardVO = new BoardVO(btitle, bcontent, bwriter);
		mapper.insertBoard(boardVO);

		session.commit(); // update, delete, insert
	}

	public ArrayList<BoardVO> getBoard(){
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<BoardVO> boardVOList = mapper.getBoard();

		return boardVOList;
	}

	public void homeBoard(){
		System.out.println();
		System.out.println("[게시판 목록]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-40s%-40s\n", "no", "writer", "date", "title"); // ??? 형식문자열. %-6s : 6자리 정수, 오른쪽 빈자리 공백
		System.out.println("-----------------------------------------------------------------");
	}

	public void mainMenu(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("메인 메뉴 : 1.create | 2.read | 3.clear | 4.exit");
		System.out.print("메뉴 선택 : ");
	}

	public void createSubMenu(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
	}

	public void exit(){
		System.out.println();
		System.out.println("게시판 기능을 종료합니다. 이용해주셔서 감사합니다.");
		System.exit(0);
	}
}
