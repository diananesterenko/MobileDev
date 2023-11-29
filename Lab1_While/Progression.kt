abstract class Progression {
    abstract fun sum(index: Double) : Double

    abstract fun getByIndex(index: Double) : Double

    open fun type() : String {
        return "This is an abstract class"
    }
}