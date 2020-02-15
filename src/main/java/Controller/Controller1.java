package Controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/tim1")
public class Controller1 {
    @GetMapping("/home")
    public ModelAndView html() {

        return new ModelAndView("home");
    }



}