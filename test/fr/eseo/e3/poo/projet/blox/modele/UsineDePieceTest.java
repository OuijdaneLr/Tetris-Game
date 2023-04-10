

package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.OPiece;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class UsineDePieceTest {

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Invoked once before all tests");
	}
	
    @Test
    public void testGenererPieceAleatoireComplet() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_COMPLET);
        Piece piece = UsineDePiece.genererPiece();
        assertNotNull(piece);
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }

    @Test
    public void testGenererPieceAleatoirePiece() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_PIECE);
        Piece piece = UsineDePiece.genererPiece();
        assertNotNull(piece);
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }

    @Test
    public void testGenererPieceCyclique() {
        UsineDePiece.setMode(UsineDePiece.CYCLIC);
        Piece piece = UsineDePiece.genererPiece();
       //assertTrue(piece instanceof OPiece);
       //assertNotEquals("IPiece :\n\t(2, 3) - ORANGE\n\t(2, 4) - ORANGE\n\t(2, 2) - ORANGE\n\t(2, 1) - ORANGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
       // assertTrue(piece instanceof IPiece);
       //assertNotEquals( "OPiece :\n\t(2, 3) - ROUGE\n\t(3, 3) - ROUGE\n\t(2, 2) - ROUGE\n\t(3, 2) - ROUGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
        //assertNotNull(piece);
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }
}

//package fr.eseo.e3.poo.projet.blox.modele;
//
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.Test;
//
//public class UsineDePieceTest {
//    @Test
//      public void testModeAleatoireComplet() {
//	         UsineDePiece.setMode(0);
//            assertNotEquals( "OPiece :\n\t(2, 3) - ROUGE\n\t(3, 3) - ROUGE\n\t(2, 2) - ROUGE\n\t(3, 2) - ROUGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//            assertNotEquals("IPiece :\n\t(2, 3) - ORANGE\n\t(2, 4) - ORANGE\n\t(2, 2) - ORANGE\n\t(2, 1) - ORANGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//            }
//
// @Test
//     public void testModeAleatoirePiece() {
//       UsineDePiece.setMode(1);
//       assertNotEquals( "OPiece :\n\t(2, 3) - ROUGE\n\t(3, 3) - ROUGE\n\t(2, 2) - ROUGE\n\t(3, 2) - ROUGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//       assertNotEquals("IPiece :\n\t(2, 3) - ORANGE\n\t(2, 4) - ORANGE\n\t(2, 2) - ORANGE\n\t(2, 1) - ORANGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//       }
//
//     @Test
//    public void testModeCyclique() {
//      UsineDePiece.setMode(2);
//      assertEquals( "OPiece :\n\t(2, 3) - ROUGE\n\t(2, 2) - ROUGE\n\t(3, 2) - ROUGE\n\t(3, 3) - ROUGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//      assertEquals("IPiece :\n\t(2, 3) - ORANGE\n\t(2, 2) - ORANGE\n\t(2, 1) - ORANGE\n\t(2, 4) - ORANGE\n",UsineDePiece.genererPiece().toString(),"Erreur");
//     }
//}
//
