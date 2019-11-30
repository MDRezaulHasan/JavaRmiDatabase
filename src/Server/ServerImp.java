package Server;

import java.rmi.RemoteException;

public class ServerImp implements ServerInterface{

	@Override
	public void print() throws RemoteException {
		System.out.println("Hello prabir");
		
	}

}
