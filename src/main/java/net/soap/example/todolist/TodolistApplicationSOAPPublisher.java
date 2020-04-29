package net.soap.example.todolist;

import net.soap.example.todolist.Service.TaskServiceImpl;

import javax.xml.ws.Endpoint;

public class TodolistApplicationSOAPPublisher {

	public static void main(String[] args) {
		System.out.println("***************");
		System.out.println("SOAP Web Service WSDL - http://localhost:8000/ws/task?wsdl");
		Endpoint.publish("http://localhost:8000/ws/task", new TaskServiceImpl());
		System.out.println("***************");
	}

}
