package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket ss2 = new ServerSocket(3000);

        do{
            Socket s = ss2.accept();

            MyThread t = new MyThread(s);
            t.start();
        } while (true);
































        /*
        System.out.println("Server in avvio!!");

        ServerSocket ss = new ServerSocket(3000);

        Socket s = ss.accept();

        System.out.println("Qualcuno si è collegato");

        BufferedReader in = new BufferedReader (new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String stringaRicevuta = in.readLine();
        System.out.println("La stringa ricevuta: " + stringaRicevuta);

        String stringaMaiuscola = stringaRicevuta.toUpperCase();
        out.writeBytes(stringaMaiuscola + '\n');

        s.close();
        ss.close(); */
    }
}