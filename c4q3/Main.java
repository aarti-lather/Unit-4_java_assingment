package c4q3;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Map<String, Employee> map1 = new HashMap<>();
        map1.put("HR",new Employee("1","aarti",100000.00));
        map1.put("Marketing",new Employee("2","nidhi",20000.00));
        map1.put("Accounts",new Employee("3","priya",800000.00));
        map1.put("Accounts",new Employee("4","amarjett",50000.00));


        Set<Map.Entry<String,Employee>>set=map1.entrySet();
        List<Map.Entry<String,Employee>>set2 =new ArrayList<>(set);

        Collections.sort(set2,((o1, o2) -> {
            Employee e1 = o1.getValue();
            Employee e2 = o2.getValue();
            return e1.getSalary()>e2.getSalary() ? +1 : -1;
        }));

        for(Map.Entry<String,Employee> es:set2){
            System.out.println("Department is: "+es.getKey());
            Employee em = es.getValue();
            System.out.println("id of employee is: "+em.getEmpId());
            System.out.println("Name of empoyee is: "+em.getEmpName());
            System.out.println("Salary of employee is: "+em.getSalary());
        }


    }
}