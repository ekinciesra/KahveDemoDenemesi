package KahveDemo;

import KahveDemo.Abstract.BaseCustomerManager;
import KahveDemo.Concrete.NeroCustomerManager;

//import KahveDemo.Abstract.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(1,"Esra","Ekinci",14/10/1998, 452774595);
		System.out.println(customerManager);
	}

}
