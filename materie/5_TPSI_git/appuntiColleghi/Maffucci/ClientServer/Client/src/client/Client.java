/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MULTIMEDIALE
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket clientSocket;
            PrintWriter out;
            BufferedReader in;
            
            clientSocket=new Socket("127.0.0.1", 9999);
            out=new PrintWriter(clientSocket.getOutputStream());
            in=new BufferedReader
                        (new InputStreamReader
                        (clientSocket.getInputStream()));
            String invio=JOptionPane.showInputDialog
                            ("Inserire l'operazione"
                                    + " da svolgere\nFormato"
                                    + "(NopN con N=numero intero "
                                    + "e op= uno fra + - * /");
            out.println(invio);
            out.flush();
            String letta=in.readLine();
            letta=letta.substring(2);
            JOptionPane.showMessageDialog(null,invio+"="+letta);
            out.close();
            in.close();           
            clientSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
