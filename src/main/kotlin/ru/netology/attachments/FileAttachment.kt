package ru.netology.attachments

// Объект, описывающий файл

data class FileAttachment(
    val id: Int, // Идентификатор файла.
    val ownerId: Int, // Идентификатор пользователя, загрузившего файл.
    val title: String, // Название файла.
    val size: Int, // Размер файла в байтах.
    val ext: String, // Расширение файла.
    val url: String, // Адрес файла, по которому его можно загрузить.
    val date: Int, // Дата добавления в формате Unixtime.
    val type: Int, //Тип файла.
    val preview: Preview  //Информация для предварительного просмотра файла.
) : Attachments {
    override val typeOfAttachments: String
        get() = "File"


    override fun toString(): String {
        return ("typeOfAttachments = $typeOfAttachments" + "\n" +
                "id = $id" + "\n" +
                "ownerId = $ownerId" + "\n" +
                "title = $title" + "\n" +
                "size = $size" + "\n" +
                "ext = $ext" + "\n" +
                "url = $url" + "\n" +
                "date = $date" + "\n" +
                "type = $type" + "\n" +
                "preview = $preview" + "\n"
                )
    }
    /**
     * Тип файла.  Возможные значения:
    1 — текстовые документы;
    2 — архивы;
    3 — gif;
    4 — изображения;
    5 — аудио;
    6 — видео;
    7 — электронные книги;
    8 — неизвестно.
     */
}