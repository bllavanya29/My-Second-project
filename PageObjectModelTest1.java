package com.TestNGDemo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelTest1 {
	
	WebDriver driver;
	
	//constructors
	
	PageObjectModelTest1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement name;
	@FindBy(xpath="//input[@placeholder='Password']")  WebElement pwd;
	@FindBy(css="button[type='submit']") WebElement Login;
	
	//Methods	
	public void username(String un) {
		   name.sendKeys(un);
	}
	
	public void password(String pass) {
		pwd.sendKeys("pass");
	}
	
	public void Loginbutton() {
		Login.click();
	}

}
