import com.dao.*;
import com.entity.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.List;
import java.util.UUID;

public class DaoTest {
    @Test
    public void testSelectUserByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.selectUserByName("admin");
        System.out.println(user.toString());
    }

    @Test
    public void testGetAllNews() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsMapper newsMapper = context.getBean(NewsMapper.class);
        List<News> newsList = newsMapper.getAllNews();
        for (News news : newsList) {
            System.out.println(news.toString());
        }
    }

    @Test
    public void testGetAllNewsType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsTypeMapper newsTypeMapper = context.getBean(NewsTypeMapper.class);
        List<NewsType> newsTypeList = newsTypeMapper.getAllNewsType();
        for (NewsType newsType : newsTypeList) {
            System.out.println(newsType.toString());
        }
    }

    @Test
    public void testUpdateUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = new User();
        user.setUserrname("wan");
        user.setPhonenumber("11111111111");
        user.setUserid(13);
        int flag = userMapper.updateUser(user);
        System.out.println(flag);
    }

    @Test
    public void testGetUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.selectUserById(1);
        System.out.println(user.toString());
    }

    @Test
    public void testInsertUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = new User();
        user.setUsername("test");
        user.setPhonenumber("111");
        user.setPassword("test");
        userMapper.insertUser(user);
        System.out.println(user.getUserid());
    }

    @Test
    public void testGetAllBlog() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BlogMapper blogMapper = context.getBean(BlogMapper.class);
        List<Blog> blogList = blogMapper.getAllBlog();
        for (Blog blog : blogList) {
            System.out.println(blog.toString());
        }
    }

    @Test
    public void test() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        System.out.println(uuid);
    }

    @Test
    public void testInsertBlog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BlogMapper blogMapper = context.getBean(BlogMapper.class);
        Blog blog = new Blog();
        blog.setUserid(1);
        blog.setContent("wanlinhuishishazi");
        blog.setTime("2020/10/12");
        int flag = blogMapper.insertBlog(blog);
        System.out.println(flag);
    }

    @Test
    public void testGetActionByUserId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ActionMapper actionMapper = context.getBean(ActionMapper.class);
        List<Action> actionList = actionMapper.getActionByUserId(1);
        for (Action action : actionList) {
            System.out.println(action.toString());
        }
    }

    @Test
    public void testInsertAction(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ActionMapper actionMapper = context.getBean(ActionMapper.class);
        Action action = new Action();
        action.setRule_id(2);
        action.setUserid(1);
        int flag = actionMapper.insertAction(action);
        System.out.println(flag);
    }

    @Test
    public void testUpdateScore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        int flag = userMapper.updateUserScore(1, 3);
        System.out.println(flag);
    }
}