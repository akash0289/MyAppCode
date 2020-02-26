package com.mashvirtual.app.IeltsStarMobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class IeltsStarTest extends Base {
	
	@Test
	public void allTestCases() throws IOException, InterruptedException
	{
		//for start server
		
		service=startServer();
		
		AndroidDriver<AndroidElement> driver=capabilities("IeltsStar");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow all the time']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Enter Email ID']").sendKeys("akash.mv@outlook.com");
		driver.findElementByXPath("//android.widget.TextView[@text='PROCEED']").click();
		//driver.findElementByXPath("//android.widget.EditText[@text='Enter Password']").sendKeys("test123");
		driver.findElementById("com.mashvirtual.letscare:id/ed_password").sendKeys("test123");
		driver.findElementByXPath("//android.widget.TextView[@text='LOGIN']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Later']").click();
		driver.findElementById("com.mashvirtual.letscare:id/imageViewCart").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='175']").click();
		//driver.findElementById("com.mashvirtual.letscare:id/tv_feedback_price").click();
		driver.findElementById("com.mashvirtual.letscare:id/check_box").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		driver.findElementById("com.mashvirtual.letscare:id/textViewBuyTraining").click();
		driver.findElementById("com.mashvirtual.letscare:id/radio_button_first").click();
		driver.findElementById("com.mashvirtual.letscare:id/textViewProceed").click();
		Thread.sleep(4000);
		//driver.findElementByXPath("//android.widget.TextView[@text='PAY NOW']").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Listening']").click();
		driver.findElementById("com.mashvirtual.letscare:id/imag_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Speaking']").click();
		driver.findElementById("com.mashvirtual.letscare:id/img_back_button").click();
		driver.findElementById("com.mashvirtual.letscare:id/tvplacmentunatmptContent").click();
		driver.findElementById("com.mashvirtual.letscare:id/textViewLetsGo").click();
		driver.findElementById("com.mashvirtual.letscare:id/ivPauseButton").click();
		driver.findElementById("com.mashvirtual.letscare:id/tvExit").click();
		driver.findElementById("com.mashvirtual.letscare:id/tvOk").click();
		
		
		service.stop();
		
		
	}

	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
		//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(4000);
	}
}
