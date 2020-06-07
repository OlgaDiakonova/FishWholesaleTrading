package com.go2it.edu;

import com.go2it.edu.entity.Country;
import com.go2it.edu.entity.Region;
import com.go2it.edu.repository.IRegionRepository;
import com.go2it.edu.service.ICountryService;
import com.go2it.edu.service.IRegionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Application {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ICountryService countryService = context.getBean(ICountryService.class);
        IRegionService regionService = context.getBean(IRegionService.class);
//        Region reg = new Region();
//        reg.setRegion_id("NA");
//        reg.setRegion_name("North America");
//        regionService.save(reg);
//
//        Country country = new Country();
//        country.setCountry_id("CA");
//        country.setCountry_name("Canada");
//        country.setRegion(reg);
//        System.out.println(country.toString());
//        countryService.save(country);
        Region reg = regionService.findById("NA").get();
        System.out.println(reg.toString());
        List<Country> countryList = countryService.findAllByRegion(reg);
        System.out.println(countryList);


    }
}
