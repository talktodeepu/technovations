package com.technovations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technovations.contract.Player;

@RestController
public class SpringPlayerController {

	@RequestMapping
	public Player player(@RequestParam(value="Sachin", defaultValue="none") String name)
	{
		return new Player(1,name);
	}
}
