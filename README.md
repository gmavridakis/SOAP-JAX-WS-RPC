# SOAP-JAX-WS-RPC  

A Java RPC Style Web Service Endpoint with a Web Service Client to demonstrate the functionality of toDoList using SOAP

# SOAP  

SOAP stands for Simple Object Access Protocol. SOAP is an XML based industry standard protocol for designing and developing web services. Since it’s XML based, it’s platform and language independent. So our server can be based on JAVA and client can be on .NET, PHP etc. and vice versa.

# WSDL  

WSDL stands for Web Service Description Language. WSDL is an XML based document that provides technical details about the web service. Some of the useful information in WSDL document are: method name, port types, service end point, binding, method parameters etc.  

# Project Details  

In this project, I use JAX-WS to create SOAP based web services to demonstrate the functionality of ToDoList.
  - Model Class includes 1. id & 2. description of a task
  - Service Class includes 1. addTask, 2. getTask, 3. deleteTask & 4. getAllTasks web methods.  
 The communication style used to translate WSDL binding to a SOAP message body was RPC.  

 # Web Service Screenshot  

![Backend](https://github.com/gmavridakis/SOAP-JAX-WS-RPC/blob/master/assets/jax-ws.png) 
 
 # Client Screenshot  
 
 ![Client](https://github.com/gmavridakis/SOAP-JAX-WS-RPC/blob/master/assets/jax-ws-client.png) 
