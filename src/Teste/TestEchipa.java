package Teste;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.*;
import clase.Angajat;
import clase.Echipa;

public class TestEchipa extends TestCase {


	Echipa echipa = new Echipa();
	
	
	public TestEchipa(String string) {
		super(string);
	}
	

	@Before
	public void setUp() throws Exception {
		
		
		
		
		echipa=new Echipa();
		
		Angajat leader=mock(Angajat.class);
		Angajat subaltern=mock(Angajat.class);
		
		when(subaltern.getCodAngajat()).thenReturn("a210593236");
	
		when(leader.getCodAngajat()).thenAnswer(new Answer<String>() {
			public String answer(InvocationOnMock invocation) throws Throwable{
				return "b150389136";
			}
		});
		echipa.setSubaltern(subaltern);
		echipa.setLeader(leader);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEchipa() {
		assertTrue(echipa.checkStatus());
		assertEquals(echipa.diferentaSalariu(), 0.0);
		
	}

	
	public static void main(String [] args){
		TestSuite suite = new TestSuite();
		suite.addTest(new TestEchipa("testEchipa"));
		
		
		TestRunner.run(suite);
	
		
	}

}
