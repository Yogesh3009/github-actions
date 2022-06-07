package com.store.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsApplication {

//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Yogesh3009/github-actions.git
//	git push -u origin main
	
	@GetMapping("/get")
	public String exapmle()
	{
		return "welcome to github actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}
