package com.pma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.bean.Vendor;

@RestController
@RequestMapping("/pma")
@CrossOrigin(origins = "http://localhost:8090")
public class CommonController {

	@GetMapping("/getVendor")
	public List<Vendor> getVendor() {

		List vendorLIst = new ArrayList<>();

		Vendor vendor1 = new Vendor();
		vendor1.setVendorName("國雲");
		vendor1.setVendorId("C03");
		vendorLIst.add(vendor1);
		
		Vendor vendor2 = new Vendor();
		vendor2.setVendorName("歐特儀");
		vendor2.setVendorId("C01");
		vendorLIst.add(vendor2);

		Vendor vendor3 = new Vendor();
		vendor3.setVendorName("宏碁");
		vendor3.setVendorId("B01");
		vendorLIst.add(vendor3);
		
		return vendorLIst;
	}
}
