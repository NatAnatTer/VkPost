package ru.netology.attachments

data class PhotoAttachment(
    override val typeOfAttachments: String = "Photo",
    val photo: Photo
) : Attachments {


}