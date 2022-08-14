package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
	@Autowired
	ICONVDaoRafi iconvDao;
	@Autowired
	IConvergeDaoSurovi is; 

	@GetMapping("/circle/{id}")
	public List<IC_CIRCLE_MST_R> getCircle(@PathVariable("id") String id) {

		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDao.getCircleList(MainControllerIC.officeCode, id);

		return circleList;

	}

	@GetMapping("/div/{id}")
	public List<IC_DIST_DIV_MST> getDiv(@PathVariable("id") String id) {

		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDao.getdivList(MainControllerIC.officeCode, id);

		return divList;

	}

	@GetMapping("/loc/{id}/{div}")
	public List<IC_LOCATION_MASTER> getDiv(@PathVariable("id") String id, @PathVariable("div") String div) {

		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDao.getlocList(MainControllerIC.officeCode, id, div);

		return locList;

	}

	@GetMapping("/owner/{id}")
	public List<IC_PP_OWNER> getownerList(@PathVariable("id") String id) {

		ArrayList<IC_PP_OWNER> ownerList = new ArrayList<>();
		ownerList = iconvDao.getownerList(MainControllerIC.officeCode, id);

		return ownerList;

	}
	
	@GetMapping("/activity/{id}")
	public List<ActivityList> getActivity(@PathVariable("id") String id) {

		ArrayList<ActivityList> activityList = new ArrayList<>();
		activityList = is.activityListShow(id);

		return activityList;

	}
	
	
	@GetMapping("/power_plant/{fuel}")
	public List<IC_POWER_PLANT> getlistIC_POWER_PLANT(@PathVariable("fuel") String fuel1 ) {
		System.out.println(fuel1);
		
		
		String fuel=null;
		String owner_type=null;
		String owner=null;
		String gen=null;
		String grid=null;
		
		if(fuel1.contains("_")) {
			
			System.out.println("test");
			
			String string = fuel1;
			String[] parts = string.split("_");
			
			for(int i=0; i< parts.length; i++) {
				
				if(parts.length == 2) {
					
					if(!parts[0].equals("0")) {
						fuel = parts[0];
					}
					 
					owner_type = parts[1];
					 
					 break;
				}
				else if(parts.length == 3) {
					
					System.out.println("ex");
					
					if(!parts[0].equals("0")) {
						fuel = parts[0];
					}
					
					if(!parts[1].equals("0")) {
						owner_type = parts[1]; 
					}
					
					
					 owner = parts[2];
					 
					 break;
				}
else if(parts.length == 4) {
					
					System.out.println("ex");
					
					if(!parts[0].equals("0")) {
						fuel = parts[0];
					}
					
					if(!parts[1].equals("0")) {
						owner_type = parts[1]; 
					}
					if(!parts[2].equals("0")) {
						owner = parts[2]; 
					}
					
					 gen = parts[3];
					 
					 break;
				}
				
				else {
					
					if(!parts[0].equals("0")) {
						fuel = parts[0];
					}
					if(!parts[1].equals("0")) {
						owner_type = parts[1]; 
					}
					if(!parts[2].equals("0")) {
						owner = parts[2]; 
					}
					
					if(!parts[3].equals("0")) {
						 gen = parts[3];
					}
					
					
					 grid = parts[4];
					 
					 break;
				}
				
				
				 
				
			}
			
			
			
		}else {
			
			fuel = fuel1;
			
		}
		
		
		
		ArrayList<IC_POWER_PLANT> listIC_POWER_PLANT = new ArrayList<>();
		listIC_POWER_PLANT = iconvDao.getIC_POWER_PLANTList(MainControllerIC.officeCode,fuel,owner_type,owner,gen,grid);
		
		System.out.println(listIC_POWER_PLANT);
		
		return listIC_POWER_PLANT;
		
		
	}

}
