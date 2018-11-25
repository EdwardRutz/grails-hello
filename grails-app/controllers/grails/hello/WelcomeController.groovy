package grails.hello

class WelcomeController {

    def index() {
        String n = params.name ?: 'World'
    }

    def greet(String name) {
        String n = name ?: 'World'
        render "Hello, ${n}!"  //double quotes used for interpolated strings
    }
}
