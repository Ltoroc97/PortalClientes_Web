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

String path = RunConfiguration.getProjectDir() + "/Data Files/"
path = path.replace("/", "\\")

//Robot robot = new Robot()

//WebUI.click(findTestObject('Object Repository/Registrar Menor/Solicitud Registro Menor/div_() Documento de identidad del solicitante_divFileDocument'))

//WebUI.click(findTestObject('Object Repository/Registrar Menor/Solicitud Registro Menor/div_() Registro civil del menor de edad_divFileRegister'))



CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Object Repository/Registrar Menor/Solicitud Registro Menor/div_() Documento de identidad del solicitante_divFileDocument'),path + CargaDocumento1)


CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Object Repository/Registrar Menor/Solicitud Registro Menor/div_() Registro civil del menor de edad_divFileRegister'),path + CargaDocumento1)


WebUI.click(findTestObject('Object Repository/Registrar Menor/Solicitud Registro Menor/button_Enviar'))

