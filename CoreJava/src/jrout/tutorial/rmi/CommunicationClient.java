package jrout.tutorial.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Jayram on 6/2/2016.
 */
public class CommunicationClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry("localhost",2345);
        ICommunication communication = (ICommunication)registry.lookup("CommunicationDemo");
        System.out.println(communication.callMe("Jayram"));
    }
}
