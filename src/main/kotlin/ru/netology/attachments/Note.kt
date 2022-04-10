package ru.netology.attachments

data class Note(
    val id: Int, // Идентификатор заметки.
    val ownerId: Int, // Идентификатор владельца заметки.
    val title: String, // Заголовок заметки.
    val text: String, // Текст заметки.
    val date: Int, // Дата создания заметки в формате Unixtime.
    val comments: Int, // Количество комментариев.
    val readComments: Int, //Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl: String, // URL страницы для отображения заметки.
    val privacyView: String, // Настройки приватности комментирования заметки
    val canComment: Boolean, // Есть ли возможность оставлять комментарии
    val textWiki: String // Тэги ссылок на wiki
) {

    override fun toString(): String {
        return ("id = $id" + "\n" +
                "ownerId = $ownerId" + "\n" +
                "title = $title" + "\n" +
                "text = $text" + "\n" +
                "date = $date" + "\n" +
                "comments = $comments" + "\n" +
                "readComments = $readComments" + "\n" +
                "viewUrl = $viewUrl" + "\n" +
                "privacyView = $privacyView" + "\n" +
                "canComment = $canComment" + "\n" +
                "textWiki = $textWiki" + "\n"
                )
    }

}
