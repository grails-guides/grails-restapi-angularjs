package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Todo)
class TodoSpec extends Specification {

    void "test name is required"() {
        when:
        def todo = new Todo(name: name)

        then:
        !todo.validate()
        todo.errors['name'].code == errorCode

        where:
        name | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }
}
