package org.example;

import java.util.List;

public class MCQQuestions extends Questions{
    private List<String> options;

    public MCQQuestions()
    {

    }

    public MCQQuestions(String questions, int points, List<String> options, String correctAnswer) {
        super(questions, points,correctAnswer);
        this.options=options;

    }

    @Override
    public int evaluate(String userInput) throws InvalidAnswerFormatException {


        return userInput.equalsIgnoreCase(getCorrectAnswer()) ? getPoints() : 0;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getQuestions()).append("\n");
        char opt = 'a';
        for (String option : options) {
            sb.append(opt).append(". ").append(option).append("\n");
            opt++;
        }
        return sb.toString();
    }
}
