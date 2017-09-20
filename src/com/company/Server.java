package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = null;


        try {

            ss = new ServerSocket(8001);
            System.out.println("Server kører...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            //så længe der ikke er oprettet en forbindelse, venter serveren her
            // så snart der anmodes om en forbindelse accepteres den med accept()


            Socket s = ss.accept();
            System.out.println("klienten forbundet.");


            InputStream input = s.getInputStream();
            OutputStream output = s.getOutputStream();

            Scanner in = new Scanner(input);

            PrintWriter out = new PrintWriter(output, true);

            out.println("Velkommen");

            boolean done = false;
            while (!done && in.hasNextLine()) ;
            {
                String stream = in.nextLine();
                if (stream.equals("luk ned")) {
                    done = true;
                } else {
                    out.println(stream);
                }
            }
            s.close();
            System.out.println("Forbindelsen til klienten blev lukket.");
        }
    }


}
