import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorsOrderPage {
    private final WebDriver webDriver;

    //УРЛ "Заказ Самоката"
    public static final String URL_ORDER_CLIENTPAGE = "https://qa-scooter.praktikum-services.ru/order";
    //Поле "Имя" в форме заказа самоката
    private By nameFieldorderForm = By.xpath(".//input[contains (@placeholder,'Имя')] ");
    //Поле "Фамилия" в форме заказа самоката
    private By surnameFieldorderForm = By.xpath(".//input[contains (@placeholder,'Фамилия')]");
    //Поле "Адрес" в форме заказа самоката
    private By addressFieldorderForm = By.xpath(".//input[contains (@placeholder,'Адрес')]");
    //Поле "Метро" в форме заказа самоката
    private By metroFieldorderForm = By.xpath(".//input[contains (@placeholder,'метро')]");
    //Станция Метро в форме заказа самоката
    private By metrostationorderForm = By.xpath(".//div[text()='Черкизовская']");
    //Поле "Телефон" в форме заказа самоката
    private By phoneFieldorderForm = By.xpath(".//input[contains (@placeholder,'Телефон')]");
    //Кнопка "Далее" в форме заказа самоката
    private By buttonNextorderForm = By.xpath(".//button[contains (text(), 'Далее')]");
    //Название страницы заказа
    private By titleOrderScooterPageForm = By.cssSelector("div .Order_Header__BZXOb");
    //Поле "Календарь" привоза самоката
    private By calendarfieldorderForm = By.cssSelector(".react-datepicker__input-container");
    //Дата поля "Календарь" привоза самоката
    private By calendardataselectdorderForm = By.xpath(".//div[contains (@aria-label, '1-е ноября 2023')]");
    //Поле "Срок аренды"
    private By rentperiodfield = By.cssSelector(".Dropdown-root");
    //Выбор срока в поле "Срок аренды"
    private By rentperioselectdropwdownfield = By.xpath(".//div[@class='Dropdown-option'][1]");
        //Чекбокс "Цвет самоката" - 1
    private By checkboxColor1 = By.cssSelector("#black");
    //Чекбокс "Цвет самоката" - 2
    private By checkboxColor2 = By.cssSelector("#grey");
    //Поле "Комментарий"
    private By CommentFieldorderForm = By.xpath(".//input[contains (@placeholder,'Комментарий')]");
    //Кнопка "Заказать" в форме заказа самоката
    private By buttonOrderorderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Заказать')]");
    //Кнопка "Да" в форме заказа самоката
    private By buttonYesorderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Да')]");
        public SelectorsOrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By getnameFieldorderForm() {
        return nameFieldorderForm;
    }

    public By getsurnameFieldorderForm() {
        return surnameFieldorderForm;
    }

    public By getaddressFieldorderForm() {
        return addressFieldorderForm;
    }

    public By getmetroFieldorderForm() {
        return metroFieldorderForm;
    }

    public By getmetrostationorderForm() {
        return metrostationorderForm;
    }

    public By getphoneFieldorderForm() {
        return phoneFieldorderForm;
    }

    public By getbuttonNextorderForm() {
        return buttonNextorderForm;
    }

    public By getcalendarfieldorderForm() {
        return calendarfieldorderForm;
    }

    public By getcalendardataselectdorderForm() {
        return calendardataselectdorderForm;
    }

    public By gettitleOrderScooterPageForm() {
        return titleOrderScooterPageForm;
    }

    public By getrentperiodfield() {
        return rentperiodfield;
    }

    public By getrentperioselectdropwdownfield() {
        return rentperioselectdropwdownfield;
    }

    public By getcheckboxColor1() {
        return checkboxColor1;
    }

    public By getCheckboxColor2() {
        return checkboxColor2;
    }

    public By getCommentFieldorderForm() {
        return CommentFieldorderForm;
    }

    public By getbuttonOrderorderForm() {
        return buttonOrderorderForm;
    }
    public By getbuttonYesorderForm() {
        return buttonYesorderForm;
    }

    public void clickaccordingItemButton(String accordingItemButton) {
        WebElement element = webDriver.findElement(By.xpath(accordingItemButton));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(By.xpath(accordingItemButton)).click();
    }

    public By setdataCalendarfield(String data) {
        return By.xpath(".//div[contains (@aria-label, '" + data + "')]");
    }

    public By setrentperioselectdropwdownfield(int number) {
        return By.xpath(".//div[@class='Dropdown-option']["+number+"]");
    }

}
