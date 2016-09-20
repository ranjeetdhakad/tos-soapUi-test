package com.tos.test;
//package com.wstest;

//import junit.framework.TestCase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.StandaloneSoapUICore;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepResult;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestAssertion;
import com.eviware.soapui.model.testsuite.TestCaseRunContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunContext;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.support.SoapUIException;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TosTest {
	@Test
	public void testSoapUiTestSuit() {
		try {
			
			final Logger logger = Logger.getLogger(TosTest.class);
			BasicConfigurator.configure();
			String suiteName = "";
			String reportStr = "";
			
			// variables for getting duration
			long startTime = 0;
			long duration = 0;

			SoapUITestCaseRunner runner = new SoapUITestCaseRunner();;
			
			// SoapUITestCaseRunner runner1 = new SoapUITestCaseRunner();
			runner.setProjectFile("C:/MDM/TOS/Kesko-TOS-soapui-project.xml");
	        runner.setJUnitReport(true);
	        runner.setOutputFolder("C:/MDM/TOS/TOSTEST_RESULT/");
	        runner.setTestSuite("TestSuite for TOS POS");
	        runner.setTestCase("TestJavaCode");
	        runner.setTestStepCount(1);
	        runner.setIgnoreErrors(true);
	   //     runner.setTestCase("Get Propostion Error Scenario");
	        WsdlProject project = new WsdlProject("C:/MDM/TOS/Kesko-TOS-soapui-project.xml");
	        List<TestSuite> suiteList = new ArrayList<TestSuite>();
			List<TestCase> caseList = new ArrayList<TestCase>();
	       // project.s
	    //    suiteList = project.getTestSuiteList("HelloTestCase1");
	      //  WsdlTestStep testStep ="Get Propostions";
	       // TestAssertion assertion = ((HttpTestRequestStep)testStep).addAssertion("Contains");
	        /*ArrayList assertionList=(ArrayList)runner.getAssertions();
	        assertionList.get(0);
	        System.out.println("assertion: "+assertionList.get(0)); */
	        TestCaseRunner testRunner=null;
	        TestCaseRunContext runContext=null;
	   //     testRunner.getTestCase();
	       // runContext.setProperty("", Object o1);
	  //      runner.beforeRun(testRunner, runContext);
	    //    String testcases=runner.getTestCase(); 
	      //  System.out.println(testcases);
	     //   runner.afterRun(TestCaseRunner testRunner, TestRunContext runContext);
				runner.run();
				
				//runner.afterRun(testRunner, runContext);;
				//String assertion=(String)list.get(0);
				 	/*			System.out.println("after run");
				 				
				HashMap<TestAssertion,WsdlTestStepResult> resultMap=(HashMap) runner.getAssertionResults();
					
					for (TestAssertion key : resultMap.keySet()) {
						   System.out.println("------------------------------------------------");
						   System.out.println("Iterating or looping map using java5 foreach loop");
						  
						   WsdlTestStepResult wsdlTestStepResult=resultMap.get(key);
						   wsdlTestStepResult.getError();
						   wsdlTestStepResult.getActions();
						   System.out.println("wsdlTestStepResult "+wsdlTestStepResult.getActions());
						   System.out.println("assertion error: "+key.getErrors());
						   com.eviware.soapui.model.testsuite.AssertionError[] e1=key.getErrors();
						   
						   for(com.eviware.soapui.model.testsuite.AssertionError e:e1)
						   {
							   System.out.println("get Mesage: "+e.getMessage());
							   System.out.println("get xmlError: "+e.getXmlError());
						   }
						   System.out.println("key: " + key.getStatus() + "  value: " + resultMap.get(key)); 
						   
						}
			*/
				
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SoapUIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// assertEquals( Status.FINISHED, runner.getStatus() );
	}

}
