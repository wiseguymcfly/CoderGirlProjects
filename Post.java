
public class Post {

    private String postContents;
    private String webAddress;



    //constructor
    public Post(String postContents, String webAddress) {
        this.webAddress = webAddress;
        this.postContents = postContents;
    }

    //Setters


    public void setPostContents(String postContents){this.postContents = postContents;}
    public void setWebAddress(String webAddress){this.webAddress = webAddress;}


    //Getters


    public String getPostContents(){
        return postContents;
    }

    public String getWebAddress(){
        return webAddress;
    }


}
