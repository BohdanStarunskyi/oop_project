import tree_types.ConiferTree
import tree_types.LeafyTree
import utilities.LeafType
import kotlin.random.Random

class Garden {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val trees: ArrayList<Tree> = arrayListOf()
            createTrees(trees)
            printTrees(trees)
            growTrees(trees)
            growFruits(trees)
            growTrees(trees)
            harvestFruits(trees)
            produceEnergy(trees)
            cutLeaves(trees)
            spreadSpores(trees)
        }

        private fun createTrees(trees: ArrayList<Tree>) {
            trees.add(
                LeafyTree(
                    height = 30,
                    diameter = 10,
                    age = 50,
                    leafType = LeafType.OVAL,
                    name = "Oak",
                    woodPrice = 100,
                    region = Region.EUROPE,
                    leafCount = 500,
                    energy = 80
                )
            )
            trees.add(
                LeafyTree(
                    height = 25,
                    diameter = 8,
                    age = 40,
                    leafType = LeafType.TRUNCATE,
                    name = "Maple",
                    woodPrice = 90,
                    region = Region.NORTH_AMERICA,
                    leafCount = 400,
                    energy = 75
                )
            )
            trees.add(
                LeafyTree(
                    height = 35,
                    diameter = 12,
                    age = 55,
                    leafType = LeafType.ELLIPTICAL,
                    name = "Eucalyptus",
                    woodPrice = 110,
                    region = Region.OCEANIA,
                    leafCount = 600,
                    energy = 85
                )
            )
            trees.add(
                LeafyTree(
                    height = 20,
                    diameter = 6,
                    age = 30,
                    leafType = LeafType.OVAL,
                    name = "Cherry Blossom",
                    woodPrice = null,
                    region = Region.ASIA,
                    leafCount = 300,
                    energy = 70
                )
            )

            trees.add(
                ConiferTree(
                    height = 40,
                    diameter = 12,
                    age = 60,
                    name = "Pine",
                    woodPrice = 120,
                    region = Region.EUROPE,
                    leafCount = 1000,
                    energy = 85
                )
            )
            trees.add(
                ConiferTree(
                    height = 35,
                    diameter = 10,
                    age = 45,
                    name = "Spruce",
                    woodPrice = 110,
                    region = Region.NORTH_AMERICA,
                    leafCount = 900,
                    energy = 80
                )
            )
            trees.add(
                ConiferTree(
                    height = 30,
                    diameter = 9,
                    age = 40,
                    name = "Cedar",
                    woodPrice = 100,
                    region = Region.NORTH_AMERICA,
                    leafCount = 800,
                    energy = 75
                )
            )
            trees.add(
                ConiferTree(
                    height = 25,
                    diameter = 8,
                    age = 35,
                    name = "Fir",
                    woodPrice = 95,
                    region = Region.NORTH_AMERICA,
                    leafCount = 700,
                    energy = 70
                )
            )
        }

        private fun printTrees(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    tree.printAllParameters()
                    println()
                }
            }
        }

        private fun growTrees(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    val randomNumber1 = Random.nextInt(0, 100)
                    val randomNumber2 = Random.nextInt(0, 100)
                    tree.grow(randomNumber1, randomNumber2)
                }
            }
        }

        private fun growFruits(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    if (tree is LeafyTree) {
                        tree.growFruits()
                    }
                }
            }
        }

        private fun harvestFruits(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    if (tree is LeafyTree) {
                        val amount = Random.nextInt(0, 10)
                        tree.harvestFruits(amount)
                    }
                }
            }
        }

        private fun produceEnergy(trees: ArrayList<Tree>) {
            trees.forEach { tree -> run { tree.produceEnergy() } }
        }

        private fun cutLeaves(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    val amount = Random.nextInt(0, 10)
                    tree.cutLeaves(amount)
                }
            }
        }

        private fun spreadSpores(trees: ArrayList<Tree>) {
            trees.forEach { tree ->
                run {
                    if (tree is ConiferTree) {
                        tree.spreadSpores()
                    }
                }
            }
        }

    }

}