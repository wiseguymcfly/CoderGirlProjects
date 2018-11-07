import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;


public class Menu2 {
    private User loggedInUser;
        //has-a
        private ArrayList<User> userList = new ArrayList();
        private Scanner input;
        private ArrayList<Post> postList = new ArrayList<>();

        //constructor
        public Menu2(User loggedInUser){
            this.loggedInUser = loggedInUser;
            this.userList = new ArrayList<>();
            input =new Scanner(System.in);
            userList.add(loggedInUser);
            this.postList = new ArrayList<>();
        }

        //setters
        private void setLoggedInUser(User loggedInUser){
            this.loggedInUser = loggedInUser;
        }

        //display menu method
        public void displayMenu() {
            out.println();
            out.println("1) Create a new user");
            out.println("2) Become an existing user");
            out.println("3) Create a post as the current user");
            out.println("4) Print all posts");
            out.println("5) Print all users");
            out.println("6) Quit");
            out.println();
            out.println("Logged in as " + loggedInUser.getUsername() + ".  Select option.");
            String choice = input.nextLine();
            selectOption(choice);
        }

        //continue method after selection
        public void continueMenu(String cont){

            if (cont.equalsIgnoreCase("c")){
                displayMenu();}
            else if (cont.equalsIgnoreCase("6")){
                out.println("Exit");
            }else{
                out.println("Invalid");
                displayMenu();
            }
        }

        public void selectOption(String choice){

            switch (choice) {
                case "1":
                    //
                    out.println("Enter Avatar URL: ");
                    String avatarUrl = input.nextLine();
                    out.println("Enter Username: ");
                    String username = input.nextLine();
                    out.println("Enter First Name: ");
                    String firstName = input.nextLine();
                    out.println("Enter Last Name: ");
                    String lastName = input.nextLine();
                    out.println("Enter email: ");
                    String email = input.nextLine();
                    out.println();
                    User newUser = new User (username, avatarUrl, firstName, lastName, email );
                    loggedInUser = newUser;
                    userList.add(newUser);
                    out.println("You are " + loggedInUser.getUsername());
                    out.println();

                    out.println("Enter '6' to exit, 'c' to continue");
                    String cont = input.nextLine();
                    continueMenu(cont);
                    break;

                case "2":
                    //call method to become existing user
                    out.println(Arrays.toString(userList.toArray()));
                    System.out.println();
                    out.println("Select a user to post as");
                    String userSelection = input.nextLine();
                    //int userChoice = Integer.parseInt(userSelection);
                    //setLoggedInUser(userList.get(userChoice-1));

                    out.println("Logged in as " + loggedInUser.getUsername() + ".");
                    out.println();
                    out.println("Enter '6' to exit, 'c' to continue");
                    cont = input.nextLine();
                    continueMenu(cont);
                    break;

                case "3":
                    //call method to create post as current user
                    if (postList != null && !postList.isEmpty()) {
                        out.println(postList.get(postList.size() - 1));
                    }
                    out.println("Enter post.");
                    String postContents = input.nextLine();
                    out.println("Enter web address");
                    String webAddress = input.nextLine();

                    Post currPost = new Post(postContents, webAddress);
                    out.println(currPost);
                    postList.add(currPost);
                    out.println("Enter '6' to exit, 'c' to continue");
                    cont = input.nextLine();
                    continueMenu(cont);
                    break;

                case "4":
                    //print all posts
                    out.println(postList);
                    out.println();
                    out.println("Enter '6' to exit, 'c' to continue");
                    cont = input.nextLine();
                    continueMenu(cont);
                    break;

                case "5":
                    //print users
                    out.println(Arrays.toString(userList.toArray()));
                    out.println();
                    out.println("Enter '6' to exit, 'c' to continue");
                    cont = input.nextLine();
                    continueMenu(cont);
                    break;

                case "6":
                    out.println("Exit");
            }
        }

        public static void main(String[] args) {
            User loggedInUser = new User("Default", "default", "default", "default", "default" );

            Menu2 currMenu = new Menu2(loggedInUser);
            currMenu.displayMenu();

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            currMenu.selectOption(choice);
        }

    }

