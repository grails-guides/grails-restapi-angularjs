package demo

class BootStrap {

    def init = { servletContext ->

        def todos = [
                [name: 'clean the house'],
                [name: 'water the dog'],
                [name: 'feed the lawn'],
                [name: 'pay dem bills'],
                [name: 'run'],
                [name: 'swim']
        ].each { new Todo(name: it.name).save() }

        //new Todo(name: 'clean the house').save(failOnError: true)
    }
    def destroy = {
    }
}
