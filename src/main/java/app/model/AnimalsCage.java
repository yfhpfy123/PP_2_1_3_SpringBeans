package app.model;


import app.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier ("dog")
    private Animal animal;
    @Autowired
    @Qualifier("getTimer")
    private Timer timer;


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
