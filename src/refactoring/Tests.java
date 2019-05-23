package refactoring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
      
	@Test
	public void testMultiplication() {
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

}