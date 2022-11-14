package chat;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;

public class servidorRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
            Registry rmi = LocateRegistry.createRegistry(1005);
            
            String ipServer = "172.20.10.4";
            System.setProperty("java.rmi.server.hostname",ipServer);
            
            rmi.rebind("Chat", (Remote) new implementacionChatServidor());
            System.out.println("Servidor Activo");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
