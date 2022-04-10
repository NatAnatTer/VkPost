package ru.netology.attachments

data class LinkAttachment(
    override val typeOfAttachments: String = "Link",
    val link: Link
) : Attachments {


}
