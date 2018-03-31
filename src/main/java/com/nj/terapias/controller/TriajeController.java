package com.nj.terapias.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.nj.terapias.constant.ViewConstant;
import com.nj.terapias.entity.User;
import com.nj.terapias.model.TriajeModel;
import com.nj.terapias.service.NotificationService;
import com.nj.terapias.service.TriajeService;





@Controller
@RequestMapping("/contacts")
public class TriajeController {

	private static final Log LOG = LogFactory.getLog(TriajeController.class);
	
	@Autowired
	@Qualifier("triajeServiceImpl")
	private TriajeService triajeService;

	@Autowired
	private NotificationService notiticationService;
	
	@GetMapping("/cancel")
	public String cancel() {
		return "redirect:/contacts/showtriaje";
	}
	
	@GetMapping("/contactform")
	public String redirectContactForm(Model model, @RequestParam(name="id", required=false) int id) {
		TriajeModel triaje = new TriajeModel();
		if(id!=0) {
			triaje = triajeService.findTriajeByIdModel(id);
		}
		model.addAttribute("triajeModel", triaje);
		return ViewConstant.CONTACT_FORM;
		
	}
	
	
	@PostMapping("/addcontact")
	public String addContact(@ModelAttribute(name="triajeModel") TriajeModel triajeModel,
			Model model) {
		LOG.info("METHOD: addContact() -- PARAMS:" + triajeModel.toString());
		
		if(null!=triajeService.addContact(triajeModel)) {
			model.addAttribute("result", 1);
			
		}else {
			model.addAttribute("result", 0);
		}
		//Envio de correo
		signupSuccess(triajeModel);
		return "redirect:/contacts/showtriaje";
	}
	
	@GetMapping("/signup-success")
	public void signupSuccess(TriajeModel triajeModel) {
		
		//Create user
		User user = new User();
		user.setEmailAddress("ederreyesc@hotmail.com");
		user.setText(triajeModel.toString());
		//send a notification
		try {
			notiticationService.sendNoification(user);
		}catch(MailException e) {
		//Catch error
			LOG.info("METHOD: signupSuccess()" + e.getMessage());
		}
	}
	
	@GetMapping("/showtriaje")
	public ModelAndView showTriaje() {
		ModelAndView mav = new ModelAndView(ViewConstant.CONTACTS);
		mav.addObject("triaje", triajeService.listAllTriaje());
		return mav;
	}
	
	@GetMapping("/removetriaje")
	public ModelAndView removeTriaje(@RequestParam(name="id", required=true) int id) {
		triajeService.removeTriaje(id);
		return showTriaje();
	}
	
	
	
	
}
