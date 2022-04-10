package ru.netology.attachments

data class VideoAttachment(
    override val typeOfAttachments: String = "Video",
    val video: Video
) : Attachments