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

WebUI.setText(findTestObject('Object Repository/MendixSignIn/Page_Login/input_User name_usernameInput'), 'akila.k')

WebUI.setEncryptedText(findTestObject('Object Repository/MendixSignIn/Page_Login/input_Password_passwordInput'), 'C7oFhhKYWvBNN7Z5AL5UVw==')

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Login/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Home/h1_Leave Requests'), 30)

WebUI.scrollToElement(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Home/button_Request time off'), 30)

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Home/button_Request time off'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/span_Leave date_glyphicon glyphicon-calendar'), 
    30)

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/span_Leave date_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/td_12'))

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/button_-_btn mx-button'))

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/td_12'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/select_Select a leave typeSpecial leavePart_b985c2'), 
    'SickLeave', true)

WebUI.scrollToElement(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/button_Submit request'), 30)

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Request time off/button_Submit request'))

WebUI.click(findTestObject('Object Repository/MendixSignIn/Page_Approvals - Home/button_OK'))

WebUI.closeBrowser()