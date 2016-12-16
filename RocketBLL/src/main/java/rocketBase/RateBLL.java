package rocketBase; //FINAL

import org.apache.poi.ss.formula.functions.*;
import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

import java.util.List;


public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) 
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		Session session = HibernateUtil.getSessionFactory().openSession();
		RateDAL.getAllRates();
		String hql = "FROM RateDomainModel";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		RateBLL.getRate(GivenCreditScore);
		return 0;
		
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		RateBLL.getPayment(r, n, p, f, t);
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
