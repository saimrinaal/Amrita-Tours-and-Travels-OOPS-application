package com.tnt.db;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import com.tnt.model.Vehicle;
public class VehicleDAO {

		private List<Vehicle> vehicleList = new ArrayList<>();// for not having null exption
		
		public VehicleDAO()
		{
			loadVehicles();
		}
	
		
		
		public void loadVehicles(){
			try{
				
				Vehicle vehicle = new Vehicle();
			    
				File file = new File(".");
				BufferedReader reader = new BufferedReader(new FileReader(new File(".").getAbsoluteFile() + "/src/resources/"+"vehicle.csv"));
			    String line = "";
			    while ((line = reader.readLine())!=null){
			        String[] split = line.split(",");
			        vehicle = new Vehicle();
			        vehicle.setVehicleNo(split[0]);
			        vehicle.setTransportName(split[1]);
			        vehicle.setStartCity(split[2]);
			        vehicle.setEndCity(split[3]);
			        vehicle.setVehicleType(split[4]);
			        vehicle.setNoOfSeats(Integer.parseInt(split[5]));
			        vehicle.setDepartureTime(Double.parseDouble(split[6]));
			        vehicle.setCost(Double.parseDouble(split[7]));
			        vehicleList.add(vehicle);
			        
			    }
			    reader.close();
			} catch(IOException ex){
			    System.out.println(ex.getMessage());
			}
			
		}
	
/*	
	public void vehiclesData()//method
	{
		
	    Vehicle bus1 = new Vehicle("TS24DO1234", "garuda", "HYDERABAD", "CHENNAI", "bus", 40, 20.08, 645.0);
        Vehicle bus2 = new Vehicle("TN01BD2754", "INDRA", "CHENNAI", "HYDERABAD", "bus", 40, 20.15, 650.0);
        Vehicle train1 = new Vehicle("01019", "CSMT BBS SPL", "CHENNAI", "BANGALORE", "train", 100, 20.09, 950.0);
        Vehicle train2 = new Vehicle("02775", "CCT SC SPL", "BANGALORE", "CHENNAI", "train", 100, 21.05, 1020.0);
        Vehicle aeroplane1 = new Vehicle("AI546|321", "AIRINDIA", "HYDERABAD", "BANGALORE", "aeroplane", 80, 21.35, 3146.0);
        Vehicle aeroplane2 = new Vehicle("AI-545", "AIRINDIA", "BANGALORE", "HYDERABAD", "aeroplane", 80, 19.30, 2894.0);
        
    	vehicleList.add(bus1);
    	vehicleList.add(bus2);
    	vehicleList.add(train1);
    	vehicleList.add(train2);
    	vehicleList.add(aeroplane1);
    	vehicleList.add(aeroplane2);// add in vehicleList
   
	}
*/	 	
	public List<String> vehicleTypes()
	{
    	ArrayList<String> vehicleTypeList = new ArrayList<String>();
    	vehicleTypeList.add("Bus");
    	vehicleTypeList.add("Train");
    	vehicleTypeList.add("Flight");
    	
    	return vehicleTypeList;
	}
	//fetch all vehicles of the given vehicle type
	public List<Vehicle> findVehileByVehicleType(String vehicleType, String fromCity, String toCity)
	{
		List<Vehicle> vehicleListOfVehicleType = new ArrayList<>();
		Vehicle vehicle;
		for (int i = 0; i < vehicleList.size(); i++)
        {
        	//get the each instance
			//check condition if instance vehicle type matches with input param
			//if yes. add to arraylist declared
			vehicle = vehicleList.get(i);
        	if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)
        			&& vehicle.getStartCity().equals(fromCity) && vehicle.getEndCity().equals(toCity))
        	{
        		vehicleListOfVehicleType.add(vehicle);
        	}
        }
		return vehicleListOfVehicleType;
	}

}
