import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for PatientHistogram.
 */
public class PatientHistogramTest
{
	
	public class NewTest {		
	    private WebDriver driver;		
		@Test				
			public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@Test
    public void Add_Histo() {
		PatientHistogram patientHistogram = new PatientHistogram();
		patientHistogram.addAPatientToRegion(1, 4);
        assertEquals(1, patientHistogram.getPatientsCountInRegion(1, 4)); //expected, actual
    }
	
	
	@Test
    public void Delete_Histo() {
		PatientHistogram patientHistogram = new PatientHistogram();
	    	patientHistogram.addAPatientToRegion(1, 4);
		patientHistogram.deleteAPatientFromRegion(1, 4);
        assertEquals(0, patientHistogram.getPatientsCountInRegion(1, 4)); //expected, actual
    }
}
