package com.qaautomated.toys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.StateChangeAction;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Provider("toys")
@PactFolder("file:\\\\QAutomated")
@ExtendWith(PactVerificationInvocationContextProvider.class)
public class FirstProviderTest {
	
	@LocalServerPort
	public int port;
	
	@TestTemplate
	public static void testProvider(PactVerificationContext context) {
		context.verifyInteraction();
		
	}
	
	@BeforeEach
	public void setup(PactVerificationContext context) {
		context.setTarget(new HttpTestTarget("localhost", port));
	}
	
	// path/allToysDetails/Barbie = (Toy does not exist)
	// expected = (toys_name: "barbie", id:, price
	// insert DB barbie record in DB = setup
	// Delete record = 

@State(value = "toys details", action = StateChangeAction.SETUP)

public void toysSetup() {
	
}

public void tearDown() {
	
}
	

}
