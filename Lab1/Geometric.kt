import kotlin.math.pow

class Geometric(val q: Double, val start: Double, override var currentTerm: Double): ProgressionPointer, Progression() {
    override fun sum(index: Double): Double {
        val sum = start *((1 - q.pow(index)) / (1 - q))
        return sum
    }

    override fun getByIndex(index: Double): Double {
        val an = start * q.pow(index - 1)
        return an
    }

    override fun type(): String {
        return "This is Geometric progression with q = $q and a1 = $start"
    }

    override fun setTerm(newTerm: Double) {
        currentTerm = newTerm
    }

    override fun nextTerm() {
        currentTerm *= q
    }
}