package org.homwork3;
public class Answer {
    private int number;
    private String text;
    private Boolean isCorrectAnswer;

    public Answer(int number, String text, Boolean isCorrectAnswer) {
        this.number = number;
        this.text = text;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public void print_answer_variant() {
        System.out.printf(
                "%s. %s\n",
                number, text);
    }

    public Boolean check_answer() {
        return this.isCorrectAnswer;
    }

}