package hello;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
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
		final RepositoryId repo = new RepositoryId("rails", "rails");
		StringBuilder returnString = new StringBuilder();
		final int size = 1;
		final String message = "{3})   {0} by {1} on {2}";
		final CommitService service = new CommitService();
		int count = 0;
		
		for (Collection<RepositoryCommit> commits : service.pageCommits(repo,
				size)) {
			for (RepositoryCommit commit : commits) {
				String sha = commit.getSha().substring(0, 7);
				String author = commit.getCommit().getAuthor().getName();
				Date date = commit.getCommit().getAuthor().getDate();
				returnString.append(MessageFormat.format(message, sha, author, date,count) + "\n");
				count++;
			}
		}
		System.out.println(returnString.toString());
        
        
    }
    
    
    

}