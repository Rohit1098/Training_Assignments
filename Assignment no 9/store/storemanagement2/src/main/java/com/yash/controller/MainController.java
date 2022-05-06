package com.yash.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.yash.dao.*;

@Controller
public class MainController {
	@Autowired
	UserDAO userdao;

	@RequestMapping(value = "/")
	public String first() {
		return "index";
	}

	@GetMapping("/signup")
	public String userReg(Model m) {
		Admin objuser = new Admin();
		m.addAttribute("objuser", objuser);
		return "signup";
	}

	
	@PostMapping("/SignUpSubmit")
	public String UserRegSubmit(@Valid @ModelAttribute("objadmin") Admin objadmin, BindingResult objBR) {
		if (objBR.hasErrors())
			return "signup";
		else {
			if (userdao.saveAdmin(objadmin) == 1)
				return "signup_success";
			else
				return "index";

		}
	}
	
//	@PostMapping("/datalist")
//	public String userItem(@Valid @ModelAttribute("objuser") User objuser, BindingResult objBR) {
////		if (objBR.hasErrors())
////			return "itemselection";
////		else {
//			if (userdao.saveUserdetaials(objuser) == 1)
//				return "userdata";
//			else
//				return "icc";
//
//		}
////	}

////

	@PostMapping("/vu")
	public String validateuser(@ModelAttribute(value="objuser") Admin objuser, ModelMap mm){
		if (objuser.getPassword().equals("11111111")) {
			return "icc";}else {
				return "userlogin";
			}
		
		
	}
	
	
	
	
	@PostMapping("/login")
	public String userregistration(@Valid @ModelAttribute("objuser") Admin objuser, BindingResult objBR) {
		if (objBR.hasErrors())
			return "signup";
		else {
			if (userdao.saveAdmin(objuser) == 1) {
				return "userlogin";
			} else
				return "signup";

		}
	}
	
	@PostMapping("/datalist")
	public String userdata(@Valid @ModelAttribute("objuser") Admin objuser, BindingResult objBR) {
		if (objBR.hasErrors())
			return "icc";
		else {
			if (userdao.saveUser(objuser) == 1) {
				return "iccsuccsess";
			} else
				return "icc";

		}
	}
	
	
	@PostMapping("/editdata")
	public String userdataupdate(@Valid @ModelAttribute("objuser") Admin objuser, BindingResult objBR) {
		if (objBR.hasErrors())
			return "iccsuccsess";
		else {
			if (userdao.updateUser(objuser) == 1) {
				return "editsucsess";
			} else
				return "iccsuccsess";

		}
	}

	
	
	@GetMapping("/vau")
	public String showItems(Model m)
	{
		List<Admin> itemlist = new ArrayList<Admin>();
		itemlist=userdao.getAllUser();
		m.addAttribute("itemlist", itemlist);
		return "icclist";
	}
	
//	@GetMapping("/itemmanage")
//	public String manage(Model m)
//	{
//		List<User> itemlist = new ArrayList<User>();
//		itemlist=userdao.getAllitem();
//		m.addAttribute("itemlist", itemlist);
//		return "itemmanage";
//	}
//

	
	
		
	
//	@GetMapping("/deleteitem")
//	public String itemDelete(@Valid @ModelAttribute("objitem") User objitem, BindingResult objBR) {
//		
//		
//			 userdao.DeleteItem(objitem);
//				return "deleteitem";
//			
//
//		}
	
//	
	
	@RequestMapping("/deleteitem2")
	public String delete() {
		
				
					return "deleteditem";
				
	
			}
	

	
	@RequestMapping("/editdata2")
	public String editItem() {

		return "editdata";

	}
	
	@RequestMapping("/home")
	public String returnhome() {

		return "index";

	}

	

}
