package classconfig;

import classconfig.robot.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Robot robot = context.getBean(Robot.class);


        robot.speak();
        robot.move();
    }

}
