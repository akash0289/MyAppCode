package com.mashvirtual.app.IeltsStarMobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class IeltsStarTest extends Base {
	
	@Test
	public void allTestCases() throws IOException
	{
		AndroidDriver<AndroidElement> driver=capabilities("IeltsStar");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow all the time']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Enter Email ID']").sendKeys("akash.mv@outlook.com");
		driver.findElementByXPath("//android.widget.EditText[@text='PROCEED']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Enter Password']").sendKeys("test123");
		driver.findElementByXPath("//android.widget.EditText[@text='OK']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Later']").click();
		driver.findElementById("com.mashvirtual.letscare:id/imageViewCart").click();
		driver.findElementByXPath("//android.widget.EditText[@text='175']").click();
		driver.findElementById("com.mashvirtual.letscare:id/check_box").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		
		
		
		
		
	}

}
