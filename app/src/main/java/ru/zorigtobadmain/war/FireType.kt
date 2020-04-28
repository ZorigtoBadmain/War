package ru.zorigtobadmain.war

sealed class FireType(var numberOfShot: Int) {
    object SingleShot : FireType(1)
    object BurstShot : FireType(3)
}
