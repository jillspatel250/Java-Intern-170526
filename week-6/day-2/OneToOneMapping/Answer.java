package OneToOneMapping;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    @OneToOne(mappedBy = "answer") //so have mappedBy answer lakhi dehdu etle have answer attirbute j banavse foriegn key aa nai kare kasu..
    @JoinColumn( name = "q_a")
    private Question question;

    public Answer(){
        super();
    }

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
