package xyz.zaldev

class Plant (private var name: String, private var family: String, private var description: String?, private var height: Int?) {
    private var isExtinct: Boolean

    init {
        this.name = name
        this.family = family
        this.description = description
        this.height = if (height != null) if (height!! > 0) height else 0 else 0 // height!! = is not null
        this.isExtinct = false
    }

    // secondary constructor
    // if the property already inside the class assignment, it should be written in return block to call the this()
    constructor(name: String, family: String, description: String, height: Int, isExtinct: Boolean) : this(name, family, description, height) {
        this.isExtinct = isExtinct
    }

    // class can have more than one secondary constructor
    constructor(name: String, family: String, isExtinct: Boolean) : this(name, family, description = null, height = null) {
        this.isExtinct = false
    }

    override fun toString(): String {
        return "Plant(name='$name', family='$family', description=$description, height=$height, isExtinct=$isExtinct)"
    }


}