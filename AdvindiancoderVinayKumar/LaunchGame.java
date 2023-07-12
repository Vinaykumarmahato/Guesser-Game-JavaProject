package com.AdvindiancoderVinayKumar;

import java.util.Scanner;
class Guesser
{
    int guessNum;
    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Guesser kindly guess the number = ");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Player! kindly guess the number = ");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Umpire
{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();
    }


    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();


        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
    }

    void compare()
    {

        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("Game tied all three players guessed correctly");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player2 won the game");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 and Player3 won ");
            }
            else
            {

                System.out.println("Player 1 won the game");
            }
        }

        else if(numFromGuesser==numFromPlayer2)
        {

            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player3 won the game");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        }
        else
        {
            System.out.println("Game lost! try again");
        }
    }

}
public class LaunchGame
{
    public static void main(String[] args)
    {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}