package demo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
  // create random instance
  static Random rand = new Random();
  public static int[] Dice = IntStream.range(1, 5).toArray();;

  // create instance for input
  static Scanner scan = new Scanner(System.in);



  public static void main(String[] args) {
    GetTurns();
  }



  private static void GetTurns(){

    // create 2 player
    // p1 = player, p2 = computer
    int p1Lives = 25;
    int p1FirePwr = 2500;

    int P1currentPlayedValue;
    int P2currentPlayedValue;

    int p2Lives = 25;
    int p2FirePwr = 2500;

    boolean ISkeypressed = false;
    System.out.println("Start Game");
    // msg for player one to start
    System.out.println("Player 1's turn :");
    char GamerStater = scan.next().charAt(0);
    // if key A is press
    if (Character.toLowerCase(GamerStater) == 'a'){
      P1currentPlayedValue = RollDice(Dice);
      System.out.println(P1currentPlayedValue);

      System.out.println("Player 2's turn :");
      P2currentPlayedValue = RollDice(Dice);
      System.out.println(P2currentPlayedValue);
    }

  }



  private static int RollDice(int[] diceRange){
    int result = rand.nextInt(diceRange.length);
    return result;
  }


}