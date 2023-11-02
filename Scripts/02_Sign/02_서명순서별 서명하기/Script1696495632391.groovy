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
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest003@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIDNZE8UFKmZmQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

WebUI.delay(2)

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/알림공지닫기'))

'서명 문서가 없어요. 리소스 체크'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/문서 없음 리소스 체크'), '서명 문서가 없어요.')

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

'프로필 아이콘 클릭'
WebUI.click(findTestObject('Object Repository/Page_/프로필 아이콘'))

'로그아웃 클릭'
WebUI.click(findTestObject('Object Repository/Page_/로그아웃 버튼'))

WebUI.delay(2)

WebUI.navigateToUrl('https://www.stg.hancomsign.com/')

WebUI.click(findTestObject('Object Repository/Page_/로그인 버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest002@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIC9EpMd4GmJVg==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

WebUI.delay(2)

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_(1)/알림공지닫기button'))

'문서목록에 추가되었는지 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_(1)/문서목록항목'), 'sample_pdf')

'서명할 문서 실행'
WebUI.click(findTestObject('Object Repository/Page_(1)/문서목록항목'))

WebUI.delay(2)

'입력시작 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력시작버튼'))

WebUI.doubleClick(findTestObject('Object Repository/Page_sample_pdf/서명 캔버스 영역'))

'서명란 더블클릭'
WebUI.doubleClick(findTestObject('Object Repository/Page_sample_pdf/서명하기영역'))

'도장이미지선택'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/도장이미지'))

'서명/도장 확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명도장 확인 버튼'))

'하단 영역클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/하단 메뉴 영역'))

'입력완료 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력완료 버튼'))

'서명 확인 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명 확인 버튼'))

'\'서명한 문서를 보냈어요.\' 리소스 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_sample_pdf/서명한 문서 확인 체크포인트 리소스'), '서명한 문서를 보냈어요.')

'문서함으로 이동'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/문서함으로 이동 버튼'))

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

WebUI.click(findTestObject('Object Repository/Page_/프로필 아이콘'))

WebUI.click(findTestObject('Object Repository/Page_/로그아웃 버튼'))

WebUI.delay(2)

WebUI.navigateToUrl('https://www.stg.hancomsign.com/')

WebUI.click(findTestObject('Object Repository/Page_/로그인 버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest003@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIDNZE8UFKmZmQ==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계정비밀번호 로그인 버튼'))

WebUI.delay(2)

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_(1)/알림공지닫기button'))

'문서목록에 추가되었는지 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_(1)/문서목록항목'), 'sample_pdf')

'서명할 문서 실행'
WebUI.click(findTestObject('Object Repository/Page_(1)/문서목록항목'))

WebUI.delay(2)

'입력시작 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력시작버튼'))

'입력완료 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/입력완료 버튼'))

'서명 확인 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/서명 확인 버튼'))

'\'서명한 문서를 보냈어요.\' 리소스 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_sample_pdf/서명한 문서 확인 체크포인트 리소스'), '서명한 문서를 보냈어요.')

'문서함으로 이동'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/문서함으로 이동 버튼'))

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks')

WebUI.click(findTestObject('Object Repository/Page_/프로필 아이콘'))

WebUI.click(findTestObject('Object Repository/Page_/로그아웃 버튼'))

WebUI.closeBrowser()

