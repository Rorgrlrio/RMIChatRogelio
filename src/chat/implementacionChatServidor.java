/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class implementacionChatServidor extends UnicastRemoteObject implements interfaceChatServidor{
    public ArrayList<interfaceChatCliente> clientes;
    
    public implementacionChatServidor() throws RemoteException{
        clientes = new ArrayList<interfaceChatCliente>();
    }
    
    @Override
    public void mensaje (String mensaje) throws RemoteException{
        int a = 0;
        
        while(a < clientes.size()){
            clientes.get(a++).mensajeCliente(mensaje);
        }
    }
    
    @Override
    public void registro(interfaceChatCliente cliente) throws RemoteException{
        this.clientes.add(cliente);
    }
    
    
}
