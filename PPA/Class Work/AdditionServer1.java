import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is running....");
        ServerSocket ssobj = new ServerSocket(2100);                                 //2100 port no
        System.out.println("Server is waiting at port no 2100");
        Socket sobj = ssobj.accept();                                               //request accepted 
        System.out.println("client request arrives and accepted by the server");
    }
}