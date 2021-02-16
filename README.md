# Remote Method Invocation in Java
- Remote Method Invocation(RMI) is a mechanism that allows an object residing in one system (JVM) to access/invoke an object running on another JVM.
- RMI is used to build distributed applications; it provides remote communication between Java programs.


## Local Procedure Call ( LPA )
- when machine A wants to call a method defined in itself.

## Remote Procedure Call ( RPC )
- machine A wants to call a method which is defined in another machine B.
- machine A is (Client) and machine B is (Server)

## Remote Method Invocation ( RMI )
- JAVA implementation of RPC is RMI

## Consider the following 3 entities:
1. Client 2. Server and 3. RMI Registry

Let's understand this client-server communication process in a nutshell<br/>
Scenerio: machine A wants to call method f2() of machine B

- In Java, to call any method we need an object.
- the objects required for all those methods which are present in B which 
  A wants to invoke are stored in RMI registry by B(Server).
- Whenever A wants to invoke method f2 it will lookup in RMI registry and
  gets the required object obj2 for that method.
- Client will pass this object to its stub and also tells which method it 
  wants to call along with the parameters required for that method
- This data will be packed by stub and is sent to skeleton which will further unpack it 
  and forward it to Server after which the desired method gets invoked and the reponse is sent back.
- This data is again sent back to client in the similiar manner it was sent earlier.
-  The process of packing is also known as "Marshalling".

## We need two objects to perform client server communication
1. Client side object also known as Stub or Proxy
2. Server side object also known as Skeleton

## Let's see how to implement this in JAVA!

Step 1: Create a remote interface (RemoteInterface.java)
- it will have all those methods which are defined in Server and client wants to invoke.
- Since this is an interface we don't have implementation

Note: Here we have 2 options:
1) Create a Server class which will implement this interface directly
2) Create a seperate class which will implement the remote interface and Server class will extend this class.

Step 2: We will be using option 2 
 - 2.1) RemoteInterfaceImplementation.java
 - 2.2) Server.java

Step 3: Create Client.java


## Steps to compile and execute:
1) Compile all java files<br/>
``` javac *.java ```
2) Start rmi registry<br/>
```start rmiregistry```
3) Run java Server<br/>
```java Server```
4) Run Client<br/>
```java Client```
  

 














   

