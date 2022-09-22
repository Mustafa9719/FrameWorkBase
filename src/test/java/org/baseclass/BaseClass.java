package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public void alertSendKeys(String value) {
		Alert alert = driver.switchTo().alert();

		alert.sendKeys(value);
	}

	public String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void driverChromeWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void driverFFWebDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public void driverEdgeWebDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public void winMaximize() {
		driver.manage().window().maximize();
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void elementClick(WebElement element) {
		element.click();
	}

	public String getWinTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement elementFindElementById(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public WebElement elementFindElementByClassName(String AttributeValue) {
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	public WebElement elementFindElementByName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}

	public WebElement elementFindElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public WebElement elementFindElementByTagName(String xpath) {
		WebElement element = driver.findElement(By.tagName(xpath));
		return element;
	}

	public WebElement elementFindElementByLinkedText(String linkText) {
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;
	}

	public WebElement elementFindElementByParLinkText(String partialLinkText) {
		WebElement element = driver.findElement(By.partialLinkText(partialLinkText));
		return element;
	}

	public WebElement elementFindElementByCssSelector(String cssSelector) {
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		return element;
	}

	public String getPageText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public void allWinClose() {
		driver.quit();
	}

	public void currentWinClose() {
		driver.close();
	}

	public WebElement elementPassValue(WebElement element, String value) {
		element.sendKeys(value);
		return element;
	}

	public WebElement elementPassValueByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		return element;
	}

	public String elementGetAttribute(WebElement element, String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}

	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectOptionByIndex(WebElement element, int a) {
		Select select = new Select(element);
		select.selectByIndex(a);
	}

	public void deselectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deselectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectOptionByIndex(WebElement element, int a) {
		Select select = new Select(element);
		select.deselectByIndex(a);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public List<WebElement> selectAllOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public List<WebElement> getAllOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allOptions = select.getOptions();
		return allOptions;
	}

	public WebElement getFirstSelectOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean ismultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void switchWindowByid(String id) {
		driver.switchTo().window(id);
	}

	public void switchWindowByTittle(String tittle) {
		driver.switchTo().window(tittle);
	}

	public void switchWindowByUrl(String url) {
		driver.switchTo().window(url);
	}

	public void threadSleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}

	// public void robotKeyPress() throws AWTException {
	// Robot robot = new Robot();
	// robot.keyPress();
	// }
	//
	// public void robotKeyRelease() throws AWTException {
	// Robot robot = new Robot();
	// robot.keyRelease();
	// }

	public void mouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click();
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	private void doubleClick() {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	}

	public void actionSendKeys(String value) {
		Actions actions = new Actions(driver);
		actions.sendKeys(value).perform();
	}

	public void switchFrameById(String id) {
		driver.switchTo().frame(id);
	}

	public void switchFrameByName(String name) {
		driver.switchTo().frame(name);
	}

	public void switchFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchFrameByelement(String id) {
		WebElement element = driver.findElement(By.id(id));
		driver.switchTo().frame(element);
	}

	public int frameCount(String tagName) {
		List<WebElement> elements = driver.findElements(By.tagName("tagName"));
		int size = elements.size();
		return size;
	}

	public void getAttributeUsingJs(String attributename, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttreibute(attributename)", element);
	}

	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void clickUsingJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public File takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("sample.png");
		FileUtils.copyFile(screenshotAs, file);
		return screenshotAs;
	}

	public void insertDataIncell(String sheetname, int rownum, int cellnum, String data) throws IOException {
		File file = new File("C:\\Users\\Mustafa\\eclipse-workspace\\FrameworkClass\\Excel\\AdactinHotelbooking.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public String readValueFromExcel(String sheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\Mustafa\\eclipse-workspace\\FrameworkClass\\Excel\\AdactinHotelbooking.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				java.util.Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MMM/yy");
				res = dateformat.format(dateCellValue);
			} else {
				double numericcellvalue = cell.getNumericCellValue();
				long check = Math.round(numericcellvalue);
				if (check == numericcellvalue) {
					res = String.valueOf(check);
				} else {
					res = String.valueOf(numericcellvalue);
				}
			}
		default:
			break;
		}
		return res;
	}

	public String updatethedataincell(String sheetname, int rownum, int cellnum, String data, String data1)
			throws IOException {
		File file = new File("C:\\Users\\Mustafa\\eclipse-workspace\\FrameworkClass\\Excel\\AdactinHotelbooking.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(data)) {
			cell.setCellValue(data1);
		}
		FileOutputStream stream1 = new FileOutputStream(file);
		workbook.write(stream1);
		return value;
	}
}