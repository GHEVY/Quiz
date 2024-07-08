package com.example.quiz;

public class Question {
    private String question;
    private String answer;
    private String wronganswer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getWronganswer() {
        return wronganswer;
    }

    public void setWronganswer(String wronganswer) {
        this.wronganswer = wronganswer;
    }
}
