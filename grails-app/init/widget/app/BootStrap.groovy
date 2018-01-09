package widget.app

class BootStrap {

    def init = { servletContext ->
        def fooPart = new Part(name: "FooPart", width: 1.5, height: 1.75, length: 1.25, deprecationDate: new Date() + 365).save(failOnError: true)
        new Widget(name: "FooWidget", createdBy: "Bootsy", parts: [fooPart]).save(failOnError: true)
    }
    def destroy = {
    }
}
