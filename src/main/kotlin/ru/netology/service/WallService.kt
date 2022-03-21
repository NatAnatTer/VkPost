package ru.netology.service

import ru.netology.data.Post
import java.util.*

internal object WallService {
    private var posts = emptyArray<Post>()
    private var uId = emptyArray<UInt>()

   internal fun add(post: Post): Post {
        post.id = setId()
       posts += post
        return posts.last()
    }

  internal  fun printPost() {
        for (post in posts)
            println(post)
    }



  private  fun setId(): UInt{
        var maxRate = uId.maxOrNull()

            if (maxRate == null){
               maxRate = 1U
            } else {
                maxRate += 1U
            }
        uId += maxRate
        return maxRate
    }


//    fun getLastIdPosts(posts: Array<Post>): Int {
//        val id: Int
//        id = if (posts.lastIndex == -1) {
//            0
//        } else {
//            posts.lastIndex + 1
//        }
//        return id
//    }
//    println(emptyList<Any>().lastIndex) // -1
//    val list = listOf("a", "x", "y")
//    println(list.lastIndex) // 2
//    println(list[list.lastIndex]) // y

//    fun update(post: Post): Boolean {
//
//    }
//
//    fun removeById(id: Long): Boolean {
//        T
//    }

//    fun likeById(id: Int) {
//        for ((index, post) in posts.withIndex()) {
//            if (post.id == id) {
//                posts[index] = post.copy(likes = post.likes.count + 1)
//            }
//        }
//    }
}