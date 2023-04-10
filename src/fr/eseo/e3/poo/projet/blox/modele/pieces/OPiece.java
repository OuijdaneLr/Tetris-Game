package fr.eseo.e3.poo.projet.blox.modele.pieces;
import java.util.List;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

	public class OPiece extends Piece{

	   	public OPiece(Coordonnees coordonnees , Couleur couleur) {
			/*this.coordonnees= coordonnees;
			this.couleur= couleur;
			*/
			super(coordonnees, couleur);
	 	     setElements(coordonnees, couleur);  
	    }
	   	
		@Override
		protected void setElements(Coordonnees coordonnees , Couleur couleur) {
			getElement().clear();
			
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee(), couleur));
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee()-1, couleur));
	           getElement().add(new Element(coordonnees.getAbscisse()+1, coordonnees.getOrdonnee()-1, couleur));
	           getElement().add(new Element(coordonnees.getAbscisse()+1, coordonnees.getOrdonnee(), couleur));}
    


		public String toString() {
	        String s= "OPiece :\n";
	       return s + super.toString();
	 }


		
		
		
	
}
