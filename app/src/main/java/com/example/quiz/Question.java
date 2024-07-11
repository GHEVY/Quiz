package com.example.quiz;

public class Question {
    private String question;
    private String answer;
    private String wrongAnswer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }


    public String getAnswer() {
        return answer;
    }

    public String getWrongAnswer() {
        return wrongAnswer;
    }


}
