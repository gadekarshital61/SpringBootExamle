package in.nit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StudentController {
 @GetMapping("/show")
 public String showStudent() {
	 return "StudentRegister";
 }
}
