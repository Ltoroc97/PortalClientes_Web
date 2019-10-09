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

WebUI.setEncryptedText(findTestObject('Object Repository/Configurar Cuenta/Editar Contrasena/input_() Contrasea actual_oldPassword'), 
    'zpitzbFj1P6iY2h+x2z5qA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Configurar Cuenta/Editar Contrasena/input_() Contrasea nueva_newPassword'), 
    'TG+1lLkBS3xswYetR2n2wg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Configurar Cuenta/Editar Contrasena/input_() Confirmar contrasea nueva_ConfirmPassword'), 
    'TG+1lLkBS3xswYetR2n2wg==')

