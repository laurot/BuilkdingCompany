package com.solvd;
import com.solvd.buildings.*;
import com.solvd.interfaces.IChange;
import com.solvd.services.*;
import com.solvd.weather.*;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class Change implements IChange{

    Scanner sc = new Scanner(System.in);
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void changeBuildings() {
        
        LOGGER.info("Menu:");
        LOGGER.info("Which values do you want to change?");
        LOGGER.info("1. Residential");
        LOGGER.info("2. Comercial");
        LOGGER.info("3. Industrial");
        LOGGER.info("0. Exit");
        LOGGER.info("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            LOGGER.info("Exiting");
            System.exit(0);

            case 1:
                //Residential
                Residential.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                Residential.changePrice(newPrice);
                Residential.changeTime(newTime);
                break;
            case 2:
                //Comercial
                Comercial.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                Comercial.changePrice(newPrice);
                Comercial.changeTime(newTime);

                break;
            case 3:
                //Industrial
                Industrial.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                Industrial.changePrice(newPrice);
                Industrial.changeTime(newTime);
                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                changeBuildings();
        }
    }

    @Override
    public void changeServices() {

        LOGGER.info("Menu:");
        LOGGER.info("Which values do you want to change?");
        LOGGER.info("1. Normal Service");
        LOGGER.info("2. Fast Service");
        LOGGER.info("3. Luxurious Service");
        LOGGER.info("0. Exit");
        LOGGER.info("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            LOGGER.info("Exiting");
            System.exit(0);

            case 1:
                //Normal Service
                NormalService.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                NormalService.changePrice(newPrice);
                NormalService.changeTime(newTime);
                break;
            case 2:
                //Fast Service
                FastService.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                FastService.changePrice(newPrice);
                FastService.changeTime(newTime);

                break;
            case 3:
                
                //Luxurious Service
                LuxuriousService.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                LuxuriousService.changePrice(newPrice);
                LuxuriousService.changeTime(newTime);

                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                changeServices();
        }
        
    }

    @Override
    public void changeWeather() {
        LOGGER.info("Menu:");
        LOGGER.info("Which values do you want to change?");
        LOGGER.info("1. Normal Season");
        LOGGER.info("2. Rain Season");
        LOGGER.info("3. Dry Season");
        LOGGER.info("0. Exit");
        LOGGER.info("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            LOGGER.info("Exiting");
            System.exit(0);

            case 1:
                //Normal Season
                NormalSeason.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                NormalSeason.changePrice(newPrice);
                NormalSeason.changeTime(newTime);
                break;
            case 2:
                //Rain Season
                RainSeason.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                RainSeason.changePrice(newPrice);
                RainSeason.changeTime(newTime);

                break;
            case 3:
                //Dry Season
                DrySeason.checkValues();
                LOGGER.info("Type the new price modifier?");
                newPrice = sc.nextInt();
                LOGGER.info("Type the new time modifier?");
                newTime = sc.nextInt();
                DrySeason.changePrice(newPrice);
                DrySeason.changeTime(newTime);
                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                changeWeather();
        }
        
    }
    
}
