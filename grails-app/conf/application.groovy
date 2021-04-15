grails {
    plugin {
        springsecurity {
            rest {
                token {
                    validation {
                        useBearerToken = false // <1>
                        enableAnonymousAccess = true // <2>
                    }
                    storage {
                        jwt {
                            secret = 'foobar123'*4 //<3>
                        }
                    }
                }

                oauth {
                    frontendCallbackUrl = { String tokenValue -> "http://localhost:8080/success?token=${tokenValue}" } //<4>
                    google {
                        client=org.pac4j.oauth.client.Google2Client //<5>
                        key='840451212809-0skpkv3rkvfec7e3prnmlob43u8f7pgp.apps.googleusercontent.com'
                        secret='xSbDDUXv_xkv4qMXEbUtD-be'
                        scope=org.pac4j.oauth.client.Google2Client.Google2Scope.EMAIL_AND_PROFILE //<8>
                        defaultRoles=[] //<9>
                    }
                }
            }
            providerNames = ['anonymousAuthenticationProvider'] // <10>
        }
    }
}