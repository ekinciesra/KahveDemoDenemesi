package KahveDemo.Adapters;

import KahveDemo.Abstract.CustomerCheckService;
import KahveDemo.Entities.Customer;
import MernisServiceReference.KPSPublicSoap;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	KPSPublicSoap client = new KPSPublicSoapProxy();
	return client.TCKimlikNoDogrula(customer.id, customer.name.toUpperCase(), customer.lastName, customer.DateOfBirth, customer.NationalityId);
	}

}
