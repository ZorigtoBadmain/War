package ru.zorigtobadmain.war

abstract class AbstractWarrior(
    val maxHealth: Int,  // максимальный уровень здоровья
    override val chanceToAvoidBeingHit: Int, // шанс избежать попадания
    val accuracy: Int,  // точность - вероятность попадания
    val weapon: AbstractWeapon,  //оружие
    var currentLevelOfHealth: Int = maxHealth  //текущий уровень здоровья
) : Warrior {

    override fun toAttack(enemy: Warrior) {
        if (weapon.presenceOfCartridges) {
            weapon.recharge()
        } else {
            weapon.getCartridgeOfShot()
            takeDamage(accuracy / currentLevelOfHealth)
        }
    }

    override fun takeDamage(damage: Int) {
        currentLevelOfHealth - damage
    }
}