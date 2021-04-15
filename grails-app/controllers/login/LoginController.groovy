package login
import grails.plugin.springsecurity.annotation.Secured
import groovy.transform.CompileStatic

@Secured('permitAll')
//@CompileStatic

class LoginController {

    def index() {

        String userNameParam = request.getParameter('username')
        String passwordParam=request.getParameter('password')
        print("success-${userNameParam}")
        print("success-${passwordParam}")

        if (userNameParam == "testuser" && passwordParam == "password")
        {
            render view:"/loginController/home"

        }

        else
        {
            flash.message="Incorrect credentials, Please enter correct credentials"
            render view:"/login/auth.gsp"
        }


    }

    def logout ={

        render view:"/loginController/login"
    }

}
