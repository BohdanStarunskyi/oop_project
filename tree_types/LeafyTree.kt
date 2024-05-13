package tree_types

import Region
import Tree
import utilities.LeafType

class LeafyTree(
    private val height: Int,
    private val diameter: Int,
    private val age: Int,
    private val leafType: LeafType,
    override var name: String,
    override var woodPrice: Int?,
    override val region: Region,
    private val leafCount: Int,
    override var energy: Int
) : Tree(height, diameter, age, leafCount) {
    private var fruitsAmount = 0

    override fun printAllParameters() {
        println(
            """
               Name: $name,
               Diameter: $diameter,
               Age: $age,
               Height: $height,
               LeafType: $leafType,
               Region: $region,
               WoodPrice: $woodPrice,
               Energy: $energy,
               LeafCount: $leafCount
            """.trimIndent()
        )
        println()
    }

    fun growFruits() {
        fruitsAmount += 10
        println("Now there are $fruitsAmount fruits on the tree $name")
    }

    fun harvestFruits(amount: Int) {
        if (fruitsAmount >= amount) {
            fruitsAmount -= amount
            println("Now there are $fruitsAmount fruits on the tree $name")
        } else {
            println("Can't harvest more fruits than the tree $name has")
        }
    }
}