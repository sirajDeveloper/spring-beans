package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
