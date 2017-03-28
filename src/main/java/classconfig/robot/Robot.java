package classconfig.robot;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
public class Robot {

    private Head head;
    private Leg leg;

    public Robot(Head head, Leg leg) {
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
