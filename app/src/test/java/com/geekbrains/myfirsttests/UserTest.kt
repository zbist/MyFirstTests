package com.geekbrains.myfirsttests

import org.junit.Assert
import org.junit.Test

class UserTest {

    private val t1 = T1()

    @Test
    fun `проверяем что пользоваетель 20 лет может попасть в Клуб`() {
        val user = User("vlad", 21)
        Assert.assertTrue(t1.canUserGoToBar(user))
    }

    @Test
    fun userTest_SameNamesUsers_ReturnsTrue() {
        val user1 = User("Stas", 21)
        val user2 = User("Stas", 12)
        Assert.assertTrue(t1.isUsersNamesSame(user1, user2))
    }

    @Test
    fun userTest_NotSameNamesUsers_ReturnsFalse() {
        val user1 = User("Stas", 21)
        val user2 = User("Oleg", 12)
        Assert.assertFalse(t1.isUsersNamesSame(user1, user2))
    }
}