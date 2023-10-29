import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorsMainPage {

    private final WebDriver webDriver;

    //УРЛ "Самокат"
    public static final String URL_MAIN_PAGE = "https://qa-scooter.praktikum-services.ru/";

    //Кнопки выпадающего списка в разделе «Вопросы о важном»
    private By accordingItemButton1 = By.xpath(".//div[@class='accordion__item'][1]/div/div[@role='button']");
    public By getAccordingItemButton1() { return accordingItemButton1; }
    private By accordingItemButton2 = By.xpath(".//div[@class='accordion__item'][2]/div/div[@role='button']");
    public By getAccordingItemButton2() {
        return accordingItemButton2;
    }
    private By accordingItemButton3 = By.xpath(".//div[@class='accordion__item'][3]/div/div[@role='button']");
    public By getAccordingItemButton3() {
        return accordingItemButton3;
    }
    private By accordingItemButton4 = By.xpath(".//div[@class='accordion__item'][4]/div/div[@role='button']");
    public By getAccordingItemButton4() {
        return accordingItemButton4;
    }
    private By accordingItemButton5 = By.xpath(".//div[@class='accordion__item'][5]/div/div[@role='button']");
    public By getAccordingItemButton5() {
        return accordingItemButton5;
    }
    private By accordingItemButton6 = By.xpath(".//div[@class='accordion__item'][6]/div/div[@role='button']");
    public By getAccordingItemButton6() {
        return accordingItemButton6;
    }
    private By accordingItemButton7 = By.xpath(".//div[@class='accordion__item'][7]/div/div[@role='button']");
    public By getAccordingItemButton7() {
        return accordingItemButton7;
    }
    private By accordingItemButton8 = By.xpath(".//div[@class='accordion__item'][8]/div/div[@role='button']");
    public By getAccordingItemButton8() {
        return accordingItemButton8;
    }
    //Текст выпадающего списка в разделе «Вопросы о важном»
    private By accordingItemButton1Text = By.cssSelector("#accordion__panel-0 p");
    public By getaccordingItemButton1Text() { return accordingItemButton1Text; }
    private By accordingItemButton2Text = By.cssSelector("#accordion__panel-1 p");
    public By getaccordingItemButton2Text() { return accordingItemButton2Text; }
    private By accordingItemButton3Text = By.cssSelector("#accordion__panel-2 p");
    public By getaccordingItemButton3Text() { return accordingItemButton3Text; }
    private By accordingItemButton4Text = By.cssSelector("#accordion__panel-3 p");
    public By getaccordingItemButton4Text() { return accordingItemButton4Text; }
    private By accordingItemButton5Text = By.cssSelector("#accordion__panel-4 p");
    public By getaccordingItemButton5Text() { return accordingItemButton5Text; }
    private By accordingItemButton6Text = By.cssSelector("#accordion__panel-5 p");
    public By getaccordingItemButton6Text() { return accordingItemButton6Text; }
    private By accordingItemButton7Text = By.cssSelector("#accordion__panel-6 p");
    public By getaccordingItemButton7Text() { return accordingItemButton7Text; }
    private By accordingItemButton8Text = By.cssSelector("#accordion__panel-7 p");
    public By getaccordingItemButton8Text() { return accordingItemButton8Text; }

    public SelectorsMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickaccordingItemButton(String accordingItemButton) {
        WebElement element = webDriver.findElement(By.xpath(accordingItemButton));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(By.xpath(accordingItemButton)).click();
    }

    //Кнопка "Заказать" в шапке сайта
    private By orderButtonHeader = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    public By getorderButtonHeader() {
        return orderButtonHeader;
    }
    //Кнопка "Заказать" в центре сайта
    private By orderButtonFinish = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");
    public By orderButtonFinish() {
        return orderButtonFinish;
    }
    //Кнопка "Самокат"
    private By linkbuttonmainpageScooter = By.xpath(".//a[contains (@class, 'LogoScooter')]");
    public By linkbuttonmainpageScooter() {
        return linkbuttonmainpageScooter;
    }
    //Кнопка "Яндекс"
    private By linkbuttonmainpageYandex = By.xpath(".//a[contains (@class, 'LogoYandex')]");
    public By linkbuttonmainpageYandex() {
        return linkbuttonmainpageYandex;
    }
    //УРЛ "Яндекс"
    public static final String URL_YANDEX_MAIN_PAGE = "https://dzen.ru/";


}
