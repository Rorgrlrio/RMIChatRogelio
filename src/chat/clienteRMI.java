package chat;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class clienteRMI {
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            String nom = nombre;
            
            String ipCliente = "172.20.10.2";
            System.setProperty("java.rmi.server.hostname",ipCliente);
            
            Registry rmii = LocateRegistry.getRegistry("172.20.10.4", 1005);
            
            interfaceChatServidor servidor = (interfaceChatServidor) rmii.lookup("Chat");
            new Thread(new implementacionChatCliente(nom, servidor)).start();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
