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
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest001@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIDkNk2v7qyiIQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

WebUI.delay(2)

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/파일 선택'), 'C:\\download\\sample_pdf.pdf')

WebUI.delay(2)

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/편집 버튼'))

WebUI.delay(2)

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 이름 입력'), '문수민')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 계정 입력'), 'signtest002@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Page_/서명참여자 추가'))

'두번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/두번째 이름 입력'), '이은지')

'두번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/두번째 계정입력'), 'signtest003@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/두번째 계정입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

WebUI.delay(2)

'첫번째 사용자 서명버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/우측사이드 서명버튼'))

'서명 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/PDF 캔버스'))

'하단바 선택 (캔버스 빠져나오기)'
WebUI.click(findTestObject('Object Repository/Page_/하단프레임'))

'두번째 사용자 선택'
WebUI.click(findTestObject('Object Repository/Page_/두번째 사용자 선택'))

'체크박스 선택'
WebUI.click(findTestObject('Object Repository/Page_/체크박스 선택'))

'체크박스 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/PDF 캔버스'))

'하단바 넣기 (캔버스 빠져나오기)'
WebUI.click(findTestObject('Object Repository/Page_/하단프레임'))

'서명순서 지정하기'
WebUI.click(findTestObject('Object Repository/Page_/서명순서체크'))

'하단 발송 \'계속\' 버튼'
WebUI.click(findTestObject('Object Repository/Page_/계속 버튼'))

'단일 발송 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/단일 발송 버튼'))

WebUI.click(findTestObject('Object Repository/Page_/보내기 버튼'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Page_sample_pdf/서명문서 만들기 완료 체크'), '서명 문서를 만들었어요.')

WebUI.closeBrowser()

