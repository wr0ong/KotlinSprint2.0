package org.example.lesson15

class MusicShop(
    val name: String = "Yamaha Shop",
    val mListOfGuitar: MutableList<Guitar> = mutableListOf(),
    val mListOfViolin: MutableList<Violin> = mutableListOf(),
    val mListOfPiano: MutableList<Piano> = mutableListOf(),
    val mListOfAccessoriesOfGuitar: MutableList<AccessoriesOfGuitar> = mutableListOf(),
    val mListOfAccessoriesOfViolin: MutableList<AccessoriesOfViolin> = mutableListOf(),
    val mListOfAccessoriesOfPiano: MutableList<AccessoriesOfPiano> = mutableListOf(),
) : Search {
    fun showAllAccessories() {
        println("Аксессуары для гитар:")
        mListOfAccessoriesOfGuitar.forEach {
            println(
                "Тип аксессуара - ${it.typeOfAccessories}, " +
                        "Бренд - ${it.brandOfAccessories}, Модель - ${it.modelOfAccessories}, Цена - ${it.priceOfAccessories} руб."
            )
        }
        println("Аксессуары для пианино:")
        mListOfAccessoriesOfPiano.forEach {
            println(
                "Тип аксессуара - ${it.typeOfAccessories}, " +
                        "Бренд - ${it.brandOfAccessories}, Модель - ${it.modelOfAccessories}, Цена - ${it.priceOfAccessories} руб."
            )
        }
        println("Аксессуары для скрипок:")
        mListOfAccessoriesOfViolin.forEach {
            println(
                "Тип аксессуара - ${it.typeOfAccessories}, " +
                        "Бренд - ${it.brandOfAccessories}, Модель - ${it.modelOfAccessories}, Цена - ${it.priceOfAccessories} руб."
            )
        }
    }
}

abstract class Instruments(
    val brand: String = "",
    val model: String = "",
    val price: Double = 0.0,
) {

}

open class Guitar(
    brand: String,
    model: String,
    price: Double,
    val mListOfAccessories: MutableList<AccessoriesOfGuitar> = mutableListOf(),
) : Instruments(brand, model, price), Search {}

open class Violin(
    brand: String,
    model: String,
    price: Double,
    val mListOfAccessories: MutableList<AccessoriesOfViolin> = mutableListOf(),
) : Instruments(brand, model, price), Search {}

open class Piano(
    brand: String,
    model: String,
    price: Double,
    val mListOfAccessories: MutableList<AccessoriesOfPiano> = mutableListOf()
) : Instruments(brand, model, price), Search {}

class AccessoriesOfGuitar(
    brand: String = "Any",
    model: String = "Any",
    price: Double = 0.0,
    val typeOfAccessories: String = "",
    val brandOfAccessories: String = "",
    val modelOfAccessories: String = "",
    val priceOfAccessories: Double = 0.0,
) : Guitar(brand, model, price) {
    init {
        mListOfAccessories.add(this)
    }
}

class AccessoriesOfViolin(
    brand: String = "Any",
    model: String = "Any",
    price: Double = 0.0,
    val typeOfAccessories: String = "",
    val brandOfAccessories: String = "",
    val modelOfAccessories: String = "",
    val priceOfAccessories: Double = 0.0,
) : Violin(brand, model, price) {
    init {
        mListOfAccessories.add(this)
    }
}

class AccessoriesOfPiano(
    brand: String = "Any",
    model: String = "Any",
    price: Double = 0.0,
    val typeOfAccessories: String = "",
    val brandOfAccessories: String = "",
    val modelOfAccessories: String = "",
    val priceOfAccessories: Double = 0.0,
) : Piano(brand, model, price) {
    init {
        mListOfAccessories.add(this)
    }
}

interface Search {
    fun searchAccessories() {
        println("Выполняется поиск...")
    }
}

fun main() {
    val yamahaShop: MusicShop = MusicShop()
    val guitar1: Guitar = Guitar(
        brand = "Yamaha",
        model = "С70",
        price = 27000.0,
    )
    val guitar2: Guitar = Guitar(
        brand = "Yamaha",
        model = "F310N",
        price = 25300.0,
    )
    yamahaShop.mListOfGuitar.add(guitar1)
    yamahaShop.mListOfGuitar.add(guitar2)

    val violin1: Violin = Violin(
        brand = "Yamaha",
        model = "V5SA 4/4",
        price = 63000.0,
    )
    val violin2: Violin = Violin(
        brand = "Yamaha",
        model = "SV-200 CD",
        price = 75000.0,
    )
    yamahaShop.mListOfViolin.add(violin1)
    yamahaShop.mListOfViolin.add(violin2)

    val piano1: Piano = Piano(
        brand = "Yamaha",
        model = "Arius YDP-145",
        price = 155000.0,
    )
    val piano2: Piano = Piano(
        brand = "Yamaha",
        model = "CSP-275B",
        price = 475000.0,
    )
    yamahaShop.mListOfPiano.add(piano1)
    yamahaShop.mListOfPiano.add(piano2)

    val accessoriesOfPiano1: AccessoriesOfPiano = AccessoriesOfPiano(
        typeOfAccessories = "Banquette",
        brandOfAccessories = "Becker",
        modelOfAccessories = "BP-3BP/BV",
        priceOfAccessories = 10300.0,
    )
    val accessoriesOfPiano2: AccessoriesOfPiano = AccessoriesOfPiano(
        typeOfAccessories = "Banquette",
        brandOfAccessories = "Dekko",
        modelOfAccessories = "JR-40-1",
        priceOfAccessories = 8800.0,
    )
    yamahaShop.mListOfAccessoriesOfPiano.add(accessoriesOfPiano1)
    yamahaShop.mListOfAccessoriesOfPiano.add(accessoriesOfPiano2)
    val accessoriesOfGuitar1: AccessoriesOfGuitar = AccessoriesOfGuitar(
        typeOfAccessories = "Spikes",
        brandOfAccessories = "Alice",
        modelOfAccessories = "AOD-017AP",
        priceOfAccessories = 1000.0,
    )
    val accessoriesOfGuitar2: AccessoriesOfGuitar = AccessoriesOfGuitar(
        typeOfAccessories = "Strings",
        brandOfAccessories = "Ernie ball",
        modelOfAccessories = "222",
        priceOfAccessories = 950.0,
    )
    yamahaShop.mListOfAccessoriesOfGuitar.add(accessoriesOfGuitar1)
    yamahaShop.mListOfAccessoriesOfGuitar.add(accessoriesOfGuitar2)

    yamahaShop.searchAccessories()
    yamahaShop.showAllAccessories()
}