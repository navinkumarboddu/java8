package exception.coding.demo3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        TeamMember tm = new Developer();
        try {
            tm.work();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
