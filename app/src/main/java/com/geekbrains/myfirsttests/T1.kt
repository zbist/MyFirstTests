package com.geekbrains.myfirsttests

class T1 {

    fun canUserGoToBar(user: User): Boolean {
        return user.age >= 18
    }

    fun isUsersNamesSame(user1: User, user2: User): Boolean {
        return user1.name == user2.name
    }

}

data class User(
    val name: String,
    val age: Int
)