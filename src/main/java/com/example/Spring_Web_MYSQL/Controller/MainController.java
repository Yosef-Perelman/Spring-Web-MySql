package com.example.Spring_Web_MYSQL.Controller;

import com.example.Spring_Web_MYSQL.Model.Job;
import com.example.Spring_Web_MYSQL.ModelAttribute.JobModelAttribute;
import com.example.Spring_Web_MYSQL.Service.JobsServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller // This means that this class is a Controller
public class MainController {
    private JobsServiceInterface jobsService;

    public MainController(JobsServiceInterface jobsService) {
        this.jobsService = jobsService;
    }

    @RequestMapping(value={"", "/", "/index", "/index.html"})
    public String home_page(Model model) {
        List<Job> jobs = jobsService.find_all_jobs();
        model.addAttribute("jobs", jobs);
        return "index";
    }

    @RequestMapping("/add")
    public String addJobShowForm(Model model){
        model.addAttribute("jobModelAttribute", new JobModelAttribute());
        return "add";
    }

    @PostMapping("/add-job")
    public String addJob(@ModelAttribute("JobModelAttribute") JobModelAttribute jobModelAttribute) {
        Job job = new Job(jobModelAttribute.getCompany_Name(),
                jobModelAttribute.getJob_Title(), jobModelAttribute.getLink(),
                jobModelAttribute.getThrough_Whom(), jobModelAttribute.getComments());
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        String str = ft.format(new Date());
        job.setDate(str);
        this.jobsService.add_job(job);
        return "redirect:/";
    }

    @PostMapping("/delete-job/{id}")
    public String deleteJob(@PathVariable int id) {
        this.jobsService.delete_job(id);
        return "redirect:/";
    }
}
