package com.viaxoft.pi.beans;

enum Question_type {grade, bool;}

public class Survey_question {
	private int survey_question_id;
	private int survey_page_id;
	private String question_title;
	private Question_type question_type;
	private int question_order;
	private boolean answer_needed;
	private boolean enable_question;
	private int answer_grade_min;
	private int answer_grade_max;
	private int answer_grade_nb_values;
	private String answer_grade_max_label;
	private String answer_grade_min_label;
	private boolean answer_bool_true_label;
	private boolean answer_bool_false_label;
	private Survey_answer answer;
	
    public void setSurvey_question_id( int survey_question_id ) {
        this.survey_question_id = survey_question_id;
    }
    public int getSurvey_question_id() {
        return survey_question_id;
    }
    
    public void setSurvey_page_id( int survey_page_id ) {
        this.survey_page_id = survey_page_id;
    }
    public int getSurvey_page_id() {
        return survey_page_id;
    }
    
    public void setQuestion_title( String question_title ) {
        this.question_title = question_title;
    }
    public String getQuestion_title() {
        return question_title;
    }
	
    public void setQuestion_type( Question_type question_type ) {
        this.question_type = question_type;
    }
    public Question_type getQuestion_type() {
        return question_type;
    }
    
    public void setQuestion_order( int question_order ) {
        this.question_order = question_order;
    }
    public int getQuestion_order() {
        return question_order;
    }
    
    public void setAnswer_needed( boolean answer_needed ) {
        this.answer_needed = answer_needed;
    }
    public boolean getAnswer_needed() {
        return answer_needed;
    }
    
    public void setEnable_question( boolean enable_question ) {
        this.enable_question = enable_question;
    }
    public boolean getEnable_question() {
        return enable_question;
    }
    
    public void setAnswer_grade_min( int answer_grade_min ) {
        this.answer_grade_min = answer_grade_min;
    }
    public int getAnswer_grade_min() {
        return answer_grade_min;
    }
    
    public void setAnswer_grade_max( int answer_grade_max ) {
        this.answer_grade_max = answer_grade_max;
    }
    public int getAnswer_grade_max() {
        return answer_grade_max;
    }
    
    public void setAnswer_grade_nb_values( int answer_grade_nb_values ) {
        this.answer_grade_nb_values = answer_grade_nb_values;
    }
    public int getAnswer_grade_nb_values() {
        return answer_grade_nb_values;
    }

    public void setAnswer_grade_max_label( String answer_grade_max_label ) {
        this.answer_grade_max_label = answer_grade_max_label;
    }
    public String getAnswer_grade_max_label() {
        return answer_grade_max_label;
    }
    
    public void setAnswer_grade_min_label( String answer_grade_min_label ) {
        this.answer_grade_min_label = answer_grade_min_label;
    }
    public String getAnswer_grade_min_label() {
        return answer_grade_min_label;
    }
    
    public void setAnswer_bool_true_label( boolean answer_bool_true_label ) {
        this.answer_bool_true_label = answer_bool_true_label;
    }
    public boolean getAnswer_bool_true_label() {
        return answer_bool_true_label;
    }
    
    public void setAnswer_bool_false_label( boolean answer_bool_false_label ) {
        this.answer_bool_false_label = answer_bool_false_label;
    }
    public boolean getAnswer_bool_false_label() {
        return answer_bool_false_label;
    }
    
    public void setAnswer( Survey_answer answer ) {
        this.answer = answer;
    }
    public Survey_answer getAnswer() {
        return answer;
    }
    
}
