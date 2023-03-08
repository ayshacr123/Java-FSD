
		package functionintefrace;

		import java.util.Arrays;
		import java.util.Comparator;
		import java.util.List;
		import java.util.stream.Collectors;


		public class Salary {

			public static void main(String[] args) {
				Employeedetails m1=new Employeedetails("123", "Akku", 300000);
				Employeedetails m2=new Employeedetails("113", "Achu", 4000);
				Employeedetails m3=new Employeedetails("103", "Appu", 80000);
				List<Employeedetails> list=Arrays.asList(m1,m2,m3);
				List<Employeedetails> lis = list.stream().sorted(Comparator.comparing(Employeedetails::getSalary).reversed())
						.peek(k->{
						if((k.getSalary()>=50000)&&(k.getSalary()<100000))
							k.setSalary(k.getSalary()+(0.1)*k.getSalary());
						else if(k.getSalary()>=100000)
							k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
					      ).toList();
						
				
							 
				System.out.println(lis);
				
			}

		}


