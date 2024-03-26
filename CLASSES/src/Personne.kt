class Personne{
    var nom: String = ""
    var taille: Double = 0.0
    var poids: Double = 0.0

    fun imc(){
        println(poids/(taille*taille))
    }


}