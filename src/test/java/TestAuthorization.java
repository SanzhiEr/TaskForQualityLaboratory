import org.junit.Test;
import ru.mail.AuthorizationPage;

public class TestAuthorization extends TestBase{

    @Test
    public void checkCorrectAuthorization() {
        authorizationPage = new AuthorizationPage(driver);
        authorizationPage.logIn(LOGIN, PASSWORD);
        authorizationPage.checkCorrectPage();
    }

}
