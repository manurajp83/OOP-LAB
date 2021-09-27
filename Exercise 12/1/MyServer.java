//1. Client server communication using Socket – TCP/IP


import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args){
		try{

			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();//establishes connection
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message= "+str);
			ss.close();

		}catch(Exception e){System.out.println(e);}
	}
}

/*

C:\Users\Documents\java\Exercise12\Question1>javac MyServer.java

C:\Users\Documents\java\Exercise12\Question1>java MyServer
message= WELCOME JAVA

*/