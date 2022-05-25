# PokemonQuiz
                                           PokeQuiz

## Project Description
##
#### What My application does
My application is a simple guessing game formatted as a quiz. To use the application
at the beginning the user clicks on the start button to begin testing their knowledge.
Once the button has been clicked the game will generate the image of 5 random pokemons
and the user will have to submit his answer in the text box situated below the image above
the next button. Once the answer has been inputted the user should click on next to move
to the next question. When the user reaches the end of the quiz they will receive a score
and a highScore (their personal record depending on how many correct answers they got previously).
Finally, they can simply restart the quiz by clicking on the restart button.
#
#### How the application was built
There was no particular technology used in building my java application. It simply contains the java
language and its functionalities. such as using an Array to store the name of pokemons. The loops were
used in various classes to avoid repeating the same code. There was also some bootstrapFx that was used
to embellish the application tto the best of my capabilities.
#
#### Some challenges I faced and features I hope to implement in the future
One of the many challenges I faced while developing the application was getting the images
to properly display withing the size of the scene I had specified. It was hard because
I could not find a way to resize the images withing affecting the ration at first.
Another one was the buttons at first I had planned on having each class have its own button
however, by doing that I was not able to switch between the multiple scenes. So I opted for
the solution of letting the helloApplication Class to manage the button and instead of having multiple
buttons only having one that changes its functions depending on the scenario was simpler.
One of the things I would like to implement in the future is allowing the user to select a difficulty
to give them more challenges. Another one would consist of making it so that the image of the pokemon
is blued or cropped out in a way to make recognizing them a bit harder.


#
#
## Design
#
#### Brief Explanation of the functionality behind the classes and such
My application was built using JavaFx. First of all, the images were imported into my ressource
folder then I used a loop to properly access them all thanks to the array of pokemon name I made.
The application needed to display multiple windows so what I created a displayable interface that
that allows each class to have their own screens. Then by creating the button in the HelloApplication
class and making sure it was the same button used through ou the entire game I linked all the pages together.
Secondly, to I separated the task each class had to do. The Question class was in charge of making sure
that all the questions were successfully being generated and keeping track of the correct responses.
The Score class had the job of not only displaying the scores at the end of the quiz but also to be able
to print the correct title according to which score is being displayed. Lastly, the quiz
class had the role of making the final touches to the other two classes such as making sure a highScore
panel was also created. It also kept track of the position of the questions (Knowing which is the current
which is the next what was the previous and such).
#
#### Class Diagram(Uml) andd application screenshots
![This is an image](![Uml_Diagram](https://user-images.githubusercontent.com/104465518/170336814-eb803329-9208-4eea-a304-ac54828170b9.jpg)
)
