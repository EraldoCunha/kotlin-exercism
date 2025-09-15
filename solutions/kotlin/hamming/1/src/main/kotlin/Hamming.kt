object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length == rightStrand.length){
            "left and right strands must be of equal length."
        }
        return leftStrand.zip(rightStrand).sumBy { if(it.first == it.second) 0 else 1 }
    }
}
