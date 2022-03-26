package ru.netology.data

import ru.netology.attachments.Attachments
import ru.netology.service.WallService

data class Post(
    val ownerId: Int, //Идентификатор владельца стены, на которой размещена запись
    val fromId: Int, //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int, //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад
    val date: Long,
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
    val postSource: Source, //Описывает способ размещения записи на стене
    val geo: Geo?, //Информация о местоположении
    var copyHistory: Array<Post>?,//Массив, содержащий историю репостов для записи. Возвращается только в том случае, если запись является репостом. Каждый из объектов массива, в свою очередь, является объектом-записью стандартного формата.
    var attachments: Array<Attachments>?, //Массив вложений
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
    fun getId(): UInt {
        return id
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (repost != other.repost) return false
        if (views != other.views) return false
        if (postType != other.postType) return false
        if (postSource != other.postSource) return false
        if (geo != other.geo) return false
        if (copyHistory != null) {
            if (other.copyHistory == null) return false
            if (!copyHistory.contentEquals(other.copyHistory)) return false
        } else if (other.copyHistory != null) return false
        if (signerId != other.signerId) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (donut != other.donut) return false
        if (postponedId != other.postponedId) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = ownerId
        result = 31 * result + fromId
        result = 31 * result + date.hashCode()
        result = 31 * result + text.hashCode()
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + likes.hashCode()
        result = 31 * result + repost.hashCode()
        result = 31 * result + views.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + postSource.hashCode()
        result = 31 * result + geo.hashCode()
        result = 31 * result + (copyHistory?.contentHashCode() ?: 0)
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + postponedId
        result = 31 * result + id.hashCode()
        return result
    }



}












