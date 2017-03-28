package xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlconfig.robot.Robot;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Robot robot = context.getBean(Robot.class);


        robot.speak();
        robot.move();
    }

}
