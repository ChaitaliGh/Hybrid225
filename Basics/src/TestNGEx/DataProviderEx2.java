package TestNGEx;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderEx2 {
	

	@Test(dataProvider="dp")
	
	//Below we have used variable argument concept of java where we have passed object variable as argument ,
	// to method so that we can pass multiple argument with different datatype to the object in dataProvider.
	// If we pass integer and string to method below but provides different datatype values in dataprovider 
	//then it will not give us correct output so we used object variable here
	public void f(Object ...a) {
		for(Object object:a) {
			System.out.println(object);
		}
		
		}
	
	@DataProvider
	public Object[][] dp(){
		return new Object[][]{
			new Object[] {1,"a"},
			new Object[] {2,"b",5.5},
			new Object[] {3,"c","Jbk"},
		};
		
	}



}
