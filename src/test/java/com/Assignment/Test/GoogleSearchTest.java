package com.Assignment.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment.Pages.GoogleSearchPage;
import com.Assignment.Utils.Utils;
import com.Assignment.base.TestBase;

public class GoogleSearchTest extends TestBase {

	GoogleSearchPage searchPage;

	@BeforeMethod
	public void launch() {
		intialization();
		searchPage = new GoogleSearchPage(webDriver, false).get();
	}

	@Test
	public void firstResultTest() {
		var resultText = searchPage.getSearchResult("Canada");
		Assert.assertEquals(resultText,"Canada.ca: Home");
	}

	@Test
	public void nonExistingResultTest() {
		var randomTextForSearch = Utils.generateRandomString(50);
		String resultText = searchPage.getSearchResult(randomTextForSearch);
		Assert.assertEquals(resultText,randomTextForSearch);
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
