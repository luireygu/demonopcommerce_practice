package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class DriverController {

    private static final ThreadLocal <WebDriver> driver =new ThreadLocal<>();
    private static final ThreadLocal <WebDriverWait> wait = new ThreadLocal<>();

    private static final int TIMEOUT = 40;
    private static final int PAGE_TIMEOUT = 30;

    private DriverController(){}

    public static void initDriver(){
        if (driver.get() == null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options =new ChromeOptions();
            options.addArguments("--disable-notifications");

            boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("excludeSwitches", List.of("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments(
                    "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120 Safari/537.36"
            );
            if (isHeadless) {
                options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
            } else {
                options.addArguments("--start-maximized");
            }
            WebDriver webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
            webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
            driver.set(webDriver);
            wait.set(new WebDriverWait(webDriver, Duration.ofSeconds(TIMEOUT)));

            System.out.println("Driver iniciado");
        }
    }
    public static WebDriver getDriver(){
        return driver.get();
    }
    public static WebDriverWait getWait(){
        return wait.get();
    }
    public static void quitDriver(){
        if (driver.get() !=null){
                driver.get().quit();
                driver.remove();
                wait.remove();
                System.out.println("Driver cerrado correctamente");
        }
    }
}
