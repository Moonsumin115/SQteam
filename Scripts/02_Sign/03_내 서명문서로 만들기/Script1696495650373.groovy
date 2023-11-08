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
WebUI.click(findTestObject('Object Repository/Page_/내 서명_로그인버튼'))

'계정 입력창'
WebUI.setText(findTestObject('Object Repository/Page_/내 서명_계정입력'), 'signtest004@tech-mail.net')

'패스워드입력창'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/내 서명_패스워드입력'), 'gkscLE5EWIBitKf28RTQyg==')

'로그인 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_로그인 실행'))

'알림 공지 닫기'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_알림 공지 닫기'))

WebUI.delay(2)

'시작하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_시작하기 클릭'))

'파일 선택 버튼'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_/내 서명_업로드 파일 선택 버튼'), 'C:\\download\\sample_pdf.pdf')

'편집 버튼'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_편집 버튼'))

WebUI.delay(2)

'첫번째 이름 입력'
WebUI.setText(findTestObject('Object Repository/Page_/내 서명_첫번째 이름 입력'), '문수민')

'첫번째 계정 입력'
WebUI.setText(findTestObject('Object Repository/Page_/내 서명_첫번째 계정 입력'), 'signtest005@tech-mail.net')

WebUI.sendKeys(findTestObject('Object Repository/Page_/내 서명_첫번째 계정 입력'), Keys.chord(Keys.ESCAPE))

'확인 버튼'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_이름계정입력 확인 버튼'))

'서명하기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_서명하기 클릭'))

'서명 캔버스에 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/내 서명_PDF 캔버스'))

'내 서명 문서로 만들기 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명 문서로 만들기'))

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/내 서명_필드 초기화 리소스 체크'), '문서에 설정한 서명자 정보와 필드가 초기화돼요. 계속할까요?')

'경고창 확인'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_이름계정입력 확인 버튼'))

'서명 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_서명하기 클릭'))

'서명 캔버스에 넣기'
WebUI.doubleClick(findTestObject('Object Repository/Page_/내 서명_PDF 캔버스'))

'하단영역 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_하단 프레임 영역'))

'계속버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_하단프레임 계속 버튼'))

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/내 서명_ 내 문서 만들기 체크포인트'), '내 문서 만들기를 완료해요.')

'서명보내기 확인'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_이름계정입력 확인 버튼'))

'알림 체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_/내 서명_ 필드비어있음 체크포인트'), '서명 문서에 추가한 필드가 비어 있어요. 필드에 내용을 입력해 주세요.')

WebUI.click(findTestObject('Object Repository/Page_/웹오피스 편집 취소버튼'))

'도장선택'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_도장 선택'))

'적용버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_적용 버튼'))

'계속 버튼 클릭'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_하단프레임 계속 버튼'))

'내 문서 만들기 완료'
WebUI.click(findTestObject('Object Repository/Page_/내 서명_이름계정입력 확인 버튼'))

'체크포인트'
WebUI.verifyElementText(findTestObject('Object Repository/Page_sample_pdf/내 서명_서명문서를 생성했어요'), '서명 문서를 생성했어요.')

'싸인 아이콘 클릭'
WebUI.click(findTestObject('Object Repository/Page_sample_pdf/한컴싸인 아이콘'))

WebUI.closeBrowser()

