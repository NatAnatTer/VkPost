package ru.netology.data

data class Like(
    val count: Int, // число пользователей, которым понравилась запись;
    val userLikes: Boolean, // наличие отметки «Мне нравится» от текущего пользователя (true — есть, false — нет);
    val canLike: Boolean, //информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (true — может, False — не может);
    val canPublish: Boolean, //информация о том, может ли текущий пользователь сделать репост записи (true — может, false — не может).

)
