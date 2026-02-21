/*
Rakesh Raj
3/13/25
Implementation class
*/
public class Contacts {
    private String name;
    private String relationship;
    private String birthday;
    private String phoneNumber;
    private String email;

    public Contacts(String name, String relationship, String birthday, String phoneNumber, String email){
        this.name = name;
        this.relationship=relationship;
        this.birthday=birthday;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getName(){
        return name;
    }

    public String getRelationship(){
        return relationship;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return String.format("%-20s%-15s%-13s%-15s%-30s", name, relationship, birthday, phoneNumber, email);
    }
    
}
