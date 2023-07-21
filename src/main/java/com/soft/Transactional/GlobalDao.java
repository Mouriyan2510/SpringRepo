package com.soft.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GlobalDao {

	
	@Autowired
	GlobalRepository gr;
	public String post(GlobalEntity g)throws SalaryException {
		 gr.save(g);
		 return "Success";
	}

}
