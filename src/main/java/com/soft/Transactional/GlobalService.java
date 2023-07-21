package com.soft.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalService {
	
	@Autowired
	GlobalDao gd;

	public String post(GlobalEntity g)throws SalaryException {
		try {
		if(g.getSalary()>35000) {
			throw new SalaryException("You are Not Allowed");
		}
		else {
		return gd.post(g);
		}
		}
		catch(SalaryException se) {
			return "Salary should be lesser than 35000";
		}
	}

}
