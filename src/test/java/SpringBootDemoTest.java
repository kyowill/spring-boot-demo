import com.app.App;
import com.app.biz.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SpringBootDemoTest {

    @Autowired
    Student student;

    @Test
    public void Test(){
        System.out.println(student);
    }
}
