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
}
