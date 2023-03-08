package cafe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lsst l1 = new lsst("veg meals",80,1);
		lsst l2 = new lsst("fish curry meals",120,2);
		lsst l3 = new lsst("chapathi veg curry",40,3);
		lsst l4 = new lsst("chapathi chicken curry",120,4);
		lsst l5 = new lsst("veg fried rice",60,5);
		lsst l6 = new lsst("chicken fried rice",150,6);
		
		List<lsst> ls = Arrays.asList(l1,l2,l3,l4,l5,l6);
		//ls.forEach(t->System.out.println(t));
		
		Scanner n = new Scanner(System.in);
		//String nme;
		Emplo e = new Emplo(0,null);
		System.out.println("Enter Details : \n\n");
		System.out.println("Enter name : ");
		e.setName(n.next());
		System.out.println("\nEnter uid : ");
		e.setUid(n.nextInt());
		List<Emplo> em = Arrays.asList(e);
		em.forEach(t->System.out.println(t));
		int ans,ch;
		do {
		System.out.println("\nFood Details\n\n");
		ls.forEach(t->System.out.println(t.getId()+" "+t.getFoodname()+" "+t.getPrice()+"\n"));
		System.out.println("Choose your choice : \n");
		ch = n.nextInt();
		System.out.println("\nDo you want to change ? 0 for yes 1 for no (0/1)");
		ans = n.nextInt();
		}while(ans==0);
		int a = ch;
		List<lsst> lss = ls.stream().filter(t->t.getId()==a).toList();
		System.out.println("\nThe Details are : \n");
		em.forEach(t->System.out.println("UID: "+t.getUid()+"\n"+"Name : "+t.getName()));
		lss.forEach(t->System.out.println("Food Name : "+t.getFoodname()+"\n"+"Food Price : "+t.getPrice()));
		n.close();
		}

}



