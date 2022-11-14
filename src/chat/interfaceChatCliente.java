/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chat;

import java.rmi.RemoteException;
import java.rmi.*;

public interface interfaceChatCliente extends Remote {
    void mensajeCliente(String mensaje) throws RemoteException;
}
