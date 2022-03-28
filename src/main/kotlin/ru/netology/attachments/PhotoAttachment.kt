package ru.netology.attachments

class PhotoAttachment(
    val id: Int, // Идентификатор фотографии.
    val albumId: Int, // Идентификатор альбома, в котором находится фотография.
    val ownerId: Int, // Идентификатор владельца фотографии.
    val userId: Int, // Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String, // Текст описания фотографии.
    val date: Int, //  Дата добавления в формате Unixtime.
    val sizes: Array<Sizes>, // Массив с копиями изображения в разных размерах. Каждый объект массива содержит следующие поля:
    val width: Int, // Ширина оригинала фотографии в пикселах.
    val height: Int, // Высота оригинала фотографии в пикселах.
) : Attachments {
    override val typeOfAttachments: String
        get() = "Photo"

    override fun toString(): String {
        return ("typeOfAttachments = $typeOfAttachments" + "\n" +
                "id = $id" + "\n" +
                "albumId = $albumId" + "\n" +
                "ownerId = $ownerId" + "\n" +
                "userId = $userId" + "\n" +
                "text = $text" + "\n" +
                "date = $date" + "\n" +
                "sizes = $sizes" + "\n" +
                "width = $width" + "\n" +
                "height = $height" + "\n")
    }
}