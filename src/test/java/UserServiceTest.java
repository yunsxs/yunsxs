import com.dao.UserMapper;
import com.entity.News;
import com.entity.User;
import com.service.NewsService;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean("UserService", UserService.class);
        User user = userService.getUserByNameAndPwd("admin", "admin");
        System.out.println(user.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsService newsService = context.getBean("NewsService", NewsService.class);
        List<News> newsList = newsService.getAllNews();
        for(News news : newsList){
            System.out.println(news.toString());
        }
    }
}