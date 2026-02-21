/*
Rakesh Raj
3/13/25
Purpose: to test sequential search and binary search (client/tester class)
*/
public class ContactsTester {

    public static void print(Contacts[] contacts){
        for(int i=0; i<contacts.length; i++){
            System.out.println(contacts[i].toString());
        }
    }

    public static void sortName(Contacts[] contacts){
        int i;
        int k;
        int posMax;
        Contacts temp;

        for( i = contacts.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(contacts[k].getName().compareTo(contacts[posMax].getName()) > 0 )
                    posMax = k;
            }

            temp = contacts[ i ];
            contacts[ i ] = contacts[posMax ];
            contacts[ posMax ] = temp;
        }
    }
    public static void binarySearchName(Contacts[] contacts, String toFind )
    {
        int high = contacts.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(contacts[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( contacts[probe].getName().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (contacts[low].getName().compareTo(toFind) == 0 ))
        {
            System.out.print(contacts[low].toString());
        }
        else
            System.out.println("Did not find anyone called " + toFind + " in contacts");
    }

    public static void sortRelationship(Contacts[] contacts){
        int i;
        int k;
        int posMax;
        Contacts temp;

        for( i = contacts.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(contacts[k].getRelationship().compareTo(contacts[posMax].getRelationship()) > 0 )
                    posMax = k;
            }

            temp = contacts[ i ];
            contacts[ i ] = contacts[posMax ];
            contacts[ posMax ] = temp;
        }
    }
    public static void binarySearchRelationship(Contacts[] contacts, String toFind )
    {
        int high = contacts.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(contacts[probe].getRelationship().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( contacts[probe].getRelationship().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (contacts[low].getRelationship().compareTo(toFind) == 0 ))
        {
            linearPrintRelationship(contacts, low, toFind);
        }
        else
            System.out.println("Did not find my " + toFind + " in contacts");
    }

    public static void linearPrintRelationship(Contacts[] contacts, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (contacts[i].getRelationship().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < contacts.length) && (contacts[i].getRelationship().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++)
            System.out.println(contacts[i]);
    }

    public static void sequentialBirthday(Contacts[] contacts, String toFind){
        int count = 0;
        for(int i=0;i<contacts.length;i++){
            
            if(contacts[i].getBirthday().substring(0, 3).equals(toFind)){
                System.out.println(contacts[i].toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Did not find anyone with a birthday in " + toFind);
        }
    }

    public static void sequentialPhonenumber(Contacts[] contacts, String toFind){
        int count = 0;
        for(int i=0;i<contacts.length;i++){
            
            if(contacts[i].getPhoneNumber().equals(toFind)){
                System.out.println(contacts[i].toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Did not find anyone with this phone number: " + toFind);
        }
    }
    public static void sequentialEmail(Contacts[] contacts, String toFind){
        int count = 0;
        for(int i=0;i<contacts.length;i++){
            
            if(contacts[i].getEmail().equals(toFind)){
                System.out.println(contacts[i].toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Did not find anyone with this email: " + toFind);
        }
    }

    public static void main(String[] args) {
        Contacts[] contacts = new Contacts[10];
        contacts[0] = new Contacts("John Smith", "Cousin", "Apr 10", "223-927-2418", "Pizzalover@gmail.com");
        contacts[1] = new Contacts("Henry Smith", "Uncle", "Dec 31", "223-533-6264", "bestdad123@gmail.com");
        contacts[2] = new Contacts("Mary Jane", "Mom", "Oct 5", "850-966-2137", "fakeemail@gmail.com");
        contacts[3] = new Contacts("Bob Jones", "Friend", "Apr 8", "850-345-2546", "bestfriend@gmail.com");
        contacts[4] = new Contacts("Harrison Tucker", "Uncle", "Feb 22", "850-014-9452", "friend2@gmail.com");
        contacts[5] = new Contacts("Molly Henderson", "Aunt", "Jan 30", "915-553-8013", "hellothere@gmail.com");
        contacts[6] = new Contacts("Aaron Donald", "Friend", "Mar 9", "752-339-2178", "thegoat@gmail.com");
        contacts[7] = new Contacts("Tommy Daniels", "Friend", "Aug 11", "523-559-0415", "dandan@gmail.com");
        contacts[8] = new Contacts("Emily Hart", "Aunt", "June 26", "545-428-8522", "hart123@gmail.com");
        contacts[9] = new Contacts("Mathew Johnson", "Grandpa", "May 13", "850-993-7625", "gramps@gmail.com");
        
        print(contacts);
        System.out.print("\n");

        System.out.println("Searching for Bob Jones");
        sortName(contacts);
        binarySearchName(contacts, "Bob Jones");
        System.out.println("\n");
        System.out.println("Searching for Amelia Donaldson");
        sortName(contacts);
        binarySearchName(contacts, "Amelia Donaldson");
        System.out.println("\n");

        System.out.println("Searching for Uncles");
        sortRelationship(contacts);
        binarySearchRelationship(contacts, "Uncle");
        System.out.println("\n");
        System.out.println("Searching for Grandma");
        sortRelationship(contacts);
        binarySearchRelationship(contacts, "Grandma");
        System.out.println("\n");

        System.out.println("Searching for birthdays in August");
        sequentialBirthday(contacts, "Aug");
        System.out.println("\n");
        System.out.println("Searching for birthdays in July");
        sequentialBirthday(contacts, "July");
        System.out.println("\n");

        System.out.println("Searching for phone number: 752-339-2178");
        sequentialPhonenumber(contacts, "752-339-2178");
        System.out.println("\n");
        System.out.println("Searching for phone number: 850-295-2135");
        sequentialPhonenumber(contacts, "850-234-2345");
        System.out.println("\n");

        System.out.println("Searching for email: Pizzalover@gmail.com");
        sequentialEmail(contacts, "Pizzalover@gmail.com");
        System.out.println("\n");
        System.out.println("Searching for email: Theking@gmail.com");
        sequentialEmail(contacts, "Theking@gmail.com");
        System.out.println("\n");
    }
}
