import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Library lb = new Library();
        int choice = 0;

        do{
            try{
                System.out.println("Enter (1) to add a book, (2) to look up a book: or -1 to exit: ");
                choice = input.nextInt();
                input.nextLine();
        
                switch(choice)
                {
                    case 1:
                        addBookToLibrary(input, lb);
                        break;
                    case 2:
                        lookUpBookFromLibrary(input, lb);
                        break;
                    case -1:
                        System.out.print("Exiting Program");
                        break;
                    default:
                        System.out.println("Invalid number please try again");
                        break;
                }
            }catch (Exception e){
                System.out.print("Invalid entry please try again");
            }
        }while(choice != -1);

         
        input.close();
    }

    public static void addBookToLibrary(Scanner input, Library lb)
    {
        String titleOfBook;
        String genreOfBook;
        int numberOfPages;
        
        try
        {
            System.out.println("Please enter the title of the book:");
                titleOfBook = input.nextLine();
                System.out.println("Please enter the genre of the book:");
                genreOfBook = input.nextLine();
                System.out.println("Please enter the number of pages in the book:");
                numberOfPages = input.nextInt();
                input.nextLine();

                Book bk = new Book(titleOfBook, genreOfBook, numberOfPages);
                lb.add(titleOfBook, bk);

            System.out.println("Book Added to library");    
        }
        catch(Exception e)
        {
            System.out.println("Sorry that was an invalid input, please try again");
        }
    }
    public static void lookUpBookFromLibrary(Scanner input, Library lb)
    {
        String titleOfBook;
        System.out.print("Please enter the title of the book: ");
        titleOfBook = input.nextLine();

        if(lb.libraryBooks.containsKey(titleOfBook))
        {
            System.out.println("Yes we have " + titleOfBook + " in the back! Book info below: ");
            System.out.println(lb.getBook(titleOfBook).toString());
        }
        else
        {
            System.out.println("Sorry we do not have "+ titleOfBook +" at the moment.");
        }
    }
}
