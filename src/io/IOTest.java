package io;

import java.io.IOException;

public class IOTest {

    public static void main(String[] args) throws IOException{

        byte [] temp = new byte[1024];
        int length = System.in.read(temp,0,1024);
        StringBuilder string = new StringBuilder();

        while(length!=-1){
            string.append(new String(temp,0,length));
            length = System.in.read(temp,0,1024);
        }
        System.out.write(string.toString().replaceAll("\r\n","\n").getBytes());
    }
}
