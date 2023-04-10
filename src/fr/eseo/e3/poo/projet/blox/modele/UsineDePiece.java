package fr.eseo.e3.poo.projet.blox.modele;


import fr.eseo.e3.poo.projet.blox.modele.pieces.*;


import java.util.Random;

	public class UsineDePiece {
		public static final int ALEATOIRE_COMPLET = 0;
	    public static final int ALEATOIRE_PIECE = 1;
	    public static final int CYCLIC = 2;

	    public static int mode = ALEATOIRE_PIECE;
	    //private static int cyclicIndex = 2;
	    private static final Random random = new Random();
	   // private static boolean isIpiece = false;

	    private UsineDePiece() {
	        // On ne veut pas qu'une instance de cette classe soit créée, car toutes les méthodes sont statiques
	    }

	    public static void setMode(int mode) {
	        UsineDePiece.mode = mode;
	        //cyclicIndex = 0;
	    }
	    
	    public static int getMode() {
	        return mode;
	    }
	    

	    
	    static private boolean isModeCyclic=true;
	    
	    
	    public static Piece genererPiece() {
	    	Couleur couleur = Couleur.values()[random.nextInt(Couleur.values().length)];
	    	Coordonnees coordonnees = new Coordonnees(2, 3);
	    	switch(mode) {
	    	case ALEATOIRE_COMPLET:
	    		//Random random;
	    		//random = new Random();
	    		if(random.nextBoolean())
	    			return new IPiece(new Coordonnees(2,3), couleur);
	    		else 
	    			return new OPiece(new Coordonnees(2,3), couleur);
	    		
	    	case ALEATOIRE_PIECE:
	    		//Random random2;
	    		//random2= new Random();
	    		if(random.nextBoolean())
	    			return new IPiece(coordonnees,Couleur.ORANGE);
	    		else
	    			return new OPiece(coordonnees,Couleur.ROUGE);
	    		
	    	case CYCLIC:
	    		if(isModeCyclic) {
	    			isModeCyclic=false;
	    			return new OPiece(coordonnees,Couleur.ROUGE);
	    		}
	    		else {
	    			isModeCyclic=true;
	    			return new IPiece(coordonnees,Couleur.ORANGE);
	    		}
	    		default:
	    			return null;
	    		
	    		}
	    		
	    	}
	    }
	
	
	
