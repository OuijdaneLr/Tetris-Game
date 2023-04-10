package fr.eseo.e3.poo.projet.blox.modele.pieces;


	import java.util.ArrayList;
	import java.util.List;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;
import fr.eseo.e3.poo.projet.blox.modele.Puits;


	public  abstract class Piece {
		private List<Element> elements;
		 private Coordonnees coordonnees;
	     private Couleur couleur= Couleur.BLEU;
	     
	     
	     private Puits puits;
	     
	     public Puits getPuits() {
	    	 return this.puits;
	     }
	     
	     public void setPuits(Puits puits) {
	    	 this.puits= puits;
	     }
	     
	     
		 public List<Element> getElement() {
			return elements;
		}

		public Piece(Coordonnees coordonnees , Couleur couleur) {
			this.coordonnees=coordonnees;
			this.couleur= couleur;
			this.elements=new ArrayList<Element>();
			setPosition(coordonnees.getAbscisse(), coordonnees.getOrdonnee());
		}
		public Couleur getCouleur() {
			return couleur;
		}
	    public void setCouleur(Couleur couleur) {
	    	this.couleur= couleur;
	    }
		

		protected abstract void setElements(Coordonnees coordonnees , Couleur couleur);

		public Coordonnees getCoordonnees() {
			return coordonnees;
		}

		public List<Element> getElements() {
			return elements;
		}

		
		public void setPosition(int abscisse, int ordonnee) {

//			coordonnees.setAbscisse(abscisse);
//			coordonnees.setOrdonnee(ordonnee);
			setElements(new Coordonnees(abscisse,ordonnee), Couleur.ROUGE);
		}
		
		public String toString() {
			String s="";
			for(int i=0;i<getElements().size();i++) {
				s=s+ "\t"+getElements().get(i).toString()+"\n";
			}
			return s;
		}

	
}
