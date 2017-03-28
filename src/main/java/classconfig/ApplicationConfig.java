package classconfig;

import classconfig.robot.Head;
import classconfig.robot.Leg;
import classconfig.robot.Robot;
import classconfig.robot.RussianHead;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public Leg leg() {
        return new Leg();
    }

    @Bean
    public Head head() {
        return new RussianHead();
    }

    @Bean
    public Robot robot() {
        return new Robot(head(), leg());
    }

}
