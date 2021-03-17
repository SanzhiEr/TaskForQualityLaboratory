import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.mail.AuthorizationPage;
import ru.mail.MailPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected static final String LOGIN = "laboratoriya.kachestva.94@mail.ru";
    protected static final String PASSWORD = "QualityLab12345";
    protected static final String RECIPIENT = "giss.ivanov.01@mail.ru";
    protected static final String MESSAGE = "Hello world!";

    protected WebDriver driver;
    protected AuthorizationPage authorizationPage;
    protected MailPage mailPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
