// Buffered Reader

import java.io.*;

public class BufferedReaderFile {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();

        System.out.println(name);
    }
}

/*
1. Aditya -> i/p
2. OS Buffer (65, 100, 105, 116, 121, 97)
3. System.in (InputStream) receives bytes
4. InputStreamReader --> stream of bytes into stream of charaters ('A', 'd', 'i', 't', 'a')
5.BufferedReader --> readLine  --> Aditya  --> name
6. Aditya --> o/p
*/