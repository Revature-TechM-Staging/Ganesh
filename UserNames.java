import java.util.HashSet;

public class UserNames {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("Arjun");
        usernames.add("Chaitanya");
        usernames.add("Divya");
        usernames.add("Sai");
        usernames.add("Pranav");
        System.out.println("Usernames: " + usernames);
        String checkUsername = "Chaitanya";
        if (usernames.contains(checkUsername)) {
            System.out.println(checkUsername + " exists.");
        } else {
            System.out.println(checkUsername + " does not exist.");
        }
        usernames.remove("Arjun");
        System.out.println("Usernames after removal: " + usernames);
    }
}
