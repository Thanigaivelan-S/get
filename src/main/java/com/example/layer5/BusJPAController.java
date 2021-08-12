package com.example.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.layer3.NumberNotFoundException;

//import com.example.layer2.EmployeeNotFoundException;

import com.example.layer4.BusServiceImpl;

@CrossOrigin(origins="*")
@RestController // it is a specialized version of @Component - arker to receive web request
@RequestMapping("/bus")
public class BusJPAController {
	
	public BusJPAController() {
		System.out.println("JPA Created");
	} 
	
	@Autowired
	BusServiceImpl serviceRepo;
	
	
	
	/*@PutMapping
	@ResponseBody
	@RequestMapping(value="/busJourneyDetails/{busNo}")
	public void updateAvailableSeats(@PathVariable String busNo) {
		String message = "Bus not found";
		BusJourneyDetails newBus = new BusJourneyDetails(busNo);
		boolean modified = false;
		for(BusJourneyDetails bus1 : empList) {
			if(employee.getEmployeeNumber() == newEmp.getEmployeeNumber()) {
				int idx = empList.indexOf(employee);
				empList.set(idx,  newEmp);
				modified = true;
				break;
			}
		}
		if(modified) {
			message =  "Employee modified successfully...";			
		}
		return message;
	}*/
	
	@ResponseBody
	@DeleteMapping(value="/deleteReservation/{rID}")
	public void deleteReservation(@PathVariable String rID) throws NumberNotFoundException {
			System.out.println("Deleted Reservation");
			serviceRepo.deleteReservation(rID);
		}
	
	@ResponseBody
	@DeleteMapping(value="/deleteTransaction/{rID}")
	public void deleteTransaction(@PathVariable String rID) throws NumberNotFoundException {
		System.out.println("Deleted Transaction");
		serviceRepo.deleteTransaction(rID);
	}
	
	@ResponseBody
	@DeleteMapping(value="/deletePayment/{rID}")
	public void deletePayment(@PathVariable String rID) throws NumberNotFoundException {
		System.out.println("Deleted Payment");
		serviceRepo.deletePayment(rID);
	}
		
	@PutMapping
	@ResponseBody
	@RequestMapping(value="/addMoney/{emailID}")
	public void addMoneyToWallet(@PathVariable String emailID) throws NumberNotFoundException{
		System.out.println("Add Money");
		serviceRepo.addMoneyToWallet(emailID);
	}
	
	@PutMapping
	@ResponseBody
	@RequestMapping(value="/changeSeatsNo/{jID}/{rID}")
	public void changeAvailableSeats(@PathVariable int jID,@PathVariable String rID) throws NumberNotFoundException{
		System.out.println("Changing Seats Count");
		serviceRepo.changeAvailableSeats(jID,rID);
	}
	
	@PutMapping
	@ResponseBody
	@RequestMapping(value="/changeSeatsDetails/{rID}")
	public void updateSeatDetails(@PathVariable String rID) throws NumberNotFoundException{
		System.out.println("Changing Seats Details");
		serviceRepo.updateSeatDetails(rID);
	}
	
	@ResponseBody
	@RequestMapping(value="/cancelReservation/{email}/{jID}/{rID}")
	public void cancelReservation(@PathVariable String email,@PathVariable int jID,@PathVariable String rID){
		System.out.println("Starting Cancel Reservation");
		serviceRepo.cancelReservation(email,jID,rID);
	}
}