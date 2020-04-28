package ru.zorigtobadmain.war

import kotlin.random.Random

enum class Ammo(
    val damage: Int, //урон
    val chanceCriticalDamage: Int,//шанс критического урона
    val criticalDamageRatio: Int //коэффициент критического урона
) {
    //виды патронов
    ARMOR_PIERCING(310, 20, 30),
    SUB_CALIBER(320, 150, 50),
    HIGH_EXPLOSIVE(500, 5, 5);

    //получение текущего урона
    fun takingCurrentDamage(): Int {
        val rand = Random.nextInt(1, 100)

        return if (chanceCriticalDamage > rand) {
            damage * criticalDamageRatio
        } else {
            damage
        }
    }
}