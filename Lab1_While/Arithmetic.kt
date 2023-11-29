class Arithmetic(val d: Double, val start: Double, override var currentTerm: Double): ProgressionPointer, Progression() {
    override fun sum(index: Double): Double {
        val an = this.getByIndex(index)
        val sum = ((start + an) * index) / 2
        return sum
    }

    override fun getByIndex(index: Double): Double {
        val an = start + (index - 1) * d
        return an
    }

    override fun type(): String {
        return "This is Arithmetic progression with d = $d and a1 = $start"
    }

    override fun setTerm(newTerm: Double) {
        currentTerm = newTerm
    }

    override fun nextTerm() {
        currentTerm += d
    }
}