package com.viaxoft.pi.beans;

public class Survey_page {
	private int survey_page_id;
	private int survey_id;
	private String page_title;
	private int page_order;
	private Survey_question[] survey_question;
	
    public void setSurvey_page_id( int survey_page_id ) {
        this.survey_page_id = survey_page_id;
    }

    public int getSurvey_page_id() {
        return survey_page_id;
    }
    
    public void setSurvey_id( int survey_id ) {
        this.survey_id = survey_id;
    }

    public int getSurvey_id() {
        return survey_id;
    }
    
    public void setPage_title( String page_title ) {
        this.page_title = page_title;
    }

    public String getPage_title() {
        return page_title;
    }
    
    public void setPage_order( int page_order ) {
        this.page_order = page_order;
    }

    public int getPage_order() {
        return page_order;
    }
    
    public void setSurvey_question( Survey_question survey_question, int i ) {
        this.survey_question[i] = survey_question;
    }
    public Survey_question getSurvey_question(int i) {
        return survey_question[i];
    }
    
}
