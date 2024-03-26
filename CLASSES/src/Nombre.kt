class Nombre {
    var nb: Int = 0

    constructor(nb: Int) {
        this.nb = nb
    }

    constructor()

    fun diviseur(): List<Int> {
        var listDiviseur = mutableListOf<Int>()
        for (i in 1..this.nb)
            if (this.nb % i == 0) {
                listDiviseur.add(i)
            }
        return listDiviseur
    }

    fun estPremier(): Boolean {
        if (this.diviseur().size == 2)
            return true
        else
            return false
    }

    fun estParfait(nombre: Int): Boolean {
        val parfait = arrayOf(6, 28, 496, 8128)
        if (nombre in parfait) {
            return true
        } else {
            return false
        }
    }

    fun sommeChiffres(): Int {
        var somme = 0

        while (this.nb != 0) {
            somme += this.nb % 10
            this.nb /= 10
        }
        return somme
    }
}