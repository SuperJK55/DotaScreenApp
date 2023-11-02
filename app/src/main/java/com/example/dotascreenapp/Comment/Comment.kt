package com.example.dotascreenapp.Comment

import com.example.dotascreenapp.R

data class User(val name: String, val photo: Int)
data class Comment(val date: String, val text: String)
data class CommentUi(val user: User, val comment: Comment)

val comments = listOf(
    CommentUi(
        user = User(
            "Auguste Conte",
            R.drawable.photo_user_1
        ),
        comment = Comment(
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    CommentUi(
        user = User(
            "Jang Marcelino",
            R.drawable.photo_user_2
        ),
        comment = Comment(
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
)