package org.launchcode.java_skillstracker_202011.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody                   //tells SpringBoot that all methods in this class return a plain text html response
@RequestMapping("skills")       //all requests to methods in this controller start with /hello
public class SkillsController {

    //handles requests for /skills
    @RequestMapping(value="", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillHello(){
        return
                "<html>" +
                        "<body>" +
                        "<form>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
    }

    //handles requests for /skills/tracker
    @RequestMapping(value="tracker", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillTracker(@RequestParam String name, String language1, String language2, String language3){
        return
                "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + language1 + "</li>" +
                            "<li>" + language2 + "</li>" +
                            "<li>" + language3 + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    //handles requests for /skills/trackerTable
    @RequestMapping(value="trackerTable", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillTrackerTable(@RequestParam String name, String language1, String language2, String language3){
        return
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<table>" +
                            "<tr>" +
                                "<th>Language</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + language1 + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + language2 + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + language3 + "</td>" +
                            "</tr>" +
                        "</table>" +
                        "</body>" +
                        "</html>";
    }

    //handles requests for /skills/select
    @RequestMapping(value="form", method = {RequestMethod.GET})
    public String skillsForm() {
        return
                "<html>" +
                        "<body>" +
                        "<form method='post' action='/skills/trackerTable'>" +
                        "<label>Name:</label><br>" +
                        "<input type='text' name='name'></input><br>" +

                        "<label>My favorite language:</label><br>" +
                        "<select name='language1' id='language1-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +

                        "<label>My second favorite language:</label><br>" +
                        "<select name='language2' id='language2-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +

                        "<label>My third favorite language:</label><br>" +
                        "<select name='language3' id='language3-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +

                        "<input type='submit' value='Submit'></input>";
    }
}
