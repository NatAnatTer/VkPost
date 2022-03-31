package ru.netology.data

import ru.netology.attachments.Attachments

// Объект, описывающий комментарии на стене
class Comment(
    val id: Int, //Идентификатор комментария.
    val fromId: Int, //Идентификатор автора комментария.
    val date: Int, //Дата создания комментария в формате Unixtime.
    val text: String, //Текст комментария.
    val donut: Donut, //Информация о VK Donut.
    val replyToUser: Int?, //Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val replyToComment: Int?,//Идентификатор комментария, в ответ на который оставлен текущий (если применимо).
    val attachments: Attachments?, //Медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
    val parentsStack: Array<Comment>?, //Массив идентификаторов родительских комментариев.
    val thread: Thread, //Информация о вложенной ветке комментариев
    val ownerId: Int, //идентификатор пользователя или сообщества, на чьей стене находится запись, к которой необходимо добавить комментарий.    Обратите внимание, идентификатор сообщества в параметре owner_id необходимо указывать со знаком "-" — например, owner_id=-1 соответствует идентификатору сообщества ВКонтакте API (club1)  целое число, по умолчанию идентификатор текущего пользователя
    val postId: UInt // идентификатор записи на стене. положительное число, обязательный параметр
) {

}

data class Thread(
    val count: Int, // количество комментариев в ветке.
    val items: Array<Comment>?, //массив объектов комментариев к записи (только для метода wall.getComments).
    val canPost: Boolean, // может ли текущий пользователь оставлять комментарии в этой ветке.
    val showReplyButton: Boolean, //нужно ли отображать кнопку «ответить» в ветке.
    val groupsCanPost: Boolean // могут ли сообщества оставлять комментарии в ветке.
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Thread

        if (count != other.count) return false
        if (!items.contentEquals(other.items)) return false
        if (canPost != other.canPost) return false
        if (showReplyButton != other.showReplyButton) return false
        if (groupsCanPost != other.groupsCanPost) return false

        return true
    }

    override fun hashCode(): Int {
        var result = count
        result = 31 * result + items.contentHashCode()
        result = 31 * result + canPost.hashCode()
        result = 31 * result + showReplyButton.hashCode()
        result = 31 * result + groupsCanPost.hashCode()
        return result
    }
}

