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

WebUI.navigateToUrl('https://www.stg.hancomsign.com/')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그인 버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest008@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIBK9443d9C5Pw==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

WebUI.delay(2)

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/파일 선택'), 'C:\\download\\sample_pdf.pdf')

WebUI.delay(5)

'하단프레임의 \'계속\' 버튼'
WebUI.click(findTestObject('Object Repository/Page_/하단프레임 계속버튼'))

'단일 발송'
WebUI.click(findTestObject('Object Repository/Page_/단일 발송'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_/서명필드없음 알림'), '참여자의 서명 필드가 없어요. 참여자를 제거하거나 필드를 추가해 주세요.')

WebUI.closeBrowser()

