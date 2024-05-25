package com.Collection;

public class Student implements Comparable<Student>{

	
		private int rollNo;
		private String name;
		private String add;
		
		public Student() {
			super();
		}

		public Student(int rollNo, String name, String add) {
			super();
			this.setRollNo(rollNo);
			this.setName(name);
			this.setAdd(add);
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdd() {
			return add;
		}

		public void setAdd(String add) {
			this.add = add;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return 0;
		}


}
