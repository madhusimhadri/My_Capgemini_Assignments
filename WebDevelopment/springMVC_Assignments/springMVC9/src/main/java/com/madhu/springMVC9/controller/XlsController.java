package com.madhu.springMVC9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.springMVC9.dao.EmpDao;
import com.madhu.springMVC9.model.Employee;
import com.madhu.springMVC9.service.GenerateXlsReport;

@Controller
public class XlsController {
	@Autowired    
    EmpDao dao; 
	@RequestMapping(value="/xlsSheet", method=RequestMethod.GET)
	public ModelAndView getExcel(){
	    List<Employee> empList = (List<Employee>) dao.getAllEmployees();		
	   /* ByteArrayInputStream in = GenerateXlsReport.usersToExcel(users);
	     return IO ByteArray(in);
	    HttpHeaders headers = new HttpHeaders();
	     set filename in header
	    headers.add("Content-Disposition", "attachment; filename=users.xlsx");
	   return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	    return new ModelAndView(new GenerateXlsReport(), "empList", empList);
	    return empList.toString();*/
	    ModelAndView mv = new ModelAndView(new GenerateXlsReport(), "empList", empList);
	    return mv;
	}
}
