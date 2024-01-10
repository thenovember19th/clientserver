import java.net.*;
import java.io.*;
import java.util.Scanner;
class Client{
    public static void main(String[] args){
        try{
            Scanner scan=new Scanner(System.in);
            Socket s=new Socket("localhost",5000);
            System.out.println("enter a string");
            String value=scan.next();
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF(value);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String ans=dis.readUTF();
            System.out.println("The string is "+ans);
            s.close();
            dis.close();
            dos.close();
            scan.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
    }
}
}
