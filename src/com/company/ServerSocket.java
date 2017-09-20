package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocket {

    public static void main(String[] args){

        ServerSocket ss;

        try{

            ss = new ServerSocket(8001);

            System.out.println("Server Kører...");

            while (true){

                Socket incoming = ss.accept();

                Runnable r = new ClientConnection(incoming);

                String welcome = in.nextLine();
                System.out.println(welcome);

                out.println("Første Besked");
                System.out.println(in.nextLine());

                out.println("Anden besked");
                System.out.println(in.nextLine());

                out.println("Tredje Linje");
                System.out.println(in.nextLine());


                s.close();
                System.out.println("Forbindelsen lukket");
            }
        }
        catch (IOException ex)
        {

        }
        Thread t = new Thread(r);

        t.start();

        ex.printStackTrace();

    }
}




