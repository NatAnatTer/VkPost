package ru.netology.attachments

import ru.netology.data.Like

data class VideoAttachment(
    val id: Int, // Идентификатор видеозаписи.
    val ownerId: Int, // Идентификатор владельца видеозаписи.
    val title: String, // Название видеозаписи.
    val description: String, // Текст описания видеозаписи.
    val duration: Int, // Длительность ролика в секундах.
    val image: Array<Image>, // Изображение обложки. Содержит массив объектов с полями:
    val firstFrame: Array<Image>, //Изображение первого кадра.
    val date: Int, // Дата создания видеозаписи в формате Unixtime.
    val addingDate: Int, // Дата добавления видеозаписи пользователем или группой в формате Unixtime.
    val views: Int, // Количество просмотров видеозаписи.
    val localViews: Int, // Если видео внешнее, количество просмотров ВКонтакте.
    val comments: Int, // Количество комментариев к видеозаписи.
    val player: String, //URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и HTML5, плеер всегда масштабируется по размеру окна.
    val platform: String, // Название платформы (для видеозаписей, добавленных с внешних сайтов).
    val canAdd: Boolean, // Может ли пользователь добавить видеозапись к себе. false — не может добавить. true — может добавить.
    val isPrivate: Int, // Поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
    val accessKey: String, // Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
    val processing: Int, // Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    val isFavorite: Boolean, // true, если объект добавлен в закладки у текущего пользователя.
    val canComment: Boolean, // Может ли пользователь комментировать видео. false — не может комментировать. true — может комментировать.
    val canEdit: Boolean, // Может ли пользователь редактировать видео. false — не может редактировать. true — может редактировать.
    val canLike: Boolean, //Может ли пользователь добавить видео в список <<Мне нравится>>.false — не может добавить. true  — может добавить.
    val canRepost: Boolean, // Может ли пользователь сделать репост видео. false — не может сделать репост. true  — может сделать репост.
    val canSubscribe: Boolean, // Может ли пользователь подписаться на автора видео. false — не может подписаться. true — может подписаться.
    val canAddToFaves: Boolean, // Может ли пользователь добавить видео в избранное. false — не может добавить. true — может добавить.
    val canAttachLink: Boolean, // Может ли пользователь прикрепить кнопку действия к видео. false — не может прикрепить. true — может прикрепить.
    val width: Int, // Ширина видео.
    val height: Int, // Высота видео.
    val userId: Int, // Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
    val converting: Boolean, // Конвертируется ли видео. false  — не конвертируется.true — конвертируется.
    val added: Boolean, //Добавлено ли видео в альбомы пользователя. false — не добавлено. true — добавлено.
    val isSubscribed: Int, // Подписан ли пользователь на автора видео. false — не подписан. true — подписан.
    val repeat: Int, // Поле возвращается в том случае, если видео зациклено, всегда содержит 1
    val type: String, // Тип видеозаписи. Может принимать значения: video, music_video, movie.
    val balance: Int, // Баланс донатов в прямой трансляции.
    val liveStatus: String, // Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming.
    val live: Int, // Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    val upcoming: Int, // Поле свидетельствует о том, что трансляция скоро начнётся. Для live =1.
    val spectators: Int, // Количество зрителей прямой трансляции.
    val likes: Like, // Содержит объект отметки «Мне нравится».
    val reposts: RepostVideo, // Содержит объект репоста.

) : Attachments {
    override val typeOfAttachments: String
        get() = "Video"

    data class Image(
        val height: Int, //высота изображения.
        val url: String, // ссылка на изображение.
        val width: Int,//цирина изображение.
        val withPadding: Int // поле возвращается, если изображение с отбивкой, всегда содержит 1.
    )

    data class RepostVideo(
        val count: Int, // счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения.
        val wallCount: Int, // счетчик репостов на стену.
        val mailCount: Int, // счетчик репостов в личные сообщения.
        val userReposted: Int //информация о том, сделал ли текущий пользователь репост этого видео.
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as VideoAttachment

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (title != other.title) return false
        if (description != other.description) return false
        if (duration != other.duration) return false
        if (!image.contentEquals(other.image)) return false
        if (!firstFrame.contentEquals(other.firstFrame)) return false
        if (date != other.date) return false
        if (addingDate != other.addingDate) return false
        if (views != other.views) return false
        if (localViews != other.localViews) return false
        if (comments != other.comments) return false
        if (player != other.player) return false
        if (platform != other.platform) return false
        if (canAdd != other.canAdd) return false
        if (isPrivate != other.isPrivate) return false
        if (accessKey != other.accessKey) return false
        if (processing != other.processing) return false
        if (isFavorite != other.isFavorite) return false
        if (canComment != other.canComment) return false
        if (canEdit != other.canEdit) return false
        if (canLike != other.canLike) return false
        if (canRepost != other.canRepost) return false
        if (canSubscribe != other.canSubscribe) return false
        if (canAddToFaves != other.canAddToFaves) return false
        if (canAttachLink != other.canAttachLink) return false
        if (width != other.width) return false
        if (height != other.height) return false
        if (userId != other.userId) return false
        if (converting != other.converting) return false
        if (added != other.added) return false
        if (isSubscribed != other.isSubscribed) return false
        if (repeat != other.repeat) return false
        if (type != other.type) return false
        if (balance != other.balance) return false
        if (liveStatus != other.liveStatus) return false
        if (live != other.live) return false
        if (upcoming != other.upcoming) return false
        if (spectators != other.spectators) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + title.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + duration
        result = 31 * result + image.contentHashCode()
        result = 31 * result + firstFrame.contentHashCode()
        result = 31 * result + date
        result = 31 * result + addingDate
        result = 31 * result + views
        result = 31 * result + localViews
        result = 31 * result + comments
        result = 31 * result + player.hashCode()
        result = 31 * result + platform.hashCode()
        result = 31 * result + canAdd.hashCode()
        result = 31 * result + isPrivate
        result = 31 * result + accessKey.hashCode()
        result = 31 * result + processing
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + canComment.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + canLike.hashCode()
        result = 31 * result + canRepost.hashCode()
        result = 31 * result + canSubscribe.hashCode()
        result = 31 * result + canAddToFaves.hashCode()
        result = 31 * result + canAttachLink.hashCode()
        result = 31 * result + width
        result = 31 * result + height
        result = 31 * result + userId
        result = 31 * result + converting.hashCode()
        result = 31 * result + added.hashCode()
        result = 31 * result + isSubscribed
        result = 31 * result + repeat
        result = 31 * result + type.hashCode()
        result = 31 * result + balance
        result = 31 * result + liveStatus.hashCode()
        result = 31 * result + live
        result = 31 * result + upcoming
        result = 31 * result + spectators
        result = 31 * result + likes.hashCode()
        result = 31 * result + reposts.hashCode()
        return result
    }

}
