package fr.eseo.e3.poo.projet.blox.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;

import static org.junit.Assert.assertEquals;


public class CoordonneesTest {
	  @Test
	  public void testConstructeur() {
		Coordonnees c = new Coordonnees(4, 5);
		assertEquals(4 ,c.getAbscisse(), "probleme dans l'abscisse");
		assertEquals(5 ,c.getOrdonnee(), "probleme dans l'ordonnee");
	     }
	  
	  @Test
	  public void testConstructeur1() {
		Coordonnees c = new Coordonnees(-1,-3);
		Coordonnees c1= new Coordonnees(2,9);
		c1.setAbscisse(5);
		c1.setOrdonnee(8);
		assertEquals(-1 ,c.getAbscisse(), "abscisse éronné");
		assertEquals(-3,c.getOrdonnee(), "ordonnee éronné");
		assertEquals(5 ,c1.getAbscisse(), "abscisse éronné");
		assertEquals(8,c1.getOrdonnee(), "ordonnee éronné");
	     }
	  
	  
	  @Test
	  public void TestSet() {
		  Coordonnees c = new Coordonnees(5,6);
		  c.setAbscisse(4);
		  c.setOrdonnee(7);
		  assertEquals(4, c.getAbscisse());
		  assertEquals(7,c.getOrdonnee());
	  }
	  @Test
	  public void testToString() {
		  Coordonnees c = new Coordonnees(2, 6);
		  assertEquals("(2, 6)", c.toString());
	  }
	  
	  @Test
	  public void testEquals() {
		  Coordonnees c = new Coordonnees(1,7);
		  Object obj = c;
		  Coordonnees other = obj instanceof Coordonnees?(Coordonnees) obj: null;
		  assertNotNull(other);
		  assertEquals(c.getAbscisse(),other.getAbscisse());
		  assertEquals(c.getOrdonnee(), other.getOrdonnee());
		  }
	  
	  @Test
	  public void testHashCode() {
		  
		  Coordonnees c = new Coordonnees(4,5);
		  Coordonnees c1 = new Coordonnees(4,5);
		  assertEquals(true ,(c.hashCode()== c1.hashCode()));
		 
	  }
		
	  
	  @Test
	  public void testCordEquals() {
		  
		  Coordonnees c = new Coordonnees(4,5);
		  Coordonnees c1 = new Coordonnees(4,5);
		  assertEquals(true ,(c.equals(c1)));
		 assertEquals(false,c1==null);
		 assertEquals(false,(c.getAbscisse()!=c1.getAbscisse()));
		 assertEquals(false,(c.getOrdonnee()!=c1.getOrdonnee()));
	  }
	  
	}


