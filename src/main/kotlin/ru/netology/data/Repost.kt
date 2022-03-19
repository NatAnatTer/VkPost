package ru.netology.data

data class Repost(
    val count: Int, // число пользователей, скопировавших запись;
    val userReposted: Boolean //наличие репоста от текущего пользователя (true — есть, false — нет).
)
