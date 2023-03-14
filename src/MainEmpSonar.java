/* Create a Emp object with the attributes with the logic Incrementation of salary 
  if noOfYears in 1-3 then increment by 2.5%, similarly if in 3-6years 5% increment, 6-10 yrs - 10% incre., above 10 years - 12%
  */
 

/**
 * 
 */
package batch3ust.sonarqube;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class MainEmpSonar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSonar e1 = new EmployeeSonar("111","Appu",30,8,100000);
		EmployeeSonar e2 = new EmployeeSonar("222","Akku",22,1,30000);
		EmployeeSonar e3 = new EmployeeSonar("333","Ammu",26,4,50000);
		EmployeeSonar e4 = new EmployeeSonar("444","Annu",40,18,1200000);
		EmployeeSonar e5 = new EmployeeSonar("555","Achu",35,13,900000);
		EmployeeSonar e6 = new EmployeeSonar("666","Abbu",25,3,65000);
		
		List <EmployeeSonar> l1 = new ArrayList();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		
		
		//increment by 2.5%
		List  newlist1 = l1.stream().filter(e -> e.getNoOfYear() >= 1 && e.getNoOfYear() <= 3).map(e -> e.getSalary() * 1.025)
                .collect(Collectors.toList());
		//System.out.println(newlist1);
		
		
		//increment by 5%
		List  newlist2 = l1.stream().filter(e -> e.getNoOfYear() > 3 && e.getNoOfYear() <= 6).map(e -> e.getSalary() * 0.05 )
                .collect(Collectors.toList());
		//System.out.println(newlist2);
		
		
		//increment by 10%
		List  newlist3 = l1.stream().filter(e -> e.getNoOfYear() >6 && e.getNoOfYear() <= 10).map(e -> e.getSalary() * 0.10)
                .collect(Collectors.toList());
		//System.out.println(newlist3);
		
		
		//increment by 12%
		List  newlist4 = l1.stream().filter(e -> e.getNoOfYear() > 10 ).map(e -> e.getSalary() * 0.12)
                .collect(Collectors.toList());
		//System.out.println(newlist4);
		
		System.out.println(" increment by 2.5% " + newlist1+"\n increment by 5% "+newlist2 + "\n increment by 10% "+newlist3+"\n increment by 12% "+newlist4);

		
	}
}
//	}
//		else if ((l1.getNoOfYear(i)>3 &&l1.getNoOfYear(i)<=6))
//				{
//			double newSalary =l1.getSalary(i)*5/100;
//			System.out.println(newSalary);
//				}
//
//		else if((l1.getNoOfYear(i)>6&&l1.getNoOfYear(i)<=10))
//				{
//			double newSalary=l1.getSalary(i)*10/100;
//			System.out.println(newSalary);
//					}
//		else {
//			
//		double newSalary =l1.getSalary(i)*12/100;
//		System.out.println(newSalary);
//		}
//	}
//		System.out.println(newlist);
//		}}
		

	

		
		

