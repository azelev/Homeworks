package OfficeEqProject.enterPoint;

import OfficeEqProject.data.ArrayDataBase;
import OfficeEqProject.methods.Methods;

public class Start {

    public void callMethods() {
        ArrayDataBase allEquipmentInfo = new ArrayDataBase();
        Methods methods = new Methods();
        System.out.println("Information about all office equipment :\n");
        methods.printEquipment(allEquipmentInfo.equipmentArray);
        System.out.println();
        System.out.println("Total price of the equipment is:" + methods.calculateTotalPrice(allEquipmentInfo.equipmentArray));

        methods.findOldestEquipment(allEquipmentInfo.equipmentArray);
        System.out.println("equipment by manufacturer");
        methods.listByManufacturer(allEquipmentInfo.equipmentArray, "Random Jose");
        System.out.println();
        System.out.println("Operation technique = " + methods.countOperationalEquipment(allEquipmentInfo.equipmentArray));
    }
}
