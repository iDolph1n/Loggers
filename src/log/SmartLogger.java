package log;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int count;

    @Override
    public void log(String msg) {
        count++;
        String info = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.printf("%s#%d %s %s\n", info, count, LocalDateTime.now(), msg);
    }
}
