package com.company;
import java.io.*;
import java.net.*;
import java.util.Scanner;





    public class ClientConnection implements Runnable {

        private Socket s;


        public ClientConnection(Socket s) throws SocketException, IOException{

            this.s = s;
        }


        @Override
        public void run(){

            try {
                try {

                    InputStream input = s.getInputStream();
                    OutputStream output = s.getOutputStream();

                    Scanner in = new Scanner(input);

                    PrintWriter out = new PrintWriter(output,true);

                    out.println("velkommen");

                    boolean done = false;

                    while (!done && in.hasNextLine()){

                        String stream = in.nextLine();
                        if(Stream.equals("luk ned")){

                            done = true;

                        }
                        else{
                            out.println(stream);
                        }
                    }

                }
                finally {
                    s.close();
                }
            }
            catch (Exception e){

                e.printStackTrace();
            }
        }

    }


