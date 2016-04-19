package hello;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.kohsuke.github.GHCommit;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.PagedIterable;
import org.kohsuke.github.PagedIterator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
    	/*
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        */
        getCommits();
    }
    public static void getCommits() throws IOException{
		final int size = 25;
		GitHub github = GitHub.connectUsingPassword("LawrenceLeo","leoboiw0w");
		GHRepository repo = github.getRepository("scs-programming-challenge");
		
		PagedIterable<GHCommit> commits = repo.listCommits();
		/*
		for(GHCommit commit : commits){
			System.out.println(commit.getAuthor().toString());
		}
		*/
		System.out.println("!!");
	}
    
    

}