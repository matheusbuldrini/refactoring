package refactoring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
      
	@Test
	public void testStatement() {
		   Movie vingadores = new Movie("Vingadores Ultimato", Movie.NEW_RELEASE);
		   Movie chiquititas = new Movie("Chiquititas", Movie.CHILDRENS);
		   
		   Rental aluguel1 = new Rental(vingadores, 3);
		   Rental aluguel2 = new Rental(chiquititas, 7);
		   
		   Customer cliente = new Customer("Manolo");
		   cliente.addRental(aluguel1);
		   cliente.addRental(aluguel2);
		   
		   assertEquals("Rental Record for Manolo\n" + 
		   		"	Vingadores Ultimato	9.0\n" + 
		   		"	Chiquititas	7.5\n" + 
		   		"Amount owed is 16.5\n" + 
		   		"You earned 3 frequent renter points", cliente.statement());
	}
	
	@Test
	public void testHtmlStatement() {
		   Movie vingadores = new Movie("Vingadores Ultimato", Movie.NEW_RELEASE);
		   Movie chiquititas = new Movie("Chiquititas", Movie.CHILDRENS);
		   
		   Rental aluguel1 = new Rental(vingadores, 3);
		   Rental aluguel2 = new Rental(chiquititas, 7);
		   
		   Customer cliente = new Customer("Manolo");
		   cliente.addRental(aluguel1);
		   cliente.addRental(aluguel2);
		   
		   assertEquals("<H1>Rentals for <EM>Manolo</EM></H1><P>\n" + 
		   		"Vingadores Ultimato: 9.0<BR>\n" + 
		   		"Chiquititas: 7.5<BR>\n" + 
		   		"<P>You owe <EM>16.5</EM><P>\n" + 
		   		"On this rental you earned <EM>3</EM> frequent renter points<P>", cliente.htmlStatement());
	}

}