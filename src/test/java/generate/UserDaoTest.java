package generate;

import com.example.springboot_hello.SpringbootHelloApplication;
import com.example.springboot_hello.generate.User;
import com.example.springboot_hello.generate.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootHelloApplication.class)
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    void insert() {
        User user = new User();
        user.setName("ui");
        try {
            int result = userDao.insert(user);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("");
        }

    }
}