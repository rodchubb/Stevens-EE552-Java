/*
* Class: EE-552-WS Fall 2020
* Assignment: Week 4, Introductions
* Author/Student: Roderick Chubb
*/


// "Student" Class Declaration
public class Student {
    
    // Instance Variables
    String firstName;
    String lastName;
    int age;
    // The "gender" variable is expected to take one of three values (F)emale,
    // (M)ale, (T)hey. There is no error checking.
    // TODO: write regex to enforce this.
    char gender;
    String degreeProgram;
    // The "expectedGraduationDate" variable indicates the final semester's 
    // month and year. It is expected to take the form "MM.YYYY" for example 
    // "202112". There is no error checking.
    // TODO: write regex to enforce this.
    String expectedGraduationDate;
    String studentIntroductionStatement;

    // Constructor of "Student" Class 
    public Student(String firstName, String lastName, int age, char gender,
            String degreeProgram, String expectedGraduationDate,
            String studentIntroductionStatement) 
    {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = age; 
        this.gender = gender;
        this.degreeProgram = degreeProgram;
        this.expectedGraduationDate = expectedGraduationDate;
        this.studentIntroductionStatement = studentIntroductionStatement;
    }

    // Methods of "Student" Class
    // Method 1 - firstName
    public String returnFirstName() 
    { 
        return firstName; 
    } 
  
    // Method 2 - lastName
    public String returnLastName() 
    { 
        return lastName; 
    } 
  
    // Method 3 - age
    public int returnAge() 
    { 
        return age; 
    } 
  
    // Method 4 - gender
    public char returnGender() 
    { 
        return gender; 
    }

    // Method 5 - degreeProgram
    public String returnDegreeProgram() 
    { 
        return degreeProgram; 
    }

    // Method 6 - expectedGraduationDate
    public String returnExpectedGraduationDate() 
    { 
        return expectedGraduationDate; 
    }

    // Method 7 - studentIntroductionStatement
    public String returnStudentIntroductionStatement() 
    { 
        return studentIntroductionStatement; 
    }

    
    public String studentRecord() 
    { 
        return("\nHi, my name is " + this.returnFirstName() + " " + 
                this.returnLastName() + ".\nI am " + this.returnAge() +
                " years old.\nIn regard to gender, I identify as " + 
                this.returnGender() + ".\nI am enrolled in the " + 
                this.returnDegreeProgram() + ".\nMy expected date of" +
                " gradution is " + this.returnExpectedGraduationDate() +
                returnStudentIntroductionStatement());
    }

    public static void main(String[] args)
    {
        String references = "\n"
        + "\nREFERENCES:"
        +"\n"
        + "\nClasses and Objects in Java. (2018, September 05). Retrieved"
        + " September 23, 2020, from"
        + "\n\thttps://www.geeksforgeeks.org/classes-objects-java/"
        +"\n"
        + "\nJava - Character Class. (n.d.). Retrieved September 23, 2020, from"
        + "\n\thttps://www.tutorialspoint.com/java/java_characters.htm"
        + "\n"
        + "\nJenkov, J. (2018, October 11). Java Classes. Retrieved September"
        + " 23, 2020, from"
        + "\n\thttp://tutorials.jenkov.com/java/classes.html"
        + "\n"
        + "\nWhy doesn't Java have multi-line string literals?"
        + " (2018, January 27). Retrieved September 23, 2020, from"
        + "\n\thttps://www.quora.com/Why-doesnt-Java-have-multi-line-string"
        + "-literals"
	    + "\n";

        String authorStatement = "\n"
        + "AUTHOR STATEMENT: I, Roderick Chubb, am the author of this program." 
        + " I wrote it. This program is free of copyright issues as there was" 
        + " no plagiarism involved in its creation.";

        String stevensHonorStatement = "\n"
        + "STEVENS HONOR SYSTEM PLEDGE: I pledge my honor that I have abided"
        + " by the Stevens Honor System."
	    + "\n";

        // Introduction Statements must be created for each student
        // individually. This is a design choice.
        // TODO: Make Introduction Statement optional.
        String roderickStudentIntroductionStatement = "\n\nI do have some" 
        + " experience with Shell scripting and programming in Python which"
        + " I'm hoping to leverage in this class. There are some fundamental"
        + " concepts that seem to carry over but not all. And of course the"
        + " syntax is different. I have a terrible feeling that those are"
        + " going to be my famous last words. If I'm not careful I'll end up"
        + " writing Java code that looks disturbingly Pythonic :-)";
        
        // Creating an instance of "Student"
        Student roderick = new Student("Roderick","Chubb", 38, 'M',
        "Applied Atrificial Intelligence Program", "12.2021",
        roderickStudentIntroductionStatement); 
        
        //Output
        System.out.println(roderick.studentRecord());
        System.out.println(references);
        System.out.println(authorStatement);
        System.out.println(stevensHonorStatement);
    }
}
