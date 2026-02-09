package netology.homework.logers;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int logIndex = 1;

    @Override
    public void log(String msg) {
        String logLevel = (msg.toLowerCase().contains("error")) ? "ERROR" : "INFO";
        System.out.println(logLevel+"#" + (logIndex++) + "[" + LocalDateTime.now() + "] " + msg);
    }
}
