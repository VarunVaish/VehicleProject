package com.cts.VehicleReservationSystem.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	
	
	@RequestMapping(value="update.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public ModelAndView getUpdatePage(){
		//System.out.println(vehicle);
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(vehicleService.getallVehicle());
		System.out.println("update");
		modelAndView.addObject("vehicle", vehicleService.getallVehicle());
		modelAndView.setViewName("update");
		return modelAndView;
	}
	@RequestMapping(value="addVehicles.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getaddVehiclePage(){
		return "addVehicle";
	}
	@RequestMapping(value="addVehicle.html", method=RequestMethod.POST)
	public ModelAndView addVehicle(@ModelAttribute Vehicle vehicle){
	System.out.println(vehicle);
		ModelAndView modelAndView=new ModelAndView();
		vehicleService.insertVehicle(vehicle);
		modelAndView.setViewName("home");
		System.out.println("In controller" + vehicle);

		return modelAndView;
}
}