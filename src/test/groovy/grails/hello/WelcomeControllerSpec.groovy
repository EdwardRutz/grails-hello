package grails.hello

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

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
        controller.greet(name)

        then:
        respone.text == 'Hello, ${name}!'
    }
}
