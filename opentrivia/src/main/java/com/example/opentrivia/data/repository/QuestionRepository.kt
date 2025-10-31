package com.example.opentrivia.data.repository

import com.example.opentrivia.data.model.Question

class QuestionRepository {
    private val _questions = arrayListOf(
        Question(
            type = true,
            difficulty = "hard",
            question = "The song \"Mystery Train\" was released by artist \"Little Junior's Blue Flames\" in 1953.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Music"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Fast food restaurant chains Carl's Jr. and Hardee's are owned by the same company.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "The National Animal of Scotland is the Unicorn.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Vincent van Gogh cut off one of his ears.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Art"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "The sum of any two odd integers is odd.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science: Mathematics"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "The card game \"Munchkin\" won the 2001 Origins Award for Best Traditional Card Game.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Board Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Instant mashed potatoes were invented by Canadian Edward Asselbergs in 1962.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "In the original script of \"The Matrix\", the machines used humans as additional computing power instead of batteries.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Film"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Jeb Bush was elected as Governor of Florida in 2002, starting his political career.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Politics"
        ),
        Question(
            type = true,
            difficulty = "hard",
            question = "Nazi Germany surrendered on Harry Truman's birthday while he was president.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Politics"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Not including false teeth; A human has two sets of teeth in their lifetime.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Science & Nature"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Only a small percentage of the world's population is lactose intolerant.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Stephen Chbosky wrote the book 'The Perks of Being A Wallflower'.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Books"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "In Full Metal Panic!, Whispered are those who are capable of creating Black Technology.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Japanese Anime & Manga"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "In association football, or soccer, a corner kick is when the game restarts after someone scores a goal.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Sports"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "There are 86400 seconds in a day.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "\"Santa Claus\" is a variety of melon.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Tony Hawk's Pro Skater was released in 1999.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "In the \"S.T.A.L.K.E.R.\" series, the Freedom faction wishes to destroy the supernatural area known as  \"the Zone\".",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The sum of all the numbers on a roulette wheel is 666.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Minecraft wasn’t the original name to Minecraft.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Shrimp can swim backwards.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Science & Nature"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Studio Ghibli is a Japanese animation studio responsible for the films \"Wolf Children\" and \"The Boy and the Beast\".",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Japanese Anime & Manga"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Greenland is almost as big as Africa.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Geography"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "\"Resident Evil 7\" is the first first-person Resident Evil game.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "A slug’s blood is green.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Animals"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Sugar contains fat.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science & Nature"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "In \"Avatar: The Last Airbender\" and \"The Legend of Korra\", Lavabending is a specialized bending technique of Firebending.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Cartoon & Animations"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "\"Metal Gear Solid 3: Snake Eater\" was released in 2004.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Former United States Presidents John Adams and Thomas Jefferson died within hours of each other.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "History"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "Resident Evil 4 was originally meant to be a Nintendo GameCube exclusive.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The Pythagorean theorem states that the square of the hypotenuse is equal to the product of the squares of the other two sides.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science: Mathematics"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "A plant that has a life cycle for more than a year is known as an annual.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science & Nature"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "The NVidia GTX 1080 gets its name because it can only render at a 1920x1080 screen resolution.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science: Computers"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "The game \"Jetpack Joyride\" was created by \"Redbrick Studios\".",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The French word to travel is \"Travail\"",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The General Motors EV1 was the first street-legal production electric vehicle.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Vehicles"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Watch_Dogs 2 is a prequel.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "In Heroes of the Storm, the Cursed Hollow map gimmick requires players to kill the undead to curse the enemy team.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "\"Twenty One Pilots\" made the song \"The Motion\" featuring Sampha.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Entertainment: Music"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The Japanese Shinkansen beat the French TGV's speed record for fastest electric rail train.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Vehicles"
        ),
        Question(
            type = true,
            difficulty = "hard",
            question = "Janus was the Roman god of doorways and passageways.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Mythology"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Linux was first created as an alternative to Windows XP.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Science: Computers"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "In the video game \"Splatoon\", the playable characters were originally going to be rabbits instead of squids.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Video Games"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The scientific name for the Southern Lights is Aurora Australis?",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Eurobeat is primarily an Italian genre of music.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Music"
        ),
        Question(
            type = true,
            difficulty = "medium",
            question = "The 1969 Frank Sinatra Song \"My Way\" was ironically not written by him.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "Entertainment: Music"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "Zebras are white with black stripes.",
            correct_answer = "False",
            incorrect_answers = listOf("True"),
            category = "Animals"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "\"Ananas\" is mostly used as the word for Pineapple in other languages.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        ),
        Question(
            type = true,
            difficulty = "easy",
            question = "On average, at least 1 person is killed by a drunk driver in the United States every hour.",
            correct_answer = "True",
            incorrect_answers = listOf("False"),
            category = "General Knowledge"
        )
    )

    fun getQuestions() = _questions
}