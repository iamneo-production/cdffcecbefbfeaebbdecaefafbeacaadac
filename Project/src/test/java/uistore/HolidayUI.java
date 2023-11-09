package uistore;

import org.openqa.selenium.By;

public class HolidayUI {
    public static By holiday = By.xpath("//*[@id=\'booking_engine_holidays\']");
	public static By depart_time = By.id("BE_holiday_leaving_city");
	public static By going_to = By.id("holiday_destination_city");
	public static By month = By.xpath("//*[@id=\'BE_holiday_destination_details\']/div/div/div/div[1]");
	public static By mon_option = By.xpath("//*[@id='BE_holiday_destination_details']/div/div/div/div[2]/div/div/ul/li[6]/span");
	public static By check_out = By.xpath("//*[@id=\'BE_holiday_search_btn\']");
}
