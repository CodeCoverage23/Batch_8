package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Map<Integer, String> departmentMap = new HashMap<>();
		departmentMap.put(10, "Marketing");
		departmentMap.put(20, "Management");
		departmentMap.put(30, "Sales");
		departmentMap.put(40, "Designing");

		Map<String, String> designationMap = new HashMap<>();
		designationMap.put("M", "Manager");
		designationMap.put("S", "Supervisor");
		designationMap.put("s", "Security Officer");
		designationMap.put("C", "Clerk");

		System.out.print("Enter Employee Id:");
		int employeeId = s.nextInt();

		System.out.print("Enter Department Number:");
		int departmentNo = s.nextInt();

		System.out.print("Enter Designation Code:");
		String designationCode = s.next();

		String departmentName;
		if (departmentMap.containsKey(departmentNo)) {
			departmentName = departmentMap.get(departmentNo);
		} else {
			departmentName = "Unknown Department";
		}

		String designationName;
		if (designationMap.containsKey(designationCode)) {
			designationName = designationMap.get(designationCode);
		} else {
			designationName = "Unknown Designation";
		}

		System.out.println("===================================");
		System.out.println("<<EMPLOYEE DETAILS>>");
		System.out.println("===================================");
		System.out.println("Employee with employee id " + employeeId + " is working in \"" + departmentName
				+ "\" department as \"" + designationName + "\".");

	}

}
