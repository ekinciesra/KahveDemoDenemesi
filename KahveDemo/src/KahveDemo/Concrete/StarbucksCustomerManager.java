package KahveDemo.Concrete;

import KahveDemo.Abstract.BaseCustomerManager;
import KahveDemo.Abstract.CustomerCheckService;
import KahveDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{
	 public void Save(Customer customer) {
		if(CheckIfRealPerson(customer)) {
			Save(customer);
		}
		else {
			System.out.println("Geçersiz Kiþi!");
		}
	 }
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
