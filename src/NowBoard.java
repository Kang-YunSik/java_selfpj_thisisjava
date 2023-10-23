import java.util.ArrayList;

public class NowBoard {
    public void printNowBoard(ArrayList<BoardVO> boardVOList) {

        for(int i = 0; i < boardVOList.size(); i++) {
            System.out.println("번호 : " + boardVOList.get(i).getBno());
            System.out.println("이름 : " + boardVOList.get(i).getBwriter());
            System.out.println("번호 : " + boardVOList.get(i).getBdate());
            System.out.println("제목 : " + boardVOList.get(i).getBtitle());
        }
    }
}
