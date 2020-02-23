package Com.Facebook.Training;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import Common.Browser;


public class App extends Browser implements ITestListener
{
    @Override
	public void onTestSuccess(ITestResult result) {
    	try {
    		screenshots("/Users/NooN/eclipse-workspace/Training/Screenshots/Pass/");
    	} catch(IOException e) {
    		e.printStackTrace();
    		
    	}
    }
    @Override
    public void onTestFailure(ITestResult result) {
    	try {
    		screenshots("/Users/NooN/eclipse-workspace/Training/Screenshots/Failure/");
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
	
}
