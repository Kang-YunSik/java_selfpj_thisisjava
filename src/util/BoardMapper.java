package util;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

// [@Mapper의 개념]
// 1. @Mapper는 인터페이스에서 사용되며, MyBatis를 통해 데이터베이스(java_selfpj_thisisjava)와
//    상호 작용하는 메서드(getBoard(), insertBoard() 등)를 가지고 있는 인터페이스를 MyBatis의 매퍼 인터페이스로 지정하는 역할
// 2. MyBatis는 이 인터페이스를 기반으로 SQL 쿼리를 실행하고 데이터베이스와의 상호 작용을 단순화합니다.

// [현 프로젝트에서의 실행 로직]
// 1. 자바 메소드를 정의할 때 BoardMapper에서 객체를 하나 생성하고,
// 2. 객체가 SQL문이 필요한 메소드(getBoard(), insertBoard() 등)를 호출
// [실제 코드]
// 	1. BoardMapper mapper = session.getMapper(BoardMapper.class);
//	2. ArrayList<BoardVO> boardVOList = mapper.readBoard(bno);
@Mapper
public interface BoardMapper {
    public ArrayList<BoardVO> getBoard();
    public void insertBoard(BoardVO boardVO);
    public ArrayList<BoardVO> readBoard(int bno);
    public void deleteBoard(int bno);
    public void updateBoard(BoardVO boardVO);
    public void clearBoard();
}
