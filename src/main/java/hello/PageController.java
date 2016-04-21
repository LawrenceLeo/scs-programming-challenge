package hello;

import org.springframework.web.bind.annotation.RestController;
import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
import org.springframework.web.bind.annotation.RequestMapping;
	
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Date;

@RestController
public class PageController {
	
    @RequestMapping("/")
    public String index() throws IOException {
    	//getCommits();
        return "Greetings from Spring Boot!";
    }
    /*
    @RequestMapping("/")
    public String getCommits() throws IOException{
    	
    	GitHubClient client = new GitHubClient();
    	client.setOAuth2Token("140c2cebe3e75efedad6a6f7e870cfbf3aea4a82");
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
		return returnString.toString();
	}
	*/
}