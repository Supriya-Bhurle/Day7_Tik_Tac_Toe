package com.bridgelabz;

public class tikTakToe {
    public static void main(String[] args) {
        System.out.println("Welcome to tik tak toe game");

        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}};
        printBOARD(gameBoard);
    }

    public static void printBOARD(char [][] gameBoard){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
