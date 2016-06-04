package jrout.tutorial.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Jayram on 6/2/2016.
 */
public class CommunicationImpl extends UnicastRemoteObject implements ICommunication {
    protected CommunicationImpl() throws RemoteException {
        super();
    }

    @Override
    public String callMe(String name) throws RemoteException {
        return "Hello How are you : "+ name;
    }
}
