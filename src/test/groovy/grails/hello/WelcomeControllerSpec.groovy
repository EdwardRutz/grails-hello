package grails.hello

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import grails.test.mixin.TestFor


class WelcomeControllerSpec extends Specification implements ControllerUnitTest<WelcomeController> {

    void "greet without a name should say Hello, World!"() {
        when:
        controller.greet()

        then:
        response.text == 'Hello, World!'
    }

    void "greet with a name should say Hello, name!"() {

        given:
        String name = 'Dolly'

        when:
        controller.greet(name)

        then:
        response.text == "Hello, ${name}!"
    }

    void 'index without a name should go to greet'() {

        when:
        controller.index()

        then:
        response.redirectedUrl == '/welcome/greet'
    }

    void 'index with a name should go to greet with a name'() {
        given:
        String name = 'Dolly'

        when:
        params.name = name
        controller.index()

        then:
        respone.redirectedUrl == "/welcome/greet?name=$name"
    }

    void 'hi without a name returns a map of user to World'() {
        when:
        def model = controler.hi()

        then:
        model.user == 'World'
    }

    void 'hi a name returns a map of user to name'() {
        when:
        params.name = 'Dolly'
        def model = controler.hi()

        then:
        model.user == 'Dolly'
    }
}
