package ru.zorigtobadmain.war

abstract class AbstractWeapon(
    var maxPatronMagazine: Int = 50, //макс кол-во патронов
    var fireType: FireType //вид стрельбы
) {
    var currentAmmoList = mutableListOf<Ammo>()//текущий список патронов
    var presenceOfCartridges: Boolean = true //факт наличия патронов

    //создание патрона
    abstract fun cartridgeMaking(): Ammo

    //перезарядка
    fun recharge() {
        for (i in currentAmmoList.size until maxPatronMagazine) {
            currentAmmoList.add(cartridgeMaking())
        }
        presenceOfCartridges = true
    }

    // получение патронов для выстрела
    fun getCartridgeOfShot(): List<Ammo> {
        val cartridge = mutableListOf<Ammo>()
        for (i in 0 until fireType.numberOfShot) {
            if (currentAmmoList.size > 0) {
                cartridge.add(currentAmmoList.removeAt(0))
            }
        }
        presenceOfCartridges = currentAmmoList.size > 0
        return cartridge
    }
}