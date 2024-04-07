package OfficeEqProject.methods;

import OfficeEqProject.equipment.OfficeEquipment;

public class Methods {

    public void printEquipment(OfficeEquipment[] equipmentArray) {
        for (OfficeEquipment a : equipmentArray) {
            System.out.println(a);
        }
    }

    public int calculateTotalPrice(OfficeEquipment[] equipmentArray) {
        int totalPrice = 0;
        for (OfficeEquipment a : equipmentArray) {
            totalPrice += a.getPrice();
        }
        return totalPrice;
    }

    public void listByManufacturer(OfficeEquipment[] equipmentArray, String manufacturer) {
        for (OfficeEquipment a : equipmentArray) {
            if(manufacturer == a.getManufacturer()) {
                System.out.println(a.getId() + a.getManufacturer() + a.getWeight() + a.getYearOfManufacture() +
                        a.getModelName() + a.getYearOfManufacture() + a.getPrice() + a.isOperational());
            }
        }
    }

    public void findOldestEquipment(OfficeEquipment[] equipmentArray) {
        int year = Integer.MAX_VALUE;
        for (OfficeEquipment a : equipmentArray) {
            if(a.getYearOfManufacture() <= year){
                year = a.getYearOfManufacture();
            }
        }
        System.out.println("Oldest equipment by year is :" + year);
    }

    public int countOperationalEquipment(OfficeEquipment[] equipmentArray) {
        int counter = 0;
        for (OfficeEquipment a : equipmentArray) {
            if(a.isOperational() == true) {
                counter++;
            }
        }
        return counter;
    }

}
