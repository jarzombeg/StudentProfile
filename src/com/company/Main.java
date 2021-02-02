package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentProfile StudentA =new StudentProfile("Jim", "Watt", 2019, 3.75, "History");
        StudentProfile StudentB =new StudentProfile("Jon", "Duke", 2025, 3.42, "Math");

        StudentB.incrementExpectedGraduationYear();
        System.out.println(StudentB.expectedYearToGraduate);
    }
}
