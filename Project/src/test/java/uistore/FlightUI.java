package uistore;

import org.openqa.selenium.By;

public class FlightUI {
    public static By from = By.xpath("//*[@id=\'BE_flight_origin_city\']");
    public static By to = By.id("BE_flight_arrival_city");
    public static By dep_date = By.id("BE_flight_origin_date");
    public static By d_date = By.id("21/12/2023");
    public static By return_date = By.id("BE_flight_arrival_date");
    public static By r_date = By.id("22/12/2023");
    public static By citizen = By.xpath("//*[@id='seniorcitizen_offer']/a/i");
    public static By search_btn = By.id("//*[@id='BE_flight_flsearch_btn']");


}