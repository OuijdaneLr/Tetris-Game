package fr.eseo.e3.poo.projet.blox.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

public class ElementTest {

	@Test
	public void testConstructeur() {
		Coordonnees c= new Coordonnees(2,5);
		Element e = new Element(c);
		
		assertEquals(new Coordonnees(2,5), e.getCoordonnees(),"Error");
		assertEquals(Couleur.ROUGE, e.getCouleur(),"Error");
	}
	
	@Test
	public void testConstructeur1() {
		Element e = new Element(2,6);
		assertEquals(2, e.getCoordonnees().getAbscisse(),"Error");
		assertEquals(6, e.getCoordonnees().getOrdonnee(),"Error");
		assertEquals(Couleur.ROUGE,e.getCouleur());
	}
	@Test
	public void testConstructeur2() {
		Coordonnees c = new Coordonnees(2,3);
		Element e = new Element(c, Couleur.ROUGE);
		assertEquals(c, e.getCoordonnees(),"Error");
		assertEquals(Couleur.ROUGE, e.getCouleur(),"Error");
	}
	
	@Test
	public void testConstructeur3() {
		Element e = new Element(2,5,Couleur.ROUGE);
		assertEquals(2,e.getCoordonnees().getAbscisse(),"Error");
		assertEquals(5,e.getCoordonnees().getOrdonnee(),"Error");
		assertEquals(Couleur.ROUGE,e.getCouleur(),"Error");
		Coordonnees c = new Coordonnees(2,9);
		e.setCoordonnees(c);
		e.setCouleur(Couleur.ORANGE);
		assertEquals(c,e.getCoordonnees(),"Error");
		assertEquals(Couleur.ORANGE,e.getCouleur(),"Error");
	}
	@Test
	public void testToString() {
		Coordonnees c =new Coordonnees(2,5);
		Element e= new Element(c, Couleur.ROUGE);
		assertEquals("(2, 5) - ROUGE", e.toString(),"Error");
	}
   
	@Test
	public void testHashCode() {
		Coordonnees c1= new Coordonnees(2,4);
		Coordonnees c2 = new Coordonnees(2,4);
		Element e1= new Element(c1);
		Element e2= new Element(c2);
		assertEquals(true, e1.hashCode()== e2.hashCode(),"Error");
	}
	
	@Test
	public void testEquals(){
		Coordonnees c1= new Coordonnees(2,4);
		Coordonnees c2 = new Coordonnees(2,4);
		Element e1= new Element(c1, Couleur.ROUGE);
		Element e2= new Element(c2 , Couleur.ROUGE);
		assertEquals(true, e1.equals(e2),"Error");
		assertEquals(false, e2==null);
		assertEquals(false, e1.getClass()!=e2.getClass(),"Error");
		assertEquals(false, e1.getCoordonnees()==null && e2.getCoordonnees()!=null);
		assertEquals(false, e1.getCouleur()!= e2.getCouleur(),"Error");
	}
	
}
