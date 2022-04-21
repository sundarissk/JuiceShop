package js_action_util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action_km_util {

	public static void click(WebDriver driver, By Locator) {

		driver.findElement(Locator).click();

	}

	public static void sendkeys(WebDriver driver, By Locator, String value) {

		driver.findElement(Locator).sendKeys(value);
	}

	public static void clicksendkeys(WebDriver driver, By Locator, String value) {

		driver.findElement(Locator).click();
		driver.findElement(Locator).sendKeys(value);

	}

	public static void clear(WebDriver driver, By Locator) {

		driver.findElement(Locator).clear();
	}

	public static void findelements(WebDriver driver, By Locator, int value) {
		driver.findElements(Locator).get(value).click();
	}

	public static void mouseover(WebDriver driver, By Locator) {
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(Locator);
		actions.moveToElement(target).perform();

	}

	public static void mouseoverlist(WebDriver driver, By Locator) {

		List<WebElement> allStars = driver.findElements(Locator);

		for (WebElement e : allStars) {
			Actions act = new Actions(driver);
			act.moveToElement(e).build().perform();

		}
	}

	public static void mouseoverclick(WebDriver driver, By Locator) throws InterruptedException {

		// Thread.sleep(1000);
		List<WebElement> allStars = driver.findElements(Locator);

		for (WebElement e : allStars) {
			Actions act = new Actions(driver);
			act.moveToElement(e).click().perform();
			// Thread.sleep(7000);

		}
	}

	public static int count(WebDriver driver, By Locator) {
		return driver.findElements(Locator).size();
	}

	public static void explicit_wait(WebDriver driver, By Locator, int value) {
		new WebDriverWait(driver, Duration.ofSeconds(value)).until(ExpectedConditions.elementToBeClickable(Locator));

	}

	/*
	 * public static void explicit_wait_alert(WebDriver driver, int value) { new
	 * WebDriverWait(driver,
	 * Duration.ofSeconds(value)).until(ExpectedConditions.alertIsPresent()); String
	 * alrt = driver.switchTo().alert().getText(); System.out.print(alrt); }
	 */

	public static void isAlertPresent(WebDriver driver) {
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText() + " Alert is Displayed");
		} catch (NoAlertPresentException ex) {
			System.out.println("Alert is NOT Displayed : Juice increment by 1 ");
		}
	}

	public static void gettextreplace(WebDriver driver, By Locator, String value1, String value2) {
		driver.findElement(Locator).getText().replace(value1, value2);
	}

	public static void gettextvalue(WebDriver driver, By Locator) {

		String mess = driver.findElement(Locator).getText();
		System.out.println("Message Received:" + mess);

	}

	public static void element_visible_nav(WebDriver driver, By Locator1) {
		WebElement ele = driver.findElement(Locator1);

		if (ele.isDisplayed()) {
			ele.click();
		} else {
			System.out.println("Last page item added");
			//driver.findElement(Locator2).click();
		}

	}

	public static void elehighlight(WebDriver driver, By Locator) {

		WebElement elehl = driver.findElement(Locator);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", elehl);
	}

	public static void dropdownindex(WebDriver driver, By Locator, int index) {

		WebElement dropelecountry = driver.findElement(Locator);
		Select drpcon = new Select(dropelecountry);
		drpcon.selectByIndex(index);
	}

	public static void scroll_view(WebDriver driver, By Locator) {
		WebElement element = driver.findElement(Locator);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void dropdownvisibletext(WebDriver driver, By Locator, String text) {

		WebElement dropelecountry = driver.findElement(Locator);
		Select drpcon = new Select(dropelecountry);
		drpcon.selectByVisibleText(text);
	}

	public static void dropdownvalue(WebDriver driver, By Locator, String value) {

		WebElement dropelecountry = driver.findElement(Locator);
		Select drpcon = new Select(dropelecountry);
		drpcon.selectByValue(value);
	}

}
