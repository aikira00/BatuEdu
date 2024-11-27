/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MULTIMEDIALE
 */
public class Server implements Runnable{
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public Server(Socket s){
        clientSocket=s;
        try {
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    @Override
    public void run() {
        try {
            String letta = in.readLine();
            Parser parser = new Parser();
            parser.parse(letta);
            String message="ERR";
            if (parser.getResult().equals("OK")) {
                int risultato = calcola(parser.getN1(), parser.getN2(), parser.getOp());
                message="OK"+risultato;
            }
            out.println(message);
            out.flush();
            out.close();
            in.close();
            clientSocket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static int calcola(int n1, int n2, char op) {
        int risultato = 0;
        switch (op) {
            case '+':
                risultato = n1 + n2;
                break;
            case '-':
                risultato = n1 - n2;
                break;
            case '*':
                risultato = n1 * n2;
                break;
            case '/':
                risultato = n1 / n2;
        }
        return risultato;
    }

}
