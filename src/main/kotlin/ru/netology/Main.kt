package ru.netology

import ru.netology.data.*

fun main() {
    val typeOfPost = TypeOfPost.POST

    val post1 = Post(
        1,
        1,
        2,
        0,
        1647721489,
        "This is my first post. I hope, I can do it better than I think. And so on, bla bla bla.",
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

    print(post1)

}