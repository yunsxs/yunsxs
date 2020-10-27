import com.dao.UserMapper;
import com.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.selectUserByName("admin");
        System.out.println(user.toString());
    }
}