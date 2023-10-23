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
		db.homeBoard();

		ArrayList<BoardVO> boardList = db.getBoard();
		NowBoard nowBoard = new NowBoard();
		nowBoard.printNowBoard(boardList);

		db.mainMenu();

		while(true){
			String cmd = scan.nextLine();

			// 입력이 4면 종료
			if(cmd.equals("4")) {
				db.exit();

			 // 입력이 1이면 게시판 작성 기능 실행
			} else if (cmd.equals("1") || cmd.equals("create")){
				System.out.println("[새 게시물 입력]");
				System.out.print("제목: ");
				String btitle = scan.nextLine();
				System.out.print("내용: ");
				String bcontent = scan.nextLine();
				System.out.print("작성자: ");
				String bwriter = scan.nextLine();

				db.createSubMenu();
				String createSubMenuNo = scan.nextLine();
				switch (createSubMenuNo){
					case "1" :
						db.insertBoard(btitle, bcontent, bwriter);
						System.out.println("[게시물 등록 완료]");
						break;
					case "2":
						System.out.println("[게시물 등록 취소]");
						break;
				}
				System.out.println("-----------------------------------------------------------------");
				NowBoard addBoard = new NowBoard();
				addBoard.printNowBoard(boardList);
				db.mainMenu();

			}

		}

	}
}