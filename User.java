import java.util.ArrayList;

/*  StaticPractice.getStaticField();
    StaticePractice instance = new StaticPractice();
    instance.getNonStaticField;
    System.out.println(instance.nonStaticField)
            System.out.println(StaticPractice.staticField);*/


public class User {
    private String avatarUrl;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Post>postList;

    //constructor
    public User(String username, String firstName, String avatarUrl, String lastName, String email) {
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    //void addPost (Post p)

    //Setters
    public void setAvatarUrl(String avatarUrl){this.avatarUrl = avatarUrl;}
    public void setLastName(String lastName){this.lastName = lastName;}

    //Getters
    public String getAvatarUrl(){ return avatarUrl; }

    public String getUsername(){ return username; }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

}