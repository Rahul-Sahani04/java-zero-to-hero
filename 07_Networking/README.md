# Networking in Java

Welcome to the **Networking** section! This section focuses on how Java allows computers to communicate over a network using various protocols.

## Topics Covered:
1. **IP Address Lookup** - How to retrieve the IP address of a host.
2. **Sockets** - Using TCP/IP sockets to build a client-server application.
3. **Echo Server/Client** - Build simple echo server-client programs.

## Example Programs:

1. **`HostNameToIP.java`** - A program that accepts a hostname and displays its IP address.
   - **Concepts**: Working with `InetAddress` to resolve IP addresses.

2. **`EchoServer.java` & `EchoClient.java`** - A pair of programs where the client sends a message to the server, and the server echoes it back.
   - **Concepts**: Working with `ServerSocket`, `Socket`, and streams.

3. **`TCPClientServer.java`** - A simple client-server program using TCP/IP, where the client sends messages to the server.
   - **Concepts**: Using TCP/IP sockets to exchange messages between client and server.

## Exercises:
1. Write a program to display the IP address of any website by accepting the hostname from the user.
2. Write a simple echo server-client program where the server echoes whatever the client sends.
3. Create a TCP client-server application that sends a message from the client to the server and logs the message on both ends.

---

### Moving Forward:
After understanding the basics of networking, you can dive deeper into more advanced network programming topics like multithreaded servers, file transfer protocols, and web services.

---

## Files

- **HostNameToIP.java**: Displays IP address of a given host name.
- **EchoServer.java**: Echo server using sockets.
- **EchoClient.java**: Echo client using sockets.
- **TCPClientServer.java**: TCP/IP client-server program.
