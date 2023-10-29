import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;

public class Steps {

    private WebDriver webDriver;

    public Steps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Steps open(String Url) {
        webDriver.get(Url);
        return this;
    }

    public Steps find(By element) {
        WebElement new_element = webDriver.findElement(element);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    public Steps click(By element) {
        webDriver.findElement(element).click();
        return this;
    }

    public Steps inputText(By element, String text) {
        webDriver.findElement(element).sendKeys(text);
        return this;
    }


}
