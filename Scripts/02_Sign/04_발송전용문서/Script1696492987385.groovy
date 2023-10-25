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
WebUI.setText(findTestObject('Object Repository/Page_/계정 입력'), 'signtest006@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/비밀번호 입력'), 'gkscLE5EWIBVXBkJvd9GIA==')

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
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 이름 입력'), '문수민')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/첫번째 계정 입력'), 'signtest002@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'서명참여자 추가'
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

'발송전용문서로 만들기'
WebUI.click(findTestObject('Object Repository/Page_/발송전용문서로 만들기 체크'))

'확인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/서명참여자추가 완료 확인'))

'발송전용문서는 서명필드없이 발송해요. 리소스 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/발송문서 리소스 체크포인트'), '발송 전용 문서는 서명 필드 없이 발송해요.')

'하단프레임 선택'
WebUI.click(findTestObject('Object Repository/Page_/하단프레임'))

'계속 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/계속 버튼'))

'CSV 파일업로드'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/CSV 파일업로드를 위한 오브젝트'), 'C:\\download\\sample_pdf.csv')

'대량발송 다음 버튼'
WebUI.click(findTestObject('Object Repository/Page_/대량발송 다음 버튼'))

'보내기 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/보내기 버튼'))

'첫번째 확인 체크'
WebUI.click(findTestObject('Object Repository/Page_/첫번째 체크'))

'두번째 확인 체크'
WebUI.click(findTestObject('Object Repository/Page_/두번째 확인 체크'))

'세번째 확인 체크'
WebUI.click(findTestObject('Object Repository/Page_/세번째 확인 체크'))

'보내기 버튼'
WebUI.click(findTestObject('Object Repository/Page_/CSV 보내기 버튼'))

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/대량 발송 리소스 체크포인트'), '대량 발송을 시작해요.')

'문서함으로 클릭'
WebUI.click(findTestObject('Object Repository/Page_/문서함으로 클릭'))

WebUI.delay(5)

WebUI.navigateToUrl('https://my.stg.hancomsign.com/tasks?state=bulksend')

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/문서발송 체크'), 'sample_pdf')

