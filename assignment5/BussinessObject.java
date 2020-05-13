package assignment5;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BussinessObject{

    List<Student> students;

    public BussinessObject(List<Student> students) {
        this.students = students;
    }

    public void readStudent(){

        Scanner scanner = Console.scanner;
        students.add(new Student(scanner.nextInt(), scanner.next(), scanner.next()));
        return;
    }

    public void displayStudent(Integer id){
        for(Student student:students){
            if(student.getId().equals(id)){
                System.out.println(student);
                return;
            }
        }
    }

    public void displayStudentsForCity(String city){
        for(Student student: students){
            if(student.getCity().equals(city)){
                System.out.println(student);
            }
        }


    }

    public void displaySortedNames(){
        Collections.sort(students,new NameComparator() );
        System.out.println(students);
    }

    public void displaySortedCities(){
        Collections.sort(students,new CityComparator());
        System.out.println(students);
    }


    public void displayStudentForId(Integer id) throws StudentNotFoundException{

        boolean find = false;

        for(Student student : students){
            if(student.getId().equals(id)){
                find = true;
                System.out.println(student);
            }
        }

        if(!find)
        throw new StudentNotFoundException("student with id: "+id +" not found");

        return;
    }


}
