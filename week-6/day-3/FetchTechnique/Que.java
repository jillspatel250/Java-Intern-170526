package FetchTechnique;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Que {
    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER) //one quesion have many ans
    private List<Ans> answers;



    public Que(){
        super();
    }

    public Que(int questionId, String question, List<Ans> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Ans> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Ans> answers) {
        this.answers = answers;
    }
}
