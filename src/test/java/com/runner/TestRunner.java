package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login",plugin= {"json:target\\index.json"},dryRun=false,features="src\\test\\resources\\Feature\\Tc1_login.feature",glue="com.stepdefinition")
public class TestRunner {
	@Test
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJVMReport("C:\\Users\\EMPULSE\\eclipse-workspace\\LoginModule\\target\\index.json");

	}
}
