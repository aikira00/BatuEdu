/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MULTIMEDIALE
 */
public class ServerMultithread {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket client;
            //Thread thread;
            ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            while(true){
                client=serverSocket.accept();
                es.execute(new Server(client));
                //thread=new Thread(new Server(client));
                //thread.start();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServerMultithread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
