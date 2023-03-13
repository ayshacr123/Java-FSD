/**
 * 
 */
package batch3ust.testNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class City {

		String city;
		int priceWith;
		int priceWithout;
		public City(String city, int priceWith, int priceWithout) {
			this.city=city;
			this.priceWith=priceWith;
			this.priceWithout=priceWithout;
		}
	
	
	public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public int getPriceWith() {
			return priceWith;
		}


		public void setPriceWith(int priceWith) {
			this.priceWith = priceWith;
		}


		public int getPriceWithout() {
			return priceWithout;
		}


		public void setPriceWithout(int priceWithout) {
			this.priceWithout = priceWithout;
		}

		 public List getThePriceOnSquareFeet(double squareFeet) {
		        double priceWithM = squareFeet * getPriceWith();
		        double priceWithoutM = squareFeet * getPriceWithout();
		        return Arrays.asList(priceWithM, priceWithoutM);

}
}
