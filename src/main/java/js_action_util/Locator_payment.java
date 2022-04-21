package js_action_util;

import org.openqa.selenium.By;

public class Locator_payment {
	// public static final By = By.xpath("");
	public static final By BUTTON_CARD = By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-0']//span[2]");
	public static final By TEXT_CARDNAME = By.xpath("//input[@id='mat-input-14']");
	public static final By TEXT_CARDNUMBER = By.xpath("//input[@id='mat-input-15']");
	public static final By DROP_EMONTH = By.xpath("//select[@id='mat-input-16']");
	public static final By DROP_EYEAR = By.xpath("//select[@id='mat-input-17']");
	public static final By BUTTON_CSUBMIT = By.xpath("//button[@id='submitButton']");
	public static final By RADIO_CARD = By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']");
	public static final By ADD_COUPON = By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-17']//span[2]");
	public static final By TEXT_COPUON = By.xpath("//input[@id='coupon']");// 10 digit
	public static final By BUTTON_REDEEM = By.xpath("//button[@id='applyCouponButton']");
	public static final By DETAILS_ERROR = By.xpath("//div[@class='error ng-star-inserted']");
	public static final By BUTTON_CONTINE = By.xpath("//button[@aria-label='Proceed to review']");

}
