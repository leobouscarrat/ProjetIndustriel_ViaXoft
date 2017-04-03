package com.viaxoft.pi.beans;

public class Survey_answer {
	private int survey_answer_id;
	private int survey_response_id;
	private int survey_question_id;
	private String answer_text;
	private boolean answer_bool;
	private int answer_grade;

    public void setSurvey_answer_id( int survey_answer_id ) {
        this.survey_answer_id = survey_answer_id;
    }
    public int getSurvey_answer_id() {
        return survey_answer_id;
    }
    
    public void setSurvey_response_id( int survey_response_id ) {
        this.survey_response_id = survey_response_id;
    }
    public int getSurvey_response_id() {
        return survey_response_id;
    }
	
    public void setSurvey_question_id( int survey_question_id ) {
        this.survey_question_id = survey_question_id;
    }
    public int getSurvey_question_id() {
        return survey_question_id;
    }
    
    public void setAnswer_text( String answer_text ) {
        this.answer_text = answer_text;
    }
    public String getAnswer_text() {
        return answer_text;
    }
    
    public void setAnswer_bool( boolean answer_bool ) {
        this.answer_bool = answer_bool;
    }
    public boolean getAnswer_bool() {
        return answer_bool;
    }
    
    public void setAnswer_grade( int answer_grade ) {
        this.answer_grade = answer_grade;
    }
    public int getAnswer_grade() {
        return answer_grade;
    }
	
}
