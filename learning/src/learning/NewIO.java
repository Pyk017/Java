package learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NewIO {
    public static void main(String args[]) {

        Path sourceFile = Paths.get("files", "sample.txt");
        Path targetFile = Paths.get("files", "destination.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    } 
}
