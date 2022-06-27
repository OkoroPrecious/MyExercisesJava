package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diary {
    private String diaryName;
    private String diaryPassword;
    private ArrayList<Entry> diaryEntry;
    private LocalDateTime diaryDate;

    public Diary(String diaryName,String diaryPassword){
        this.diaryName = diaryName;
        this.diaryPassword = diaryPassword;
        diaryDate = LocalDateTime.now();
    }

    public void setDiaryName(String diaryName){
        this.diaryName = diaryName;
    }
    public String getDiaryName(){
        return diaryName;
    }

    public String getDiaryPassword(){
        return diaryPassword;
    }
    public String getDiaryDate(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String diaryDateCreated = diaryDate.format(dateFormatter);
        return diaryDateCreated;

    }
}
