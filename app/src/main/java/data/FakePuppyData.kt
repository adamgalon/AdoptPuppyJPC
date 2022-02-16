package data

import com.example.adoptpuppyjpc.Puppy
import com.example.adoptpuppyjpc.R


object FakePuppyData {

    val puppy =
        Puppy(
            id = 1,
            title = "Monty",
            gender = "Male",
            age = 14,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            puppyImageId = R.drawable.p1
        )

    val puppyList = listOf(
        puppy,
        Puppy(
            id = 2,
            title = "Jubilee",
            gender = "Female",
            age = 6,
            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            puppyImageId = R.drawable.p2
        ),
        Puppy(
            id = 3,
            title = "Beezy",
            gender = "Male",
            age = 8,
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            puppyImageId = R.drawable.p3
        ),
        Puppy(
            id = 4,
            title = "Mochi",
            gender = "Male",
            age = 10,
            description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
            puppyImageId = R.drawable.p4
        ),
        Puppy(
            id = 5,
            title = "Brewery",
            gender = "Female",
            age = 12,
            description = "Brewery loves fetching you your favorite homebrew.",
            puppyImageId = R.drawable.p5
        ),
        Puppy(
            id = 6,
            title = "Lucy",
            gender = "Female",
            age = 8,
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            puppyImageId = R.drawable.p6
        ),
        Puppy(
            id = 7,
            title = "Astro",
            gender = "Male",
            age = 10,
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
            puppyImageId = R.drawable.p7
        ),
        Puppy(
            id = 8,
            title = "Boo",
            gender = "Female",
            age = 9,
            description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            puppyImageId = R.drawable.p8
        ),
        Puppy(
            id = 9,
            title = "Pippa",
            gender = "Male",
            age = 7,
            description = "Pippa likes to look out the window and write pup-poetry.",
            puppyImageId = R.drawable.p9
        ),
        Puppy(
            id = 10,
            title = "Coco",
            gender = "Female",
            age = 10,
            description = "Coco enjoys getting pampered at the local puppy spa.",
            puppyImageId = R.drawable.p10
        ),
        Puppy(
            id = 11,
            title = "Brody",
            gender = "Male",
            age = 13,
            description = "Brody is a good boy, waiting for your next command.",
            puppyImageId = R.drawable.p11
        ),
        Puppy(
            id = 12,
            title = "Stella",
            gender = "Female",
            age = 14,
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            puppyImageId = R.drawable.p12
        ),
    )
}
