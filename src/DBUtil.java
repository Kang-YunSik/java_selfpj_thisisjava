import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;

// DB연동 설정파일 (jdbc: mariadb / framework: Mybatis)
public class DBUtil {

	// jdbc 사용자 정보 입력
	String url = "jdbc:mariadb://127.0.0.1:3306/addr_prj"; // addr_prj: 데이터가 저장될 스키마
	String user = "root"; // 아이디
	String pass = "12345"; // 비밀번호
	SqlSessionFactory sqlSessionFactory; // mybatis SqlSessionFactory 필드 생성

	// init 메서드 정의
	// SqlSessionFactory 빌드가 잘 되었는지 확인(마이바티스 연동이 잘 되었는지)
	//
	public void init() {
		try {
			// SqlSessionFactory 빌드하기
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace();
		}
	}

	public ArrayList<Addr> getAddresses() {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		ArrayList<Addr> addrList = mapper.getAddresses();

		return addrList;
	}

	public void insertAddress(String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(name, address, phone);
		mapper.insertAddress(addr);

		session.commit(); // update, delete, insert
	}

	public void updateAddress(int id, String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(id, name, address, phone);
		mapper.updateAddress(addr);

		session.commit(); // update, delete, insert
	}

	public void deleteAddress(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.deleteAddress(id);

		session.commit(); // update, delete, insert
	}
	
}
