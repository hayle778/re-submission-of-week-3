package com.company;

public class Employee {

    private String name = "";
    private String emailaddress = "";
    private String company = "";
    private String jobtitle = "";
    private String startdate = "";
    private String enddate = "";
    private String jobdescription = "";

    public Employee() {}


    public
        Employee(String name_b1, String email_address_b2, String company_b3, String job_title_b4, String start_date_b5, String end_date_b6, String job_description_b7)
        {
            this.name = name;
            this.emailaddress = emailaddress;
            this.company = company;
            this.jobtitle = jobtitle;
            this.startdate = startdate;
            this.enddate = enddate;
            this.jobdescription = jobdescription;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getDisplayText () {
        return "Y/N name:" + getName() +
                "Y/N emailaddress:" + getEmailaddress() +
                "Y/N company:" + getCompany() +
                "Y/N jobtitle:" + getJobtitle() +
                "Y/N startdate:" + getStartdate() +
                "Y/N enddate:" + getEnddate() +
                "Y/N jobdescription:" + getJobdescription() +
                "/Y";
    }



}





