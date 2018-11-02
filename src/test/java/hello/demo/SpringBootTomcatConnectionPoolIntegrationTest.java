package hello.demo;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTomcatConnectionPoolIntegrationTest {
  
  @Autowired
  private DataSource dataSource;
  
  @Test
  public void givenTomcatConnectionPoolInstance_whenCheckedPoolClassName_thenCorrect() {
    AssertionsForClassTypes.assertThat(dataSource.getClass().getName())
        .isEqualTo("org.apache.tomcat.jdbc.pool.DataSource");
  }
}
