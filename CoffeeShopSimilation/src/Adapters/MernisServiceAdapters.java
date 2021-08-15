package Adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapters implements CustomerCheckService {
	
	KPSPublicSoap kpspublicSoap = new KPSPublicSoap() {
		
		public boolean TCKimlikNoDogrula(long TCKimlikNo, String ad, String soyad, int dogumYili) throws RemoteException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean TCKimlikNoDogrula(long TCKimlikNo, String ad, String soyad, LocalDate localDate)
				throws RemoteException {
			// TODO Auto-generated method stub
			return false;
		}
	};
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		try {
			return kpspublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationallityId()), customer.getFirstName(),customer.getlastName(),customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
