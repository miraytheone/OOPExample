package oopProject;

import oopProject.business.CreditManager;
import oopProject.business.CustomerManager;
import oopProject.business.TeacherCreditManager;
import oopProject.entities.Company;
import oopProject.entities.Customer;
import oopProject.entities.Person;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager =new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}

}
