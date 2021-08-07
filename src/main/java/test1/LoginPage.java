package test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
@FindBy(xpath="//input[@id='jot-ui-searchInput']")
WebElement Input;

@FindBy(xpath="//div[@id='sites-searchbox-search-button']")
WebElement Two;

public void SearchFunctionality() {
	Input.sendKeys("qwer");
	Two.click();
}

}
