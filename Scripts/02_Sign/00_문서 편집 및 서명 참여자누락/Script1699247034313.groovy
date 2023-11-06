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
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'hsignTest004@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'Ltf7E4+jKv9N7rCrZRkljQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/파일 선택'), 'C:\\download\\sample_docx.docx')

WebUI.delay(3)

'웹오피스 편집하기'
WebUI.click(findTestObject('Object Repository/Page_/웹오피스편집하기'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/웹오피스 프레임'))

'한컴싸인 아이콘 클릭'
WebUI.click(findTestObject('Object Repository/Page_/한컴싸인 아이콘'))

WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/파일 선택'), 'C:\\download\\sample_pdf.pdf')

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/편집 버튼'))

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 이름 입력'), '문수민')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 계정 입력'), 'hsigntest002@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'문서편집 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명참여자 추가'))

WebUI.delay(2)

'두번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/두번째 이름 입력'), '이은지')

'두번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/두번째 계정입력'), 'hsigntest003@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/두번째 계정입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

WebUI.click(findTestObject('Object Repository/Page_/하단프레임'))

WebUI.click(findTestObject('Object Repository/Page_/계속 버튼'))

'단일발송 클릭'
WebUI.click(findTestObject('Object Repository/Page_/단일발송'))

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/서명필드없음 알림'), '참여자의 서명 필드가 없어요. 참여자를 제거하거나 필드를 추가해 주세요.')

WebUI.closeBrowser()

