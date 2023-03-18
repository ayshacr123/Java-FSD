/* Create a Emp object with the attributes with the logic Incrementation of salary 
  if noOfYears in 1-3 then increment by 2.5%, similarly if in 3-6years 5% increment, 6-10 yrs - 10% incre., above 10 years - 12%
  */
 

/**
 * 
 */
package batch_three_ust.sonarqube;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Administrator
 *
 */
public class MainEmpSonar {

	/**
	 * @param <EmployeeSonar>
	 * @param args
	 */
	public static  void main(String[] args) {
		

		
		List <EmployeeSonar> l1 =new ArrayList<>();
		l1.add(new EmployeeSonar("111","Appu",30,8,100000));
		l1.add(new EmployeeSonar("222","Akku",22,1,30000));
		l1.add(new EmployeeSonar("333","Ammu",26,4,50000));
		l1.add(new EmployeeSonar("444","Annu",40,18,1200000));
		l1.add(new EmployeeSonar("555","Achu",35,13,900000));
		l1.add(new EmployeeSonar("666","Abbu",25,3,65000));
		
		List <Double> newlist1 = l1.stream().filter(e -> e.getNoOfYear() >=1  && e.getNoOfYear() <= 3).map(e -> e.getSalary()+e.getSalary() * 0.025 )
                .collect(Collectors.toList());
	
		List <Double> newlist2 = l1.stream().filter(e -> e.getNoOfYear() > 3 && e.getNoOfYear() <= 6).map(e -> e.getSalary()+e.getSalary() * 0.05 )
                .collect(Collectors.toList());
	
		List <Double> newlist3 = l1.stream().filter(e -> e.getNoOfYear() >6 && e.getNoOfYear() <= 10).map(e -> e.getSalary()+e.getSalary() * 0.10)
               .collect(Collectors.toList());
		
		List <Double> newlist4 = l1.stream().filter(e -> e.getNoOfYear() > 10 ).map(e -> e.getSalary()+e.getSalary() * 0.12)
                .collect(Collectors.toList());
		
		
		System.out.println(" increment by 2.5% " + newlist1+"\n increment by 5% "+newlist2 + "\n increment by 10% "+newlist3+"\n increment by 12% "+newlist4);
	}
}







		

	

		
		

