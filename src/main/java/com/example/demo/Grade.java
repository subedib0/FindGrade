package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Grade {
    @RequestMapping("/")
    public String ShowIndex()
    {
        int studentNum;
        String studentName;
        double testScore;
        double calculatedScore;
        char letterGrade = ' ';
        String grade = " ";
        Scanner keyboard = new Scanner(System.in);
System.out.println("Enter your student number");

        studentNum = keyboard.nextInt();
        System.out.println("Enter your student Name");

        studentName = keyboard.next();
        System.out.println("Enter Test Grade");

        testScore = keyboard.nextDouble();

        calculatedScore = (testScore / 50) * 100;

        if (calculatedScore > 89)

            letterGrade = 'A';
        else if (calculatedScore > 79 && calculatedScore <= 89)
            letterGrade = 'B';

        else if (calculatedScore > 69 && calculatedScore <= 79)
            letterGrade = 'C';


        else if (calculatedScore > 59 && calculatedScore <= 69)
            letterGrade = 'D';

        else if (calculatedScore > 49 && calculatedScore <= 59)
            letterGrade = 'F';


        System.out.println("Student Name =" + studentName + "Student Number = " + studentNum + "Student Test Score =" + testScore + "Student Grade =" + letterGrade);

        grade = "Student Name =" + studentName + "Student Number = " + studentNum + "Student Test Score =" + testScore + "Student Grade =" + letterGrade;
        return grade;


    }

}


