package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Server.ServerInterface;

public class Client {

	public static void main(String[] args) {

		try {

			Registry registry = LocateRegistry.getRegistry(null);
			ServerInterface stub = (ServerInterface) registry.lookup("Server");
			stub.print();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
