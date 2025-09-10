package FetchTechnique;

import OneToOneMapping.Question;
import jakarta.persistence.*;

@Entity
public class Ans {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    @ManyToOne //many question have one ans
    private Que question;

    public Ans(){
        super();
    }

    public Ans(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Que getQuestion() {
        return question;
    }

    public void setQuestion(Que question) {
        this.question = question;
    }
}
