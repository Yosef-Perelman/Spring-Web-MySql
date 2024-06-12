package com.example.Spring_Web_MYSQL.ModelAttribute;

public class JobModelAttribute {
    private int Id;

    private String Date;

    private String Company_Name;

    private String Job_Title;

    private String Link;

    private String Through_Whom;

    private String Comments;

    public JobModelAttribute() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public String getJob_Title() {
        return Job_Title;
    }

    public void setJob_Title(String job_Title) {
        Job_Title = job_Title;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getThrough_Whom() {
        return Through_Whom;
    }

    public void setThrough_Whom(String through_Whom) {
        this.Through_Whom = through_Whom;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    @Override
    public String toString() {
        return "JobModelAttribute{" +
                "Id=" + Id +
                ", Date='" + Date + '\'' +
                ", Company_Name='" + Company_Name + '\'' +
                ", Job_Title='" + Job_Title + '\'' +
                ", Link='" + Link + '\'' +
                ", through_whom='" + Through_Whom + '\'' +
                ", Comments='" + Comments + '\'' +
                '}';
    }
}

