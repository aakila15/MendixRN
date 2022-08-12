import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://leavetracker110-sandbox.mxapps.io/login.html')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/MendixSignIn/Page_Login/input_User name_usernameInput'), 30)

WebUI.setText(findTestObject('Object Repository/MendixSignIn/Page_Login/input_User name_usernameInput'), 'akila.kn')

WebUI.setEncryptedText(findTestObject('Object Repository/MendixSignIn/Page_Login/input_Password_passwordInput'), 'C7oFhhKYWvBNN7Z5AL5UVw==')

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Login/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MendixSignIn/Page_Login/Error_InvalidUnPw'), 30)

WebUI.closeBrowser()
