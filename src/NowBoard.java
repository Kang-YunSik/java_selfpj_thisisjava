import java.util.ArrayList;

public class NowBoard {
    public void printNowBoard(ArrayList<BoardVO> boardVOList) {

        for(int i = 0; i < boardVOList.size(); i++) {
            System.out.printf("%-6s%-12s%-40s%-40s\n",
                    boardVOList.get(i).getBno(),
                    boardVOList.get(i).getBwriter(),
                    boardVOList.get(i).getBdate(),
                    boardVOList.get(i).getBtitle());
        }
    }
}
