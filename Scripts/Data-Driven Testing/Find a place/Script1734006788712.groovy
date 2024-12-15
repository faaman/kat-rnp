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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.ie/?locale=en&_set_bev_on_new_domain=1734008142_EAYTk3MmM1MTJhNW')

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_Only necessary'))

WebUI.setText(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/input_Where_query'), 
    city)

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/span_City'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_23'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/svg'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_29'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/span_Add guests_t1dqvypu atm_9s_1ulexfb atm_023ad9'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Galway  Holiday Rentals  Place_8e00a8/span_Learn how we sort results'))

WebUI.verifyElementText(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Galway  Holiday Rentals  Place_8e00a8/span_Learn how we sort results'), 
    'Learn how we sort results')

WebUI.closeBrowser()

