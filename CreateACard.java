package com.company.weeks;

import java.util.Scanner;

public class CreateACard {
   public static void main(String[] args){
       //Create a Scanner
       // datatype object name :
       Scanner    scanner     = new Scanner(System.in);
       card       aceofSpades    = new card ("Ace", "Spades", 14);
       card       phoneOfBatteries = new card ("Phone","Batteries", 13);

       System.out.println(aceofSpades);
       System.out.println(phoneOfBatteries);

   }
}
