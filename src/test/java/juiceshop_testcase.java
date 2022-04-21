
import static js_action_util.Locator_add_new_address.BUTTON_ADD_NEW_ADDRESS;
import static js_action_util.Locator_add_new_address.BUTTON_SUBMIT;
import static js_action_util.Locator_add_new_address.TEXT_ADDRESS;
import static js_action_util.Locator_add_new_address.TEXT_CITY;
import static js_action_util.Locator_add_new_address.TEXT_COUNTRY;
import static js_action_util.Locator_add_new_address.TEXT_MOBILE_NO;
import static js_action_util.Locator_add_new_address.TEXT_NAME;
import static js_action_util.Locator_add_new_address.TEXT_STATE;
import static js_action_util.Locator_add_new_address.TEXT_ZIPCODE;
import static js_action_util.Locator_add_speedd.BUTTON_CONTINUE;
import static js_action_util.Locator_add_speedd.BUTTON_CONTINUEPAY;
import static js_action_util.Locator_add_speedd.RADIO_ADDRESS;
import static js_action_util.Locator_add_speedd.RADIO_FASTD;
import static js_action_util.Locator_cart.BUTTON_ADD_MORE;
import static js_action_util.Locator_cart.BUTTON_CART;
import static js_action_util.Locator_cart.BUTTON_CHECKOUT;
import static js_action_util.Locator_login.BUTTON_LOGIN;
import static js_action_util.Locator_login.TEXT_EMAILID;
import static js_action_util.Locator_login.TEXT_PASSW;
import static js_action_util.Locator_order.BUTTON_ITEM1;
import static js_action_util.Locator_order.BUTTON_ITEM10;
import static js_action_util.Locator_order.BUTTON_ITEM2;
import static js_action_util.Locator_order.BUTTON_ITEM3;
import static js_action_util.Locator_order.BUTTON_ITEM4;
import static js_action_util.Locator_order.BUTTON_ITEM6;
import static js_action_util.Locator_order.BUTTON_ITEM8;
import static js_action_util.Locator_order.BUTTON_NEXT_PAGE;
import static js_action_util.Locator_order.ITEM_TOTAL_LIST;
//import static js_action_util.Locator_payment.ADD_COUPON;
import static js_action_util.Locator_payment.BUTTON_CARD;
import static js_action_util.Locator_payment.BUTTON_CONTINE;
import static js_action_util.Locator_payment.BUTTON_CSUBMIT;
//import static js_action_util.Locator_payment.BUTTON_REDEEM;
import static js_action_util.Locator_payment.DROP_EMONTH;
import static js_action_util.Locator_payment.DROP_EYEAR;
import static js_action_util.Locator_payment.RADIO_CARD;
import static js_action_util.Locator_payment.TEXT_CARDNAME;
import static js_action_util.Locator_payment.TEXT_CARDNUMBER;
//import static js_action_util.Locator_payment.TEXT_COPUON;
import static js_action_util.Locator_place_review.BUTTON_ACCOUNT;
import static js_action_util.Locator_place_review.BUTTON_LOGOUT;
import static js_action_util.Locator_place_review.BUTTON_ORDER;
import static js_action_util.Locator_place_review.BUTTON_ORDERHISTORY;
import static js_action_util.Locator_place_review.BUTTON_TRACKDELIVERY;
import static js_action_util.Locator_user_register.BUTTON_COOKIE;
import static js_action_util.Locator_user_register.BUTTON_DISMISS;
import static js_action_util.Locator_user_register.BUTTON_REGISER;
import static js_action_util.Locator_user_register.DROP_SECURITY;
import static js_action_util.Locator_user_register.DROP_SECURITY_QUE5;
import static js_action_util.Locator_user_register.TEXT_ANSWER_SECQUE;
import static js_action_util.Locator_user_register.TEXT_EMAIL;
import static js_action_util.Locator_user_register.TEXT_PASSWORD;
import static js_action_util.Locator_user_register.TEXT_REPEAT_PASSWORD;
import static js_action_util.action_km_util.click;
import static js_action_util.action_km_util.count;
import static js_action_util.action_km_util.dropdownindex;
import static js_action_util.action_km_util.dropdownvisibletext;
import static js_action_util.action_km_util.element_visible_nav;
import static js_action_util.action_km_util.explicit_wait;
import static js_action_util.action_km_util.findelements;
import static js_action_util.action_km_util.mouseover;
import static js_action_util.action_km_util.mouseoverclick;
import static js_action_util.action_km_util.scroll_view;
import static js_action_util.action_km_util.sendkeys;
import static js_action_util.takescreenshot.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import js_action_util.Takescreenshot_word;

public class juiceshop_testcase {

	static WebDriver driver = null;
	static String Emailid, passwrd;
	
