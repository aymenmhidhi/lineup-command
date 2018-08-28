package adaming.com.service;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongodb.MongoClient;

import adaming.com.domain.Site;

@Service
public class SiteService {
	MongoOperations mongoOperations;
	@Inject
	MongoClient mongoClient;

	public void createUpdateSite(@RequestBody Site site) {
		mongoOperations.insert(site);
	}


	public void removeSite(String id) {
		mongoOperations.remove(id);

	}

}
