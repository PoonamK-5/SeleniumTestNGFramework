package com.herouapp.theinternet.dropdowntests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herouapp.theinternet.base.TestUtilities;
import com.herouapp.theinternet.pages.DropdownPage;
import com.herouapp.theinternet.pages.WelcomePage;

public class DropdownTest extends TestUtilities{
	@Test
	public void optionTwoTest() {
		log.info("Starting optionTwoTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on Dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();

		// Select Option 2
		dropdownPage.selectOption(2);

		// Verify Option 2 is selected
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"),
				"Option 2 is not selected. Instead selected - " + selectedOption);
	}

}
