import com.uu.model.User;
import org.junit.Test;

public class Main {
    // 合并一下喽 😁😝
    public static void main(String[] args) {
        System.out.println("Hello World!  12345777");

    }

    @Test
    public void println() {
        User user = new User();
        user.setName("a aa ");
        user.setDescription("ddfdf ");
        user.setAge(0);

        System.out.println(user.toString());
    }
}
