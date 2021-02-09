package Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {

    public RemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello everyone !! what's up ?";
    }

    @Override
    public double average(int a, int b) throws RemoteException {
        return divided(a, b) / 2;
    }

    @Override
    public double divided(int a, int b) throws RemoteException {
        double quo = add(a, b) / 2;
        double mod = add(a, b) % 2;
        return quo + mod;
    }

    @Override
    public double multiplied(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double subs(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public double add(int a, int b) throws RemoteException {
        return a + b;
    }
}
