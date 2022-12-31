package pages;

import base.BasePage;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;

public class HomePage extends BasePage{

	String newCarMenu="xpath=//div[@class='top-nav-label js-main-nav-label']" ;
	String findNewCar="//a[contains(text(),'Find New Cars')]";
	
	public void findNewCars() {
		moveMouseTo(newCarMenu);
	click(findNewCar);
	
	}
}
