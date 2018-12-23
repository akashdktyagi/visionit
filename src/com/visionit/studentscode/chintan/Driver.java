import org.testng.TestListenerAdapter;

import com.beust.testng.TestNG;

import testng_CS_cart.tc_megamenu;
import testng_CS_cart.tc_paymentgatway;
import testng_CS_cart.tc_signin;
import testng_CS_cart.testng_register;

public class Driver {

	public static void main(String[] args) {
		TestListenerAdapter tla=new TestListenerAdapter();
		TestNG testng=new TestNG();
		testng.setTestClasses(new Class[] {tc_signin.class});
		testng.setTestClasses(new Class[] {tc_paymentgatway.class});
		testng.setTestClasses(new Class[] {tc_megamenu.class});
		testng.addListener(tla);
		testng.run();
	}

}
