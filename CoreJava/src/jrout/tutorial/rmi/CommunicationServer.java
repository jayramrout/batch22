package jrout.tutorial.rmi;

import com.sun.deploy.net.cookie.IExplorerCookieHandler;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Jayram on 6/2/2016.
 */
public class CommunicationServer {
    public static void main(String[] args) throws RemoteException {
        ICommunication communication = new CommunicationImpl();
        Registry registry = LocateRegistry.createRegistry(2345);
        registry.rebind("CommunicationDemo",communication);
        System.out.println("Object is ready for invokation");
    }
}
