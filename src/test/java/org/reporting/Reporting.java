package org.reporting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	 @Test
     public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException {
		File f=new File("C:\\Users\\EMPULSE\\eclipse-workspace\\LoginModule\\target");
		Configuration configuration=new Configuration(f, "eMsalesAutomation");
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder r=new ReportBuilder(jsonFiles,configuration);
		r.generateReports();
	 }
}
