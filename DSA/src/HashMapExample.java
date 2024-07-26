import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Employee,String> map = new HashMap<>();
        Employee e1=new Employee(12,"Raj",23000.00);
        Employee e2=new Employee(9,"Suresh",13000.00);
        Employee e3=new Employee(3,"Ganga",33000.00);
        Employee e4=new Employee(5,"Nikhil",73000.00);
        Employee e5=new Employee(1,"Sruthi",83000.00);
        Employee e6=new Employee(1,"Sruthi",83000.00);

        map.put(e1,"A");
        map.put(e2,"C");
        map.put(e3,"Z");
        map.put(e4,"a");
        map.put(e5,"F");
        map.put(e6,"s");

        System.out.println(map);

        //sort employee descening order
        Set<Map.Entry<Employee,String>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Employee,String>> list = new ArrayList<>(entrySet);

        Collections.sort(list, new Comparator<Map.Entry<Employee,String>>() {
            @Override
            public int compare(Map.Entry<Employee,String> o1, Map.Entry<Employee,String> o2) {
                //return o2.getKey().getEmpNo().compareTo(o1.getKey().getEmpNo());
                return Integer.compare(o2.getKey().getEmpNo(),o1.getKey().getEmpNo());
                //assening orer
//                return o1.getKey().getEmpNo()<o2.getKey().getEmpNo()? -1 :
//                        (o1.getKey().getEmpNo()==o2.getKey().getEmpNo()) ? 0 : 1;
                //dessening orer
//                return o2.getKey().getEmpNo()<o1.getKey().getEmpNo()? -1 :
//                        (o2.getKey().getEmpNo()==o1.getKey().getEmpNo()) ? 0 : 1;
            }
        });
        Map<Employee,String> employeeStringMap = new LinkedHashMap<>();
        for(Map.Entry<Employee,String> emp:list){
           employeeStringMap.put(emp.getKey(),emp.getValue());
        }
        System.out.println("Sort by EmpID Desening: "+employeeStringMap);
    }
}
