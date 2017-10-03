import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\michaelb\\projects\\java_projects\\seleniumTest\\src\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        will wait for elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 900));

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.linkText("Log in"));

        driver.quit();


    }
}
