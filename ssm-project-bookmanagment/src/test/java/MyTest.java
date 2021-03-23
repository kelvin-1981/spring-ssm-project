import com.yykj.ssm.bean.Books;
import com.yykj.ssm.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBookService service = context.getBean("bookService", IBookService.class);
        List<Books> books = service.queryAllBook();
        System.out.println(books.toString());
    }
}
