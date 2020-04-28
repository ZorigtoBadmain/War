package ru.zorigtobadmain.war

interface Warrior {

    val isKilled: Boolean
    val chanceToAvoidBeingHit: Int

    fun toAttack(enemy: Warrior)

    fun takeDamage(damage: Int)
}