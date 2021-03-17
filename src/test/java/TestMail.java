import org.junit.Test;
import ru.mail.AuthorizationPage;
import ru.mail.MailPage;

public class TestMail extends TestBase {

    @Test
    public void correctSend() {
        authorizationPage = new AuthorizationPage(driver);
        authorizationPage.logIn(LOGIN,PASSWORD);
        mailPage = new MailPage(driver);
        mailPage.sendMessage(RECIPIENT, MESSAGE);
    }
}
