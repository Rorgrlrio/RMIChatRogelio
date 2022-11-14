/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.util.Scanner;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class implementacionChatCliente extends UnicastRemoteObject implements interfaceChatCliente, Runnable{
    
    interfaceChatServidor servidor;
    public String nombre = null;
    
    implementacionChatCliente(String nombre, interfaceChatServidor servidor) throws RemoteException{
        this.nombre = nombre;
        this.servidor = servidor;
        servidor.registro(this);
    }
    
    @Override
    public void mensajeCliente(String mensaje) throws RemoteException{
        System.err.println(mensaje);
    }
    
    @Override
    public void run(){
        Scanner s = new Scanner(System.in);
        String mensaje;
        
        while(true){
            mensaje = s.nextLine();
            
            try{
                servidor.mensaje(nombre + ": " + mensaje);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    
    
}
