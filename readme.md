## 🙋‍♂️ 프로젝트 설명 
### 1. 프로젝트 소개
* 게시판의 CRUD 기능 구현

### 2. 프로젝트 목표
* [이것이 자바다] 교재의 게시판 CRUD 기능을 똑같이 구현
* Java에 JDBC(Mariadb, MyBatis) 연동

### 3. 디렉토리 구조
| 파일명 | 파일 설명| 
| --- | --- | 
| [BoardMain](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/BoardMain.java) |  실행 파일   |
| [DBUtil](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/DBUtil.java) | 기능(메소드)을 정의한 파일 |
| [BoardVO](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/BoardVO.java) | 필드와 Getter, Setter 메소드 선언한 파일 |
| [BoardMapper](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/BoardMapper.java) | 기능의 SQL문을 정의한 파일 |
| [BoardMapper.xml](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/BoardMapper.xml) | ??? |
| [mybatis-config.xml](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/src/util/mybatis-config.xml) | Mybatis 설정 파일 |
| [create_boards_table.sql](https://github.com/Kang-YunSik/java_selfpj_thisisjava/blob/main/sql/creat_boards_table.sql) | DB table 생성 SQL문 |

### 4. 사용 기술
<img src="https://img.shields.io/badge/IntelliJ IDEA-2F8CBB?style=flat-square&logo=IntelliJ IDEA&logoColor=white"></a>

<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"></a>
<img src="https://img.shields.io/badge/MariaDB-1F305F?style=flat-square&logo=MariaDB&logoColor=white"></a>
<img src="https://img.shields.io/badge/Mybatis-FFFC00?style=flat-square&logo=Mybatis&logoColor=white"/></a>

## 🚗 프로젝트 결과물
![java_selfpj_thisisjava](https://github.com/Kang-YunSik/java_selfpj_thisisjava/assets/145963623/65f6a13a-a51b-4bea-b37f-329b93c2f529) 


## 🛠 개인 피드백
* 제네릭 개념, List 개념
* BoardVO 클래스에서 BoardVO메소드를 선언할 때
   매개변수 개수별로 여러개 선언하던데 맞는건지? (어떤 개념인건지)
* interface 개념과 제네릭으로 정의한 것과 클래스로 정의한 것의 차이점
* <s>Mapper.xml에서 Mybatis 속성 값 (resultType, parameterType 등등)</s>
  * [@MyBatis의 Mapper.xml에 작성되는 요소와 속성](https://github.com/Kang-YunSik/java_selfpj_thisisjava/commit/5b900491007eb507a6ff5839755a1c0d087aa3cc)   
* <s>Mybatis 클래스(getMapper, mapper 등)인지 뭔지, DBUtil 클래스 해석</s>
  * [@Mapper의 개념](https://github.com/Kang-YunSik/java_selfpj_thisisjava/commit/c10450ae871770318d5d47ad2ef0e50b466e73a3)   
  * [getMapper 메소드의 개념](https://github.com/Kang-YunSik/java_selfpj_thisisjava/commit/5aec5f0c39eb39c29a3cfab6fc78f301864377f9)   
