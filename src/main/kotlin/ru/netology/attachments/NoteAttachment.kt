package ru.netology.attachments
//Объект, описывающий заметку

class NoteAttachment(
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
) : Attachments {
    override val typeOfAttachments: String
        get() = "Note"
}
