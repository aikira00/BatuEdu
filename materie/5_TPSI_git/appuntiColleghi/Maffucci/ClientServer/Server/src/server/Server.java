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
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket clientSocket;
        PrintWriter out;
        BufferedReader in;
        try {
            serverSocket = new ServerSocket(9999);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String letta = in.readLine();
            if (ok(letta)) {
                int n1 = Integer.parseInt(letta.substring(0, 2));
                int n2 = Integer.parseInt(letta.substring(3, 5));
                char op = letta.charAt(2);
                int risultato = calcola(n1, n2, op);
                out.println("OK" + risultato);
                out.flush();
                out.close();
                in.close();
                clientSocket.close();
                serverSocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static boolean ok(String letta) {
        return true;
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
