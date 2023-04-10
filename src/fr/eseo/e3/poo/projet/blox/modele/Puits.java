package fr.eseo.e3.poo.projet.blox.modele;


	import java.beans.PropertyChangeListener;
    import java.beans.PropertyChangeSupport;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

	public class Puits {
	  public static final int LARGEUR_PAR_DEFAUT =6;
	   public static final int PROFONDEUR_PAR_DEFAUT= 17;
	   
	   
	   private int largeur;
	   private int profondeur;
	   private Piece pieceActuelle;
	   private Piece pieceSuivante;
	   
	   
	   private  PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	 

	   
   public static final String MODIFICATION_PIECE_ACTUELLE = "pieceActuelle";
   public static final String MODIFICATION_PIECE_SUIVANTE = "pieceSuivante";
	    
	   public Puits(){
		   this.largeur =LARGEUR_PAR_DEFAUT;
		  this.profondeur=PROFONDEUR_PAR_DEFAUT;
		

		  
	   }
	   
	   public Puits(int largeur, int profondeur){
		   if((largeur < 5) || (largeur > 15) || (profondeur < 15) || (profondeur > 25)) {
			   throw new IllegalArgumentException("Error");
		   }
		   else {
		   this.largeur=largeur;
		   this.profondeur=profondeur;
		   }
		

	   }
	   
	   
	     public int getLargeur() {
		   return largeur;
	     }
	     
	     public void setLargeur(int largeur) {
		  if((largeur < 5) | (largeur > 15)) {
			  throw new IllegalArgumentException("Error");
		  }else {
		  this.largeur=largeur;
		  }
		  
	    }
	     
	     public int getProfondeur() {
		   return profondeur;
	      }
	     
	    public void setProfondeur(int profondeur) {
	    	if((profondeur < 15) || (profondeur > 25)) {
	 		   throw new IllegalArgumentException("Error");
	 	   }else {
	 	   this.profondeur=profondeur;
	 	   }
	    }

		public Piece getPieceActuelle() {
			return pieceActuelle;
		}



		public Piece getPieceSuivante() {
			return pieceSuivante;
		}

		public void setPieceSuivante(Piece piece) {
			Piece oldPieceActuelle = this.pieceActuelle;
			if(pieceSuivante!= null) {
				pieceActuelle= pieceSuivante;
				
				pieceActuelle.setPosition(this.largeur/2, -4);
			}
			pieceSuivante= piece;
			
			this.pcs.firePropertyChange(MODIFICATION_PIECE_ACTUELLE, oldPieceActuelle, pieceActuelle);
	        this.pcs.firePropertyChange(MODIFICATION_PIECE_SUIVANTE, null, pieceSuivante);
		}
	   
		public  String toString() {
			  String s= "Puits : Dimension "+this.largeur+" x "+this.profondeur+"\nPiece Actuelle : ";
		       if(this.pieceActuelle == null){
				  s=s+"<aucune>\n";
			  }else {
				  s=s+this.pieceActuelle.toString();
			  }
			  s=s+"Piece Suivante : ";
			  if(this.pieceSuivante == null) {
				  s=s+"<aucune>\n";
			  }else {
				  s=s+this.pieceSuivante.toString();
			  }
			  return s;
		 }
			

	   
		public void addPropertyChangeListener(PropertyChangeListener listener) {
		    pcs.addPropertyChangeListener(listener);
		}

		public void removePropertyChangeListener(PropertyChangeListener listener) {
		    pcs.removePropertyChangeListener(listener);
		}

	   
	
}
