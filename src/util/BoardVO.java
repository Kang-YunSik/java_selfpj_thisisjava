package util;

import java.util.Date;

public class BoardVO {
    // Board 클래스 필드 선언
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;


    // [생성자의 개념]
    // 1. 생성자는 필드의 값을 불러와 새로운 값으로 초기화하는 역할을 합니다.
    // 2. 이 때, 기본 생성자는 매개변수가 없는 메소드이며 필드를 해당 자료형의 기본값으로 초기화합니다.
    //    예를 들어, int 필드는 0으로 초기화됩니다.
    // 3. 매개변수가 있는 생성자는 호출하려면 BoardVO boardVO = new BoardVO(동일한 매개변수) 로 한다.
    // 4. 만약, 동일한 매개변수를 받지만 다른 기능을 수행하는 메소드를 정의하고 싶다면, 메소드 명을 다르게 해야 한다.


    // 매개변수가 5개 모두 필요한 메소드
    public BoardVO(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = bdate;
    }

    // 매개변수가 4개만 필요한 메소드
    public BoardVO(int bno, String btitle, String bcontent, String bwriter) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }

    // 매개변수가 3개만 필요한 메소드
    public BoardVO(String btitle, String bcontent, String bwriter) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }

    // 매개변수가 1개만 필요한 메소드
    public BoardVO(int bno) {
        this.bno = bno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }
}
