package log;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        logger.log("Пошел в магазин");
        Thread.sleep(2000);
        logger.log("Купил хлеб");
        Thread.sleep(2000);
        smartLogger.log("Пошел домой");
        Thread.sleep(2000);
        smartLogger.log("Дома");
        Thread.sleep(2000);
        smartLogger.log("Пошел спать, Error");
    }
}
