package com.example.KnowYouLimit.dto

data class drinkDTO(var name: String, var category: String, var abv: String, var size: String) {
//
//    var budlight = drinkDTO("Bud light", "beer", "4.2%", "12oz")
//    var budlightPlat = drinkDTO("Bud Light Platinum", "beer", "6%", "12oz")
//    var coorLight = drinkDTO("Coors Light", "beer", "4.2%", "12oz")
//    var hamms = drinkDTO("Hamm's", "beer", "4.7%", "12oz")
//    var heineken = drinkDTO("Heineken", "beer", "5%", "12oz")
//    var michelob = drinkDTO("Michelob Ultra", "beer", "4.2%", "12oz")
//    var millerHighLife = drinkDTO("Miller High Life", "beer", "4.6%", "12oz")
//    var rollingRock = drinkDTO("Rolling Rock", "beer", "4.5%", "12oz")
//    var stella = drinkDTO("Stella Artois", "beer", "5.2%", "12oz")
//    var yuengling = drinkDTO("Yuengling", "beer", "4.5%", "12oz")
//    var marg = drinkDTO("Margarita", "mixed", "26%", "12oz")
//    var oldFashioned = drinkDTO("Old Fashioned", "mixed", "35%", "6oz")
//    var mojito = drinkDTO("Mojito", "mixed", "25%", "8oz")
//    var moscowMule = drinkDTO("Moscow Mule", "mixed", "35%", "8oz")
//    var vodkaRedbull = drinkDTO("Vodka & Redbull", "mixed", "30%", "8oz")
//    var whiskey = drinkDTO("Whiskey", "liquor", "40%", "2oz")
//    var vodka = drinkDTO("Vodka", "liquor", "40%", "2oz")
//    var gin = drinkDTO("Gin", "liquor", "47%", "2oz")
//    var rum = drinkDTO("Rum", "liquor", "40%", "2oz")

    override fun toString(): String{
        return "$name ($abv) $size"
    }
}