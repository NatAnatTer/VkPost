package ru.netology.attachments


class FileAttachment() : Attachments {
    override val typeOfAttachments: String
        get() = "File"

    // Объект, описывающий файл
    val id: Int = 0 // Идентификатор файла.
    val ownerId: Int = 0 // Идентификатор пользователя, загрузившего файл.
    val title: String = "" // Название файла.
    val size: Int = 0 // Размер файла в байтах.
    val ext: String = "" // Расширение файла.
    val url: String = "" // Адрес файла, по которому его можно загрузить.
    val date: Int = 0 // Дата добавления в формате Unixtime.
    val type: Int = 0 //Тип файла.  Возможные значения:

    /**
    1 — текстовые документы;
    2 — архивы;
    3 — gif;
    4 — изображения;
    5 — аудио;
    6 — видео;
    7 — электронные книги;
    8 — неизвестно.
     */
    val preview: Preview  //Информация для предварительного просмотра файла.
    get() = preview


}