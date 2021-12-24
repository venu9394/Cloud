package com.demo.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;

@RestController
public class Cloudent {

	@Autowired
	private CloudantClient client;
      @GetMapping("Cloudent")
	
	public String cloudentDb() {
		List<String> list=new ArrayList<>();
		
		try {
			list=client.getAllDbs();
		}catch(NullPointerException e) {
			return "Server Error::"+list.toString();
		}
		System.out.println("Cloudant DataBase Connection......!!!!");
		System.out.println(list.get(0) +"~~~~~~~~~~~~~~"+list.toString());
		return "Connected Successfully....!"+list.get(0)+"" +list.toString();
	}

}
