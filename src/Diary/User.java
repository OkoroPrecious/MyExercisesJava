package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class User {
    private String user;
    private String userID;
    private String email;
    private String password;
    private ArrayList<Diary>pinkie;
    private LocalDateTime dateCreated;

    public User(String user, String userID, String email, String password){
        this.user = user;
        this.userID = userID;
        this.email = email;
        this.password = password;
        dateCreated = LocalDateTime.now();
    }

    public void  setUser(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    public void setUserID(String userID){
        this.userID = userID;
    }

    public String getUserID(){
        return userID;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getDateCreated(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newDateCreated = dateCreated.format(dateFormatter);
        return newDateCreated;
    }


}
