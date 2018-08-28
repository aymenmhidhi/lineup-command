package adaming.com.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adaming.com.domain.Site;
import adaming.com.service.SiteService;

@RestController
@RequestMapping("api/command")
public class SiteController {

	@Inject
	SiteService siteService;

	@RequestMapping(value = "/site", method = RequestMethod.POST)
	public String createUpdateSite(@RequestBody Site site) {
		siteService.createUpdateSite(site);
		return "success";
	}

	@RequestMapping(value = "/site", method = RequestMethod.PUT)
	public String updateSite(@RequestBody Site site) {
		siteService.createUpdateSite(site);
		return "success";
	}

	@RequestMapping(value = "/site", method = RequestMethod.DELETE)
	public String updateSite(@RequestBody String id) {
		siteService.removeSite(id);
		return "success";
	}

}
