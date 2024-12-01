package com.example.design_patterns_java.CreationalPatterns.PrototypePattern.Solution;

public class GameClientWithPrototype {

   /* The Prototype Design Pattern is a creational pattern that enables the creation of new objects by copying an existing object.
   Prototype allows us to hide the complexity of making new instances from the client.
   The existing object acts as a prototype and contains the state of the object.l*/
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedBoard = gameBoard.clone();

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
