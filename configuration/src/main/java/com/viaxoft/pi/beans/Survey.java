package com.viaxoft.pi.beans;

enum Survey_state {draft, ongoing, finished;}

public class Survey {
	private int survey_id;
	private int company_id;
	private String survey_title;
	private Survey_state survey_state;
	private String creation_date;
	private String last_change_date;
	private String start_date;
	private String end_date;
	private Survey_page[] survey_page;
	
    public void setSurvey_id( int survey_id ) {
        this.survey_id = survey_id;
    }

    public int getSurvey_id() {
        return survey_id;
    }
	
    public void setCompany_id( int company_id ) {
        this.company_id = company_id;
    }

    public int getCompany_id() {
        return company_id;
    }
	
    public void setState( Survey_state survey_state ) {
        this.survey_state = survey_state;
    }

    public Survey_state getState() {
        return survey_state;
    }
    
    public void setTitle( String survey_title ) {
        this.survey_title = survey_title;
    }

    public String getTitle() {
        return survey_title;
    }
    
    public void setCreation_date( String creation_date ) {
        this.creation_date = creation_date;
    }

    public String getCreation_date() {
        return creation_date;
    }
    
    public void setLast_change_date( String last_change_date ) {
        this.last_change_date = last_change_date;
    }

    public String getLast_change_date() {
        return last_change_date;
    }
    
    public void setStart_date( String start_date ) {
        this.start_date = start_date;
    }

    public String getStart_date() {
        return start_date;
    }
    
    public void setEnd_date( String end_date ) {
        this.end_date = end_date;
    }

    public String getEnd_date() {
        return end_date;
    }
    
    public void setSurvey_page( Survey_page survey_page, int i ) {
        this.survey_page[i] = survey_page;
    }
    public Survey_page getSurvey_page(int i) {
        return survey_page[i];
    }
}

