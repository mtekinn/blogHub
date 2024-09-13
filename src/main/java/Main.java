import model.User;
import model.enums.UserType;

public class Main {
    public static void main(String[] args) {

        User user = new User("tekinmdev@gmail.com", "admin123");

        System.out.println(user.toString());


    }
}
