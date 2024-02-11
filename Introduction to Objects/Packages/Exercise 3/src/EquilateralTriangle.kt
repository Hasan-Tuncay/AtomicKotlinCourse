// Packages/EquilateralTriangle.kt
package pythagorean

import kotlin.math.pow

class EquilateralTriangle(val side : Double){
    fun area()=
        Math.sqrt(3.0)/4* side.pow(2.0)

}