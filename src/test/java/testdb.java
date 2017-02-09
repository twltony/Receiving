import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Tonny on 2017-2-7.
 */
public class testdb {

    private ApplicationContext ctx =null;
    {
        ctx =  new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void test() throws SQLException{
        DataSource dataSource= ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}
