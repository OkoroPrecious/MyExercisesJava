package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String entryID;
    private String title;
    private String body;
    private LocalDateTime entryDate;

    public Entry(String entryID, String title, String body){
        this.entryID = entryID;
        this.title = title;
        this.body = body;
        entryDate = LocalDateTime.now();
    }

    public void setEntryID(String entryID){
        this.entryID = entryID;
    }

    public String getEntryID(){
        return entryID;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setBody(String body){
        this.body = body;
    }
    public String getBody(){
        return body;
    }
    public String getEntryDate(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String entryDateCreated = entryDate.format(dateFormatter);
        return entryDateCreated;
    }
}
