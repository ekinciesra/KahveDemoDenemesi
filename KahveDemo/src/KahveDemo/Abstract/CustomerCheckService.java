package KahveDemo.Abstract;

import KahveDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
