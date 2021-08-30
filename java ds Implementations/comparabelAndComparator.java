// "static void main" must be defined in a public class.




public class Main {
    
     static class Employee implements Comparable<Employee>{
        String name;
        int empId;
        int salary;
        
        Employee(String name, int empId, int salary){
            this.name = name;
            this.empId = empId;
            this.salary = salary;
        }
         
        public int compareTo(Employee o){
            return this.salary - o.salary;
        }

         
        public String toString(){
            return "Name = " + this.name + ", EmpId = " + this.empId 
                + ", salary = " + this.salary;
        }
        
    }
    
    static class EmpoyeeIdComparator implements Comparator<Employee>{
        public int compare(Employee e1, Employee e2){
            return e1.empId - e2.empId;
        }
    }
    
    static class EmployeeNameComparator implements Comparator<Employee>{
        public int compare(Employee e1, Employee e2){
            return e1.name.compareTo(e2.name);
        }
    }
    
    
    public static void main(String[] args) {
        // PriorityQueue<Employee> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // if i will not pass any object comparator in priorityqueue constructor then by default it will sort by salary because employee class itself implements comparable on the basis of salary
        
        // if i will pass any object comparator then on the basis of that comparator it will sort the data
        PriorityQueue<Employee> pq = new PriorityQueue<>(new EmployeeNameComparator());

        pq.add(new Employee("Manish", 59580, 61000));
        pq.add(new Employee("Vibhishan", 54850, 53000));
        pq.add(new Employee("Bipul", 14520, 54000));
        pq.add(new Employee("Rakesh", 96850, 93000));
        pq.add(new Employee("Saurabh", 47850, 52000));

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
        
    }
}
