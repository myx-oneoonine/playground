package allinoneconverter.datastorageconverter;

import allinoneconverter.Unit;
import java.util.ArrayList;
import java.util.List;

public class DataStorageConverter {

    public DataStorageConverter() {

    }

    public List<Unit> convertDataStorage(int unitTarget, double value) {
        List<Unit> unitList = new ArrayList<>();

        switch (unitTarget) {
            case 1: //bit
                value = value / 8;
                break;
            case 2: //byte defaultValue
                value = value * 1;
                break;
            case 3: //	"kilobyte"	
                value = value * Math.pow(1024, 2);
                break;
            case 4: //	"megabyte"	
                value = value * Math.pow(1024, 3);
                break;
            case 5: //	"gigabyte"	
                value = value * Math.pow(1024, 4);
                break;
            case 6: //	"terabyte"	
                value = value * Math.pow(1024, 5);
                break;
            case 7: //	"petabyte"	
                value = value * Math.pow(1024, 6);
                break;
            case 8: //	"exabyte"	

                value = value * Math.pow(1024, 7);
                break;
            case 9: //	"zettabyte"	
                value = value * Math.pow(1024, 8);
                break;
            case 10: //	"yottabyte"	
                value = value * Math.pow(1024, 9);
                break;

            default:
                return unitList;
        }

        unitList.add(new Unit("Bit", value * 8));
        unitList.add(new Unit("Byte", value * 1));
        unitList.add(new Unit("Kilobyte", value / Math.pow(1024, 1)));
        unitList.add(new Unit("Megabyte", value / Math.pow(1024, 2)));
        unitList.add(new Unit("Gigabyte", value / Math.pow(1024, 3)));
        unitList.add(new Unit("Terabyte", value / Math.pow(1024, 4)));
        unitList.add(new Unit("Petabyte", value / Math.pow(1024, 5)));
        unitList.add(new Unit("Exabyte", value / Math.pow(1024, 6)));
        unitList.add(new Unit("Zettabyte", value / Math.pow(1024, 7)));
        unitList.add(new Unit("Yottabyte", value / Math.pow(1024, 8)));

        return unitList;

    }

}