	Takescreenshot_word tssw;
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuma\\eclipse-workspace\\JuiceShop_sel\\target\\driver\\chromedriver.exe");

		ChromeOptions chOptions = new ChromeOptions();
		chOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chOptions.setAcceptInsecureCerts(true);

		/*
		 * chOptions.addArguments("--disable-notifications");
		 * chOptions.addArguments("--start-maximized");
		 * chOptions.addArguments("--disable-web-security");
		 * chOptions.addArguments("--no-proxy-server");
		 * chOptions.addArguments("--enable-javascript");
		 * chOptions.addArguments("--enable-automation"); DesiredCapabilities cap = new
		 * DesiredCapabilities(); cap.setBrowserName("chrome");
		 * cap.setPlatform(Platform.ANY); cap.setCapability("chrome.switches",
		 * Arrays.asList("--disable-notifications"));
		 * cap.setCapability(ChromeOptions.CAPABILITY, chOptions);
		 */

		driver = new ChromeDriver(chOptions);

		driver.get("https://juice-shop.herokuapp.com/#/register");
		driver.manage().window().maximize();

	}

	public void js_register() throws InterruptedException {

		click(driver, BUTTON_DISMISS);
		click(driver, BUTTON_COOKIE);
		Thread.sleep(5000);
		Emailid = RandomStringUtils.randomAlphabetic(5, 7) + "@gmail.com";
		sendkeys(driver, TEXT_EMAIL, Emailid);

		System.out.println("Email register:" + Emailid);

		passwrd = RandomStringUtils.randomAlphabetic(5, 10);
		sendkeys(driver, TEXT_PASSWORD, passwrd);
		System.out.println("Pass register:" + passwrd);

		sendkeys(driver, TEXT_REPEAT_PASSWORD, passwrd);

		click(driver, DROP_SECURITY);

		click(driver, DROP_SECURITY_QUE5);

		String anssec = RandomStringUtils.randomAlphabetic(4, 5);
		sendkeys(driver, TEXT_ANSWER_SECQUE, anssec);

		click(driver, BUTTON_REGISER);

		System.out.println("Successfully register");

	}

	public void js_login() {
		explicit_wait(driver, TEXT_EMAILID, 30);
		sendkeys(driver, TEXT_EMAILID, Emailid);
		sendkeys(driver, TEXT_PASSW, passwrd);
		click(driver, BUTTON_LOGIN);
		System.out.println("Login sucessful,Ready to place an order");
	}

	public void item_order() throws InterruptedException {

		Thread.sleep(1000);
		int totitem1 = count(driver, ITEM_TOTAL_LIST);
		System.out.println("Total Item list in page 1 " + totitem1);
		scroll_view(driver, BUTTON_ITEM4);
		mouseoverclick(driver, BUTTON_ITEM4);
		explicit_wait(driver, BUTTON_ITEM8, 30);
		scroll_view(driver, BUTTON_ITEM8);
		mouseoverclick(driver, BUTTON_ITEM8);

		Thread.sleep(1000);
		explicit_wait(driver, BUTTON_NEXT_PAGE, 30);
		scroll_view(driver, BUTTON_NEXT_PAGE);
		element_visible_nav(driver, BUTTON_NEXT_PAGE);

		int totitem2 = count(driver, ITEM_TOTAL_LIST);
		System.out.println("Total Item list in page 2 " + totitem2);
		explicit_wait(driver, BUTTON_ITEM2, 30);
		scroll_view(driver, BUTTON_ITEM2);
		mouseoverclick(driver, BUTTON_ITEM2);
		explicit_wait(driver, BUTTON_ITEM6, 30);
		scroll_view(driver, BUTTON_ITEM6);
		mouseoverclick(driver, BUTTON_ITEM6);
		explicit_wait(driver, BUTTON_ITEM10, 60);
		scroll_view(driver, BUTTON_ITEM10);
		mouseoverclick(driver, BUTTON_ITEM10);
		Thread.sleep(1000);

		explicit_wait(driver, BUTTON_NEXT_PAGE, 30);
		scroll_view(driver, BUTTON_NEXT_PAGE);
		element_visible_nav(driver, BUTTON_NEXT_PAGE);

		int totitem3 = count(driver, ITEM_TOTAL_LIST);
		System.out.println("Total Item list in page 3 " + totitem3);

		explicit_wait(driver, BUTTON_ITEM1, 30);
		scroll_view(driver, BUTTON_ITEM1);
		mouseoverclick(driver, BUTTON_ITEM1);
		explicit_wait(driver, BUTTON_ITEM3, 30);
		scroll_view(driver, BUTTON_ITEM3);
		mouseoverclick(driver, BUTTON_ITEM3);

		Thread.sleep(4000);

		mouseoverclick(driver, BUTTON_CART);
		System.out.println("Juice added from 3 pages");
	}

	public void cart_add_iterate() throws InterruptedException {

		int count = count(driver, BUTTON_ADD_MORE);
		System.out.println("count" + count);

		explicit_wait(driver, BUTTON_CART, 60);

		for (int i = 0; i <= count - 1; i++) {

			scroll_view(driver, BUTTON_ADD_MORE);
			findelements(driver, BUTTON_ADD_MORE, i);
			System.out.println("Juice Addded" + i);
			Thread.sleep(4000);

		}

		System.out.println("Proceed to checkout");
		Thread.sleep(1000);
	}

	public void add_new_address() throws InterruptedException {
		Thread.sleep(1000);
		mouseoverclick(driver, BUTTON_CHECKOUT);
		click(driver, BUTTON_ADD_NEW_ADDRESS);

		explicit_wait(driver, TEXT_COUNTRY, 30);
		String country = RandomStringUtils.randomAlphabetic(5);
		sendkeys(driver, TEXT_COUNTRY, country);

		String name = RandomStringUtils.randomAlphabetic(7);
		sendkeys(driver, TEXT_NAME, name);

		String mobileno = RandomStringUtils.randomNumeric(10);
		sendkeys(driver, TEXT_MOBILE_NO, mobileno);

		String zipc = RandomStringUtils.randomNumeric(5);
		sendkeys(driver, TEXT_ZIPCODE, zipc);

		String address = RandomStringUtils.randomAlphanumeric(10);
		sendkeys(driver, TEXT_ADDRESS, address);

		String city = RandomStringUtils.randomAlphabetic(5);
		sendkeys(driver, TEXT_CITY, city);

		String state = RandomStringUtils.randomAlphabetic(4);
		sendkeys(driver, TEXT_STATE, state);

		explicit_wait(driver, BUTTON_SUBMIT, 30);
		click(driver, BUTTON_SUBMIT);
		System.out.println("Sucessfully Added New Addres, proceed to delivery option");
		Thread.sleep(4000);

	}

	public void address_dspeed() throws InterruptedException {
		Thread.sleep(1000);
		explicit_wait(driver, RADIO_ADDRESS, 120);
		click(driver, RADIO_ADDRESS);
		click(driver, BUTTON_CONTINUE);
		click(driver, RADIO_FASTD);
		click(driver, BUTTON_CONTINUEPAY);

		System.out.println("Delivery option done ,Proceed to payment");
		Thread.sleep(5000);
	}

	public void payment_card() throws IOException {

		click(driver, BUTTON_CARD);

		String cardname = RandomStringUtils.randomAlphabetic(8);
		sendkeys(driver, TEXT_CARDNAME, cardname);

		String cardno = RandomStringUtils.randomNumeric(16, 16);
		sendkeys(driver, TEXT_CARDNUMBER, cardno);

		explicit_wait(driver, DROP_EMONTH, 120);
		dropdownindex(driver, DROP_EMONTH, 5);
		dropdownvisibletext(driver, DROP_EYEAR, "2097");

		click(driver, BUTTON_CSUBMIT);

		click(driver, RADIO_CARD);
		System.out.println("Payment sucessfully done");

		click(driver, BUTTON_CONTINE);
		takesshot(driver, "Js_Orderhistory");
		System.out.println("Order places ");

	}

	public void order_review() throws InterruptedException, IOException {

		click(driver, BUTTON_CHECKOUT);

		click(driver, BUTTON_ACCOUNT);

		// explicit_wait(driver, BUTTON_ORDER, 60);
		mouseover(driver, BUTTON_ORDER);

		//takesshot(driver, "Js_Orderhistory");

		explicit_wait(driver, BUTTON_ORDERHISTORY, 60);
		mouseoverclick(driver, BUTTON_ORDERHISTORY);

		//Takescreenshot_word.captureScreenShot(docx,run,out);
		takesshot(driver ,"Orderhistory");

		explicit_wait(driver, BUTTON_TRACKDELIVERY, 60);
		click(driver, BUTTON_TRACKDELIVERY);
		
		//takesshot(driver, "Delivery track");

		explicit_wait(driver, BUTTON_ACCOUNT, 60);

		click(driver, BUTTON_ACCOUNT);

		click(driver, BUTTON_LOGOUT);
		System.out.println("Delivery status checked , Logout");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		juiceshop_testcase run = new juiceshop_testcase();
		run.js_register();
		run.js_login();
		run.item_order();
		run.cart_add_iterate();
		run.add_new_address();
		run.address_dspeed();
		run.payment_card();
		run.order_review();

		driver.close();
		driver.quit();
	}
}
