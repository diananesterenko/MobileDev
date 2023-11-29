interface ProgressionPointer {
    var currentTerm: Double

    fun setTerm(newTerm: Double)

    fun getTerm(): Double
    {
        return currentTerm
    }

    fun nextTerm()
}