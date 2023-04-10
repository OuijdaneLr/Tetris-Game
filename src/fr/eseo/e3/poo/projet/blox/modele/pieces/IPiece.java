package fr.eseo.e3.poo.projet.blox.modele.pieces;


	import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

	public class IPiece extends Piece{

	   	public IPiece(Coordonnees coordonnees , Couleur couleur) {
			 
			super(coordonnees, couleur);
	 	     setElements(coordonnees, couleur);  
	    }
	   	
		@Override
		protected void setElements(Coordonnees coordonnees , Couleur couleur) {
			
			
			getElement().clear();
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee(), couleur));
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee()-1, couleur));
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee()-2, couleur));
	           getElement().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee()+1, couleur));
	}

			
	
	     
	
	       


		public String toString() {
	        String s= "IPiece :\n";
	       return s + super.toString();
	 }


}
		
		
	

