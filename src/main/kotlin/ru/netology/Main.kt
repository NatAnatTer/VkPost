package ru.netology

import ru.netology.attachments.*
import ru.netology.data.*
import ru.netology.service.WallService


fun main() {
    val typeOfPost = TypeOfPost.POST

    val obj = WallService

    val attachment: Array<Attachments> = arrayOf(
        PhotoAttachment(
            "Photo", Photo(
                1,
                1,
                5,
                10,
                "Myfirst symphony",
                123213,
                arrayOf(Sizes("http://my_album", 123, 234, "photo")),
                123,
                234
            )
        ),
        AudioAttachment(
            "Audio", Audio(
                1,
                3,
                "First artist",
                "First song",
                14678,
                "http://first_song",
                null,
                null,
                30,
                2343424,
                true,
                true
            )
        ),
        FileAttachment(
            "File", File(
                1,
                2,
                "Title 1 file",
                256,
                "pdf",
                "http://file_store.ru",
                72634628,
                1,
                PhotoSize(arrayOf(Sizes("https://rhoto_preview", 123, 243, "some type")))
            )
        ),
        LinkAttachment(
            "Link", Link(
                "http://link_first_link",
                "this link is link",
                null,
                "description this link",
                null,
                Link.Product(Link.Price(10, Link.Currency(1232, "Ru"), "something")),
                Link.Button("thisButton", Link.Actions("radio_button")),
                "owner_id_page_id",
                "http://preview.ru"
            )
        ),
        NoteAttachment(
            "Note", Note(
                45,
                32,
                "thisNote",
                "there is text of note",
                2342342,
                5,
                2,
                "http://firstNote.ru",
                "property of privacy",
                true,
                "#linkOn WiKi"
            )
        )
    )

    val post1 = Post(
        ownerId = 1,
        fromId = 2,
        createdBy = 0,
        date = System.currentTimeMillis(),
        text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = Comment(1, true, true, true, true),
        copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
        likes = Like(1000, true, true, true),
        repost = Repost(100_000_000, true),
        views = View(1_000_000_000),
        postType = typeOfPost,
        postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
        geo = null,
        copyHistory = null,
        attachments = null,
        signerId = 0,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
        postponedId = 1232
    )

    val post2 = Post(
        1,
        2,
        0,
        System.currentTimeMillis(),
        "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
        0,
        0,
        true,
        Comment(1, true, true, true, true),
        Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
        Like(1000, true, true, true),
        Repost(100_000_000, true),
        View(1_000_000_000),
        typeOfPost,
        Source("vk", "android", "profile_activity", "https://source1234source"),
        null,
        null,
        null,
        0,
        true,
        true,
        true,
        false,
        false,
        true,
        Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
        1232
    )
    val post3 = Post(
        1,
        2,
        0,
        System.currentTimeMillis(),
        "This is my ТРЕТИЙ post. I hope, I can do it better than I think. And so on, bla bla bla.",
        0,
        0,
        true,
        Comment(1, true, true, true, true),
        Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
        Like(1000, true, true, true),
        Repost(100_000_000, true),
        View(1_000_000_000),
        typeOfPost,
        Source("vk", "android", "profile_activity", "https://source1234source"),
        null,
        null,
        null,
        0,
        true,
        true,
        true,
        false,
        false,
        true,
        Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
        1232
    )
    val post4 = Post(
        5,
        2,
        0,
        System.currentTimeMillis(),
        "This is my SECOND COOOOPYYYY post. I hope, I can do it better than I think. And so on, bla bla bla.",
        0,
        0,
        true,
        Comment(1, true, true, true, true),
        Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
        Like(1000, true, true, true),
        Repost(100_000_000, true),
        View(1_000_000_000),
        typeOfPost,
        Source("vk", "android", "profile_activity", "https://source1234source"),
        null,
        null,
        null,
        0,
        true,
        true,
        true,
        false,
        false,
        true,
        Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
        1232
    )

    obj.add(post1)
    obj.add(post2)
    obj.add(post3)

    obj.printPost()

    val copyHistory = arrayOf(post2, post3)
    obj.addCopyHistory(post1, copyHistory)

    obj.addAttachment(attachment, post1)
    obj.update(post1, post4)
    obj.printPost()


}
