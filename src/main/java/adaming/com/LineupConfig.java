package adaming.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
public class LineupConfig {
	
	@Bean
	public MongoClient mongoClient() throws Exception {
		ServerAddress server = new ServerAddress();
		//MongoCredential mongoCredential = MongoCredential.createCredential(mongoDbUser, mongoDbName, mongoDbPwd.toCharArray());
		//return new MongoClient(Arrays.asList(server), Arrays.asList(mongoCredential));
		return new MongoClient(server); 
	}

}
