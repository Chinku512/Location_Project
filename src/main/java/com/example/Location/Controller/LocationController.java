package com.example.Location.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Location.Entity.Location;
import com.example.Location.Service.LocationService;
import com.example.Location.Utility.EmailService;

@Controller
public class LocationController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/view")
	public String viewPage() {
		return "view";
	}
	@RequestMapping("/save")
	public String createLocation( Location location, ModelMap model) {
		locationService.createLocation(location);
		emailService.sendSimpleMessage("chinkumarandi0556@gmail.com", "test", "Welcome Message");
		model.addAttribute("location", "Record is Saved");
		return "view"; 
	} 
	@RequestMapping("/list")
	public String listAllLocation(ModelMap model) {
		List<Location> locations = locationService.listAllLocation();
		model.addAttribute("locations", locations);
		return "list";
	}
	@RequestMapping("/delete") 
	public String deleteLocation(@RequestParam("id")long id,ModelMap modelmap) {
		locationService.deleteById(id);
		List<Location> locations = locationService.listAllLocation();
		modelmap.addAttribute("location",locations);
		return "redirect:/list"; 
	}
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id")long id,ModelMap modelmap) {
		Location location = locationService.getLocationById(id);
		modelmap.addAttribute("location", location);
		return "update"; 
	}
	@RequestMapping("/updatelocation")
	public String updateLocation(@ModelAttribute ("loc")Location location, ModelMap model) {
		locationService.createLocation(location);
		model.addAttribute("msg", "Record Updated Sucessfully.!");
		return "redirect:/list";
	}
	
}
