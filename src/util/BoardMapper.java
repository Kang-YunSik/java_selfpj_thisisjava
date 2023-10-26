package util;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardMapper {
    public ArrayList<BoardVO> getBoard();
    public void insertBoard(BoardVO boardVO);
    public ArrayList<BoardVO> readBoard(int bno);
    public void deleteBoard(int bno);
    public void updateBoard(BoardVO boardVO);
    public void clearBoard();
}
