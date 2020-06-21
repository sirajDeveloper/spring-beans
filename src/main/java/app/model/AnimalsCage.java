package app.model;

import com.sun.xml.internal.bind.XmlAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    private Timer timer;

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public Timer getTimer() {
        return timer;
    }



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
}
