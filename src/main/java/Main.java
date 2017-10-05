import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    static WebDriver driver;

    static WebDriverWait wait = (new WebDriverWait( driver, 5));

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
               "D:\\java projects\\03 10 17\\seleniumTest\\src\\drivers\\geckodriver.exe");
//                 "C:\\Users\\michaelb\\projects\\java_projects\\seleniumTest\\src\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        will wait for elements
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 900));

//        явное ожиднание
        driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.com%2F%3Fgfe_rd%3Dcr%26dcr%3D0%26ei%3DQijWWae-OY2CaNynv6gH%26gws_rd%3Dcr%26fg%3D1&hl=en");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(), 'Create your Google Account')]")));



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

  /*      driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchInput']"))
                .sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='ooui-1']")).getAttribute("value"));
        driver.findElement(By.xpath("//*[@id='ooui-1']")).clear();*/

/*        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]"));

        Table table = new Table(tableElement, driver);
        System.out.println("Rows number " + table.getRows().size());
        System.out.println(table.getValueFromCell(2, 3));
        System.out.println(table.getValueFromCell(4, "Company"));*/


//        driver.quit();

    }
    public static void selectOption(String listName, String option){
        String listXpath = String.format("(//strong[text()='%s']/following-siblings::div/div[@role='listbox'])[1]", listName);
        String optionXpath = String.format("//div[text()='%s']/parent::div[@role='option']", option);
        driver.findElement(By.xpath(listXpath)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionXpath)));
        driver.findElement(By.xpath(optionXpath)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(optionXpath)));

    }
}
