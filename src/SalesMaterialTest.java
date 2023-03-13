/**
 * 
 */
package batch3ust.testNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Administrator
 *
 */

	public class SalesMaterialTest {
	    @Test
	    public void testThePricePerSquareFeet() {

	        List<City> theSalesData = new ArrayList<>();

	        theSalesData.add(new City("TVM", 1600, 800));
	        theSalesData.add(new City("Chennai", 1800, 1000));
	        theSalesData.add(new City("Hyderabad", 2000, 900));
	        theSalesData.add(new City("Mumbai", 2500, 1200));
	        theSalesData.add(new City("Cochin", 1800, 1200));


	        String userGivenCity = "TVM";
	        double userGivenSquareFeet = 2;

	        List myPriceList = theSalesData.stream()
	                .filter(val -> val.getCity().equalsIgnoreCase(userGivenCity))
	                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet)).collect(Collectors.toList()).get(0);

	        double totalAmount = theSalesData.stream()
	                .filter(val -> val.getCity().equalsIgnoreCase(userGivenCity))
	                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet))
	                .collect(Collectors.toList()).get(0).stream().mapToDouble(f -> (double) f).sum();

	        System.out.println("Location: " + userGivenCity);
	        System.out.println("Square Feet: " + userGivenSquareFeet);
	        System.out.println("Price with material : " + myPriceList.get(0));
	        System.out.println("Price without material : " + myPriceList.get(1));
	        System.out.println("Total amount: " + totalAmount);

	        String myCity = "TVM";
	        double squareFeet = 2;
	        List<Double> priceList = Arrays.asList(3200.0, 1600.0);
	        double totalExpected = 4800.0;

	        Assert.assertEquals(myPriceList, priceList);
	        Assert.assertEquals(totalAmount, totalExpected);

	    }
	}

