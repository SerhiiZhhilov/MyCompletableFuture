import exampleFuture.MyFuture;
import lombok.extern.slf4j.Slf4j;

public class Main {

    public static void main(String[] args) {
        System.out.println("Run process");
        (new MyFuture()).testFuture();
        System.out.println("End process");

    }
}
