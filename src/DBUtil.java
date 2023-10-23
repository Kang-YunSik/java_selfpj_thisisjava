import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

// DB연동 설정파일 (jdbc: mariadb / framework: Mybatis)
public class DBUtil {

	// jdbc 사용자 정보 입력
	String url = "jdbc:mariadb://127.0.0.1:3306/addr_prj"; // addr_prj: 데이터가 저장될 스키마
	String user = "root"; // 아이디
	String pass = "12345"; // 비밀번호
	SqlSessionFactory sqlSessionFactory; // mybatis SqlSessionFactory 필드 생성


	public void init(){
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);

			// SqlSessionFactory 빌드하기
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace(); // printStackTrace() : 예외가 발생하면 예외 족적(발자취)을 남긴다.
		}
	}
}
