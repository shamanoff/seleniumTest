import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
//                "D:\\java projects\\03 10 17\\seleniumTest\\src\\drivers\\geckodriver.exe");
                "C:\\Users\\michaelb\\projects\\java_projects\\seleniumTest\\src\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        will wait for elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 900));

     /*   driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Log"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement link3 = driver.findElement(By.xpath("//*[@id=\"mp-topbanner\"]/ul/li[3]/a"));
        driver.quit();*/

/*        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div/div[2]/div/form/button"));
        if (button.getText().equals("Sign up for GitHub")){
            System.out.println("Success!!!!");
        }else System.out.println("Fail");
        button.submit();*/

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchInput']"))
                .sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='ooui-1']")).getAttribute("value"));
        driver.findElement(By.xpath("//*[@id='ooui-1']")).clear();

        driver.quit();

    }
}
