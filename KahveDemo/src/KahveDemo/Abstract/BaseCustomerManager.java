package KahveDemo.Abstract;

public abstract class BaseCustomerManager implements CustomerService {

	private String name;

	public void Save(BaseCustomerManager customerManager) {
		System.out.println("Veritabanýna Kaydedildi: "+customerManager.name);		
	}

	public void Save(int i, String string, String string2, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}
