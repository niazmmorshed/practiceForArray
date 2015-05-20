/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

/**
 *
 * @author Niaz-Sima
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         import java.util.*; 
 2. 
 3. public class EmployeeTest 
 4. { 
 5.    public static void main(String[] args) 
 6.    { 
 7.       // fill the staff array with three Employee objects 
 8.       Employee[] staff = new Employee[3]; 
 9. 
10.       staff[0] = new Employee("Carl Cracker", 75000, 
11.          1987, 12, 15); 
12.       staff[1] = new Employee("Harry Hacker", 50000, 
13.          1989, 10, 1); 
14.       staff[2] = new Employee("Tony Tester", 40000, 
15.          1990, 3, 15); 
16. 
17.       // raise everyone's salary by 5% 
18.       for (int i = 0; i < staff.length; i++) 
19.          staff[i].raiseSalary(5); 
20. 
21.       // print out information about all Employee objects 
22.       for (int i = 0; i < staff.length; i++) 
23.       { 
24.          Employee e = staff[i]; 
25.          System.out.println("name=" + e.getName() 
26.             + ",salary=" + e.getSalary() 
27.             + ",hireDay=" + e.getHireDay()); 
28.       } 
    }
    
}
