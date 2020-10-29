import com.dao.BlogMapper;
import com.dao.UserMapper;
import com.entity.Blog;
import com.entity.News;
import com.entity.NewsType;
import com.entity.User;
import com.service.BlogService;
import com.service.NewsService;
import com.service.NewsTypeService;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
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

    @Test
    public void testGetAllNews() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        NewsTypeService newsTypeService = context.getBean("NewsTypeService", NewsTypeService.class);
        List<NewsType> newsTypeList = newsTypeService.getAllNewsType();
        for(NewsType newsType : newsTypeList){
            System.out.println(newsType.toString());
        }
    }

    @Test
    public void testGetAllBlog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BlogService blogService = context.getBean("BlogService", BlogService.class);
        List<Blog> blogList = blogService.getAllBlog();
        for(Blog blog : blogList){
            System.out.println(blog.toString());
        }
    }
}