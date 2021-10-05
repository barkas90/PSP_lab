package com.my.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import tests.EmailValidator;
import tests.NewTests;
import tests.PasswordChecker;
import tests.PhoneValidator;

class ValidatorTest {
	
	PasswordChecker passwordChecker = new PasswordChecker();
	PhoneValidator phoneValidator = new PhoneValidator();
	EmailValidator emailValidator = new EmailValidator();
	NewTests newTests = new NewTests();
	
	//tests for password
	
	@Test
	public void passwordChecker_TestPasswordLength()
	{
		assertTrue(passwordChecker.isOfCorrectLength("slapTazoDis123_"));
		
	}
	
	@Test
    void passwordChecker_TestUppercaseSymbols()
    {
    	assertTrue(passwordChecker.containsUppercaseSymbols("slapTazoDis123_"));
    }
    
	@Test
    void passwordChecker_TestSpecialSymbols()
    {
    	assertTrue(passwordChecker.containsSpecialSymbols("slapTazoDis123_"));
    }
    
    
    //tests for phone
	
	@Test
    void phoneValidator_TestPhoneNumberDigits()
    {
    	assertTrue(phoneValidator.containsOnlyDigits("861234567"));
    }

	@Test
    void phoneValidator_TestPhoneNumberPrefix()
    {
    	assertEquals("+37061234567", phoneValidator.addCountryPrefix("861234567"));
    }
    
	@Test
    void phoneValidator_TestCountriesPhoneNumber()
    {
    	assertTrue(phoneValidator.isValidForCountry("+370","+37061234567"));
    }
    
    //tests for email 
	
	@Test
    void emailValidator_TestIfContainsRequiredSymbol()
    {
    	assertTrue(emailValidator.containsRequiredSymbol("pastas@gmail.com"));
    }
    
	@Test
    void emailValidator_TestIfValidSymbols() 
    {
    	assertTrue(emailValidator.isOfValidSymbols("pastas@gmail.com"));
    }
    
	@Test
    void emailValidator_TestIfCorrectDomain()
    {
    	assertTrue(emailValidator.isCorrectDomain("pastas@gmail.com"));
    }
    
    
}
