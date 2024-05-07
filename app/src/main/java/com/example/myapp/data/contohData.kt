package com.example.myapp.data

import com.example.myapp.R
import com.example.myapp.model.Album
import com.example.myapp.model.Gallery
import com.example.myapp.model.Member
import com.example.myapp.model.Story

object contohData {
    val userStory = listOf(
        Story(
            id = 1,
            photo = R.drawable.mina,
            name = "Myoui Mina"
        ),
        Story(
            id = 2,
            photo = R.drawable.jihyo,
            name = "Park jihyo"
        ),
        Story(
            id = 3,
            photo = R.drawable.chaeyoung,
            name = "Son Chae Young"
        ),
        Story(
            id = 4,
            photo = R.drawable.nayeon,
            name = "Im Nayeon"
        ),
        Story(
            id = 5,
            photo = R.drawable.jeongyeon,
            name =  "Yoo Jeong Yeon"
        ),
        Story(
            id = 6,
            photo = R.drawable.dahyun,
            name = "Kim Dahyun"
        ),
        Story(
            id = 7,
            photo = R.drawable.sana,
            name = "Minatozaki Sana"
        ),
        Story(
            id = 8,
            photo = R.drawable.momo,
            name = "Hirai Momo"
        ),
        Story(
            id = 9,
            photo = R.drawable.tzuyu,
            name = "Chou Tzuyu"
        ),
        Story(
            id = 10,
            photo = R.drawable.yeji,
            name = "Hwang Yeji"
        ),
        Story(
            id = 11,
            photo = R.drawable.yuna,
            name = "Shin Yu Na"
        ),
        Story(
            id = 12,
            photo = R.drawable.chaeryoung,
            name = "Lee Chaeryeong"
        ),
        Story(
            id = 13,
            photo = R.drawable.ryujn,
            name = "Shin Ryu Jin"
        ),
        Story(
            id = 14,
            photo = R.drawable.lia,
            name = "Choi Ji Su  "
        ),



        )
    val myGalleries = listOf(
        Gallery(
            id = 1,
            name = "Gambar 1",
            photo = R.drawable.gambar_1
        ),
        Gallery(
            id = 2,
            name = "Gambar 2",
            photo = R.drawable.gambar_2
        ),
        Gallery(
            id = 3,
            name = "Gambar 3",
            photo = R.drawable.gambar_3
        ),
        Gallery(
            id = 4,
            name = "Gambar 4",
            photo = R.drawable.gambar_4
        ),
        Gallery(
            id = 5,
            name = "Gambar 5",
            photo = R.drawable.gambar_5
        ),
        Gallery(
            id = 6,
            name = "Gambar 6",
            photo = R.drawable.gambar_6
        ),
        Gallery(
            id = 7,
            name = "Gambar 7",
            photo = R.drawable.gambar_7
        ),
        Gallery(
            id = 8,
            name = "Gambar 8",
            photo = R.drawable.gambar_8
        ),
        Gallery(
            id = 9,
            name = "Gambar 9",
            photo = R.drawable.gambar_9
        ),
        Gallery(
            id = 10,
            name = "Gambar 10",
            photo = R.drawable.gambar_10
        ),
    )
    val member = listOf(
        Member(
            id = 1,
            name = "Myoui Mina",
            nickname = "Mina",
            role = "Main Dancer, Sub Vocalist",
            dob = "San Antonio, Texas, 24 Maret 1997",
            photo = R.drawable.mina_profile,
            group = "Twice"
        ),
        Member(
            id = 2,
            name = "Park Ji Hyo",
            nickname = "Jihyo",
            role = "Leader, Main Vocalist",
            dob = "Guri, 1 Februari 1997",
            photo = R.drawable.jihyo_profile,
            group = "Twice"
        ),
        Member(
            id = 3,
            name = "Im Na Yeon",
            nickname = "Nayeon",
            role = "Lead Vocalist, Lead Dancer, Center",
            dob = "Seoul, 22 September 1995",
            photo = R.drawable.nayeon_profile,
            group = "Twice"
        ),
        Member(
            id = 4,
            name = "Yoo Jeong Yeon",
            nickname = "Jeongyeon",
            role = "Lead Vocalist",
            dob = "Suwon, 1 November 1996",
            photo = R.drawable.jeongyeon_profile,
            group = "Twice"
        ),
        Member(
            id = 5,
            name = "Hirai Momo",
            nickname = "Momo",
            role = "Main Dancer, Sub Vocalist, Sub Rapper",
            dob = "Kyotanabe, 9 November 1996",
            photo = R.drawable.momo_profile,
            group = "Twice"
        ),
        Member(
            id = 6,
            name = "Minatozaki Sana",
            nickname = "Sana",
            role = "Sub Vocalist",
            dob = "Osaka, 29 Desember 1996",
            photo = R.drawable.sana_profile,
            group = "Twice"
        ),
        Member(
            id = 7,
            name = "Kim Da Hyun",
            nickname = "Dahyun",
            role = "Lead Rapper, Sub Vocalist",
            dob = "Seongnam, 28 Mei 1998",
            photo = R.drawable.dahyun_profile,
            group = "Twice"
        ),
        Member(
            id = 8,
            name = "Son Chae Young",
            nickname = "Chaeyoung",
            role = "Main Rapper, Sub Vocalist",
            dob = "Seoul, 23 April 1999",
            photo = R.drawable.chaeyoung_profile,
            group = "Twice"
        ),
        Member(
            id = 9,
            name = "Chou Tzuyu",
            nickname = "Tzuyu",
            role = "Lead Dancer, Sub Vocalist, Visual, Maknae",
            dob = "Tainan, 14 Juni 1999",
            photo = R.drawable.tzuyu_profile,
            group = "Twice"
        ),
        Member(
            id = 10,
            name = "Hwang Yeji",
            nickname = "Yeji",
            role = "Leader, main dancer, vocalist, lead rapper",
            dob = "26 Mei 2000",
            photo = R.drawable.yeji_profile,
            group = "Itzy"
        ),
        Member(
            id = 11,
            name = "Choi Ji-su",
            nickname = "Lia",
            role = "main vocal, rapper",
            dob = "21 Juli 2000",
            photo = R.drawable.lia_profile,
            group = "Itzy"
        ),
        Member(
            id = 12,
            name = "Shin Yuna",
            nickname = "Yuna",
            role = "vocal, lead dancer, visual, maknae",
            dob = "9 Desember 2003",
            photo = R.drawable.yuna_profile,
            group = "Itzy"
        ),
        Member(
            id = 13,
            name = "Lee Chaeryeong",
            nickname = "Chaeryeong",
            role = "lead vocal, lead dancer",
            dob = "5 Juni 2021",
            photo = R.drawable.chaeryoung_profile,
            group = "Itzy"
        ),
        Member(
            id = 14,
            name = "Shin Ryu Jin",
            nickname = "Ryujin",
            role = "center, main dancer, main rapper, vocal",
            dob = "17 April 2001",
            photo = R.drawable.ryujin_profile,
            group = "Itzy"
        ),

    )
    val album = listOf(
        Album(
            id = 1,
            name = "THE STORY BEGINS",
            release = "2015-10-20",
            photo = R.drawable.twice_album_1,
            group = "TWICE"
        ),
        Album(
            id = 2,
            name = "PAGE TWO",
            release = "2016-04-25",
            photo = R.drawable.twice_album_2,
            group = "TWICE"
        ),

        Album(
            id = 3,
            name = "TWICEcoaster : LANE 1",
            release = "2016-10-24",
            photo = R.drawable.twice_album_3,
            group = "TWICE"
        ),

        Album(
            id = 4,
            name = "TWICEcoaster : LANE 2",
            release = "2017-02-20",
            photo = R.drawable.twice_album_4,
            group = "TWICE"
        ),
        Album(
            id = 5,
            name = "TWICE - SIGNAL",
            release = "2017-05-15",
            photo = R.drawable.twice_album_5,
            group = "TWICE"
        ),
        Album(
            id = 6,
            name = "twicetagram",
            release = "2017-10-30",
            photo = R.drawable.twice_album_6,
            group = "TWICE"
        ),
        Album(
            id = 7,
            name = "Merry & Happy",
            release = "2017-12-11",
            photo = R.drawable.twice_album_7,
            group = "TWICE"
        ),
        Album(
            id = 8,
            name = "What is Love?",
            release = "2018-04-09",
            photo = R.drawable.twice_album_8,
            group = "TWICE"
        ),
        Album(
            id = 9,
            name = "IT’z Different",
            release = "2019-02-12",
            photo = R.drawable.itzy_album_1,
            group = "ITZY"
        ),
        Album(
            id = 10,
            name = "IT'z ICY",
            release = "2019-07-29",
            photo = R.drawable.itzy_album_2,
            group = "ITZY"
        ),
        Album(
            id = 11,
            name = "IT'z ME",
            release = "2020-03-09",
            photo = R.drawable.itzy_album_3,
            group = "ITZY"
        ),
        Album(
            id = 12,
            name = "Not Shy",
            release = "2020-08-17",
            photo = R.drawable.itzy_album_4,
            group = "ITZY"
        )

    )

}