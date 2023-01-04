package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BlogController {
    /**
     *
     * @param home
     * @return
     * Spring Boot Annotations is a form of metadata that provides data
     * about a program. In other words, annotations are used to provide
     * supplemental information about a program.
     */

    @RequestMapping("/") //@RequestMapping: It is used to map the web requests. It has many optional elements like consumes, header, method, name, params, path, produces, and value. We use it with the class as well as the method.
    public String listPosts(ModelMap map){
        /*
        * ModelMap is used to pass values to render a view
        * It gives us the ability to pass a collection of values
        * and treat these values as if they were within a Map
        * */
        map.put("title", "Blog Post 1"); //calling put inside method on the model map with a key of "title" and "Blog Post 1"

        return "home"; // will display the home.html template that lives in src/main/resources/templates/
    }

    private PostRepository postRepository;

    public PostRepository(PostRepository postRepository){
        this.postRepository = postRepository;

    }

}
