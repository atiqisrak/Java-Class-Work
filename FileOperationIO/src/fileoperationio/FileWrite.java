package fileoperationio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWrite {

    public void writeToFile() {
        try {
            File file = new File("C:\\Users\\Teacher\\Desktop\\MAHB\\My.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("This is new content write from java code.");
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
