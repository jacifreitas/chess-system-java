package aplication;

import boardgame.BoardException;
import chess.ChassMatch;

public class Program {

	public static void main(String[] args) {
		
		try {
			ChassMatch chassmatch = new ChassMatch();
			UI.printBoard(chassmatch.getPieces());
		
			
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
