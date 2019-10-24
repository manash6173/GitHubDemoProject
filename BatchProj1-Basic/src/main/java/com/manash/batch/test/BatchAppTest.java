package com.manash.batch.test;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchAppTest {

	public static void main(String[] args) {
	
		ApplicationContext ctx=null;
		JobLauncher launcher=null;
		Job job1=null;
		JobExecution execution=null;
		//create ioc Container
		ctx=new ClassPathXmlApplicationContext("com/manash/batch/config/applicationContext.xml");
		//get luncher object
		launcher=ctx.getBean("jobLaunch",JobLauncher.class);
		//get job
		job1=ctx.getBean("mySimpleJob",Job.class);
		try {
		execution=launcher.run(job1, new JobParameters());
		
		System.out.println("Status::--->>>"+execution.getExitStatus());
		}catch(Exception e) {
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
