package foo.bar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/")
public class TestController {
    @RequestMapping(path = "test", method = RequestMethod.GET)
    String test() {
        return "test";
    }
}
