package com.example.asus.projcet;

public class QuestionLibrary {
    private String mQuestions[] = {
            "มือ ภาษาอังกฤษ คืออะไร",
            "แขน ภาษาอังกฤษ คืออะไร",
            "ไหล่ ภาษาอังกฤษ คืออะไร",
            "ลำตัว ภาษาอังกฤษ คืออะไร",
            "หัวเข่า ภาษาอังกฤษ คืออะไร",
            "ขา ภาษาอังกฤษ คืออะไร",
            "เท้า ภาษาอังกฤษ คืออะไร"
    };


    private String mChoices[][] = {
            {"hand","arm","shoulder","body"},
            {"hand","arm","shoulder","body"},
            {"hand","arm","shoulder","body"},
            {"hand","arm","shoulder","body"},
            {"hand","knee","leg","foot"}
    };

    private String mCorrectAnswers[] = {"hand","arm","shoulder","body","knee","leg","foot"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
