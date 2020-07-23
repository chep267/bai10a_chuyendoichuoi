package dongcode.bai10a;

import java.io.*;

class MyFilterInputStream extends FilterInputStream{

    public MyFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int n = (int)super.read();
        if(n>64 && n<91) return n+32;
        else return n;
    }
}