package autoconfig.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
@Component
public class Robot {

    private Head head;
    private Leg leg;

    @Autowired
    public Robot(@Qualifier("russianHead") Head head, Leg leg) {
        this.head = head;
        this.leg = leg;
    }

    public void speak() {
        head.speak();
    }

    public void move() {
        leg.move();
    }

}
