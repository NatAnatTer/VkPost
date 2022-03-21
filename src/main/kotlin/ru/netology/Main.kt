package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService


fun main() {
    val typeOfPost = TypeOfPost.POST


    val post1 = Post(
        id = 0U,
        ownerId = 1,
        fromId = 2,
        createdBy = 0,
        date = 1647721489,
        text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = true,
        comments = Comment(1, true, true, true, true),
        copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
        likes = Like(1000, true, true, true),
        repost = Repost(100_000_000, true),
        views = View(1_000_000_000),
        postType = typeOfPost,
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
        0U,
        1,
        2,
        0,
        1647721489,
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
        0U,
        1,
        2,
        0,
        1647721489,
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
    val obj = WallService
    obj.add(post1)
    obj.add(post2)
    obj.add(post3)
    obj.printPost()


}