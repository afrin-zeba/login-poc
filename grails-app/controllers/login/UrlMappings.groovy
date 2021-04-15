package login

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/login/auth.gsp")
        "/home"(controller:"login",action:[POST: "index"])
        "/logout"(controller:"login",action:[POST: "logout"])
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
