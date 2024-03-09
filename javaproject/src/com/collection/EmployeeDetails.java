package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, String> deptMap = new LinkedHashMap<>();
		deptMap.put(10, "Marketing");
		deptMap.put(20, "Management");
		deptMap.put(30, "Sales");
		deptMap.put(40, "Designing");

		System.out.println("Enter a Employee Id : ");
		int id = sc.nextInt();

		/*
		 * for (Map.Entry<Integer, String> entry : deptMap.entrySet()) {
		 * System.out.println(entry.getKey() + ": " + entry.getValue());}
		 */

		System.out.println("Enter Department Number : ");
		int departmenttNo = sc.nextInt();

		Map<String, String> designationMap = new LinkedHashMap<>();
		designationMap.put("M", "Manager");
		designationMap.put("S", "Supervisor");
		designationMap.put("s", "Security Officer");
		designationMap.put("C", "Cleark");

		/*
		 * for (Map.Entry<String, String> entry : designationMap.entrySet()) {
		 * System.out.println(entry.getKey() + ":" + entry.getValue());}
		 */

		System.out.println("Enter Designation Code : ");
		String designationCode = sc.next();

		// get Department Name
		String departmentName;
		if (deptMap.containsKey(departmenttNo)) {
			departmentName = deptMap.get(departmenttNo);
		} else {
			departmentName = "Unknown Department(Please Enter A valid Department No.)";
		}
		// get Designation Name
		String designationName;
		if (designationMap.containsKey(designationCode)) {
			designationName = designationMap.get(designationCode);
		} else {
			designationName = "Unknown Designation(Please Enter a Valid Designation Code.)";
		}
		System.out.println("Employee Details >>");
		System.out.println("  Employee With Employee Id " + id + " is Working in " + departmentName + " department as a "
				+ designationName+".");
	}

}
