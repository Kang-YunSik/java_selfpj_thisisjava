import java.util.ArrayList;
import java.util.Scanner;

// Board.java에서 정의한 함수를 기반으로 실행될 것 작성
public class BoardMain {

	public static void main(String[] args) {

		DBUtil db = new DBUtil();
		Scanner scan = new Scanner(System.in);

		db.init();
		// 생성자

		// 타이틀 및 컬럼명 출력
		System.out.println();
		System.out.println("[게시판 목록]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title"); // ??? 형식문자열. %-6s : 6자리 정수, 오른쪽 빈자리 공백
		System.out.println("-----------------------------------------------------------------");
		System.out.println("메인 메뉴 : 1.create | 2.read | 3.clear | 4.exit");
		System.out.print("메뉴 선택 : ");

		while(true){
			String cmd = scan.nextLine();

			// 입력이 4면 종료
			if(cmd.equals("4")) {
				System.out.println();
				System.out.println("게시판 기능을 종료합니다. 이용해주셔서 감사합니다.");
				break;

			 // 입력이 1이면 게시판 작성 기능 실행
			} else if (cmd.equals("1") || cmd.equals("create")){
				System.out.println("[새 게시물 입력]");
				System.out.print("제목: ");
				String btitle = scan.nextLine();
				System.out.print("내용: ");
				String bcontent = scan.nextLine();
				System.out.print("작성자: ");
				String bwriter = scan.nextLine();

				db.insertBoard(btitle, bcontent, bwriter);

				System.out.println("게시물 등록 완료.");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("메인 메뉴 : 1.create | 2.read | 3.clear | 4.exit");
				System.out.print("메뉴 선택 : ");
			}
		}

	}
}