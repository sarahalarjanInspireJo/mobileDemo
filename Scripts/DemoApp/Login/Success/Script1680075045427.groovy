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

Mobile.startApplication(GlobalVariable.AndroidAPK, false)

Mobile.tap(findTestObject('DemoApp/MainPage/SideMenuImage'), 5)

Mobile.takeScreenshot('Check', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DemoApp/SideMenuGroup/Login'), 5)

Mobile.setText(findTestObject('DemoApp/Login/usernameInput'), GlobalVariable.Username1, 5)

Mobile.setText(findTestObject('DemoApp/Login/passwordInput'), GlobalVariable.password, 5)

Mobile.takeScreenshot('Check2', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DemoApp/Login/LoginButton'), 5)

Mobile.verifyElementExist(findTestObject('DemoApp/MainPage/ProductsLabel'), 5)

