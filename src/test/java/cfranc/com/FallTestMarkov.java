package cfranc.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FallTestMarkov {
	
	//Teste mon fichier créé
	@Test
	public void testSenghor() {
		Markov m = new Markov();
		m.readFile("senghor.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 10);
		assertNotNull(res);
		
	}
	
	//Teste fichier vide
	@Test	 
	public void EmptygenerateText() {
		Markov m = new Markov();
		m.readFile("senghor.txt");
		int empty = m.couples.size();
		assertEquals(0, empty);
	}

	//Teste de la fonction generate
	@Test
	public void testGenerateText() {
		Couple c = new Couple("Femme", "Noir");
		Markov m = new Markov();
		m.couples.put(c, null);
		String res  = m.generateText(c, 2);
		assertNotNull(res);
		System.out.println(res);
	}
	
	//Teste de la fonction hashCode
	@Test
	public void testhashCode() {
		Couple c = new Couple("Informatique", "Electronique");
		Markov m = new Markov();
		m.couples.put(c, null);
		//appel fonction hashCode()
		int res = m.hashCode();
		assertNotNull(res);
		System.out.println(res);
	}
	
	//Test de la fonction hashCodeEclipse en utilisant un fichier
	@Test 
	public void testHashCodeEclipse() {
		Markov m = new Markov();
		m.readFile("senghor.txt");
		Couple c = Markov.randomElement(m.couples.keySet());
		m.couples.put(c, null);
		//appel fonction hashCodeEclipse
		int res = c.hashCodeEclipse();
		assertNotNull(res);
		System.out.println(res);
		
	}
	
	//teste de la fonction equals
	@Test
	public void equals() {
		
	}
	
}
