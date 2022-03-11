package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
	@Test
	public void applyDiscount()
	{
		System.out.println("Apply discount...");
	}
	
	@Parameters({"action"})
	@Test
	public void makePayment(String paymentType,ITestContext context)
	{
		if(paymentType.equals("instantPay")) 
			System.out.println("Making Instant Payment....");
		else
			System.out.println("Pay@Hotel Booking");
		
		// Booking Number/ID
		String bookingID= "abcd1234";
		System.out.println(bookingID);
		context.setAttribute("bookingID", bookingID);
	}
}
