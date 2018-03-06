package zavod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class MainZavod {
    public static void main(String[] args) {


       ArrayList<Employer> employerList= new ArrayList<>(5);
        System.out.println(employerList.size());
       employerList.add(new Manager("Vaisa",3,4));
        employerList.add(new Manager("Andru",2,1));
        employerList.add(new Manager("Max",5,3));
        employerList.add(new Worker("Vova",1,2));
        employerList.add(new Worker("Nikit",4,1));
        employerList.add(new Worker("Told",6,2));

        Iterator iterator= employerList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

       // System.out.println(employerList.isEmpty());

        //for (Employer employer:employerList){
          //  if(employer instanceof Worker){
            //    System.out.println("I am worker");
         //   }else{
             //   System.out.println("I am manager");
          //  }
          //  System.out.println(employer.getName()+" "+employer.getYear()+" "+employer.doSalary());
          //  System.out.println(employerList.size());
       // System.out.println(employerList.removeFirst());
       // System.out.println(employerList.size());
        }
    }

