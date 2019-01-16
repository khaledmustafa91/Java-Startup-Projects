public class Main {

    public static void main(String [] args)
    {
       // System.out.println("Hello World");
       // ContactsManager myContactManager = new ContactsManager();
        Main m = new Main();

        ContactsManager mycontact = new ContactsManager();
        Contact myfriend = new Contact();
        myfriend.name = "Khaled";
        myfriend.email = "mostafamero35@yahoo.com";
        myfriend.phoneNumber  = "01157207343";
        mycontact.addContact(myfriend);

        Contact myfriend1 = new Contact();
        myfriend1.name = "Belal";
        myfriend1.email = "BelalElwikil@yahoo.com";
        myfriend1.phoneNumber  = "01247896325";
        mycontact.addContact(myfriend1);
        Contact name = mycontact.searchContact("Belal");
        System.out.println(name.phoneNumber);

    }

    /*class Contact{
        String name;
        String email;
        String phoneNumber;
    }*/
    /*class  ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;
        // Constructor:
        ContactsManager(){
            this.friendsCount = 0;
            this.myFriends = new Contact[500];
        }
        void addContact(Contact contact){
            myFriends[friendsCount] = contact;
            friendsCount++;
        }
        Contact searchContact(String searchName){
            for(int i=0; i<friendsCount; i++){
                if(myFriends[i].name.equals(searchName)){
                    return myFriends[i];
                }
            }
            return null;
        }
    }*/
}
