package widget.app

class Widget {
    String name
    String createdBy

    static hasMany = [parts: Part]

    static constraints = {
        name nullable: false, blank: false, maxSize: 64
        createdBy nullable: false
        parts nullable: false
    }
}
