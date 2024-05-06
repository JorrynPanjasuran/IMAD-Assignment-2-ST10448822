# IMAD-Assignment-2-ST10448822
IMAD Assignment 2 ST10448822 - Happy Pet Haven

**Report: Purpose of the App, Design Considerations, and Utilization of GitHub and GitHub Actions**

This report provides a comprehensive overview of an Android application, including its purpose, design considerations, and the utilization of GitHub and GitHub Actions. The report also includes the code snippets related to the app's main activity and its layout.

**1. Introduction**
My application is called Happy Pet Haven. The purpose of the Android application is to create a Tamagotchi-style game where users can interact with a virtual pet, in this case, Cody the Corgi. The app allows users to perform various actions such as feeding, cleaning, and playing with the virtual pet to maintain its health, happiness, and cleanliness levels. The app's main goal is to provide an engaging and interactive experience for users.

**2. Design Considerations**
The design of the app follows the Model-View-Controller (MVC) architectural pattern, which separates the concerns of data management, user interface, and business logic. The app utilizes the Android ConstraintLayout to arrange and position the UI elements effectively.

**The app's design was guided by the following key considerations:**
**User Experience:** The app's interface is intuitive and easy to navigate, with clear instructions and feedback on the pet's status. The use of progress bars and visual cues helps the user understand the pet's needs at a glance.
**Engagement:** The app incorporates various interactive elements, such as buttons for feeding, cleaning, and playing, to keep the user engaged and invested in the pet's well-being. The gradual decrease in the pet's status over time encourages the user to regularly interact with the app.
**Realism:** The app aims to simulate the experience of caring for a real pet, with the pet's status reflecting its needs and the user's actions. The use of a Corgi as the pet's image adds to the realism and appeal of the app.
**Accessibility:** The app's design considers accessibility features, such as edge-to-edge layout and system bar padding, to ensure a comfortable user experience on various device sizes and orientations.

**3.Screens and GUI use:**
The user interface (UI) for this Tamagotchi-like app consists of three main screens, each designed to provide a different functionality to the user.
**Welcome Screen (MainActivity):**![Cover Screen 1](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/7ff57a89-503b-4b2b-bf59-2ab31264f8be)

This screen serves as the entry point to the app.
-It features two buttons:
"Play Game!" Button: Initiates the game and transitions the user to the main gameplay screen (MainActivity2).
"Instructions" Button: Provides instructions on how to play the game and takes the user to the instructions screen (MainActivity3).
-The background of this screen features an image that sets the theme of the game, creating a visually engaging introduction.

**Gameplay Screen (MainActivity2):**![Play screen 2](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/8d1c8583-0cd0-49fd-9cf7-35f27461952f)
![Hunger Screen 2](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/828b4e2f-ad7a-4e69-a204-0e9a1375f1b2)

This screen is where the main interaction with the virtual pet takes place.
Key elements of this screen include:
-Pet Image View: Displays an image representing the virtual pet.
-Progress Bars: Visual indicators of the pet's health, hunger, and cleanliness levels.
-Text Views: Numeric representation of the percentage values of the pet's health, hunger, and cleanliness.
-Action Buttons: Buttons labeled "Feed," "Clean," and "Play" allow the user to interact with the pet, affecting its status.
-Alert Text View: Displays a message alerting the user if any of the pet's status indicators fall below a certain threshold.
-Back Button: Allows the user to navigate back to the welcome screen (MainActivity).

**Instructions Screen (MainActivity3):**![instructionsthree](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/7ad415d4-d551-4379-b7e3-ad1c6a76d1bf)

This screen provides guidance to the user on how to play the game.
-It consists of explanatory text and a "Back" button.
-The "Back" button returns the user to the welcome screen (MainActivity).
Each screen is designed with a ConstraintLayout, enabling flexible positioning of UI elements, and utilizes appropriate colors and images to enhance the visual appeal and thematic coherence of the app. Additionally, the UI design ensures ease of navigation and clear communication of the game's mechanics to the user.

**4.Personal design inspiration and touches**
Each screen and background is crafted and artistically made. The colours used match each other well, and the image styles are similar.
![corgiplain](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/e42fc894-ad42-4b8b-b615-74d3be84ca51)
![corgiplay](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/05b8be2f-15a9-48e4-b544-3c3181dda429)
![corgieat](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/3bf5a275-04e1-42d1-92d8-43930bbc5ee3)
![corgibath](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/d755889b-5b90-4824-b42f-fc51e00db495)

**5. GitHub and GitHub Actions**
The Happy Pet Haven app is developed and managed using GitHub, a popular version control platform. GitHub provides the following benefits for the app's development:
**Version Control:** GitHub allows me as well as a development team, other learners, or lecturers that access it to track changes, collaborate on the codebase, and easily revert to previous versions if needed.
**Issue Tracking**: The app's developers, other learners, or lecturers can use GitHub's issue tracking system to manage bug reports, feature requests, and other project-related tasks.
**Continuous Integration and Deployment:** GitHub Actions, a powerful automation tool, can be used to set up a continuous integration (CI) and continuous deployment (CD) pipeline. This ensures that the app is automatically built, tested, and deployed upon code changes, improving the development workflow and release process.
**Collaboration:** GitHub's collaborative features enable the development team to work together effectively, review code changes, and discuss project-related topics.
**Documentation:** The app's documentation, including this report, can be stored and versioned within the GitHub repository, making it easily accessible to the development team and stakeholders. We submitted a Readme file as documentation![image](https://github.com/JorrynPanjasuran/IMAD-Assignment-2-ST10448822/assets/163964500/76e326f4-b498-47e4-be56-d7b857e1dbc3)


**6.Conclusion**
In conclusion, this report has provided an overview of the Android application's purpose, design considerations, and the utilization of GitHub and GitHub Actions. 
The app aims to deliver an engaging virtual pet experience to users, and its design follows the MVC architectural pattern with a focus on effective UI layout using ConstraintLayout.

GitHub and GitHub Actions play a crucial role in the development workflow, enabling version control, collaboration, and automated building and testing of the application. By leveraging these tools, developers can ensure a smooth and efficient development process.

Overall, the Android application holds promise in delivering an enjoyable experience to users, and its utilization of GitHub and GitHub Actions showcases the adoption of modern development practices.
