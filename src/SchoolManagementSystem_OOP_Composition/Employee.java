package SchoolManagementSystem_OOP_Composition;

public class Employee extends Student {

    private String userID;
    private String name;
    private String email;


    public Employee(String userID, String name, String email){
        super();
        this.userID = userID;
        this.name = name;
        this.email = email;

    }
}
