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

WebUI.selectOptionByValue(findTestObject('Object Repository/Solicitar Servicio/SeleccionarPais'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Solicitar Servicio/SeleccionarDepartamento'), '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Solicitar Servicio/SeleccionarCiudad'), '05001', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Solicitar Servicio/SeleccionarBarrio'), '0110', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Solicitar Servicio/SeleccionarTipoCalle'), 'CL', true)

WebUI.setText(findTestObject('Object Repository/Solicitar Servicio/input_Campo1'), '30')

WebUI.setText(findTestObject('Object Repository/Solicitar Servicio/input__Campo2'), '30')

WebUI.setText(findTestObject('Object Repository/Solicitar Servicio/input_Campo3'), '30')

WebUI.setText(findTestObject('Object Repository/Solicitar Servicio/input_Apartamento'), '9001')

WebUI.setText(findTestObject('Object Repository/Solicitar Servicio/input_Detalles'), 'dirección prueba')

WebUI.click(findTestObject('Object Repository/Solicitar Servicio/button_Guardar'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Solicitar Servicio/button_Confirmar'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Solicitar Servicio/button_ACEPTAR'))

WebUI.delay(20)

