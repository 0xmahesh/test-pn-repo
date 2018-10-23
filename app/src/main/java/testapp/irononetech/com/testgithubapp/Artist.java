package testapp.irononetech.com.testgithubapp;

public class Artist {
    private String fName;
    private String lName;
    private String genre;
    private int artistId;

    public Artist(String firstName, String lastName, String genre, int artistId){
        this.fName = firstName;
        this.lName = lastName;
        this.genre = genre;
        this.artistId = artistId;
    }
}
