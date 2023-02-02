package com.Atyeti.MovieBooking;

import com.Atyeti.MovieBooking.controller.MultiplexController;
import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieBookingApplicationTests {
   @Autowired
   MultiplexController multiplexController;
	@Test
	void contextLoads() {

	}

}
