package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.school.beans.Student;
import com.school.dao.StudentDao;

@Controller
public class RestController {
	
	@ResponseBody
	@RequestMapping(value="/rest", method=RequestMethod.GET, headers="Accept=application/json")
	public String  check()
	{
		List <String> al= new ArrayList<String>();
		al.add("Kulcha");
		return "kulcha";
	}
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/angular")
	public ModelAndView angular()
	{
		Student student=new Student();
		return new ModelAndView("/angular", "student", student);
	}
	@ResponseBody
	@RequestMapping(value="/create", method=RequestMethod.POST, headers="Accept=application/json")
	public String createStudent(@ModelAttribute("student") Student st){
		String ant=new StudentDao().save(st);
		System.out.println(ant);
		return ant;
	}
	@RequestMapping("/hello")
	public ModelAndView mymethod(HttpServletRequest req, HttpServletResponse res){
		String name=req.getParameter("name");
		Student st=new Student();
		st.setName(name);
		String ant=new StudentDao().save(st);
		return new ModelAndView("hellopage","msg",ant);
	}
	@RequestMapping("angi")
	public ModelAndView angi()
	{
		return new ModelAndView("angi");
	}

}
