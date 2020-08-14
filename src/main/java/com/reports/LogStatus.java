package com.reports;

import com.main.DriverFactory;
import com.utilities.TestUtils;

public class LogStatus {

	private LogStatus() {
		//private to avoid initialization
	}
	public static void pass(String message)
	{
		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.PASS, message);
	}

	public static void fail(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, message);
	}

	public static void fail(Exception message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, message);
	}

	public static void fail(AssertionError a)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.PASS, a);
	}

	public static void info(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.INFO, message);
	}

	public static void error(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.ERROR, message);
	}

	public static void fatal(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FATAL, message);
	}

	public static void skip(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, message);
	}

	public static void unknown(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.UNKNOWN, message);
	}

	public static void warning(String message)
	{

		ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.WARNING, message);
	}
	public static void pass(String string, String addScreenCapture) {

		if(DriverFactory.getPassedStepsScreenshots().equalsIgnoreCase("yes")) {
			ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.PASS, string,ExtentFactory.getExtTest().addBase64ScreenShot("data:image/png;base64,"+TestUtils.getBase64Image(addScreenCapture)));
			//ExtentReport.logger.log(com.relevantcodes.extentreports.LogStatus.PASS, string,ExtentReport.logger.addBase64ScreenShot("data:image/png;base64,"+TestUtils.getBase64Image(addScreenCapture)));
			//	ExtentReport.logger.log(com.relevantcodes.extentreports.LogStatus.PASS, string , ExtentReport.logger.addScreenCapture(addScreenCapture));
		}
	}

	public static void fail(String string, String addScreenCapture)
	{

		if(DriverFactory.getFailedStepsScreenshots().equalsIgnoreCase("yes")) {
			ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, string,ExtentFactory.getExtTest().addBase64ScreenShot("data:image/png;base64,"+TestUtils.getBase64Image(addScreenCapture)));
			//	ExtentReport.logger.log(com.relevantcodes.extentreports.LogStatus.PASS, string , ExtentReport.logger.addScreenCapture(addScreenCapture));
		}

	}

	public static void skip(String string, String addScreenCapture)
	{
		if(DriverFactory.getSkippedStepScreenshots().equalsIgnoreCase("yes")) {
			ExtentFactory.getExtTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, string,ExtentFactory.getExtTest().addBase64ScreenShot("data:image/png;base64,"+TestUtils.getBase64Image(addScreenCapture)));
				//	ExtentReport.logger.log(com.relevantcodes.extentreports.LogStatus.SKIP, string, ExtentReport.logger.addScreenCapture(addScreenCapture));
		}

	}
}
