package com.cj.freelanceapp.ServiceImp;
import com.cj.freelanceapp.model.JobApplication;
import com.cj.freelanceapp.repository.JobApplicationRepo;
import com.cj.freelanceapp.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class JobApplicationServiceImp implements JobApplicationService {

	private JobApplicationRepo jobApplicationRepo;
	@Autowired
	public JobApplicationServiceImp(JobApplicationRepo jobApplicationRepo)
	{
		this.jobApplicationRepo = jobApplicationRepo;
	}

	@Override
	public void add_job_application(JobApplication jobApplication) {
		jobApplicationRepo.save(jobApplication);
	}

	@Override
	public JobApplication get_job_application(long id) {
		return null;
	}

	@Override
	public List<JobApplication> all_job_application() {
		return null;
	}

	@Override
	public void update_job_application(long id)
	{

	}

	@Override
	public void delete_job_application(long id) {
		jobApplicationRepo.deleteById(id);
	}

	@Override
	public void delete_all() {
		jobApplicationRepo.deleteAll();
	}
}
