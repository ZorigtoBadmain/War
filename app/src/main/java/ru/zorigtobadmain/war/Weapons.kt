package ru.zorigtobadmain.war

object Weapons {
    object shotGun : AbstractWeapon(5, FireType.SingleShot) {
        override fun cartridgeMaking(): Ammo {
            TODO("Not yet implemented")
        }
    }

    object rifle : AbstractWeapon(10, FireType.SingleShot) {
        override fun cartridgeMaking(): Ammo {
            TODO("Not yet implemented")
        }
    }

    object pistol : AbstractWeapon(7, FireType.SingleShot) {
        override fun cartridgeMaking(): Ammo {
            TODO("Not yet implemented")
        }
    }

    object machineGun : AbstractWeapon(30, FireType.BurstShot) {
        override fun cartridgeMaking(): Ammo {
            TODO("Not yet implemented")
        }
    }
}