package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String,Questions> questions=new LinkedHashMap<>();

        questions.put("Which language is platform-independent?",new MCQQuestions("Which language is platform-independent?",2,
                List.of("Java", "C++", "Python", "C#"),"Java"));

        questions.put("Java supports multithreading",new TrueOrFalseQuestions("Java supports multithreading",1,
                "True"));
        questions.put("____ is the father of Java",new FillInBlankQuestion("____ is the father of Java",3,
                "James Gosling"));
        questions.put("Which of these is not a Java primitive type?",new MCQQuestions(
                "Which of these is not a Java primitive type?",
                2,
                List.of("int", "float", "String", "boolean"),
                "String"
        ));

        questions.put("Which keyword is used to inherit a class in Java?",new MCQQuestions(
                "Which keyword is used to inherit a class in Java?",
                2,
                List.of("implements", "extends", "inherits", "super"),
                "extends"
        ));

        questions.put("Which of these is a valid Java access modifier?",new MCQQuestions(
                "Which of these is a valid Java access modifier?",
                2,
                List.of("public", "private", "protected", "all of the above"),
                "all of the above"
        ));

        questions.put("What is the default value of a boolean in Java?",new MCQQuestions(
                "What is the default value of a boolean in Java?",
                1,
                List.of("true", "false", "0", "null"),
                "false"
        ));


        questions.put("Java supports multiple inheritance through classes",new TrueOrFalseQuestions(
                "Java supports multiple inheritance through classes",
                1,
                "False"
        ));

        questions.put("The 'final' keyword can be used with classes, methods, and variables",new TrueOrFalseQuestions(
                "The 'final' keyword can be used with classes, methods, and variables",
                1,
                "True"
        ));

        questions.put("The 'static' keyword belongs to the object instance",new TrueOrFalseQuestions(
                "The 'static' keyword belongs to the object instance",
                1,
                "False"
        ));

        questions.put("'ArrayList' in Java can dynamically grow in size",new TrueOrFalseQuestions(
                "'ArrayList' in Java can dynamically grow in size",
                1,
                "True"
        ));


        questions.put("The '____' keyword is used to handle exceptions in Java",new FillInBlankQuestion(
                "The '____' keyword is used to handle exceptions in Java",
                2,
                "try"
        ));

        questions.put("Java programs are compiled into '____' before execution",new FillInBlankQuestion(
                "Java programs are compiled into '____' before execution",
                2,
                "bytecode"
        ));

        questions.put("The method that runs when a Java program starts is called '____'",new FillInBlankQuestion(
                "The method that runs when a Java program starts is called '____'",
                2,
                "main"
        ));

        questions.put("'____' is used to create a new object in Java",new FillInBlankQuestion(
                "'____' is used to create a new object in Java",
                2,
                "new"
        ));
        Quiz quiz=new Quiz(questions);
        quiz.saveToFile("questions.json");
        Map<String,Questions> questions1=quiz.loadFromFile("questions.json");
        int n=1;
        System.out.println("Quiz Questions.......");
        for(Questions q:questions1.values())
        {

            System.out.println(n+". "+q);
            n++;
        }
        Scanner sc=new Scanner(System.in);
        Map<String,String> userAnswers = new LinkedHashMap<>();
        String answer;
        for(String q: questions.keySet())
        {
            answer=sc.nextLine();
            userAnswers.put(q,answer);
        }
        quiz.evaluate(userAnswers);





    }
}