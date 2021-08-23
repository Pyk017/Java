package learning;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadFile {

    public static final String FILE_URL = "https://raw.githubusercontent.com/Pyk017/JavaScript/master/practice.js";

    public static void main(String args[]) throws IOException {

        InputStream stream = null;
        BufferedInputStream bfr = null;

        try {

            URL url = new URL(FILE_URL);
            stream = url.openStream();
            bfr = new BufferedInputStream(stream);
    
            StringBuilder sb = new StringBuilder();
    
            while(true) {
                int data = bfr.read();
                if(data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                }
            }
    
            System.out.println(sb);
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
            bfr.close();
        }
    } 


}
