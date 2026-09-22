package com.methods;

import java.util.Scanner;

public class BugTrackers {

	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	int priority;
	String status;
	String assignedDeveloper;

	public static void main(String[] args) {

		BugTrackers b1 = new BugTrackers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BugID:");
		b1.bugId = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter the ApplicationName");
		b1.applicationName = sc.nextLine();

		System.out.println("Enter the Bug title:");
		b1.bugTitle = sc.nextLine();

		System.out.println("Enter the Severity:");
		b1.severity = sc.nextLine();

		System.out.println("Enter the Priority:");
		b1.priority = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter the getstatus:");
		b1.status = sc.nextLine();

		System.out.println("Enter the AssignedDeveloper:");
		b1.assignedDeveloper = sc.nextLine();

		System.out.println("Enter the bug details");

		System.out.println("BugiD:" + b1.bugId);
		System.out.println("Application Name:" + b1.applicationName);
		System.out.println("Bug title:" + b1.bugTitle);
		System.out.println("Severity:" + b1.severity);
		System.out.println("Priority:" + b1.priority);
		System.out.println("status:" + b1.status);
		System.out.println("Asssigned developer:" + b1.assignedDeveloper);

		System.out.println("Enter the bugId to assign developer:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the developer name:");
		String developername = sc.nextLine();

		b1.assignToDeveloper(id, developername);

		System.out.println("updated BugSummary:");
		b1.displayBugSummary();
	}

	void displayBugSummary() {
		System.out.println("BugiD:" + getBugid());
		System.out.println("Application Name:" + getApplicationName());
		System.out.println("Bug title:" + getBugTitle());
		System.out.println("Severity:" + getseverity());
		System.out.println("Priority:" + getPriority());
		System.out.println("status:" + getstatus());
		System.out.println("Asssigned developer:" + getAssignedDeveloper());
//		System.out.println();
//		System.out.println();

	}

	void assignToDeveloper(int id, String developername) {
		if (bugId == id) {
			assignedDeveloper = developername;
			updatestatus("In developement");
		}
	}

	void updatestatus(String newstatus) {
		// TODO Auto-generated method stub
		status = newstatus;
	}

	String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	String getstatus() {
		return status;
	}

	int getPriority() {
		return priority;
	}

	String getseverity() {
		return severity;
	}

	String getBugTitle() {
		return bugTitle;
	}

	String getApplicationName() {
		return applicationName;
	}

	int getBugid() {
		return bugId;
	}

}
