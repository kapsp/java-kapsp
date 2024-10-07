import com.sun.javafx.logging.JFRInputEvent;

import java.util.Optional;

public class o4 {
    public static void main(String[] args) {
        int a=43;

        Optional<User> b= find(a);
        User c=b.orElseThrow(()->new UserNotFoundException("id not found"));
        System.out.println(c.getName());

    }

    public static Optional<User> find(int userId){
        if (userId==43){
            return Optional.of(new User(43,"kapil"));
        }
        else {
            return Optional.empty();
        }
    }
}