package ru.netology.attachments

class NoteAttachment {
    class NoteAttachment() : Attachments {
        override val typeOfAttachments: String
            get() = "Note"

        //Объект, описывающий заметку, содержит следующие поля:
        val id: Int = 0 // Идентификатор заметки.
        val ownerId: Int = 0 // Идентификатор владельца заметки.
        val title: String = "" // Заголовок заметки.
        val text: String = "" // Текст заметки.
        val date: Int = 0 // Дата создания заметки в формате Unixtime.
        val comments: Int = 0 // Количество комментариев.
        val readComments: Int = 0 //Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
        val viewUrl: String = "" // URL страницы для отображения заметки.
        val privacyView: String = "" // Настройки приватности комментирования заметки
        val canComment: Boolean = false // Есть ли возможность оставлять комментарии
        val textWiki: String = "" // Тэги ссылок на wiki
    }
}