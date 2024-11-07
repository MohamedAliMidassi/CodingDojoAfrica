package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.models.Travel;
import com.example.demo.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelServ;
	
	@GetMapping("/")
	public String index(@ModelAttribute("travel")Travel travel, Model model) {
		List<Travel> allTravels = travelServ.allTravels();
		model.addAttribute("allTravels", allTravels);
		return "index.jsp";
	}

	@PostMapping("/newTravel")
	public String createTravel(@Valid @ModelAttribute("travel")Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}else {
			travelServ.createTravel(travel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/travel/show/{id}")
	public String showTravel(@PathVariable("id")Long id, Model model) {
		Travel travel = travelServ.findTravelById(id);
		model.addAttribute("travel", travel);
		return "show.jsp";
		
	}
	
	@PutMapping ("/updateTravel/{id}")
	public String editTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			travelServ.updateTravel(travel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/travels/edit/{id}")
	public String updateTravel(@PathVariable("id") Long id, Model model) {
		Travel travel = travelServ.findTravelById(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	
	@DeleteMapping("/delete/travels/{id}")
	public String deleteCar(@PathVariable("id") Long id) {
		travelServ.deleteTravel(id);
		return "redirect:/";
	}
}
