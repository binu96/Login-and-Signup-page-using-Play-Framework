package controllers;

import models.UserDetails;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by Binu Senevirathne on 3/4/2017.
 */

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index()  {

        UserDetails usdetails = new UserDetails();

        session(usdetails.getUsn(), usdetails.getPas());

        return ok(index.render("Your new application is ready."));
    }

    public Result Loininfo(){ // the login info

        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String us =  dynamicForm.get("username");
        String pass =  dynamicForm.get("password");

        UserDetails usdetails = new UserDetails();

        if(session().get(us).equals(pass)){
            return ok("You are Successfully logged in!");

        }else {
            return ok("The username or the password provided is incorrect!");

        }

    }
    public Result Signupinfo(){
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        String us =  dynamicForm.get("uname");
        String pass =  dynamicForm.get("passwd");

        session(us, pass);

        return ok("You are Successfully Signed up!");

        }

    }




