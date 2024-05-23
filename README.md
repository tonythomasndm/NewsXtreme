# NewsXtreme

## Project Overview
NewsXtreme is a mobile application that provides users with relevant news based on their current location and selected categories. It offers features such as location-sensing to fetch local news, the ability to download articles for offline reading, and web scraping to retrieve detailed content from articles. The application is built using Jetpack Compose for a modern UI experience.

## Features
- **Location-Based News**: Fetches news relevant to the user's current location using the device's location sensor.
- **Category Selection**: Allows users to choose from various news categories, with a default option set to general news.
- **Offline Reading**: Users can download news articles to local storage for offline access.
- **Web Scraping**: Uses Jsoup to scrape content from news articles for detailed views.
- **API Integration**: Fetches the latest news from [newsapi.org](https://newsapi.org) when the device is online.
- **Custom UI Components**: Utilizes custom fonts, images, and Jetpack Compose for creating a modern and dynamic user interface.

## Activities
1. **Splash Activity**: Displays an animated splash screen using Jetpack Compose.
2. **Home Activity**: Main screen with a lazy row of categories, search bar, and top news icons.
3. **ContentScreen Activity**: Displays the detailed content of a selected news article, including the title, author, published date, images, and text.
4. **DownloadScreen Activity**: Shows a list of downloaded articles stored in the local database.
5. **Main Activity**: Acts as the launcher activity, initiating the splash screen and navigating to the home activity.

## Composables
- **SplashScreen()**: Creates a splash screen with animated text components.
- **NewsCard()**: Displays article data in a card format, including the title, author, published date, images, and content.
- **DisplayImageFromUrl()**: Fetches and displays images asynchronously with a loading indicator.
- **NewsContent()**: Shows detailed news content in a structured layout.
- **DownloadScreen()**: Manages the display of downloaded articles.

## Workflow
1. **Main Activity**: Launches the Splash Activity.
2. **Splash Activity**: Transitions to the Home Activity.
3. **Home Activity**: Displays news categories and articles based on user selection.
4. **ContentScreen Activity**: Provides detailed views of selected articles.
5. **DownloadedNews Activity**: Lists downloaded articles for offline reading.

## Dependencies
- **Jetpack Compose**: For building UI components.
- **Room Database**: For storing downloaded news articles.
- **Jsoup**: For web scraping article content.
- **NewsAPI**: For fetching the latest news.
- **Location Services**: For retrieving the user's current location.

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/NewsXtreme.git
    ```
2. Open the project in Android Studio.
3. Build and run the application on an emulator or physical device.

OR

1. Locate the apk file in the repository in the following path: `app\build\outputs\apk\debug\app-debug.apk"
2. Install the apk file in your smartphone and run the application

## Usage
- Launch the app to see the splash screen.
- Navigate through the home activity to view news categories and articles.
- Tap on an article to see detailed content.
- Use the download icon to save articles for offline reading.
- Access downloaded articles in the DownloadScreen activity.

## Screenshots
Include screenshots of various activities and screens here.

## Demo Video
[Watch the demo video]([https://drive.google.com/link-to-your-demo-video](https://drive.google.com/file/d/1LxiuW56ZxNFntOEsh5gRdMYhTviyHiPK/view?usp=sharing))

## Authors
- Arpan Kumar
- Tony Thomas

## Acknowledgments
Thank you for reading our presentation. This project was developed as part of the Mobile Computing course. Special thanks to our instructors and peers for their support and feedback.
