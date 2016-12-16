package exceptions;//FINAL
import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateDomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
	private int rate;
	public class RateDomainModel {

		public RateDomainModel() {
			super();
			
			
		}
		
	
			
		}
	public int getRate() {
		return rate;
	}
	
	
	}

