/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author kohutek
 */
public class Piece {
    
    int value;
    String name;
    char c;
    boolean white;
    
    public Piece(char c)
    {
        this.c =c;
        
        switch (c){
            
            case 'P': value=100; name = "Pawn"; white=true;break; 
            case 'p': value=100; name = "Pawn"; white=false;break;
            
            case 'B': value=300; name = "Bishop"; white=true;break;
            case 'b': value=300; name = "Bishop"; white=false;break;
                
            case 'N': value=300; name = "Knight"; white=true;break;
            case 'n': value=300; name = "Knight"; white=false;break;
                
            case 'R': value=500; name = "Rook"; white=true;break;
            case 'r': value=500; name = "Rook"; white=false;break;
                
            case 'Q': value=900; name = "Queen"; white=true;break;
            case 'q': value=900; name = "Queen"; white=false;break;
                
            case 'K': value=2000; name = "King"; white=true;break;
            case 'k': value=2000; name = "King"; white=false;break;

                
             
            
        }
            
                
    
    }
    
}

