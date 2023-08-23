package org.homwork3;
import java.util.Scanner;


public class TestDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Question[] questions = {
                new Question(1, "Столица России?"),
                new Question(2, "Что лишнее?"),
                new Question(3, "Название замка во Франции?"),
        };

        Answer[][] answers = {
                {new Answer(1, "Рим", false), new Answer(2, "Вена", false), new Answer(3, "Москва", true)},
                {new Answer(1, "Пицца", false), new Answer(2, "Вино", true), new Answer(3, "Паста", false)},
                {new Answer(1, "Каркасон", true), new Answer(2, "Брест", false), new Answer (3, "Вигвам", false)}
        };

        Counter correctAnswersSum  = new Counter();

        for (int i = 0; i < questions.length; i++) {
            questions[i].print_question();
            for (int j = 0; j < answers[i].length; j++) {
                answers[i][j].print_answer_variant();
            }

            try {
                int userAnswer = sc.nextInt();
                int userAnswerIndex = userAnswer - 1;
                if (answers[i][userAnswerIndex].check_answer()) {
                    System.out.println("Верно.\n");
                    correctAnswersSum.increaseCount();
                } else {
                    System.out.println("Неверно.\n");
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите ответ цифрой.\n");
                sc.next();
                i -= 1;
            }
        }


        System.out.println("Всего правильных ответов: " + correctAnswersSum.getCount() + " из " + questions.length + ".");
    }
}