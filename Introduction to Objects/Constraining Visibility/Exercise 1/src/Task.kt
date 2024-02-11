// Visibility/Task1.kt
package constrainingVisibilityExercise1

import AlienSpecies

class Alien(public val name : String, public val species: String, private var planet : String){
    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
    fun movePlanet(newPlanet: String) {
        planet = newPlanet
    }
}

fun main() {

}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/