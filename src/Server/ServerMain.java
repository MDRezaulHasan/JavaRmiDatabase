package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain {

	public static void main(String[] args) {

		try {

			ServerImp serverImp = new ServerImp();
			ServerInterface serverInterface = (ServerInterface) UnicastRemoteObject.exportObject(serverImp, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Server", serverInterface);
			System.out.println("Server started....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
