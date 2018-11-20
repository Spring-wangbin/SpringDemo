package SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTask {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("task.xml");


    }
}
