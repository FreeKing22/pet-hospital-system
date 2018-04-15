package com.cui.phs.entity;

import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
public class QuizEntity {

    private int id;
    private int disease_id;
    private String question;
    private String choice_list;
    private List<String> choiceList;
    private String answer;

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(int disease_id) {
        this.disease_id = disease_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoice_list() {
        return choice_list;
    }

    public void setChoice_list(String choice_list) {
        this.choice_list = choice_list;
    }

    public List<String> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        this.choiceList = choiceList;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
