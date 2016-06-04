package jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Jayram on 6/2/2016.
 */
public interface ICommunication extends Remote {
    String callMe(String name) throws RemoteException;
}