import Service.RemoteImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    /**
     * @param args input parameters
     */
    public static void main(String[] args) throws RemoteException {

        Registry registry = LocateRegistry.createRegistry(18500);
        RemoteImpl remote = new RemoteImpl();
        String rebindName = "remote";
        registry.rebind(rebindName, remote);

        System.out.println("It Done !!");
    }
}
