package com.pluralsight;
import java.util.Scanner;


public class Program {
    static Scanner input = new Scanner(System.in);
    static Book[] books = new Book[20];//      <-- why this works (probably the static)
    //static Book book = new Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo);

    public static void main(String[] args) {


        //Book[] books = new Book[20];      <-- revisit to know why this gave issues
        books[0] = new Book(303, "9780156030304", "Flowers for Algernon", true, "Daniel Keyes"); // 303
        books[1] = new Book(973, "9780743297318", "Look Homeward, Angel", true, "Thomas Wolfe"); // 973
        books[2] = new Book(299, "9780545229937", "The Hunger Games, Book One", true, "Suzanne Collins"); // 299
        books[3] = new Book(273, "9780316327336", "Twilight", false, "Stephenie Meyer"); // 273
        books[4] = new Book(150, "9780062315007", "The Alchemist", false, "Paulo Coelho"); // 150

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

            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();

            if (firstName.isEmpty()) {
                System.out.print("First name: ");
                firstName = input.nextLine();
            } else {
                firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            }

            if (lastName.isEmpty()) {
                System.out.print("Last name: ");
                lastName = input.nextLine();
            } else {
                lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
            }
            //System.out.printf("%s %s", firstName, lastName);
            //System.out.println("");
            System.out.println("Select the book that you would like!");
            int bookIdSelection = input.nextInt();
            for (Book book : books) {
                if (bookIdSelection == book.getId()) {
                    System.out.println(book.getCheckedOutTo());
                }
            }
            // method to check out a book goes here

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
    public static void checkOutBook() {

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

















//                                       comment about what I noticed can be routed into and out of the methods so far























