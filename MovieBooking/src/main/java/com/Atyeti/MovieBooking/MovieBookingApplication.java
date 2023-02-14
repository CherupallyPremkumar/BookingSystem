package com.Atyeti.MovieBooking;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.repository.MovieRepo;
import com.Atyeti.MovieBooking.repository.SeatLockerImp;
import com.Atyeti.MovieBooking.sevice.MovieServie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class MovieBookingApplication {

	public static void main(String[] args) {
		BeanFactory context=SpringApplication.run(MovieBookingApplication.class, args);
	}


}
