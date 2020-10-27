import com.dao.NewsMapper;
import com.dao.NewsTypeMapper;
import com.dao.UserMapper;
import com.entity.News;
import com.entity.NewsType;
import com.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.selectUserByName("admin");
        System.out.println(user.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsMapper newsMapper = context.getBean(NewsMapper.class);
        List<News> newsList = newsMapper.getAllNews();
        for(News news : newsList){
            System.out.println(news.toString());
        }
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsTypeMapper newsTypeMapper = context.getBean(NewsTypeMapper.class);
        List<NewsType> newsTypeList = newsTypeMapper.getAllNewsType();
        for(NewsType newsType : newsTypeList){
            System.out.println(newsType.toString());
        }
    }
}