package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.CarWaleSteps;

@RunWith(SerenityRunner.class)
public class FindCarTest {

	@Managed
	WebDriver driver;
	
	@Steps
	CarWaleSteps car;
	
	
	@Title("Finding car Test")
	@Test
	public void findCarTest() {
		car.navigate(); 
		car.findNewCars();
		
	}
}
