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
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest009@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIBEUpDr0rlqPQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/시작하기'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/파일 선택'), 'C:\\download\\sample_pdf.pdf')

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/편집 버튼'))

WebUI.delay(2)

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 이름 입력'), '자동화10')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 계정 입력'), 'signtest010@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

WebUI.delay(2)

'첫번째 사용자 서명버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/우측사이드 서명버튼'))

'서명 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/PDF 캔버스'))

'하단바 선택 (캔버스 빠져나오기)'
WebUI.click(findTestObject('Object Repository/Page_/하단프레임'))

'하단 발송 \'계속\' 버튼'
WebUI.click(findTestObject('Object Repository/Page_/계속 버튼'))

'단일 발송 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/단일 발송 버튼'))

'서명거부 선택'
WebUI.click(findTestObject('Object Repository/Page_/서명순서 지정하기'))

'보내기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/보내기 버튼'))

'한컴싸인 아이콘 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/한컴싸인 아이콘'))

WebUI.delay(3)

'프로필 클릭'
WebUI.doubleClick(findTestObject('Object Repository/Page_/프로필 아이콘'))

WebUI.delay(2)

'로그아웃 클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그아웃 버튼'))

WebUI.navigateToUrl('https://accounts.stg.hancom.com/signout?redirect=https://www.stg.hancomsign.com')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그인 버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest010@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIB/7J7vhr2VZA==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

WebUI.click(findTestObject('Object Repository/Page_(1)/알림공지닫기button'))

'받은문서  클릭'
WebUI.click(findTestObject('Object Repository/Page_(1)/받은문서 클릭'))

WebUI.click(findTestObject('Object Repository/Page_(2)/관리클릭'))

'거부이유 입력필드'
WebUI.click(findTestObject('Object Repository/Page_(1)/거부이유 입력필드'))

WebUI.setText(findTestObject('Object Repository/Page_(3)/거부입력사유 필드'), '테스트자동화')

'보내기 클릭'
WebUI.click(findTestObject('Object Repository/Page_(1)/보내기버튼2'))

'서명문서 없음 체크포인트'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/서명문서없음 체크포인트'), 0)

WebUI.delay(2)

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

'프로필포함영역 클릭'
WebUI.click(findTestObject('Object Repository/Page_/STG010프로필'))

WebUI.delay(1)

'로그아웃클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그아웃 버튼'))

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그인 버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest009@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIBEUpDr0rlqPQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

'문서함 클릭'
WebUI.click(findTestObject('Object Repository/Page_/문서함 클릭'))

'거부 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/거부 리소스'), '거부')

'관리 클릭'
WebUI.click(findTestObject('Object Repository/Page_(4)/관리클릭'))

'삭제버튼'
WebUI.click(findTestObject('Object Repository/Page_/컨텍스트 삭제위치'))

WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

WebUI.navigateToUrl('https://accounts.stg.hancom.com/signout?redirect=https://www.stg.hancomsign.com')

