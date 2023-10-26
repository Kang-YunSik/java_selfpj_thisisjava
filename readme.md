## 프로젝트 설명
1. [이것이 자바다] 교재의 프로젝트의 CRUD 기능을 똑같이 구현할 것
2. JDBC는 mariadb, Framework는 Mybatis를 사용할 것

## 파일 구성
1. BoardMain: 프로젝트 실행 파일
2. DBUtil: 프로젝트에 사용되는 기능(메소드)을 정의한 파일
3. BoardVO: 프로젝트에 사용되는 필드와 Getter, Setter 함수 선언 파일
4. BoardMapper: 인터페이스 파일 ???
5. BoardMapper.xml: 기능의 SQL문을 정의
6. mybatis-config.xml: Mybatis 설정 파일
7. create_boards_table: 프로젝트에 사용되는 table 생성 SQL문


## 개인 피드백
1. BoardVO 클래스에서 BoardVO메소드를 선언할 때
   매개변수 개수별로 여러개 선언하던데 맞는건지? (어떤 개념인건지)


2. interface 개념
   1. 제네릭으로 정의한건 뭐고, 클래스로 정의한건 뭐고 차이점을 구분


3. Mapper.xml에서 Mybatis 속성 값 (resultType, parameterType 등등)


4. Mybatis 클래스(getMapper, mapper 등)인지 뭔지, DBUtil 클래스 해석

   public void updateBoard(int bno, String btitle, String bcontent, String bwriter){
   SqlSession session = sqlSessionFactory.openSession();
   BoardMapper mapper = session.getMapper(BoardMapper.class);
   BoardVO boardVO = new BoardVO(bno, btitle, bcontent, bwriter);
   mapper.updateBoard(boardVO);
   
   session.commit();
   }


5. 제네릭 개념, List 개념