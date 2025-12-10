package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.*;

public class Quiz {
    Map<String,Questions> questions=new LinkedHashMap<>();

    public Quiz() {
    }

    public Quiz(Map<String,Questions> questions) {
        this.questions = questions;
    }

    public Map<String,Questions> getQuestions() {
        return questions;
    }
    public void saveToFile(String filename) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("questions.json"), this);
    }
    public Map<String,Questions> loadFromFile(String filename) throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        Quiz loadedQuiz=mapper.readValue(new File(filename),Quiz.class);
        return loadedQuiz.getQuestions();
    }
    public void evaluate(Map<String,String> answer) throws InvalidAnswerFormatException {
        int totalScore = 0;
        int n=1;

        for (Map.Entry<String, Questions> entry : questions.entrySet()) {

            String questionText = entry.getKey();
            Questions questionObj = entry.getValue();

            String userInput = answer.getOrDefault(questionText, "Wrong answer");
            boolean isCorrect=userInput.equalsIgnoreCase(questionObj.getCorrectAnswer());
            System.out.println(n++ +". "+questionText);
            System.out.println( "Your answer: "+userInput);
            if(isCorrect)
            {
                System.out.println("Result: Correct answer");
                totalScore += questionObj.evaluate(userInput);

            }
            else {
                System.out.println("Result: Wrong answer");
                System.out.println("Correct: "+questionObj.getCorrectAnswer());
            }
            System.out.println("Total Score "+totalScore);

        }

    }


}
