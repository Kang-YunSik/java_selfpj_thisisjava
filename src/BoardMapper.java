import java.util.ArrayList;

public interface BoardMapper {
    public ArrayList<BoardVO> getBoard();
    public void insertBoard(BoardVO boardVO);
    public ArrayList<BoardVO> readBoard(int bno);

}
