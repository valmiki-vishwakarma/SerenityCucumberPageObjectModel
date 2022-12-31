package steps;

import org.junit.Test;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class CarWaleSteps {

	HomePage home;

	@Step
	public void navigate() {
		home.open();
	}

	@Step
	public void findNewCars() {
		home.findNewCars();
	}
}
