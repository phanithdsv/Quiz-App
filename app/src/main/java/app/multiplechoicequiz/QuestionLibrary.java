package app.multiplechoicequiz;


public class QuestionLibrary {

    private String mQuestions []={
            "Which part of the plant holds it in the soil?",
            "This pat of plant absorbs energy from sun.",
            "This part of plant attracts butterfly.",
            "The _______ holds the plant upright."
    };

    private String mChoice[][]={
            {"Roots","Stem","Flower"},
            {"Fruit","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Flower","Leaves","Stem"}
    };
    private String mCorrectAnswers[]={"Roots","Leaves","Flower","Stem"};



    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0= mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1= mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2= mChoice[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }

}
