package netology.homework.logers;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int logIndex = 1;

    @Override
    public void log(String msg) {
        System.out.println("INFO#" + (logIndex++) + "[" + LocalDateTime.now() + "] " + msg);
    }
}
