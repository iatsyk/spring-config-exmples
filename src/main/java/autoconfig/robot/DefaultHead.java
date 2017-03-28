package autoconfig.robot;


import org.springframework.stereotype.Component;

/**
 * @author Vova Iatsyk
 *         Date: 3/28/17.
 */
@Component
public class DefaultHead implements Head {

    public void speak() {
        System.out.println("Default hi");
    }

}
