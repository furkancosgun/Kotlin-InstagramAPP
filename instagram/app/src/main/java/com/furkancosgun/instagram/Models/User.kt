package com.furkancosgun.instagram.Models

data class User(
    val name: String? = null,
    val userName: String? = null,
    val bio: String? = null,
    val profileImg: String? = null,
    val link: String? = null,
    val followerCount: String? = null,
    val followingCount: String? = null,
    val postCount: String? = null,
)

class Users {
    companion object {
        val user = User(
            "Furkan COSGUN",
            "Furkangobrr",
            "Mobile Developer",
            "https://avatars.githubusercontent.com/u/79643303?v=4",
            "https://github.com/furkancosgun",
            "100K",
            "100",
            "1"
        )
        val users = mutableListOf<User>(
            User(
                "Furkan COSGUN",
                "Furkangobrr",
                "Mobile Developer",
                "https://avatars.githubusercontent.com/u/79643303?v=4",
                "https://github.com/furkancosgun",
                "100K",
                "100",
                "1"
            ), User(
                "Furkan COSGUN",
                "Furkangobrr",
                "Mobile Developer",
                "https://avatars.githubusercontent.com/u/79643303?v=4",
                "https://github.com/furkancosgun",
                "100K",
                "100",
                "1"
            ), User(
                "Furkan COSGUN",
                "Furkangobrr",
                "Mobile Developer",
                "https://avatars.githubusercontent.com/u/79643303?v=4",
                "https://github.com/furkancosgun",
                "100K",
                "100",
                "1"
            ), User(
                "Furkan COSGUN",
                "Furkangobrr",
                "Mobile Developer",
                "https://avatars.githubusercontent.com/u/79643303?v=4",
                "https://github.com/furkancosgun",
                "100K",
                "100",
                "1"
            )
        )
    }
}