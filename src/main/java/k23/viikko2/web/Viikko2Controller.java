package k23.viikko2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Viikko2Controller {

	// Tehtävä 1
	@GetMapping("hello1") // HUOM hello1
	public String sayGreetings(@RequestParam(name = "name") 
			String name, @RequestParam(name = "age") int ika,
			Model model) {
		model.addAttribute("nimi", name);
		model.addAttribute("ika", ika);
		return "tehtava1";

	}
}