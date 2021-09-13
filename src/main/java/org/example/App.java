package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner uInput = new Scanner(System.in);
        System.out.println( "Enter the password" );
        String Password = uInput.nextLine();
        if(Password.equals("12345!A") == true){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I Don't know you.");
        }
    }
}
