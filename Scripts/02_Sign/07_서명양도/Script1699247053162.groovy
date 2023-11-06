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
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/서명양도_계정입력창'), 'signtest004@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/서명양도_패스워드입력'), 'gkscLE5EWIBitKf28RTQyg==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인 버튼 클릭'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_알림공지닫기'))

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_시작하기클릭'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/서명양도_업로드버튼'), 'C:\\download\\sample_pdf.pdf')

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_편집버튼'))

WebUI.delay(2)

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/서명양도_첫번째 이름 입력'), '자동화5')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/서명양도_첫번째 계정 입력'), 'signtest005@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/서명양도_첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_확인 버튼'))

WebUI.delay(2)

'첫번째 사용자 서명버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_첫번째 사용자 서명버튼 클릭'))

'서명 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/서명양도_PDF캔버스'))

'하단바 선택 (캔버스 빠져나오기)'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_하단바'))

'하단 발송 \'계속\' 버튼'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_발송 버튼'))

'단일 발송 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_단일발송버튼'))

'서명권한양도'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_서명권한양도'))

'보내기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_보내기 버튼'))

WebUI.delay(5)

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

'프로필 사진 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_ STG004 프로필 영역'))

'로그아웃 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그아웃버튼'))

'로그인 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인버튼'))

'계정입력'
WebUI.setText(findTestObject('Object Repository/Page_/서명양도_계정입력'), 'signtest005@tech-mail.net')

'비밀번호 입력'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/서명양도_비밀번호입력'), 'gkscLE5EWIDbl+9ZUqR0xg==')

'로그인'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인 버튼 클릭'))

WebUI.click(findTestObject('Object Repository/Page_(1)/서명양도_알림공지닫기'))

'관리 메뉴 클릭'
WebUI.click(findTestObject('Object Repository/Page_(1)/서명양도_관리메뉴'))

'서명참여자 변경'
WebUI.click(findTestObject('Object Repository/Page_(1)/서명양도_서명참여자변경'))

'체크박스 클릭'
WebUI.click(findTestObject('Object Repository/Page_(1)/서명양도_서명참여자변경체크박스'))

WebUI.setText(findTestObject('Object Repository/Page_(1)/서명양도_변경할 서명자 입력 필드'), '김학수')

WebUI.setText(findTestObject('Object Repository/Page_(1)/서명양도_변경할 서명 계정 입력 필드'), 'signtest006@tech-mail.net')

WebUI.setText(findTestObject('Object Repository/Page_(1)/서명양도_추가정보 입력 필드'), '서명자 변경')

'보내기 클릭'
WebUI.click(findTestObject('Object Repository/Page_(1)/서명양도_보내기 버튼'))

'리소스 체크'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/서명양도_서명참여자변경리소스'), '서명 참여자를 변경했어요.')

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

'STG005 프로필 영역 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_STG005프로필'))

'로그아웃 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그아웃버튼'))

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/서명양도_계정입력창'), 'signtest006@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/서명양도_패스워드입력'), 'gkscLE5EWIBVXBkJvd9GIA==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_로그인 버튼 클릭'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/서명양도_알림공지닫기'))

'서명할 문서 클릭'
WebUI.click(findTestObject('Object Repository/Page_(2)/서명양도_서명할문서 캔버스'))

'입력시작'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력시작버튼'))

'서명클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명하기영역'))

'도장 선택'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명양도_도장선택'))

'적용 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명도장 확인 버튼'))

'입력완료 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력완료 버튼'))

'서명완료'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명 확인 버튼'))

'문서함으로 이동'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/문서함으로 이동 버튼'))

'완료 체크'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/서명양도_완료체크'), '완료')

WebUI.closeBrowser()

