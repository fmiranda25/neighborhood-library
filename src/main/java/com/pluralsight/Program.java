package com.pluralsight;
import java.util.Scanner;


public class Program {
    static Scanner input = new Scanner(System.in);
    static Book[] books = new Book[20];//      <-- why this works (probably the static)

    public static void main(String[] args) {


        //Book[] books = new Book[20];      <-- revisit to know why this gave issues
        books[0] = new Book(303, "9780156030304", "Flowers for Algernon", true, "Daniel Keyes");
        books[1] = new Book(973, "9780743297318", "Look Homeward, Angel", true, "Thomas Wolfe");
        books[2] = new Book(299, "9780545229937", "The Hunger Games, Book One", true, "Suzanne Collins");
        books[3] = new Book(273, "9780316327336", "Twilight", false, "Stephenie Meyer");
        books[4] = new Book(150, "9780062315007", "The Alchemist", false, "Paulo Coelho");

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

    // would keep receiving that every array element is null
    public static int displayFirstPage() {//                            <--- changed type to int to test break statement, should revert to void
        System.out.println("Here are all of the available books.");
        System.out.println("");
        for (int index = 0; index <= books.length - 1; index++) {
            if (books[index] != null) {
                books[index].showAvailableBooks();
            }
        }
        System.out.println("");
        System.out.println("Press [C] to select a book to check out.");
        System.out.println("Press [X] to go back.");
        String command2 = input.nextLine();
        if (command2.equals("c") || command2.equals("C")) {
            // code for checking out goes here
            System.out.print("Please enter your first and last name: ");
            String nameInput = input.next();
        } else if (command2.equals("x") || command2.equals("X")) {
            System.out.println("Thanks for stopping by!");
        }
        return 0;
    }

    public static void displaySecondPage() {
        System.out.println("Here are all the books that are currently checked out.");
        //display ID, ISBN, Title, Name of Person with book

    }
    public static void quitProgram() {

    }
}


/*

        System.out.println("Press [C] to check out a book. Press [X] to return to home screen.");
String proceed1 = input.nextLine();
        if (proceed1.equals("c") || proceed1.equals("C")) {
        System.out.println("Please select a book by entering it's number in the list.");
            System.out.println("// List goes here");
int bookNumberInList = input.nextInt();
            for(Book book : books) {
        if ( book index number goes herebookNumberInList == 1) {
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




*/
















