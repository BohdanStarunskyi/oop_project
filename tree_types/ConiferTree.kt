package tree_types

import Region
import Tree

class ConiferTree(
    private val height: Int,
    private val diameter: Int,
    private val age: Int,
    override var name: String,
    override var woodPrice: Int?,
    override val region: Region,
    override var energy: Int,
    private val leafCount: Int
) : Tree(height, diameter, age, leafCount) {

    override fun printAllParameters() {
        println(
            """
               Name: $name,
               Diameter: $diameter,
               Age: $age,
               Height: $height,
               Region: $region,
               WoodPrice: $woodPrice,
               Energy: $energy,
               LeafCount: $leafCount
            """.trimIndent()
        )
        println()
    }

    fun spreadSpores() {
        println("Spreading spores of $name")
        println()
    }
}