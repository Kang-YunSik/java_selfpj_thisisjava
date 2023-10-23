import java.util.Scanner;

public class Board {
    // 필드 생성
    Scanner scanner = new Scanner(System.in); // ??? 왜 private일까? // ??? 필드를 생성자로 선언?

    // 메서드
    public void list(){
        // 타이틀 및 컬럼명 출력
        System.out.println();
        System.out.println("[게시만 목록]");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title"); // ??? 형식문자열. %-6s : 6자리 정수, 오른쪽 빈자리 공백
        System.out.println("-----------------------------------------------------------------");

        // boards 테이블에서 게시물 정보를 가져와서 출력하기

    }

    public void mainMenu(){
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Creat | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 션택: ");
        // ??? scanner 필드 선언?
        String menuNo = scanner.nextLine();
        System.out.println();

        switch (menuNo){
            case "1" : create();
            case "2" : read();
            case "3" : clear();
            case "4" : exit();
        }
    }

    //
    public void create(){
        System.out.println("*** create() 메소드 실행됨");
        list();
    }
    public void read(){
        System.out.println("*** create() 메소드 실행됨");
        list();
    }
    public void clear(){
        System.out.println("*** clear() 메소드 실행됨");
        list();
    }
    public void exit() {
        // ??? exit함수. : JVM을 강제로 종료시키는 함수
        // exit(0): 정상종료
        // exit(1): 비정상종료
        System.exit(0);
    }

}