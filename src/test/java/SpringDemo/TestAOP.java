package SpringDemo;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP{

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");

        UserService userService = (UserService) ac.getBean("userService");

        User user = new User(1,"wangbin","123456");

        userService.addUser(user);
        userService.deleteUser(user);
    }


}
