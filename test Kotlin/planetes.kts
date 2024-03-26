fun main(){
    val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne","Uranus", "Neptune")

    println(planetes.first())
    println(planetes.last())
    println(planetes.get(2))
    planetes[2] = "La Terre"
    println(tabEleves.filter { it.uppercase().startsWith('M') })
    println(planetes)
}
