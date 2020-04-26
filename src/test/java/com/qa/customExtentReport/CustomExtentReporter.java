package com.qa.customExtentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;

public class CustomExtentReporter {

	private ExtentHtmlReporter extentHtmlReporter;
	private ExtentReports extentReports;
	private static WebDriver wdDriver;

	public CustomExtentReporter(String reportLocation) {

		extentHtmlReporter = new ExtentHtmlReporter(new File(reportLocation));
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
	}

	public void createTest(Scenario scenario, String screenshotFile) throws IOException {
		if (scenario != null) {
			String testName = getScenarioTitle(scenario);
			switch (scenario.getStatus()) {
			case PASSED:
				extentReports.createTest(testName).pass("Passed");
				break;

			case FAILED:
				extentReports.createTest(testName).fail("Failed")
						.addScreenCaptureFromPath(getScreenshotLocation(screenshotFile));
				break;

			default:
				extentReports.createTest(testName).skip("Skipped");
			}
		}

	}
	
	public void writeToReport() {
		if(extentReports!=null) {
			extentReports.flush();
		}
	}

	private String getScreenshotLocation(String location) {
		return "file:///" + location.replaceAll("\\", "//");
	}

	private String getScenarioTitle(Scenario scenario) {
		return scenario.getName().replaceAll(" ", "");
	}
	
	public String takeScreenshot(String aPath) {
		File screenshot = ((TakesScreenshot)wdDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(aPath));
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
		return aPath;
	}
}
