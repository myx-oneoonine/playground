/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allinoneconverter;

import allinoneconverter.datastorageconverter.DataStorageConverter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author myx
 */
public class AllInOneConverter {

    private AllInOneConverter() {

    }

    public static void main(String[] args) throws IOException {
        DataStorageConverter dataStorageConverter = new DataStorageConverter();

        System.out.println("DataContverter V2.0");

        Scanner scanner = new Scanner(System.in);
        System.out.println(""
                + "Select Data Type"
                + "\n1. Bit"
                + "\n2. Byte"
                + "\n3. Kilobyte"
                + "\n4. Megabyte"
                + "\n5. Gigabyte"
                + "\n6. Terabyte"
                + "\n7. Petabyte"
                + "\n8. Exabyte"
                + "\n9. Zettabyte"
                + "\n10. Yottabyte");

        String unitTarget = scanner.nextLine();
        System.out.println("Enter value");
        String value = scanner.nextLine();

        List<Unit> units = dataStorageConverter.convertDataStorage(Integer.parseInt(unitTarget), Double.parseDouble(value));

        for (Unit unit : units) {
            System.out.println(unit.getUnitName() + ":" + unit.getValue());
        }

    }

}
