import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login_Steps {

	@Given("I am on Login page")
	def Navigatetologin() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demo.guru99.com/V4/')
	}

	@When("I enter (.*) and (.*)")
	def EnterLogins(String username,String Password) {
		WebUI.setText(findTestObject('Object Repository/DEMO_Page/Page_Guru99 Bank Home Page/input_UserID_uid'),username)
		WebUI.setEncryptedText(findTestObject('Object Repository/DEMO_Page/Page_Guru99 Bank Home Page/input_Password_password'),Password)
	}
	@And("I click on submit button")
	def submit() {
		WebUI.click(findTestObject('Object Repository/DEMO_Page/Page_Guru99 Bank Home Page/input_Password must not be blank_btnLogin'))
	}
	@Then("user clicks on new customer for verification")
	def sucessful() {
		WebUI.click(findTestObject('Object Repository/DEMO_Page/Page_Guru99 Bank Manager HomePage/a_New Customer'))
		WebUI.closeBrowser()
	}
}