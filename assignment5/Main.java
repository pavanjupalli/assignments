package assignment5;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //reading n students from console
        List<Student> students = new ArrayList<>();
        Scanner scanner = Console.scanner;
        Integer n = scanner.nextInt();

        for(int i =0;i<n;i++) {
            students.add(new Student(scanner.nextInt(), scanner.next(), scanner.next()));
        }

        BussinessObject bussinessObject = new BussinessObject(students);

        bussinessObject.readStudent();

        Integer id =scanner.nextInt();
        bussinessObject.displayStudent(id);

        bussinessObject.displaySortedCities();

        bussinessObject.displaySortedNames();

        id=scanner.nextInt();

        try {
            bussinessObject.displayStudentForId(id);
        }
        catch (StudentNotFoundException exception){
            System.out.println(exception.getMessage());
        }



    }
}
