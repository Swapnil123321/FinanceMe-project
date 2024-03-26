package com.staragile.swapnil.financeme.controller;

import java.awt.PageAttributes.MediaType;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.staragile.swapnil.financeme.dao.ApiResponse;
import com.staragile.swapnil.financeme.model.Account;
import com.staragile.swapnil.financeme.service.AccountService;




import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AccountController  implements ErrorController{
	
	@Autowired
	private AccountService as;
	private static final String PATH = "/error";
	
	public AccountController(AccountService as){
    	super();
    	this.as = as;
    }
	
	// Save operation
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
    public ResponseEntity<?> createAccount(@RequestBody Account ac) {
		ac.setAccountOpenDate(LocalDateTime.now());
		as.createAccount(ac);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(Boolean.TRUE, "Account Created Successfully"));
    }
	
	
	// Update operation
	@RequestMapping(value = "/updateAccount/{account_no}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateAccount(@RequestBody Account ac,@PathVariable("account_no") Long account_no) {
		ac.setAccountNo(account_no);
		ac.setAccountOpenDate(LocalDateTime.now());
		as.updateAccount(ac);
		return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(Boolean.TRUE, "Account Updated Successfully"));
    }
	
	// Update operation
	@RequestMapping(value = "/updateAccount", method = RequestMethod.PUT)
    public ResponseEntity<?> updateAccount(@RequestBody Account ac) {
		Account an = as.viewPolicy(ac.getAccountNo()).get();
		ac.setAccountOpenDate(an.getAccountOpenDate());
		as.updateAccount(ac);
		return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(Boolean.TRUE, "Account Updated Successfully"));
    }
	
	// Read operation
	@RequestMapping(value = "/viewPolicy/{account_no}", method = RequestMethod.GET)
    public ResponseEntity<?> viewPolicy(@PathVariable("account_no") Long account_no) {
		Optional<Account> account = as.viewPolicy(account_no);
		return ResponseEntity.status(HttpStatus.OK).body(account.get());
    }
	
	@RequestMapping(value = "/viewAllPolicy", method = RequestMethod.GET)
    public ResponseEntity<?> viewAllPolicy() {
		List<Account> account = as.viewAll();
		return ResponseEntity.status(HttpStatus.OK).body(account);
    }
	
	
	// Delete operation
	@RequestMapping(value = "/deletePolicy/{account_no}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePolicy(@PathVariable("account_no") Long account_no) {
		as.deletePolicy(account_no);
		return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(Boolean.TRUE, "Account Deleted Successfully")); 
    }
	
	@RequestMapping("/")  
	public ModelAndView home(@RequestParam(name="name", required=false, defaultValue="Swapnil") String name, Model model)   
	{  
		return new ModelAndView("index.html");
	}
	
	@RequestMapping("/index")  
	public ModelAndView  index(@RequestParam(name="name", required=false, defaultValue="Swapnil") String name, Model model)   
	{  
		return new ModelAndView("index.html");
	}
	@RequestMapping("/about")
	public ModelAndView  about(@RequestParam(name="name", required=false, defaultValue="Swapnil") String name, Model model)   
	{  
		return new ModelAndView("about.html");
	}
	
	@RequestMapping("/services")
	public ModelAndView services(@RequestParam(name="name", required=false, defaultValue="kubernetes") String name, Model model)   
	{  
		return new ModelAndView("services.html");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(@RequestParam(name="name", required=false, defaultValue="Swapnil") String name, Model model)   
	{  
		return new ModelAndView("contact.html");
	}
	
	@RequestMapping("/team")
	public ModelAndView team(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		return new ModelAndView("team.html");
	}
	
	
	@RequestMapping("/error")
    public ModelAndView error(@RequestParam(name="name", required=false, defaultValue="Swapnil") String name, Model model) {
        return new ModelAndView("error.html");
    }
}
