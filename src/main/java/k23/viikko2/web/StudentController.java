package k23.viikko2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import k23.viikko2.domain.Student;

@Controller
public class StudentController {

	// Tehtävä 2
	@GetMapping("hello")
	public String SayGreetingToStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		students.add(new Student("Etunimi4", "Sukunimi4"));
		model.addAttribute("students", students);
		return "tehtava2";
	}
}