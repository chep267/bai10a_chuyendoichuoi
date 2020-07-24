package dongcode.bai10a;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {

        InputStream file = new FileInputStream(new File("/home/dongnt/Dong_Projects/dongcode/src/dongcode/bai10a/input.txt"));
        MyFilterInputStream filter = new MyFilterInputStream(file);

        StringBuilder sb = new StringBuilder("");

        try {
            int k = 0;
            while ( (k = filter.read()) != -1 ) {
                sb.append((char) k);
            }
            System.out.println("Chuoi chuyen doi:      \n" + sb);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        file.close();
        filter.close();
    }
}