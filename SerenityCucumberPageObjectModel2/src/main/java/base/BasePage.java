package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

	/************ Common Functionality **********************************/
	public WebElementFacade getElement(String locator) {

		try {

			return find(By.xpath(locator));
		} catch (Exception e) {
			e.getMessage();
		}

		return null;
	}

	public By getBy(String locator) {
		By by = null;

		try {
			if (locator.startsWith("id=")) {
				locator = locator.substring(3);
				by = By.id(locator);
			} else if (locator.startsWith("xpath=")) {
				locator = locator.substring(3);
				by = By.xpath(locator);
			}

			else if (locator.startsWith("css=")) {
				locator = locator.substring(3);
				by = By.cssSelector(locator);
			}

			return by;
		} catch (Throwable e) {
			e.getMessage();
		}
		return by;
	}

	public void click(String locator) {
		waitFor(getElement(locator)).click();

	}

	public void type(String locator, String value) {
		waitFor(getElement(locator)).sendKeys(value);
	}

	public void getText(String locator) {
		waitFor(getElement(locator)).getText();
	}

	public void moveMouseTo(String locator) {
		WebElement moveTo=waitFor(getElement(locator));
		withAction().moveToElement(moveTo).perform();
		
	}
	/************ Business Specific Functionality ***********************/

}
