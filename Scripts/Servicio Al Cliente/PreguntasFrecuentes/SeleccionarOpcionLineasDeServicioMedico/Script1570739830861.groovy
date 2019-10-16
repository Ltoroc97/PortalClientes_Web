import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Servicio Al Cliente/a_Lneas de servicio mdico'))

WebUI.delay(10)

WebUI.scrollToPosition(250,0)

WebUI.click(findTestObject('Object Repository/Servicio Al Cliente/h3_Lneas de servicio mdico'))

result = WebUI.getText(findTestObject('Object Repository/Servicio Al Cliente/h3_Lneas de servicio mdico'))

System.out.println(result)

WebUI.verifyEqual(result, 'Líneas de servicio médico')


