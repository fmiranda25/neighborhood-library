package com.pluralsight;
import java.util.Scanner;


public class Program {
    static Scanner input = new Scanner(System.in);
    static Book[] books = new Book[20];

    public static void main(String[] args) {

        Book[] books = new Book[20];
        books[0] = new Book(30306, "9780156030304", "Flowers for Algernon", true, "Daniel Keyes");
        books[1] = new Book(97318, "9780743297318", "Look Homeward, Angel", true, "Thomas Wolfe");
        books[2] = new Book(29936, "9780545229937", "The Hunger Games, Book One", true, "Suzanne Collins");
        books[3] = new Book(27336, "9780316327336", "Twilight", false, "Stephenie Meyer");
        books[4] = new Book(15005, "9780062315007", "The Alchemist", false, "Paulo Coelho");

        boolean programIsRunning = true;

        while(programIsRunning) {
            System.out.print("""
                    ===========////Welcome to the CPL Online Board////===========
                    
                                     What would you like to do?
                                       1. Show Available Books
                                      2. Show Checked Out Books
                                   3. Exit - closes the application
                    
                    Enter a number: 
                    """);
            int command = input.nextInt();
            input.nextLine();

            switch(command) {
                case 1:
                    displayFirstPage();
                    break;
                case 2:
                    displaySecondPage();
                    break;
                case 3:
                    quitProgram();
                    break;
            }





        }

    }
    public static void displayFirstPage() {
        System.out.println("Here are all of the available books.");
        System.out.println("// Book array code goes here");
        System.out.println("Press [C] to check out a book. Press [X] to return to home screen.");
        String proceed1 = input.nextLine();
        if (proceed1.equals("c") || proceed1.equals("C")) {
            System.out.println("Please select a book by entering it's number in the list.");
            System.out.println("// List goes here");
            int bookNumberInList = input.nextInt();
            for(Book book : books) {
                if (/* book index number goes here*/) {
                    // print out "You have chosen X book
                    System.out.println("Please enter your first and last name.");
                    // code for formatting full name into proper capitalization
                    // code for removing individual book index from array
                }
            }

        }

        //display ID, ISBN, Title
        //prompt user to either select book to check out, or exit to go back to home screen
        //if user selects book, prompt for name
        //check book out of system

        //go back to home screen
    }
    public static void displaySecondPage() {
        System.out.println("Here are all the books that are currently checked out.");
        //display ID, ISBN, Title, Name of Person with book

    }
    public static void quitProgram() {

    }
}
