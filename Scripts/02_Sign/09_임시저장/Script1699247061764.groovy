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
WebUI.click(findTestObject('Object Repository/Page_/임시저장_로그인버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/임시저장_계정 입력창'), 'signtest010@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/임시저장_패스워드입력창'), 'gkscLE5EWIB/7J7vhr2VZA==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_로그인버튼클릭'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_알림공지닫기'))

WebUI.delay(2)

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/임시저장_파일'), 'C:\\download\\sample_pdf.pdf')

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_편집 버튼'))

WebUI.delay(2)

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/임시저장_첫번째 이름 입력'), '자동화11')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/임시저장_첫번째 계정 입력'), 'signtest011@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/임시저장_첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_확인 버튼'))

WebUI.delay(2)

'첫번째 사용자 서명버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_첫번째 사용자 서명 버튼'))

'서명 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/임시저장_PDF 캔버스'))

'하단바 선택 (캔버스 빠져나오기)'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_하단메뉴'))

'하단 발송 \'계속\' 버튼'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_하단발송의 계속 버튼'))

'단일 발송 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_단일 발송 버튼'))

'임시저장 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시 저장_임시 저장 버튼'))

WebUI.delay(5)

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/임시저장_임시문서를 저장했어요 리소스'), '임시 문서를 저장했어요.')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/임시저장_임시저장 표시 체크포인트'), '임시 저장')

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

'문서함 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_문서함'))

'임시저장문서 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_저장된 문서 체크포인트'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/임시저장_PDF 캔버스'), 1)

'한컴싸인 아이콘클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_한컴싸인 아이콘'))

'확인버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_확인 버튼'))

'문서함 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_문서함'))

'관리클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_관리 아이콘'))

'삭제 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_컨텍스트 삭제 선택'))

'확인버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/임시저장_확인 버튼'))

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks?state=tasks')

WebUI.closeBrowser()

