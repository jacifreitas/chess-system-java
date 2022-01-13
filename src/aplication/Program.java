package aplication;

import chess.ChassMatch;

public class Program {

	public static void main(String[] args) {
		
		ChassMatch chassmatch = new ChassMatch();
		UI.printBoard(chassmatch.getPieces());
	
	}

}
