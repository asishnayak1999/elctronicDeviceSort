package p2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collection;


public class MainClass {


	public static void filterlist(List<ElectronicDevice> List, Map<String,List<ElectronicDevice>> mapList) {
		
		System.out.println("\nSorting Type");
		System.out.println("1.By Price\t2By Ratings");
		System.out.println("Enter Type ?? ");
		
		int choice = new Scanner(System.in).nextInt();

		switch(choice) {
			case 1:
				Collections.sort(List,new PriceSorted());
				break;
			case 2:
				Collections.sort(List,new RatingSorted());
				break;
			default: System.out.println("Wrong Input !!");
						System.exit(0);
			}
		Iterator<String> itr = mapList.keySet().iterator();
		
		while(itr.hasNext()) {
			String Key = itr.next();
			if(Key.equalsIgnoreCase("Computer"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=40000 && electronicDevice.getPrice()<=200000) {
						System.out.println(electronicDevice);
					}
				}
				
			}
			
			else if(Key.equalsIgnoreCase("Mobile Phone"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=1500 && electronicDevice.getPrice()<=100000) {
						System.out.println(electronicDevice);
					}
				}	
			}
			
			else if(Key.equalsIgnoreCase("Camera"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=50000 && electronicDevice.getPrice()<=80000) {
						System.out.println(electronicDevice);
					}
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		int sel;
		MainClass obj = new MainClass();
		Memory SD  = new Memory("SanDisk",64);
		Bluetooth BT5 = new Bluetooth(5.2);
		Bluetooth BT4 = new Bluetooth(4.0);
		
		do{
//==============================================================================================================
			
			MobilePhone M1 = new MobilePhone("iPhone5",200,5,22000,SD,BT4);
			MobilePhone M2 = new MobilePhone("iPhone6",300,7,32000,SD,BT4);
			MobilePhone M3 = new MobilePhone("iPhone7",250,6,43000,SD,BT5);
			MobilePhone M4 = new MobilePhone("iPhone8",300,3,40000,SD,BT5);
			MobilePhone M5 = new MobilePhone("iPhone12",400,9,55000,SD,BT5);			
			MobilePhone M6 = new MobilePhone("Samsung_S8",100,6,32000,SD,BT4);
			MobilePhone M7 = new MobilePhone("Samsung_S9",200,8,44000,SD,BT5);
			MobilePhone M8 = new MobilePhone("Samsung_S10",400,10,55000,SD,BT5);
			MobilePhone M9 = new MobilePhone("Samsung_S20",500,9,89000,SD,BT5);
			
			Map<String,List<ElectronicDevice>> ElectronicdevicesList = new LinkedHashMap<>();
			
			List<ElectronicDevice> MobileList = new ArrayList<>();
			
			MobileList.add(M1);
			MobileList.add(M2);
			MobileList.add(M3);
			MobileList.add(M4);
			MobileList.add(M5);
			MobileList.add(M6);
			MobileList.add(M7);
			MobileList.add(M8);
			MobileList.add(M9);
			
//===============================================================================================================
			
			Computer L1= new Computer("HP Spectre 360",1000,8,80000,SD,BT4);
			Computer L2= new Computer("Apple Macbook pro M1",500,7,150000,SD,BT5);
			Computer L3= new Computer("Apple Macboook Air M1",400,9,90000,SD,BT5);
			Computer L4= new Computer("Dell Lattitude 7420",800,7,143000,SD,BT5);
			Computer L5= new Computer("HP All in One",3000,6,90000,SD,BT4);
			Computer L6= new Computer("Apple iMAC",4000,10,200000,SD,BT5);
			Computer L7= new Computer("Dell Inspiron 5000",900,9,40000,SD,BT5);
			
			List<ElectronicDevice> CompList = new ArrayList<>();
			
			CompList.add(L1);
			CompList.add(L2);
			CompList.add(L3);
			CompList.add(L4);
			CompList.add(L5);
			CompList.add(L6);
			CompList.add(L7);
			
//===============================================================================================================	
			
			Camera C1=new Camera("Nikon DSLR",200,7,50000,SD,BT4);
			Camera C2=new Camera("Canon DSLR",300,8,80000,SD,BT5);
			Camera C3=new Camera("HassleBlad Telescope",500,9,100000,SD,BT5);
			Camera C4=new Camera("Go PRO Hero 6",300,8,28000,SD,BT5);
			
			List<ElectronicDevice> CamList = new ArrayList<>();
			
			CamList.add(C1);
			CamList.add(C2);
			CamList.add(C3);
			CamList.add(C4);
			
//==============================================================================================================
			
			System.out.println("\n*********SELECT DEVICE TYPE**********");
			System.out.println("\n1.Computer");
			System.out.println("\n2.Mobile Phones");
			System.out.println("\n3.Camera");
			System.out.println("\nWhich Device you want ??\n");
			
			int device = new Scanner(System.in).nextInt();
			
			switch (device) {
			case 1: 
				ElectronicdevicesList.put("Computer", CompList);
				filterlist(CompList,ElectronicdevicesList);
				break;
			case 2: 
				ElectronicdevicesList.put("Mobile Phone", MobileList);
				filterlist(MobileList,ElectronicdevicesList);
				break;
			case 3: 
				ElectronicdevicesList.put("Camera", CamList);
				filterlist(CamList,ElectronicdevicesList);
				break;
			default: System.out.println("Invalid Choice!!!");

		}
		
		System.out.println("Want to Continue ? Press 1 else 0");
		sel = new Scanner(System.in).nextInt();

	}while(sel == 1);

	}
}
