package k23.viikko2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Tehtävä 3
@Controller
public class FriendsController {
	private ArrayList<String> friends = new ArrayList<>();

	@GetMapping("/index")
	public String handleFriends(@RequestParam(name = "nimi", required = false) String name, Model model) {
		if (name != null) {
			friends.add(name);
		}
		model.addAttribute("friends", friends);
		return "tehtava3";
	}

}