package org.example;

public class FillInBlankQuestion extends Questions{
    public FillInBlankQuestion() {

    }

    public FillInBlankQuestion(String questions, int points, String correctAnswer) {
        super(questions, points,correctAnswer);
    }


    @Override
    public int evaluate(String userInput) throws InvalidAnswerFormatException {
        return userInput.trim().equalsIgnoreCase(getCorrectAnswer())?getPoints():0;
    }

    @Override
    public String toString() {
        return getQuestions()+"\n";
    }
}
