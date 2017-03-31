package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "hello " + name;
    }
        
    @RequestMapping(path = "/greeting/{name}", method={RequestMethod.GET})
    public String greeting2(@PathVariable(value="name") String name) {
        return "hello " + name;
    }
}