import java.util.ArrayList;
import java.util.Scanner;

// Board.java에서 정의한 함수를 기반으로 실행될 것 작성
public class BoardMain {

	public static void main(String[] args) {

		// 생성자
		DBUtil db = new DBUtil();
		DBUtil nowBoard = new DBUtil();

		Scanner scan = new Scanner(System.in);

		// Mybatis 연동 확인
		db.init();

		// 게시판 틀 출력
		db.homeBoard();

		// 게시판 목록 출력
		ArrayList<BoardVO> boardList = db.getBoard();
		nowBoard.printNowBoard(boardList);

		db.mainMenu();

		while(true) {
			String cmd = scan.nextLine();

			// 입력이 4면 종료
			if (cmd.equals("4")) {
				db.exit();

				// 게시판 작성 기능 실행
			} else if (cmd.equals("1") || cmd.equals("create")) {
				System.out.println("[새 게시물 입력]");
				System.out.print("제목: ");
				String btitle = scan.nextLine();
				System.out.print("내용: ");
				String bcontent = scan.nextLine();
				System.out.print("작성자: ");
				String bwriter = scan.nextLine();

				// 하위 메뉴 출력
				db.createSubMenu();

				String createSubMenuNo = scan.nextLine();

				// 입력값에 따른 하위 메뉴 실행
				switch (createSubMenuNo) {
					case "1":
						db.insertBoard(btitle, bcontent, bwriter);
						System.out.println("[게시물 등록 완료]");

						// boardList 최신화
						boardList = db.getBoard();

						break;
					case "2":
						System.out.println("[게시물 등록 취소]");
						break;
				}
				System.out.println("-----------------------------------------------------------------");

				// 게시판 틀 출력
				db.homeBoard();

				// add된 게시판 목록 출력
				nowBoard.printNowBoard(boardList);

				// 메인 메뉴 출력
				db.mainMenu();

			} else if (cmd.equals("5")) {
				System.out.println("[게시물 삭제]");
				System.out.print("bno: ");
				int bno = Integer.parseInt(scan.nextLine());

				System.out.println(bno + "번째 게시물을 삭제하시겠습니까?");
				db.createSubMenu();
				String deleteSubMenuNo = scan.nextLine();
				switch (deleteSubMenuNo) {
					case "1":
						db.deleteBoard(bno);
						System.out.println(bno + "번째 게시물 삭제 완료");

						// boardList 최신화
						boardList = db.getBoard();

						break;
					case "2":
						System.out.println("게시물 삭제 취소");
						break;
				}

				// 게시판 틀 출력
				db.homeBoard();

				// add된 게시판 목록 출력
				nowBoard.printNowBoard(boardList);

				// 메인 메뉴 출력
				db.mainMenu();

			} else if(cmd.equals("2")){
				System.out.println("[게시물 읽기]");
				System.out.print("bno: ");

				int bno = Integer.parseInt(scan.nextLine());
				boardList = db.readBoard(bno);
				db.readBnoBoard(boardList);

			}

//			else if (cmd.equals("2")) {
//				System.out.println();
//				System.out.println("[게시글 읽기]");
//				System.out.print("bno: ");
//				String bno = scan.nextLine();
//
//
//				db.readBoard(Integer.parseInt(bno));
//		}




		}

	}
}