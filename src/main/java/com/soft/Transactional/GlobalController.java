package com.soft.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalController {
	
	@Autowired
	GlobalService gs;
	
	@PostMapping("post")
	public String post(@RequestBody GlobalEntity g)throws SalaryException {
		return gs.post(g);
	}

}
