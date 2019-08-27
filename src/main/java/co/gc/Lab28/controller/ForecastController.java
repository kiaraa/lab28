package co.gc.Lab28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.Lab28.entity.Forecast;

@Controller
public class ForecastController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		RestTemplate rt = new RestTemplate();
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		Forecast forecast = rt.getForObject(url, Forecast.class);
		return new ModelAndView("index", "forecast", forecast);
	}
	
	@RequestMapping("newLatLong")
	public ModelAndView newLatLong(@RequestParam("lat") String latitude, @RequestParam("long") String longitude) {
		RestTemplate rt = new RestTemplate();
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + latitude + "&lon=" + longitude + "&FcstType=json";
		System.out.println(url);
		Forecast forecast = rt.getForObject(url, Forecast.class);
		return new ModelAndView("index", "forecast", forecast);
	}
}
