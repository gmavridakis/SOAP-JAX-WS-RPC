package net.soap.example.todolist;

import net.soap.example.todolist.Model.Task;
import net.soap.example.todolist.Service.TaskService;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import java.net.MalformedURLException;
import java.net.URL;

public class TodolistApplicationSOAPPublisherClient {

	public static void main(String[] args) {
		
		System.out.println("***************");
		System.out.println("SOAP Web Service Client Demo");
		
		try {
			
			Task t1 = new Task();  t1.setId(1); t1.setDescription("Description of task 1");
			Task t2 = new Task();  t2.setId(2); t2.setDescription("A New Description of task 2");
			
			URL wsdlURL = new URL("http://localhost:8000/ws/task?wsdl");
			QName qname = new QName("http://Service.todolist.example.soap.net/", "TaskServiceImplService");
			
			//TaskServiceImpl service = new TaskServiceImpl();
			Service svc = Service.create(wsdlURL, qname);
			TaskService service = svc.getPort(TaskService.class);
	        
			System.out.println("Add Task Status (t1) 	: " +service.addTask(t1));
			System.out.println("Add Task Status (t2) 	: " +service.addTask(t2));
			//get a task
			System.out.println("Get a Task (t1) 	: " +service.getTask(1));
			//get all tasks
			System.out.println("Show all tasks 		: " +Arrays.asList(service.getAllTasks()));
			//delete task
			System.out.println("Delete Task Status (t2) : "+service.deleteTask(2));
			//get all tasks
			System.out.println("Show all tasks 		: " +Arrays.asList(service.getAllTasks()));			
			System.out.println("***************");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
