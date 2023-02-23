/*
 * package com.Facebook.Pageobjects;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import com.Facebook.Base.Baseclass;
 * 
 * public class OranangeHrmLeaveapage extends Baseclass {
 * 
 * 
 * public OranangeHrmLeaveapage() { PageFactory.initElements(driver,this); }
 * 
 * 
 * @FindBy(xpath="//a[contains(text(),'Apply')]") WebElement clickonapplylink;
 * 
 * @FindBy(
 * xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
 * WebElement clickondropdwnarrow;
 * 
 * @FindBy(xpath="//span[text()='Leave']/parent::a") WebElement
 * clickonleavelink;
 * 
 * @FindBy(xpath="//div[text()='CAN - Bereavement']") WebElement selectoption;
 * 
 * @FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]") WebElement
 * SelectFromDate;
 * 
 * public void clickapplylink() { clickonapplylink.click(); try {
 * Thread.sleep(6000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } }
 * 
 * 
 * public void clickdropdownbutton() {
 * 
 * try { Actions ac= new Actions(); ac.moveToElement(SelectFromDate)
 * Thread.sleep(6000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } }
 * 
 * 
 * public void linkleave() {try {
 * System.out.println("inside link leave method"); clickonleavelink.click();
 * Thread.sleep(6000); } catch (Exception e) { e.printStackTrace(); }
 * 
 * }
 * 
 * public void selectdropdwnoption(String val) { try { selectoption.click();
 * Thread.sleep(6000); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * public void FromDate(String Date) { try { Select s = new
 * Select(SelectFromDate); s.selectByIndex(1);
 * System.out.println("the value is selected"); Thread.sleep(6000); } catch
 * (Exception e) { // TODO: handle exception } }
 * 
 * 
 * 
 * }
 */