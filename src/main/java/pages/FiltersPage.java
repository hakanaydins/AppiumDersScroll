package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FiltersPage {

    ElementHelper elementHelper;

    By tabs = By.id(" ");
    By filters = By.id(" ");
    By buttons = By.id(" ");
    By showResult = By.id(" ");
    By maxPrice = By.id(" ");

    public FiltersPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }

    public void clickFilter(String filter) {
        elementHelper.clickElementWithText(filters, filter);

    }

    public void clickOkayButton(String okay) {

        elementHelper.clickElementWithText(buttons, okay);
    }


    public void clickShowResults() {
        elementHelper.click(showResult);

    }

    public void sendKeysMaxPrice(String price) {
        elementHelper.sendKeys(maxPrice, price);

    }


}
