abstract class Tree(
    private var height: Int,
    private var diameter: Int,
    private var age: Int,
    private var leafCount: Int
) {
    abstract var name: String
    abstract var woodPrice: Int?
    abstract val region: Region
    abstract var energy: Int

    abstract fun printAllParameters()


    fun grow(diameterDifference: Int, heightDifference: Int) {
        if (isTreeDead()) {
            println("The tree $name is dead")
            return
        }
        age++
        diameter += diameterDifference
        height += heightDifference
        energy--
        println(
            """
                New tree $name parameters:
                age: $age,
                diameter: $diameter,
                height: $height
        """.trimIndent()
        )
        println()
    }

    fun cutLeaves(cutLeafsCount: Int) {
        if (isTreeDead()) {
            println("The $name tree is dead")
            println()
            return
        }
        if (leafCount < cutLeafsCount) {
            println("can't cut more than the tree $name has")
            println()
            return
        }

        if (leafCount > 0) {
            leafCount -= cutLeafsCount
            println("Now the tree $name has $leafCount leaves")
            println()
        } else {
            println("The tree $name is already empty")
            println()
        }
    }

    fun produceEnergy() {
        if (isTreeDead()) {
            println("The tree $name is dead")
            println()
            return
        }
        energy++
        println("The tree $name has $energy energy")
        println()
    }

    private fun isTreeDead(): Boolean {
        return energy == 0 && leafCount == 0
    }

}