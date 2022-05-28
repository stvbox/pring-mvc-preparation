package foo.bar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.HandlerMapping;

@EnableWebMvc
@Controller
@RequestMapping(path = "/")
public class StudApplication {
    public static void main(String... args) throws Exception {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.scan("foo.bar");
        //ctx.register(StudApplication.class);
        ctx.refresh();

        new DelegatingWebMvcConfiguration();

        Thread.currentThread().join();
    }
}

