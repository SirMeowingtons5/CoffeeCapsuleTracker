package com.sirmeowingtons5.coffeecapsuletracker.data.datasource

import com.sirmeowingtons5.coffeecapsuletracker.domain.model.Capsule
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CoffeeSystem
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CupSize

class CapsuleDataSource {

    //TODO: to JSON
    private val capsules: List<Capsule> = generateStubData()

    fun get(id: String): Capsule? =
        capsules.find { it.id == id }

    fun getAll(): List<Capsule> =
        capsules

    //TODO: delete after migrating to JSON
    private fun generateStubData(): List<Capsule> =
        listOf(
			Capsule(
				id = "vertuo-master-origins-costa-rica",
				title = "Costa Rica",
				annotation = "With crystal clarity",
				description = "Why we love it : High in Costa Rica’s mountains, only a small selection of Arabica coffee beans is soaked in rainforest hot spring waters. The thermal waters are brought down to the wet mill – their temperature dropping over 12 hours from 70˙C down to 18˙C. As the waters cool, the pulped coffee soaks in the mineral-rich water. The warmer water speeds up the fermentation and brings out this rare coffee’s finest characteristics – balanced and clean like no other, it shines in the cup with crystal clarity. The scarcity of this coffee comes from this rare process – no one else does it. It highlights the malty sweet cereal character of these unique craftsmen’s coffee.",
				collection = "Master Origin",
				country = "Costa Rica",
				aromaticProfile = "Malty and Sweet",
				coffeeSystem = CoffeeSystem.VERTUO,
				intensity = 7,
				cupSize = listOf(CupSize.GRAN_LUNGO),
				capsuleImageLink = "https://www.nespresso.com/ecom/medias/sys_master/public/13415871971358/C-0631-Responsive-Standard-2000x2000-.png?impolicy=product&imwidth=200",
				backgroundImageLink = "https://www.nespresso.com/shared_res/agility/commons/img/coffees/VL/backgrounds/costarica-description_L.jpg"
			),
			Capsule(
				id = "origins-late-harvest-arabica-colombian",
				title = "Colombia",
				annotation = "Original Master Origin Coffee: Ethiopia with Dry Processed Arabica.",
				description = "Master Origin Colombia with Late Harvest uses only high-grown, washed processed Colombian Arabica. Can you taste the lively acidity and the burst of winey red fruit aromas? That comes from those coffee farmers who dared to wait longer before harvesting their crop.",
				collection = "Master Origin",
				country = "Colombia",
				aromaticProfile = "Fruity-Winey",
				coffeeSystem = CoffeeSystem.ORIGIN,
				intensity = 6,
				cupSize = listOf(CupSize.ESPRESSO, CupSize.LUNGO),
				capsuleImageLink = "https://www.nespresso.com/ecom/medias/sys_master/public/10842190675998.png?impolicy=product&imwidth=200",
				backgroundImageLink = "https://www.nespresso.com/shared_res/mos/free_html/int/pdp/craftmanship/3_colombia_ol_recipe.jpg"
			)
		)
}