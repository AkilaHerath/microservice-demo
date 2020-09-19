package com.example.app;


import com.example.app.course.CourseServer;
import com.example.app.registry.EurekaApplication;

public class MicroserviceDemoApplication {

	public static void main(String[] args) {

		String serverName = "";

		switch (args.length) {
			case 2:
				System.setProperty("server.port", args[1]);
			case 1:
				serverName = args[0].toLowerCase();
				break;

			default:
				return;
		}

		if (serverName.equals("eureka")) {
			EurekaApplication.main(args);
		} else if (serverName.equals("course")) {
			CourseServer.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
		}
	}

}
