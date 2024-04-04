package exception.coding.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Developer extends TeamMember{

    @Override
    public void work() throws
            FileNotFoundException,
            IOException {
        System.out.println("Dev");
    }
}
