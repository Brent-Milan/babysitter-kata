This is a programming kata provided by Pillar Technology that I solved using the following:

+ Language stack: 				Java
+ Additional Framework(s): 		JUnit 4
+ IDE:							Eclipse
+ Approach: 					Test-driven design (TDD)
+ Dependencies:					[Link to raw of build.gradle](https://raw.githubusercontent.com/Brent-Milan/pillar-katas/master/build.gradle)

## **Description**: 

To solve the 'Babysitter' kata, I initially built out two parallel int[] arrays. 

One array represented the range of hours the babysitter could potentially work and served as a timeline of sorts. The other array was (initially) constructed to represent the pay rates with the assumption the bedtime was 9pm -- however, I needed this to be more dynamic and allow the user to select their own bedtime. As the process went on, this array was refactored to be populated by a method that took in a 'bedtime' argument and generated an appropriate array of pay rates based on that information. 

At one point, I started to scrap the design to begin using a hashmap in lieu of parallel arrays.Key-value pairs would have been another way to approach this problem. Ultimately, I decided to follow the original array design to its logical conclusion, because I liked the simplicity of the design approach.

This kata was done from a test-driven approach where unit tests were constructed (red), were made to pass with production code (green), and improvements were made after (refactor). After the TimeClock class was largely complete, I added a BabysitterApp class to build a simple console menu to accept user input and provide accessibility. This class has its own test file to check the two boolean methods it uses.

## **Ideas for future additions**: 

Could easily add a variable that functions as a multiplier to adjust pay rates for multiple children or special cases like infants. 

## **Scrapped ideas**:

Built a TimeClock logger method and associated try/catch/IOException code in the Babysitter App that used PrintWiter and FileWriter to automatically log invoice dates and values to a text file. I decided this was outside the scope of what the exercise asked for + created a lot of ugly clutter to the code. 

**Note**:

This project was initially setup with SpringInitializr + Gradle to setup my files/directories quickly. It has some Spring-related dependencies listed that it doesn't actually require to run. If you have JUnit 4, you're good to go. 

