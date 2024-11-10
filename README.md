# Multi-Server Application

This project contains three simple HTTP server applications in Java, each running on a different port. The servers respond with unique messages based on the port they are running on.

## Overview

Each class (`Server1`, `Server2`, and `Server3`) runs an HTTP server on a different port:

- **Server1**: Runs on port `8081` and responds with `"Response from Server 1 on port 8081"`.
- **Server2**: Runs on port `8082` and responds with `"Response from Server 2 on port 8082"`.
- **Server3**: Runs on port `8083` and responds with `"Response from Server 3 on port 8083"`.

## Prerequisites

- **Java 17**: Required to run the server applications.

## Running the Servers

To start each server, simply run the `main` method in each class individually. This will start each HTTP server on its respective port.

### Example

To start each server, you can use your IDE to run the `main` method in each class or run them directly via command line if compiled:

1. **Server1**: Run the `main` method in `Server1` to start the server on port `8081`.
2. **Server2**: Run the `main` method in `Server2` to start the server on port `8082`.
3. **Server3**: Run the `main` method in `Server3` to start the server on port `8083`.

Once each server is started, you can access them in a browser or with `curl`:

- **Server1**: [http://localhost:8081/](http://localhost:8081/)
- **Server2**: [http://localhost:8082/](http://localhost:8082/)
- **Server3**: [http://localhost:8083/](http://localhost:8083/)

Each URL should return a response unique to the server's port, e.g., `"Response from Server 1 on port 8081"` for `Server1`.

## Code Explanation

- **HttpServer Initialization**: Each class initializes an `HttpServer` instance on a unique port (`8081`, `8082`, `8083`).
- **Context Setup**: A context (`"/"`) is defined for each server, which specifies the response message based on the server's port.
- **Response Handling**: Each server sends a `200 OK` status along with a message when accessed.
