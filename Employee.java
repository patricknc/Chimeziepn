package Exercise5;

public class Employee {
	
		private String ssn;
		private String name;
		private String address;
		private double salary;
		
		public Employee() {}
		
		public Employee(String ssn, String name, String address) {
			this.ssn = ssn;
			this.name = name;
			this.address = address;
			}

		public String getSsn() {
			return this.ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	}
		
	
