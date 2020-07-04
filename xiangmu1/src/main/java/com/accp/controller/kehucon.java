package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Dizhi;
import com.accp.domain.Kehu;
import com.accp.service.kehuService;

@Controller
@RequestMapping("/con")
public class kehucon {
	
	@Autowired
	kehuService kser;
	
	@GetMapping("/to")
	public String to() {
		return "page";
	}
	
	@GetMapping("/finddi")
	@ResponseBody
	public List<Dizhi> finddi(){
		return kser.finddi();
	}
	
	@GetMapping("/findById")
	@ResponseBody
	public Kehu findById(Integer id) {
		return kser.findById(id);
	}
	
	@PostMapping("/update")
	@ResponseBody
	public int update(@RequestBody Kehu ke) {
		return kser.update(ke);
	}
}
