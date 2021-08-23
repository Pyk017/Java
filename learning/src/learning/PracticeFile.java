package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class PracticeFile {
    public static void main(String args[]) {

        String sourceFile = "files/sample.txt";
        String destFile = "files/target.txt";

        try (
            FileReader fReader = new FileReader(sourceFile);
            BufferedReader bReader = new BufferedReader(fReader);
            FileWriter writer = new FileWriter(destFile);
        ) {
            while(true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File Copied!");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
