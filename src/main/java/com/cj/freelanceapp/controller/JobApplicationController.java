package com.cj.freelanceapp.controller;


import com.cj.freelanceapp.ServiceImp.JobApplicationServiceImp;
import com.cj.freelanceapp.ServiceImp.JobServiceImp;
import com.cj.freelanceapp.dto.JobApplicationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JobApplicationController {
    @Autowired
    private JobApplicationServiceImp jobApplicationServiceImp;
    @Autowired
    JobServiceImp jobServiceImp;
    private long jobId;

    @RequestMapping("/apply{id}")
    public ModelAndView addJobApplication(long id) {
        jobId = id;
//         job = jobServiceImp.get_job(id);
//         System.out.println(job.getCustomer().getUser().getFullName());
//        JobApplication jobApplication = JobApplication.builder()
//                .coverLetter(jobApplicationDTO.getCoverLetter())
//                .job(jobApplicationDTO.getJob())
//                .applicationDate(jobApplicationDTO.getApplicationDate())
//                .build();
//        jobApplicationServiceImp.add_job_application(jobApplication);
        return new ModelAndView("applyform");
    }
    @RequestMapping("/applyforjob")
    public String applyforjob(JobApplicationDTO jobApplicationDTO) {
        System.out.println(jobApplicationDTO);
        return "jobapplications";
    }
    @RequestMapping("/jobapplication{id}")
    public String getJobApplication(long id) {
        jobApplicationServiceImp.get_job_application(id);
        return "jobapplication.jsp";
    }

    @RequestMapping("/myjobapplications")
    public String myJob(int id) {
        return "myjobs.jsp";
    }

    @RequestMapping("/jobapplications")
    public String allJobs() {
        jobApplicationServiceImp.all_job_application();
        return "jobs.jsp";
    }

    @RequestMapping("/editjobapplication")
    public String editJob(JobApplicationDTO jobApplicationDTO) {
        return "editjob.jsp";
    }

    @RequestMapping("/api/deletejobapplication")
    public String deleteJobApplication(JobApplicationDTO jobApplication) {
        return "deletejob.jsp";
    }

}
