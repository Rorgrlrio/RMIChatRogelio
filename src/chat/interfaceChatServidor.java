/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chat;

import java.rmi.RemoteException;
import java.rmi.*;

public interface interfaceChatServidor extends Remote{
    void registro(interfaceChatCliente cliente) throws RemoteException;
    void mensaje(String mensaje) throws RemoteException;
}
