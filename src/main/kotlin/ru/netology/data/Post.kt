package ru.netology.data

import ru.netology.service.WallService

data class Post(
    val ownerId: Int, //Идентификатор владельца стены, на которой размещена запись
    val fromId: Int, //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int, //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад
    val text: String, //Текст записи.
    val replyOwnerId: Int, //Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int, //Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Boolean = false, //true, если запись была создана с опцией «Только для друзей»
    val comments: Comment, //Информация о комментариях к записи
    val copyright: Copyright, //Источник материала,
    val likes: Like, //Информация о лайках к записи
    val repost: Repost, //Информация о репостах записи («Рассказать друзьям»)
    val views: View, //Информация о просмотрах записи
    val postType: TypeOfPost, //Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val signerId: Int, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    val canPin: Boolean, //Информация о том, может ли текущий пользователь закрепить запись (true — может, false — не может).
    val canDelete: Boolean, //Информация о том, может ли текущий пользователь удалить запись (true — может, false — не может).
    val canEdit: Boolean, //Информация о том, может ли текущий пользователь редактировать запись (true — может, false — не может).
    val isPinned: Boolean, //Информация о том, что запись закреплена.
    val markedAsAds: Boolean, //Информация о том, содержит ли запись отметку «реклама» (true — да, false — нет).
    val isFavorite: Boolean, //true, если объект добавлен в закладки у текущего пользователя.
    val donut: Donut, //Информация о записи VK Donut
    val postponedId: Int //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
) {
    private val id: UInt = WallService.setId() //Идентификатор записи
    private val date: Long = System.currentTimeMillis() //Время публикации записи в формате unixtime

    fun getId(): UInt {
        return id
    }

    fun getCurrentDate(): Long {
        return date
    }
}






