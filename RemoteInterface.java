import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface RemoteInterface extends Remote {  
   void printHelloWorld() throws RemoteException;  
}