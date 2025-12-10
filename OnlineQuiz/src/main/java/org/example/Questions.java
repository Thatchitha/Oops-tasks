package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MCQQuestions.class, name = "MCQQuestions"),
        @JsonSubTypes.Type(value = TrueOrFalseQuestions.class, name = "TrueOrFalseQuestions"),
        @JsonSubTypes.Type(value = FillInBlankQuestion.class, name = "FillInBlankQuestion")
})

public abstract class Questions {

    private String questions;
    private int points;
    private String correctAnswer;

    public Questions() {
    }

    public Questions(String questions, int points, String correctAnswer) {

        this.questions = questions;
        this.points = points;
        this.correctAnswer=correctAnswer;
    }
    public String getQuestions() {
        return questions;
    }

    public int getPoints() {
        return points;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public abstract int evaluate(String userInput) throws InvalidAnswerFormatException;

//    @Override
//    public String toString() {
//        return "Questions{" +
//                "questions='" + questions + '\'' +
//                ", points=" + points +
//                '}';
//    }
}
