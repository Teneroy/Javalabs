import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.connectToDB();
        System.out.println(service.getUser(3));
        System.out.println(Arrays.toString(service.getAllUsers()));


    }
}
