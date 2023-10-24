### 공부할 목록
1. BoardVO 클래스에서 BoardVO메소드를 선언할 때 
    매개변수 개수별로 여러개 선언하던데 맞는건지? (어떤 개념인건지)
2. interface 개념
3. Mapper.xml에서 Mybatis 속성 값 (resultType, parameterType 등등)
4. Mybatis 클래스인지 뭔지, DBUtil 클래스 해석
   1. public void updateBoard(int bno, String btitle, String bcontent, String bwriter){
      SqlSession session = sqlSessionFactory.openSession();
      BoardMapper mapper = session.getMapper(BoardMapper.class);
      BoardVO boardVO = new BoardVO(bno, btitle, bcontent, bwriter);
      mapper.updateBoard(boardVO);

   session.commit();
   }
5. 제네릭 개념, 매개변수 개념

### 개인 피드백
1. 게시글 목록 출력할 때, 자릿수 맞춤
   1. date 값 입력하지 않았을 때 YYYY-MM-DD 형식으로 만들고 싶음
   2. "no", "writer", "date", "title" 순으로 출력하는데, 입력한 writer의 크기에 따라 자릿수 맞춤이 달라짐...