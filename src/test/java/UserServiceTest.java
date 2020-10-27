import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean("UserService", UserService.class);
        User user = userService.getUserByNameAndPwd("admin", "admin");
        System.out.println(user.toString());
    }
}