import java.util.ArrayList;
import java.util.Scanner;

// Board.java에서 정의한 함수를 기반으로 실행될 것 작성
public class BoardMain {

	public static void main(String[] args) {

		// 생성자
		DBUtil db = new DBUtil(); // 실행 기지에 사용될 변수 db
		DBUtil nowBoard = new DBUtil(); // 게시판 출력에 사용될 변수 nowBoard
		Scanner scan = new Scanner(System.in); // 사용자 입력 값에 사용될 변수 scan

		// Mybatis 연동 확인. 최초 실행
		db.init();

		// 게시판 틀 출력
		db.homeBoard();

		// 게시판 목록 출력
		ArrayList<BoardVO> boardList = db.getBoard();
		nowBoard.printNowBoard(boardList);

		// 메인메뉴 출력
		db.mainMenu();


		while(true) {
			// 지역변수 선언
			String cmd = scan.nextLine(); // 사용자가 Enter를 입력했을 때 값을 cmd에 대입

			// 종료
			if (cmd.equals("4")) {
				db.exit();

			// 게시판 작성 기능 실행(CREATE)
			} else if (cmd.equals("1") || cmd.equals("create")) {
				System.out.println("[새 게시물 입력]");
				System.out.print("제목: ");
				// 사용자가 입력한 제목 값을 btitle 변수에 대입
				String btitle = scan.nextLine();
				System.out.print("내용: ");
				// 사용자가 입력한 내용 값을 bcontent 변수에 대입
				String bcontent = scan.nextLine();
				System.out.print("작성자: ");
				// 사용자가 입력한 작성자 값을 bwriter 변수에 대입
				String bwriter = scan.nextLine();

				// 하위 메뉴 출력
				db.okSubMenu();

				String createSubMenuNo = scan.nextLine();

				// 입력값에 따른 하위 메뉴 실행
				switch (createSubMenuNo) {
					case "1":
						db.insertBoard(btitle, bcontent, bwriter);
						System.out.println("[게시물 등록 완료]");
						break;

					case "2":
						System.out.println("[게시물 등록 취소]");
						break;
				}

				// 게시판 최신화
				boardList = db.getBoard();

				// 게시판 틀 출력
				db.homeBoard();

				// 게시판 목록 출력
				nowBoard.printNowBoard(boardList);

				// 메인 메뉴 출력
				db.mainMenu();

			} else if(cmd.equals("2")){
				System.out.println("[게시물 읽기]");
				System.out.print("bno: ");

				int bno = Integer.parseInt(scan.nextLine());
				boardList = db.readBoard(bno);
				db.readBnoBoard(boardList);

				db.readSubMenu();

				String readSubMenuNo = scan.nextLine();

				switch (readSubMenuNo){
					case "1" :
						System.out.println("[수정 내용 입력]");
						System.out.print("제목 : ");
						String btitle = scan.nextLine();
						System.out.print("내용 : ");
						String bcontent = scan.nextLine();
						System.out.print("작성자 : ");
						String bwriter = scan.nextLine();

						db.okSubMenu();
						String createSubMenuNo = scan.nextLine();

						switch (createSubMenuNo) {
							case "1":
								db.updateBoard(bno, btitle, bcontent, bwriter);
								System.out.println("[게시물 수정 완료]");
								break;

							case "2":
								System.out.println("[게시물 수정 취소]");
								break;
						}
						break;

					case "2" :
						System.out.println("정말로 " + bno + "번째 게시물을 삭제하시겠습니까?");
						db.okSubMenu();
						String deleteSubMenuNo = scan.nextLine();
						switch (deleteSubMenuNo) {
							case "1":
								db.deleteBoard(bno);
								System.out.println(bno + "번째 게시물 삭제 완료");
								break;

							case "2":
								System.out.println("게시물 삭제 취소");
								break;
						}
						break;

					case "3" :
						break;
				}

				// 게시판 최신화
				boardList = db.getBoard();

				// 게시판 틀 출력
				db.homeBoard();

				// 게시판 목록 출력
				nowBoard.printNowBoard(boardList);

				// 메인 메뉴 출력
				db.mainMenu();

			}
		}
	}
}