package spring_maria;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class Test {
	final String DRIVER = "org.mariadb.jdbc.Driver";
	final String URL = "jdbc:mariadb://127.0.0.1:3306/testboard";
	final String USER = "boardMaster";
	final String PASSWORD = "1234";
	
	@org.junit.Test
	public void mariaTest() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(con);
			System.out.println("yes! connection");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
