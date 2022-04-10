package ru.netology.attachments

// Объект, описывающий файл

data class FileAttachment(
    override val typeOfAttachments: String = "File",
    val file: File
) : Attachments