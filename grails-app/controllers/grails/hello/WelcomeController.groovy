package grails.hello

class WelcomeController {

    def index() {
        redirect(action: 'greet', params: params)

    }

    def greet(String name) {
        String n = name ?: 'World'
        render "Hello, ${n}!"  //double quotes used for interpolated strings
    }

    def hi() {
        String n = params.name ?: 'World'
        return [user: n]
    }
}
