package Stream.Problem.CollectionEmployes;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass 
{
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Sai", "IT", 55000, 25, "Male");
        Employee e2 = new Employee(2, "Teja", "HR", 48000, 27, "Male");
        Employee e3 = new Employee(3, "Anita", "Finance", 62000, 30, "Female");
        Employee e4 = new Employee(4, "Rahul", "Sales", 45000, 28, "Male");
        Employee e5 = new Employee(5, "Priya", "IT", 70000, 32, "Female");
         Employee e6 = new Employee(6, "Priya", "IT", 70000, 32, "Female");

        List<Employee> employees = List.of(e1, e2, e3, e4, e5,e6);

        // 1️⃣ Group by department

        Map<String,List<Employee>> emplBydept = 
                                                employees.stream()
                                                .collect(Collectors.groupingBy(c->c.dept));

        // System.out.println(emplBydept);
        //   for(Map.Entry<String,List<Employee>> entry : emplBydept.entrySet())
        //   {
        //          System.out.println("----"+entry.getKey()+"-----");

        //          for(Employee e:entry.getValue()){
        //             System.out.println(e.getName());
        //          }
        //   }

        // emplBydept.entrySet().stream()
        // .entry().forEach(System.out.print(entry.getKey))
        
        // ;
//32️⃣ Count per department
      Map<String,Long> empCountPerDept =
                                            employees.stream()
                                            .collect(Collectors.groupingBy(e->e.dept,Collectors.counting()));

    //  System.out.println(empCountPerDept);


    //  33️⃣ Highest paid employee

     Employee highestPaidEmployee= employees.stream()
                                             .max(Comparator.comparing(
                                                Employee::getSalary)).get();

    //   System.out.println(highestPaidEmployee.getName()+" "+highestPaidEmployee.getSalary());




    // 34️⃣ Max salary per department
    Map<String,Optional<Employee>> maxSalByDept =
       employees.stream()
                .collect(Collectors.groupingBy(
                    c->c.dept,      /// key -> dept
                    Collectors.maxBy(Comparator.comparing(e->e.salary)) /// value -> employee based on salary 
                ));

        // for(Map.Entry<String, Optional<Employee>> entry :maxSalByDept.entrySet())
        // {
        //     System.out.println("Department"+entry.getKey());

        //     if(entry.getValue().isPresent())
        //     {
        //         Employee employee1 = entry.getValue().get();
        //         System.out.println(employee1.getName()+" "+employee1.getSalary());
        //     }
        // }



        // 35️⃣ Sort by salary
          List<Employee> empSortedByList =   employees.stream()
             .sorted(Comparator.comparing(Employee::getSalary)).toList();


            //  for (Employee employee : empSortedByList)
            //  {
            //     System.out.println(
            //     employee.getName() +" Salart "+employee.getSalary());
            //  }


            // 36️⃣ Average salary per department

        Map<String,Double> empAveSalPerDep=   employees.stream().
            collect(Collectors.groupingBy(
                c->c.dept,
                Collectors.averagingDouble(e->e.salary)
            ));
        /// print using EntrySet
        //   System.out.println(empAveSalPerDep);



            // 37️⃣ List → Map<id, name>
            Map<Integer,String> empMap = 
            employees.stream().collect(
                Collectors.toMap(
                    e->e.id, 
                    e->e.name)
            );

            // for(Map.Entry<Integer,String> entry : empMap.entrySet()){
            //        System.out.println(entry.getKey()+"->"+entry.getValue());
            // }


            // 38 Duplicate elements

            // need learn and solve 

           Map<Employee,Long> mapemp=  employees.stream()
             .collect(Collectors.groupingBy(
                c->c,Collectors.counting()
             ));

        List<Employee> dupEmp=mapemp.entrySet().stream()
             .filter(e->e.getValue()>1)
             .map(e->e.getKey())
             .collect(Collectors.toList());

            //  System.out.println(dupEmp);
   
        // 39️⃣ Partition by gender

       Map<String,List<Employee>> genderbasedEmpl =   employees.stream()
          .collect(Collectors.groupingBy(
            e->e.gender
          ));

        //   for(Map.Entry<String,List<Employee>> entry:genderbasedEmpl.entrySet())
        //   {
        //     System.out.println("---"+entry.getKey()+"---");
        //     for(Employee emp : entry.getValue())
        //     {
        //         System.out.println(emp.name);
        //     }
        //   }


        //   40️⃣ Youngest / Oldest
         Optional<Employee> oldest =   employees.stream()
                                        .max(Comparator.comparing(Employee::getAge));

        Optional<Employee> youngest = employees.stream()
                                      .min(Comparator.comparing(Employee::getAge));

            System.out.println(" Youngest "+ youngest.get().getName() + youngest.get().getDept()+
               " Oldest "+ oldest.get().getName() + oldest.get().getDept());



    












    









    }
}
