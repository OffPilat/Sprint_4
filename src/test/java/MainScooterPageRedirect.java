import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertEquals;

public class MainScooterPageRedirect {
    private WebDriver webDriver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void clickingHeaderClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(webDriver);
        Steps steps = new Steps(webDriver);
        steps
                .open(selectorsMainPage.URL_MAIN_PAGE)
                .click(selectorsMainPage.getorderButtonHeader());
        assertEquals("Для кого самокат", webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());

    }

    @Test
    public void clickingCenterClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(webDriver);
        Steps steps = new Steps(webDriver);
        steps
                .open(selectorsMainPage.URL_MAIN_PAGE)
                .find(selectorsMainPage.orderButtonFinish())
                .click(selectorsMainPage.orderButtonFinish());
        assertEquals("Для кого самокат", webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());

    }

    @Test
    public void clickingScooterLogo() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(webDriver);
        Steps steps = new Steps(webDriver);
        steps
                .open(selectorsMainPage.URL_MAIN_PAGE)
                .click(selectorsMainPage.linkbuttonmainpageScooter());
        assertEquals("УЧЕБНЫЙ ТРЕНАЖЕР", webDriver.findElement(By.cssSelector("div .Header_Disclaimer__3VEni")).getText());
    }

    @Test
    public void clickingYandexLogo() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(webDriver);
        Steps steps = new Steps(webDriver);
        steps.open(selectorsMainPage.URL_MAIN_PAGE)
                .click(selectorsMainPage.linkbuttonmainpageYandex());
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div .dzen-search-arrow-common__placeholder")));
        //Помогите локализовать ошибку в этом тесте - догадываюсь что поиск элемента происходит на странице Самоката, поэтому элемента "Поиск Яндекса" не находит
        assertEquals("Поиск Яндекса", element.getText());
    }

    @After
    public void teardown() {
        // Close the browser
        webDriver.quit();
    }

}
