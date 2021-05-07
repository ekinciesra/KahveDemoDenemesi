package KahveDemo.Concrete;

import KahveDemo.Abstract.CustomerCheckService;
import KahveDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
	
}
