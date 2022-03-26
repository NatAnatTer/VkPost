package ru.netology.attachments

class PhotoAttachment() : Attachments {
    override val typeOfAttachments: String
        get() = "Photo"
    val id: Int = 0 // Идентификатор фотографии.
    val albumId: Int = 0 // Идентификатор альбома, в котором находится фотография.
    val ownerId: Int = 0 // Идентификатор владельца фотографии.
    val userId: Int = 0 // Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String = "" // Текст описания фотографии.
    val date: Int = 0 //  Дата добавления в формате Unixtime.
    val sizes = emptyArray<Sizes>() // Массив с копиями изображения в разных размерах. Каждый объект массива содержит следующие поля:
    val width: Int = 0 // Ширина оригинала фотографии в пикселах.
    val height: Int = 0 // Высота оригинала фотографии в пикселах.


}