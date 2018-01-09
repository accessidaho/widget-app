package widget.app

class Part {
    String name

    //Dimensions
    BigDecimal width
    BigDecimal length
    BigDecimal height

    Date deprecationDate

    static constraints = {
        name blank: false, nullable: false, maxSize: 255
        width nullable: false
        length nullable: false
        height nullable: false
        deprecationDate nullable: false, blank: false
    }
}
