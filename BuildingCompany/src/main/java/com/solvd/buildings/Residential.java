package com.solvd.buildings;

import org.apache.logging.log4j.*;

public class Residential extends Buildings {

    private static final Logger LOGGER = LogManager.getLogger();
    private static float priceMod = 500;
    private static float timeMod = 12;

    public Residential(int floors, float sqMeters) {
        super(priceMod, timeMod, floors, sqMeters);
    }
    

    public static void checkValues() {

        LOGGER.info("The price modifier is set to:" + priceMod);
        LOGGER.info("The time modifier is set to:" + timeMod);
    }


    public static void changePrice(float priceMod) {

        Residential.priceMod = priceMod;
        checkValues();
        
    }


    public static void changeTime(float timeMod) {

        Residential.timeMod = timeMod;
        checkValues();
        
    }
}
