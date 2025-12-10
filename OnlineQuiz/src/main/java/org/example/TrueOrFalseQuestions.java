package org.example;

import java.util.List;

public class TrueOrFalseQuestions extends Questions{
    private List<String> options=List.of("True","False");

    public TrueOrFalseQuestions() {
    }

    public TrueOrFalseQuestions(String questions, int points, String correctAnswer ) {
        super(questions, points,correctAnswer);

    }

    @Override
    public int evaluate(String userInput) throws InvalidAnswerFormatException {
        return userInput.equalsIgnoreCase(getCorrectAnswer())?getPoints():0;
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append(getQuestions()).append("\n");
       char c='a';
       for(String option:options)
       {
           sb.append(c).append(". ").append(option).append("\n");
           c++;
       }
       return sb.toString();
    }
}
